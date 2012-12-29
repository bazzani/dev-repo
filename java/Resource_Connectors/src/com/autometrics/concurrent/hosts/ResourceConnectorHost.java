package com.autometrics.concurrent.hosts;

import org.apache.log4j.Logger;

import com.autometrics.concurrent.AbstractHost;
import com.autometrics.concurrent.Channel;
import com.autometrics.connectors.IResourceConnector;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.exceptions.ConnectorException;
import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.connectors.exceptions.ExecuteConnectorException;

/**
 * Class responsible for interacting with a service on behalf of a channel via
 * an implementation of the {@link IResourceConnector} interface.
 * <p>
 * A {@link IResourceConnector} implementation will be created as a proxy to the
 * service and the request will be passed on to the connector.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see Channel
 * @see AbstractHost
 * @see IResourceConnector
 * @see ResourceConnectorFactory
 * @see CreateConnectorException
 * @see ExecuteConnectorException
 */
public class ResourceConnectorHost extends AbstractHost {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger
			.getLogger(ResourceConnectorHost.class);

	/**
	 * Constructs a new {@link ResourceConnectorHost} that assigns the channel
	 * to this host.
	 * 
	 * @param channelIn
	 *            The channel to get the resource for.
	 */
	public ResourceConnectorHost(Channel channelIn) {
		super(channelIn);
	}

	public void run() {
		try {
			// create the resource connector from the factory and set the
			// resource on the channel
			channel.setResource(ResourceConnectorFactory
					.CreateResourceConnector(channel.getRequestProperties())
					.getResource());
		} catch (ConnectorException e) {
			logger
					.error(
							"Failed to retrieve the requested resource from the connector.",
							e);

			// notify the channel that the host failed to successfully interact
			// with the service
			channel.setResource(null);
		}
	}
}