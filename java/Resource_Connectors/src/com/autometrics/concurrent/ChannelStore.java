package com.autometrics.concurrent;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.autometrics.generics.vo.PropertiesVO;

/**
 * Class responsible for storing and providing access to all channels. This
 * object can be manipulated to:
 * <ul>
 * <li>create new channels</li>
 * <li>retrieve existing channels</li>
 * <li>recycle existing channels</li>
 * </ul>
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see Channel
 * @see ChannelManager
 */
public class ChannelStore {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger.getLogger(ChannelStore.class);

	/**
	 * The collection of unique channels.
	 */
	private ArrayList<Channel> channels;

	/**
	 * Empty constructor that initialises the collection of channel objects.
	 */
	public ChannelStore() {
		channels = new ArrayList<Channel>();
	}

	/**
	 * Return a channel if one exists for the specified properties, or create a
	 * new one and return it if one does not exist for the specified properties.
	 * 
	 * @param requestProperties
	 *            The request properties to find a channel for.
	 * 
	 * @since Version 1.1
	 */
	synchronized public Channel getChannel(PropertiesVO requestProperties) {
		// used to determine the current highest channel id.
		// if a new channel is created, this number will be used as the channel
		// id.
		int newChannelId = 0;

		for (Channel channel : channels) {
			// if the properties of the current channel match the specified
			// properties return it
			if (channel.getRequestProperties().propertiesAreEqual(
					requestProperties)) {
				return channel;
			} else {
				// is the current channel id the largest?
				if (channel.getChannelId() > newChannelId) {
					newChannelId = channel.getChannelId();
				}
			}
		}

		// create the new channel id
		newChannelId = newChannelId + 1;

		if (logger.isInfoEnabled()) {
			logger.info("Creating Channel # " + newChannelId);
		}

		// no channel found for the properties. Create a new one, add it to
		// the collection, then return it
		Channel newChannel = new Channel(requestProperties, newChannelId);

		channels.add(newChannel);

		return newChannel;
	}

	/**
	 * Attempt to recycle a channel, if and only if it does not have any pending
	 * requests.
	 * 
	 * @param channelIn
	 *            The channel to attempt to recycle.
	 * 
	 * @since Version 1.1
	 */
	public void recycleChannel(Channel channelIn) {
		if (logger.isDebugEnabled()) {
			logger.debug("Attempting to recycle Channel # "
					+ channelIn.getChannelId());
		}

		synchronized (channelIn) {
			// if the channel does not have any pending requests
			if (channelIn.getRequestCount() == 0) {
				if (logger.isInfoEnabled()) {
					logger.info("Recycling Channel # "
							+ channelIn.getChannelId());
				}

				// remove it from the collection and nullify it
				channels.remove(channelIn);
				channelIn = null;

				if (logger.isInfoEnabled()) {
					logger.info("Channels remaining --> " + channels.size());
				}
			} else {
				if (logger.isDebugEnabled()) {
					logger.debug("Cannot recycle channel # "
							+ channelIn.getChannelId() + ", it has "
							+ channelIn.getRequestCount()
							+ " pending request(s)");
				}
			}
		}
	}
}