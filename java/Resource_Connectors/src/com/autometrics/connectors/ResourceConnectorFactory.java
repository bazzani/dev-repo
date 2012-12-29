package com.autometrics.connectors;

import org.apache.log4j.Logger;

import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Factory class that instantiates implementations of the
 * <code>IResourceConnector</code> interface.
 * 
 * @author Barry Evans
 * @since Version 1.0
 * @see IResourceConnector
 * @see AbstractResourceConnector
 * @see ResourceConnectorPropertiesFactory
 * @see DearbornConnectorV9J2EE
 * @see CreateConnectorException
 */
public class ResourceConnectorFactory {
	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger
			.getLogger(ResourceConnectorFactory.class);

	/**
	 * Static property for the connector version property.
	 */
	public static final String CONNECTOR_VERSION = "connectorversion";

	/**
	 * Static property for the Dearborn Version 9 J2EE connector.
	 */
	public static final String DEARBORN_V9_J2EE = "dbv9j2ee";

	/**
	 * Static property for a dummy connector that emulates a real one.
	 */
	public static final String DUMMY_CONNECTOR = "dummy";

	/**
	 * Create and return an implementation of the
	 * <code>IResourceConnector</code> interface.
	 * 
	 * @param propertiesIn
	 *            The instance properties to be applied to the connector.
	 * 
	 * @return An implementation of the <code>IResourceConnector</code>
	 *         interface.
	 * 
	 * @throws CreateConnectorException
	 *             if a problem occurs when creating the
	 *             {@link IResourceConnector}
	 */
	public static IResourceConnector CreateResourceConnector(
			PropertiesVO propertiesIn)
			throws CreateConnectorException {
		IResourceConnector resourceConnector = null;

		// is the connector version property specified?
		if (propertiesIn.hasProperty(CONNECTOR_VERSION)) {
			String connectorVersion = propertiesIn
					.getPropertyValue(CONNECTOR_VERSION);

			try {
				// which version of the connector are attempting to create?
				if (logger.isInfoEnabled()) {
					logger.info("Creating \"" + connectorVersion
							+ "\" resource connector...");
				}

				// Dearborn 9 running under J2EE
				if (connectorVersion.equalsIgnoreCase(DEARBORN_V9_J2EE)) {
					resourceConnector = new DearbornConnectorV9J2EE(
							propertiesIn);
				} else if (connectorVersion.equalsIgnoreCase(DUMMY_CONNECTOR)) {
					resourceConnector = new DummyResourceConnector(propertiesIn);
				} else {
					logger
							.error("No resource connector exists with the specified version \""
									+ connectorVersion + "\"");

					throw new CreateConnectorException(
							"No resource connector exists with the specified version \""
									+ connectorVersion + "\"");
				}

				if (logger.isInfoEnabled()) {
					logger.info("\"" + connectorVersion
							+ "\" resource connector created!");
				}
			} catch (CreateConnectorException e) {
				throw e;
			}
		} else {
			throw new CreateConnectorException(
					"No resource connector version specified, please ensure a "
							+ CONNECTOR_VERSION
							+ " property exists in the specified properties.");
		}

		return resourceConnector;
	}
}