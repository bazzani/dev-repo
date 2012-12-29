package com.autometrics.connectors;

import org.apache.log4j.Logger;

import com.autometrics.concurrent.ChannelManager;
import com.autometrics.concurrent.exceptions.InvalidChannelResponseException;
import com.autometrics.connectors.exceptions.ConnectorException;
import com.autometrics.connectors.exceptions.InvalidConnectorResponseException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * This is the main class used to interact with connectors and should be used to
 * execute commands on and retrieve resources from services, rather than using
 * the connectors directly.
 * <p>
 * The <code>execute</code> method can be called to execute a command on a
 * service that has no response, only processing logic.
 * <p>
 * The <code>getResource</code> method can be called to retrieve resources such
 * as report results.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see ChannelManager
 */
public class ConnectorProxy {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger.getLogger(ConnectorProxy.class);

	/**
	 * Calling this method is similar to calling the
	 * {@link com.autometrics.connectors.ConnectorProxy#getResource(com.autometrics.generics.vo.PropertiesVO)}
	 * method and never returning the response from the request.
	 * 
	 * @param requestPropertiesIn
	 *            The request properties.
	 * 
	 * @throws InvalidConnectorResponseException
	 */
	public static void execute(PropertiesVO requestPropertiesIn)
			throws InvalidConnectorResponseException {
		try {
			if (logger.isInfoEnabled()) {
				logger.info("Executing command on connector proxy...");
			}

			processRequest(requestPropertiesIn);

			if (logger.isInfoEnabled()) {
				logger
						.info("...successfully executed command on connector proxy");
			}
		} catch (InvalidConnectorResponseException e) {
			logger
					.error(
							"A problem occurred executing the command on the connector proxy!",
							e);

			throw e;
		}
	}

	/**
	 * Retrieve a resource from a connector.
	 * <p>
	 * The internal data structure that is stored in the returned
	 * {@link ResourceVO} object is determined by the implementation of the
	 * connector and should be cast to the appropriate data type by the object
	 * calling this method i.e. <br>
	 * <code>
	 * ResourceVO theResource = ConnectorProxy.getResource();<br>
	 * String[][] results = (String[][]) theResource.getData();
	 * </code>
	 * 
	 * @param requestPropertiesIn
	 *            The request properties.
	 * 
	 * @return The requested resource.
	 * 
	 * @throws InvalidConnectorResponseException
	 */
	public static ResourceVO getResource(PropertiesVO requestPropertiesIn)
			throws InvalidConnectorResponseException {
		ResourceVO theResource;

		try {
			if (logger.isInfoEnabled()) {
				logger.info("Retrieving resource from connector proxy...");
			}

			theResource = processRequest(requestPropertiesIn);

			if (logger.isInfoEnabled()) {
				logger.info("...Resource retrieved from connector proxy");
			}

			return theResource;
		} catch (InvalidConnectorResponseException e) {
			logger
					.error(
							"A problem occurred retrieving the resource from the connector proxy!",
							e);

			throw e;
		}
	}

	/**
	 * If it is a concurrent request, use a {@link ChannelManager} , otherwise
	 * get the resource directly from the from a resource connector via the
	 * {@link ResourceConnectorFactory}.
	 * 
	 * @param requestPropertiesIn
	 *            The request properties
	 * 
	 * @return The response from the request.
	 * 
	 * @throws InvalidConnectorResponseException
	 */
	private static ResourceVO processRequest(PropertiesVO requestPropertiesIn)
			throws InvalidConnectorResponseException {
		if (requestPropertiesIn.getPropertyValue("concurrent")
				.equalsIgnoreCase("true")) {
			try {
				return ChannelManager.getInstance().registerRequest(
						requestPropertiesIn);
			} catch (InvalidChannelResponseException e) {
				throw new InvalidConnectorResponseException(
						"Invalid connector response!", e);
			}
		} else {
			try {
				return ResourceConnectorFactory.CreateResourceConnector(
						requestPropertiesIn).getResource();
			} catch (ConnectorException e) {
				throw new InvalidConnectorResponseException(
						"Invalid connector response!", e);
			}
		}
	}
}