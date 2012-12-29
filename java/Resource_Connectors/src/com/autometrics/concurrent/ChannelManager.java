package com.autometrics.concurrent;

import org.apache.log4j.Logger;

import com.autometrics.concurrent.exceptions.InvalidChannelResponseException;
import com.autometrics.concurrent.exceptions.RequestRegistrationException;
import com.autometrics.connectors.IResourceConnector;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.ResourceVO;
import com.autometrics.connectors.exceptions.ConnectorException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * The channel manager is a singleton and operates as a Façade to channels and
 * supporting classes.
 * <p>
 * Operations such as registering requests with channels and recycling existing
 * channels are performed here. The operations on channels must be initiated
 * through this class, and not on a channel itself.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see Channel
 * @see ChannelStore
 * @see ChannelSubscriber
 */
public class ChannelManager {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger.getLogger(ChannelManager.class);

	/**
	 * Singleton instance of this class.
	 */
	private static volatile ChannelManager sChannelManager;

	/**
	 * The object containing all channel objects.
	 */
	private volatile ChannelStore channels;

	/**
	 * Constructs a new channel manager and initialises the {@link ChannelStore}
	 * instance variable.
	 * 
	 * @since Version 1.1
	 */
	private ChannelManager() {
		this.channels = new ChannelStore();
	}

	/**
	 * Return the singleton instance of this class. Create the singleton class
	 * if necessary. This method is thread safe.
	 * 
	 * @since Version 1.1
	 */
	public static ChannelManager getInstance() {
		if (sChannelManager == null) {
			synchronized (ChannelManager.class) {
				if (sChannelManager == null) {
					sChannelManager = new ChannelManager();
				}
			}
		}

		return sChannelManager;
	}

	/**
	 * Register a new request with the manager.
	 * <p>
	 * Both concurrent and non-concurrent requests are supported, and
	 * non-concurrent requests are performed by default, unless otherwise
	 * specified in the request properties.
	 * <p>
	 * <u>Concurrent Requests</u><br>
	 * During concurrent request processing, the manager will route the request
	 * to the appropriate channel based on the request properties. The resource
	 * will be returned from that channel when it becomes available.
	 * <p>
	 * To perform a concurrent request, the request properties must contain a
	 * property with the name <b>concurrent</b> and the string value
	 * <i>true</i>.
	 * <p>
	 * <u>Non-Concurrent Requests</u><br>
	 * During the execution of non-concurrent requests, a new instance of the
	 * relevant {@link IResourceConnector} is created, and processing passes on
	 * to it.
	 * <p>
	 * If a problem occurs during the resource retrieval process an
	 * {@link InvalidChannelResponseException} exception will be thrown.
	 * 
	 * @param requestProperties
	 *            The request properties that will be used to retrieve the
	 *            resource.
	 * 
	 * @return The response from the request.
	 * 
	 * @throws InvalidChannelResponseException
	 * 
	 * @since Version 1.1
	 */
	public ResourceVO registerRequest(PropertiesVO requestProperties)
			throws InvalidChannelResponseException {
		if (requestProperties.getPropertyValue("concurrent").equalsIgnoreCase(
				"true")) {
			return processConcurrentRequest(requestProperties);
		} else {
			return processNonConcurrentRequest(requestProperties);
		}
	}

	/**
	 * Recycle a channel.
	 * 
	 * @param channelIn
	 *            The channel to recycle.
	 * 
	 * @since Version 1.1
	 */
	public void recycleChannel(Channel channelIn) {
		channels.recycleChannel(channelIn);
	}

	/**
	 * Perform a concurrent request on a {@link Channel}.
	 * 
	 * @param requestProperties
	 *            The request properties.
	 * 
	 * @return The response from the request.
	 * 
	 * @throws InvalidChannelResponseException
	 * 
	 * @since Version 1.1
	 */
	private ResourceVO processConcurrentRequest(PropertiesVO requestProperties)
			throws InvalidChannelResponseException {
		if (logger.isInfoEnabled()) {
			logger.info("Registering concurrent request with the manager");
		}

		try {
			channels.getChannel(requestProperties).registerRequest();

			return new ChannelSubscriber(channels.getChannel(requestProperties))
					.getRequestResponse();
		} catch (RequestRegistrationException e) {
			logger.error("Request registering failed");

			// TODO: Perhaps enter logic to retry registering the request after
			// a delay if the current state of the channel is FAILED, rather
			// than FAILED_HOST_CREATION
			// i.e. registerRequest(requestProperties);

			throw new InvalidChannelResponseException(
					"An invalid response was received.", e);
		}
	}

	/**
	 * Perform a non concurrent request on a {@link IResourceConnector}
	 * implementation.
	 * 
	 * @param requestProperties
	 *            The request properties.
	 * 
	 * @return The response from the request.
	 * 
	 * @throws InvalidChannelResponseException
	 * 
	 * @since Version 1.1
	 */
	private ResourceVO processNonConcurrentRequest(
			PropertiesVO requestProperties)
			throws InvalidChannelResponseException {
		try {
			if (logger.isInfoEnabled()) {
				logger
						.info("Registering non concurrent request with the manager");
			}

			return ResourceConnectorFactory.CreateResourceConnector(
					requestProperties).getResource();
		} catch (ConnectorException e) {
			logger.error("Request registration failed");

			throw new InvalidChannelResponseException(e);
		}
	}
}