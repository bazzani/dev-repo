package com.autometrics.concurrent;

import org.apache.log4j.Logger;

import com.autometrics.concurrent.exceptions.CreateHostThreadException;
import com.autometrics.concurrent.exceptions.CreateRecyclerThreadException;
import com.autometrics.concurrent.exceptions.RequestRegistrationException;
import com.autometrics.concurrent.hosts.ResourceConnectorHost;
import com.autometrics.connectors.ResourceVO;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * A Channel provides a mechanism for handling requests that either:
 * <ul>
 * <li>execute a command on a service, or</li>
 * <li>retrieve a resource from a service.</li>
 * </ul>
 * <p>
 * Each channel represents a <i>unique</i> request, and is capable of handling
 * concurrent requests.
 * <p>
 * The channel is responsible for creating an implementation of an
 * {@link AbstractHost}, which performs the interaction with the service.
 * <p>
 * After the channel has responded to all requests, it then starts a cleanup
 * process via its {@link ChannelRecycler} object.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see AbstractHost
 * @see ChannelRecycler
 * @see ChannelManager
 * @see CreateHostThreadException
 * @see CreateRecyclerThreadException
 */
public class Channel {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger.getLogger(Channel.class);

	/**
	 * The id of the channel.
	 */
	private int id = 0;

	/**
	 * The number of requests this channel is currently processing.
	 */
	private int requestCount = 0;

	/**
	 * The current state of the service interaction process.
	 */
	private ChannelState currentState = ChannelState.NOT_STARTED;

	/**
	 * The current number of host creation attempts.
	 */
	private int hostCreationRetryCount = 0;

	/**
	 * The MAXIMUM number of attempts to create the host before an exception is
	 * thrown.
	 */
	private final int hostCreationRetryLimit = 5;

	/**
	 * The current number of recycler creation attempts.
	 */
	private int recyclerCreationRetryCount = 0;

	/**
	 * The MAXIMUM number of attempts to create the host before an exception is
	 * thrown.
	 */
	private final int recyclerCreationRetryLimit = 5;

	/**
	 * The amount of time (in seconds) to wait before attempting to create
	 * another host/recycler.
	 */
	private final int threadCreationRetrySeconds = 5;

	/**
	 * The resource this channel stores.
	 */
	private ResourceVO resource;

	/**
	 * The request properties that make this channel unique.
	 */
	private PropertiesVO requestProperties;

	/**
	 * The host interacts with a service on behalf of the channel. If the
	 * service returns a resource, it is applied to the channel.
	 * <p>
	 * Declaring the host as a {@link AbstractHost} data type permits the
	 * channel to interact with any concrete host implementation.
	 */
	private AbstractHost host;

	/**
	 * The recycler is responsible for initiating the cleanup process for this
	 * channel.
	 */
	private ChannelRecycler recycler;

	/**
	 * Thread to run the host, independently of the channel.
	 */
	private Thread hostThread;

	/**
	 * Thread to run the recycler, independently of the channel.
	 */
	private Thread recyclerThread;

	/**
	 * Instantiate a new <code>Channel</code> object, and apply the request
	 * properties and a name to it. The recycler is also instantiated in the
	 * constructor.
	 * 
	 * @param requestPropertiesIn
	 *            The request properties that make this channel unique.
	 * @param idIn
	 *            The channel id.
	 * 
	 * @since Version 1.1
	 */
	public Channel(PropertiesVO requestPropertiesIn, int idIn) {
		this.requestProperties = requestPropertiesIn;
		this.id = idIn;

		this.recycler = new ChannelRecycler(this);
	}

	/**
	 * Register a concurrent request with this channel. If the channel has not
	 * started service interaction process, a new host will be created to
	 * perform it.
	 * <p>
	 * If a {@link CreateHostThreadException} exception is caught when the host
	 * is being created a number of things happen:
	 * <ol>
	 * <li>the channel's resource is set to <code>null</code></li>
	 * <li>the channel status is set to the <code>FAILED_HOST_CREATION</code>
	 * {@link ChannelState}</li>
	 * <li>the channel's request counter is decremented (which could also
	 * initiate the recycling process)</li>
	 * <li>finally, a {@link RequestRegistrationException} exception is thrown
	 * with the details of the caught exception.</li>
	 * </ol>
	 * 
	 * @throws RequestRegistrationException
	 * 
	 * @since Version 1.1
	 */
	public void registerRequest() throws RequestRegistrationException {
		incRequestCounter();

		try {
			if (getCurrentState() == ChannelState.NOT_STARTED) {
				createHost();

				setCurrentState(ChannelState.IN_PROGRESS);
			} else if (getCurrentState() == ChannelState.FAILED_HOST_CREATION) {
				throw new RequestRegistrationException(
						"The channel failed to create its host and cannot process any more requests.");
			}
		} catch (CreateHostThreadException e) {
			setCurrentState(ChannelState.FAILED_HOST_CREATION);

			try {
				decRequestCounter();
			} catch (CreateRecyclerThreadException rex) {
				logger.error(e.getMessage(), rex);
			}

			throw new RequestRegistrationException(
					"The channel failed to register the request.", e);
		}
	}

