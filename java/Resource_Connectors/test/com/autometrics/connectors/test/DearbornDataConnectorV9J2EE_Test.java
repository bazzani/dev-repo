package com.autometrics.connectors.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Test;

import com.autometrics.connectors.IResourceConnector;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.ResourceVO;
import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.connectors.exceptions.ConnectorException;
import com.autometrics.generics.exceptions.PropertiesVOCreationException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Test the DearbornConnectorV9J2EE connector (via the
 * {@link ResourceConnectorFactory}) to verify it is able to successfully run
 * the following reports sequentially:
 * <ul>
 * <li>Server : 1.40</li>
 * <li>Project : PulseWS</li>
 * <li>Report : LIVE_DS1_P1_E3_MAKE_TABLE_INDEX</li>
 * <li>Parameters : Enter a Serial Sales Month:117;Enter a Sales Day:15</li>
 * </ul>
 * 
 * <ul>
 * <li>Server : 1.40</li>
 * <li>Project : PulseWS</li>
 * <li>Report : LIVE_DS1_P1_E3_MAKE_TABLE_INDEX</li>
 * <li>Parameters : Enter a Serial Sales Month:117;Enter a Sales Day:30</li>
 * </ul>
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class DearbornDataConnectorV9J2EE_Test {
	// The request properties
	public static PropertiesVO requestProperties;

	// The connector
	public static IResourceConnector connector;

	// The resource retrieved from the connector
	public static ResourceVO resource;

	@AfterClass
	public static void cleanup() {
		requestProperties = null;
		connector = null;
		resource = null;
	}

	/**
	 * Create the request properties.
	 */
	@Test
	public void createRequestProperties() {
		try {
			// Create the request properties
			requestProperties = new PropertiesVO(
					new String[] { "server", "websvc", "project", "userid",
							"passwd", "report", "params",
							ResourceConnectorFactory.CONNECTOR_VERSION },
					new String[] {
							"localhost",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
							"PulseWS",
							"DASHBOARDS_PULSE",
							"d45hb04rd5",
							"LIVE_DS1_P1_E3_MAKE_TABLE_INDEX",
							"Enter a Serial Sales Month:117;Enter a Sales Day:15",
							ResourceConnectorFactory.DEARBORN_V9_J2EE });

			assertNotNull("A problem occurred creating the request properties",
					requestProperties);
		} catch (PropertiesVOCreationException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Create the connector.
	 */
	@Test
	public void createDataConnector() {
		try {
			connector = ResourceConnectorFactory
					.CreateResourceConnector(requestProperties);

			assertNotNull(
					"A problem occurred creating the DEARBORN_V9_J2EE connector",
					connector);
		} catch (CreateConnectorException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Attempt to get the resource from the connector.
	 */
	@Test
	public void testGetResource() {
		try {
			resource = connector.getResource();
			assertNotNull("A problem occurred retrieving the resource",
					resource);
		} catch (ConnectorException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Create the request properties for the second time.
	 */
	@Test
	public void createRequestProperties2() throws PropertiesVOCreationException {
		try {
			// Create the request properties
			requestProperties = new PropertiesVO(
					new String[] { "server", "websvc", "project", "userid",
							"passwd", "report", "params",
							ResourceConnectorFactory.CONNECTOR_VERSION },
					new String[] {
							"localhost",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
							"PulseWS",
							"DASHBOARDS_PULSE",
							"d45hb04rd5",
							"LIVE_DS1_P1_E3_MAKE_TABLE_INDEX",
							"Enter a Serial Sales Month:117;Enter a Sales Day:30",
							ResourceConnectorFactory.DEARBORN_V9_J2EE });

			assertNotNull(
					"A problem occurred creating the second request properties",
					requestProperties);
		} catch (PropertiesVOCreationException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Attempt to set the new request properties on the connector.
	 */
	@Test
	public void testSetRequestProperties() {
		try {
			connector.setRequestProperties(requestProperties);
		} catch (ConnectorException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Attempt to get the resource from the connector with the second set of
	 * request properties.
	 */
	@Test
	public void testGetResource2() throws ConnectorException {
		try {
			resource = connector.getResource();
			assertNotNull("A problem occurred retrieving the second resource",
					resource);
		} catch (ConnectorException e) {
			fail(e.getMessage());
		}
	}
}