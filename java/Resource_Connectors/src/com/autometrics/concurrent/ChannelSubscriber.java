package com.autometrics.concurrent;

import org.apache.log4j.Logger;

import com.autometrics.concurrent.exceptions.InvalidChannelResponseException;
import com.autometrics.connectors.ResourceVO;

/**
 * Class responsible for returning the response of a request that was registered
 * with a channel, when it becomes available
 * <p>
 * <ul>
 * <li>
 * If the request was to execute a command, then a {@link ResourceVO} with null
 * data will be returned.</li>
 * <li>
 * If the request was to retrieve a resource, then a {@link ResourceVO} with
 * data will be returned.<br>
 * </li>
 * </ul>
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see Channel
 */
public class ChannelSubscriber {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger.getLogger(ChannelSubscriber.class);

	/**
	 * The channel to get the resource from.
	 */
	private Channel channel;

	/**
	 * Constructor that assigns the channel to this subscriber.
	 */
	public ChannelSubscriber(Channel channelIn) {
		this.channel = channelIn;
	}

	/**
	 * Get the response from registering a request with this channel. If it is
	 * not yet available, wait until it becomes available.
	 * 
	 * @return The response of registering the request with the channel.
	 * 
	 * @throws InvalidChannelResponseException
	 */
	public ResourceVO getRequestResponse()
			throws InvalidChannelResponseException {
		ResourceVO theResponse;

		synchronized (channel) {
			// while the channel's service interaction process has not
			// started or it is in progress, wait
			while (channel.getCurrentState() == Channel.ChannelState.NOT_STARTED
					|| channel.getCurrentState() == Channel.ChannelState.IN_PROGRESS) {
				try {
					if (logger.isDebugEnabled()) {
						logger.debug("Waiting on channel # "
								+ channel.getChannelId()
								+ " for its response...");
					}

					// make the executing thread wait
					channel.wait();
				} catch (InterruptedException e) {
				}
			}

			// resource is available, so get it
			theResponse = channel.getResource();

			if (theResponse == null) {
				throw new InvalidChannelResponseException(
						"The channel failed to get a valid response.");
			}

			if (logger.isDebugEnabled()) {
				logger.debug("Returning response from channel # "
						+ channel.getChannelId());
			}

			return theResponse;
		}
	}
}