	/**
	 * Create the channel's host.
	 * <p>
	 * A new thread is created with maximum priority to start the host
	 * interacting with the service. If a {@link OutOfMemoryError} exception is
	 * caught when attempting to create the new thread, the method is called
	 * recursively up to a maximum of the <code>hostCreationRetryLimit</code>
	 * value.
	 * <p>
	 * Before the method is called again, the executing thread is put to sleep
	 * for the number of seconds specified in the
	 * <code>threadCreationRetrySeconds</code> value. When this limit is reached
	 * a {@link CreateHostThreadException} is thrown.
	 * 
	 * @throws CreateHostThreadException
	 * 
	 * @since Version 1.1
	 */
	synchronized private void createHost() throws CreateHostThreadException {
		// TODO: Look at synchronised code, try and minimise
		if (host == null) {
			// TODO: we should use a ChannelHostFactory by using the
			// requestProperties to create the appropriate host

			// create the host
			host = new ResourceConnectorHost(this);
		}

		try {
			// create a new thread with maximum priority for the host
			hostThread = new Thread(host, "Host Thread (" + getChannelId()
					+ ")");
			hostThread.setPriority(Thread.MAX_PRIORITY);
			hostThread.start();
		} catch (OutOfMemoryError error) {
			hostCreationRetryCount++;

			if (hostCreationRetryCount <= hostCreationRetryLimit) {
				try {
					logger.warn("Creating host (" + getChannelId()
							+ ") FAILED, retry # " + hostCreationRetryCount
							+ " in " + threadCreationRetrySeconds
							+ " seconds...");

					// put this thread to sleep
					Thread.sleep(threadCreationRetrySeconds * 1000);
				} catch (InterruptedException ie) {
				}

				// attempt to create the host again
				createHost();
			} else {
				hostCreationRetryCount = 0;

				throw new CreateHostThreadException("Creating host ("
						+ getChannelId()
						+ ") FAILED COMPLETELY, insufficient JVM memory.");
			}
		}
	}

	/**
	 * Increment the request counter.
	 * <p>
	 * If the channel recycling thread is currently running, it will be
	 * interrupted and set to null to prevent the channel from being recycled.
	 * 
	 * @since Version 1.1
	 */
	synchronized private void incRequestCounter() {
		requestCount++;

		// if the recycling thread is not null AND currently running
		if (recyclerThread != null && recyclerThread.isAlive()) {
			recyclerThread.interrupt();

			recyclerThread = null;
		}
	}

	/**
	 * Decrement the request counter.
	 * <p>
	 * If the channel has responded to its last pending request, a new thread is
	 * created with normal priority to initiate the recycling process.
	 * <p>
	 * If a {@link OutOfMemoryError} exception is thrown when attempting to
	 * create the new thread, the method is called recursively up to a maximum
	 * of the <code>recyclerCreationRetryLimit</code> value.
	 * <p>
	 * Before the method is called again, the thread is put to sleep for the
	 * number of seconds specified in the
	 * <code>threadCreationRetrySeconds</code> value.
	 * <p>
	 * When this limit is reached a {@link CreateRecyclerThreadException} is
	 * thrown.
	 * 
	 * @throws CreateRecyclerThreadException
	 * 
	 * @since Version 1.1
	 */
	private synchronized void decRequestCounter()
			throws CreateRecyclerThreadException {
		// TODO: Look at synchronised code, try an minimise
		try {
			// synchronized (this) {
			requestCount--;

			if (requestCount == 0) {
				// create a new thread to perform the channel recycling
				// process with normal priority
				recyclerThread = new Thread(recycler,
						"Channel Recycling Thread (" + getChannelId() + ")");
				recyclerThread.setPriority(Thread.NORM_PRIORITY);
				recyclerThread.start();
			}
			// }
		} catch (OutOfMemoryError error) {
			// synchronized (this) {
			requestCount++;

			recyclerCreationRetryCount++;

			if (recyclerCreationRetryCount <= recyclerCreationRetryLimit) {
				try {
					logger.warn("Creating Recycler (" + getChannelId()
							+ ") FAILED, retry # " + recyclerCreationRetryCount
							+ " in " + threadCreationRetrySeconds
							+ " seconds...");

					// put this thread to sleep
					Thread.sleep(threadCreationRetrySeconds * 1000);
				} catch (InterruptedException ie) {
				}

				// attempt to decrement the request counter again
				decRequestCounter();
			} else {
				recyclerCreationRetryCount = 0;

				throw new CreateRecyclerThreadException("Creating recycler ("
						+ getChannelId()
						+ ") FAILED COMPLETELY, insufficient JVM memory.");
			}
		}
		// }
	}

