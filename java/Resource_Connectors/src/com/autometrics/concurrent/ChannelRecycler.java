package com.autometrics.concurrent;

import org.apache.log4j.Logger;


/**
 * Class responsible for recycling an existing channel (its owner) when it is no
 * longer needed. A new thread will be created by the channel to run the
 * instance of this class when the channel has returned the resource to its last
 * request.
 * <p>
 * The process of initiating the check of a channel's redundancy occurs after
 * the interval specified by the <code>recycleWaitSeconds</code> variable.
 * <p>
 * The thread that runs this class can be interrupted, which prevents the
 * recycling process from completing.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see Channel
 * @see ChannelManager
 */
public class ChannelRecycler implements Runnable {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger.getLogger(ChannelRecycler.class);

	/**
	 * The number of seconds to wait before attempting to recycle the channel.
	 */
	private final int recycleWaitSeconds = 10;

	/**
	 * The channel this recycler will attempt to recycle.
	 */
	private Channel channel;

	/**
	 * Constructor that assigns the channel to this recycler.
	 * 
	 * @param channelIn
	 *            The channel to recycle.
	 */
	public ChannelRecycler(Channel channelIn) {
		channel = channelIn;
	}

	/**
	 * Initiate the recycling process. The executing thread is put to sleep for
	 * the number of seconds specified in the <code>recycleWaitSeconds</code>
	 * value before attempting to recycle the channel.
	 * <p>
	 * If the thread encounters an {@link InterruptedException}, the method
	 * simply returns and prevents the recycling process from completing.
	 */
	public void run() {
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Recycling thread is sleeping for "
						+ recycleWaitSeconds
						+ " seconds before it continues...");
			}

			Thread.sleep(recycleWaitSeconds * 1000);
		} catch (InterruptedException e) {
			if (logger.isDebugEnabled()) {
				logger.debug("Recycling has been interrupted!");
			}

			return;
		}

		// attempt to recycle the channel
		ChannelManager.getInstance().recycleChannel(channel);
	}
}