package com.autometrics.connectors.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Test;

import com.autometrics.connectors.ConnectorProxy;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.ResourceVO;
import com.autometrics.connectors.exceptions.InvalidConnectorResponseException;
import com.autometrics.generics.exceptions.PropertiesVOCreationException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Test the DearbornConnectorV9J2EE connector (via the {@link ConnectorProxy})
 * to verify it is able to successfully execute a command and get a resource for
 * the following report using concurrent features:
 * <ul>
 * <li>Server : 1.40</li>
 * <li>Project : PulseWS</li>
 * <li>Report : LIVE_DS1_P1_E3_MAKE_TABLE_INDEX</li>
 * <li>Parameters : Enter a Serial Sales Month:117;Enter a Sales Day:15</li>
 * </ul>
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class ConnectorProxy_Test_Concurrent_DearbornV9J2EE {
	// The request properties
	public static PropertiesVO requestProperties;

	// The resource retrieved from the connector
	public static ResourceVO resource;

	@AfterClass
	public static void cleanup() {
		requestProperties = null;
		resource = null;
	}

	/**
	 * Create the request properties with a concurrent flag.
	 */
	@Test
	public void createRequestProperties() {
		try {
			// Create the request properties
			requestProperties = new PropertiesVO(new String[] { "server",
					"1websvc", "project", "userid", "passwd", "report",
					"params", "concurrent",
					ResourceConnectorFactory.CONNECTOR_VERSION }, new String[] {
					"localhost",
					"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
					"PulseWS", "DASHBOARDS_PULSE", "d45hb04rd5",
					"LIVE_DS1_P1_E3_MAKE_TABLE_INDEX",
					"Enter a Serial Sales Month:117;Enter a Sales Day:15",
					"true", ResourceConnectorFactory.DEARBORN_V9_J2EE });

			assertNotNull("A problem occurred creating the request properties",
					requestProperties);
		} catch (PropertiesVOCreationException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Execute a command on the {@link ConnectorProxy}. Test method for
	 * {@link com.autometrics.connectors.ConnectorProxy#execute(com.autometrics.generics.vo.PropertiesVO)}
	 * .
	 */
	@Test
	public void testExecute() {
		try {
			ConnectorProxy.execute(requestProperties);
		} catch (InvalidConnectorResponseException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Get a resource from the {@link ConnectorProxy}. Test method for
	 * {@link com.autometrics.connectors.ConnectorProxy#getResource(com.autometrics.generics.vo.PropertiesVO)}
	 * .
	 */
	// @Test
	public void testGetResource() throws InvalidConnectorResponseException {
		try {
			resource = ConnectorProxy.getResource(requestProperties);

			assertNotNull(
					"A problem occurred retrieving the request resource.",
					resource);
		} catch (InvalidConnectorResponseException e) {
			fail(e.getMessage());
		}
	}
}