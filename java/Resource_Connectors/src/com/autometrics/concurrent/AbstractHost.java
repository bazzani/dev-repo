package com.autometrics.concurrent;

/**
 * Abstract class which all hosts must extend. Hosts are responsible for
 * interacting with a service on behalf of a channel.
 * <p>
 * A new thread will be created where the host/service interaction is performed
 * independent of the channel it is representing.
 * <p>
 * A channel interacts with an <code>AbstractHost</code>, making it possible for
 * it to use a range of host implementations.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public abstract class AbstractHost implements Runnable {
	/**
	 * The channel that this host performs service interactions for.
	 */
	protected Channel channel;

	/**
	 * Execute the host's main logic to interact with a service. If a resource
	 * is retrieved, it is applied to the channel.
	 * 
	 * @since Version 1.1
	 */
	public abstract void run();

	/**
	 * Constructor that assigns the channel to this host.
	 * 
	 * @param channelIn
	 *            The channel to get the resource for.
	 */
	public AbstractHost(Channel channelIn) {
		this.channel = channelIn;
	}
}