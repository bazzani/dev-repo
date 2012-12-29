package com.autometrics.connectors;

import org.apache.log4j.Logger;

import com.autometrics.generics.exceptions.PropertiesVOCreationException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Factory class that instantiates <code>PropertiesVO</code> objects for
 * implementations of the <code>IResourceConnector</code> interface.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see IResourceConnector
 * @see ResourceConnectorFactory
 * @see PropertiesVO
 */
public class ResourceConnectorPropertiesFactory {

	/**
	 * The class's logger.
	 */
	private static Logger logger = Logger
			.getLogger(ResourceConnectorPropertiesFactory.class);

	/**
	 * Create and return a <code>PropertiesVO</code> value object for the
	 * specified connector. This object will define the required and optional
	 * properties that the connector supports.
	 * 
	 * @param connectorClassName
	 *            The class name of the connector.
	 * 
	 * @return The <code>PropertiesVO</code> object for the specified connector.
	 */
	public static PropertiesVO GetSupportedProperties(String connectorClassName) {
		PropertiesVO properties = null;

		if (connectorClassName != null && connectorClassName.length() > 0) {
			try {
				// Dearborn 9 deployed on J2EE
				if (connectorClassName
						.equalsIgnoreCase(DearbornConnectorV9J2EE.class
								.getSimpleName())) {
					// create the properties VO
					properties = new PropertiesVO(
							new String[] { "server", "websvc", "project",
									"userid", "passwd", "report", "params",
									"portno", "cached", "timeout", "verbose" },
							new boolean[] { true, true, true, true, true, true,
									false, false, false, false, false });
				}

				// dummy connector that simulates delayed responses
				else if (connectorClassName
						.equalsIgnoreCase(DummyResourceConnector.class
								.getSimpleName())) {
					// create the properties VO
					properties = new PropertiesVO(
							new String[] { "server", "websvc", "project",
									"userid", "passwd", "report", "params",
									"portno", "cached", "timeout", "verbose" },
							new boolean[] { true, true, true, true, true, true,
									false, false, false, false, false });
				}
			} catch (PropertiesVOCreationException e) {
				logger.error(
						"A problem occurred creating the connector properties",
						e);
			}
		}

		return properties;
	}
}