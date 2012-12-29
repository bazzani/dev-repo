package com.autometrics.connectors.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autometrics.connectors.DearbornConnectorV9J2EE;
import com.autometrics.connectors.DummyResourceConnector;
import com.autometrics.connectors.IResourceConnector;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.ResourceConnectorPropertiesFactory;
import com.autometrics.connectors.exceptions.InvalidConnectorPropertiesException;
import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.generics.vo.PropertiesVO;
import com.autometrics.generics.vo.PropertyVO;

public class AbstractResourceConnectorTest {

	public static String connectorVersionClassName;
	public static String connectorVersionName;

	public static PropertiesVO requestProperties;

	public static IResourceConnector connector;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		connectorVersionName = ResourceConnectorFactory.DEARBORN_V9_J2EE;
		connectorVersionClassName = DearbornConnectorV9J2EE.class
				.getSimpleName();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		connectorVersionClassName = null;
	}

	@Before
	public void setUp() throws Exception {
		requestProperties = ResourceConnectorPropertiesFactory
				.GetSupportedProperties(connectorVersionClassName);
	}

	@After
	public void tearDown() throws Exception {
		requestProperties = null;
	}

	@Test
	public final void testAbstractResourceConnector() {
		try {
			requestProperties.setProperty(new PropertyVO("connectorversion",
					connectorVersionName));

			connector = ResourceConnectorFactory
					.CreateResourceConnector(requestProperties);
		} catch (CreateConnectorException e) {
			fail("Failed to create connector : " + e.getMessage());
		}

		assertNotNull(connector);
	}

	@Test
	public final void testSetInvalidRequestProperties() {
		requestProperties = ResourceConnectorPropertiesFactory
				.GetSupportedProperties(DummyResourceConnector.class
						.getSimpleName());

		requestProperties.setProperty(new PropertyVO("connectorversion",
				"DUMMY_CONNECTOR"));

		try {
			connector.setRequestProperties(requestProperties);
		} catch (InvalidConnectorPropertiesException e) {
			fail("Failed to set properties on the connector : "
					+ e.getMessage());
		} catch (InitConnectorException e) {
			fail("Failed to set properties on the connector : "
					+ e.getMessage());
		}
	}
}