	/**
	 * Get this channels id.
	 * 
	 * @return The channel id.
	 * 
	 * @since Version 1.1
	 */
	public int getChannelId() {
		return id;
	}

	/**
	 * Get the channel's resource. <i>This should only ever be called by a</i>
	 * {@link ChannelSubscriber}.
	 * <p>
	 * The number of requests this channel is currently processing is
	 * decremented before returning the resource.
	 * 
	 * @return The channels resource.
	 * 
	 * @since Version 1.1
	 */
	public ResourceVO getResource() {
		try {
			decRequestCounter();
		} catch (CreateRecyclerThreadException e) {
			logger.error(e.getMessage(), e);
		}

		return resource;
	}

	/**
	 * Set a resource on this channel. <i>This should only ever be called
	 * internally or by the channel's host.</i>
	 * <p>
	 * <ul>
	 * <li>If the resource is <code>null</code> it is deemed that the channel
	 * has failed to successfully interact with the service and moves to the
	 * FAILED state.</li>
	 * </ul>
	 * <ul>
	 * <li>If the resource is not null, the interaction with the service has
	 * successfully completed:
	 * <ol>
	 * <li>If a command was executed on the service the resource will contain
	 * null data.</li>
	 * <li>If a resource was retrieved from the service the resource will
	 * contain non null data.
	 * <p>
	 * <i>However it is possible that null data may be returned from a service,
	 * even when the retrieval process completes successfully.</i>
	 * </li>
	 * </ol>
	 * </li>
	 * </ul>
	 * <p>
	 * Finally, the <code>notifyAll</code> method is called so that any threads
	 * waiting on this object are alerted.
	 * 
	 * @param resourceIn
	 *            The resource to set on this channel.
	 * 
	 * @since Version 1.1
	 */
	synchronized public void setResource(ResourceVO resourceIn) {
		// clean up member variables related to the host
		host = null;
		hostThread = null;

		resource = resourceIn;

		if (resource == null) {
			logger.error("A null resource has been set on channel # "
					+ getChannelId());

			setCurrentState(ChannelState.FAILED);
		} else {
			if (resource.getData() == null) {
				if (logger.isInfoEnabled()) {
					logger.info("An empty resource has been set on channel # "
							+ getChannelId());
				}
			} else {
				if (logger.isDebugEnabled()) {
					logger
							.debug("A non-empty resource has been set on channel # "
									+ getChannelId()
									+ " --> "
									+ resource.getData().toString());
				}
			}

			setCurrentState(ChannelState.COMPLETE);
		}

		notifyAll();
	}

	/**
	 * Get the properties that make this channel unique.
	 * 
	 * @return The request properties.
	 * 
	 * @since Version 1.1
	 */
	public PropertiesVO getRequestProperties() {
		return requestProperties;
	}

	/**
	 * Get the current state of the service interaction process.
	 * 
	 * @return The current state of the service interaction process.
	 * 
	 * @since Version 1.1
	 */
	public ChannelState getCurrentState() {
		return currentState;
	}

	/**
	 * Set the current state of the service interaction process.
	 * 
	 * @param state
	 *            The new state.
	 * 
	 * @since Version 1.1
	 */
	synchronized private void setCurrentState(ChannelState state) {
		currentState = state;

		switch (getCurrentState()) {
		case FAILED_HOST_CREATION:
			// set a null resource on the channel as a problem occurred when
			// creating the host, and the service is therefore unavailable
			setResource(null);
			break;
		}
	}

	/**
	 * Get the current number of requests this channel is processing.
	 * 
	 * @return The current number of requests this channel is processing.
	 * 
	 * @since Version 1.1
	 */
	public int getRequestCount() {
		return requestCount;
	}

	/**
	 * Enumeration for the different states the service interaction process can
	 * be in.
	 * 
	 * @author Barry Evans
	 * @since Version 1.1
	 */
	public enum ChannelState {
		/**
		 * The service interaction process has not been started.
		 */
		NOT_STARTED,

		/**
		 * The service interaction process is in progress.
		 */
		IN_PROGRESS,

		/**
		 * The service interaction process has completed successfully.
		 */
		COMPLETE,

		/**
		 * The service interaction process has failed (but it has completed).
		 */
		FAILED,

		/**
		 * The service interaction process failed when attempting to create the
		 * host.
		 */
		FAILED_HOST_CREATION
	}
}