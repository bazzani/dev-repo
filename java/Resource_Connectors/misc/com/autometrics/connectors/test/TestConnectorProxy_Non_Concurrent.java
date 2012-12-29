package com.autometrics.connectors.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Test;

import com.autometrics.connectors.ConnectorProxy;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.ResourceVO;
import com.autometrics.connectors.exceptions.ExecuteConnectorException;
import com.autometrics.connectors.exceptions.UnavailableResourceException;
import com.autometrics.generics.exceptions.PropertiesVOCreationException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Class to test non concurrent functionality of the {@link ConnectorProxy}
 * class.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class TestConnectorProxy_Non_Concurrent {
	// The request properties
	public static PropertiesVO requestProperties;

	// The resource retrieved from the connector
	public static ResourceVO resource;

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void cleanup() throws Exception {
		requestProperties = null;
		resource = null;
	}

	/**
	 * Create the request properties
	 * 
	 * @throws PropertiesVOCreationException
	 */
	@Test
	public void createRequestProperties() throws PropertiesVOCreationException {
		// Create the request properties
		requestProperties = new PropertiesVO(new String[] { "server", "websvc",
				"project", "userid", "passwd", "report", "params",
				ResourceConnectorFactory.CONNECTOR_VERSION }, new String[] {
				"localhost",
				"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ", "PulseWS",
				"DASHBOARDS_PULSE", "d45hb04rd5",
				"LIVE_DS1_P1_E3_MAKE_TABLE_INDEX",
				"Enter a Serial Sales Month:117;Enter a Sales Day:15",
				// ResourceConnectorFactory.DEARBORN_V9_J2EE
				"2" });

		assertNotNull("A problem occurred creating the request properties",
				requestProperties);
	}

	/**
	 * Test method for
	 * {@link com.autometrics.connectors.ConnectorProxy#execute(com.autometrics.generics.vo.PropertiesVO)}
	 * .
	 * 
	 * @throws ExecuteConnectorException
	 */
	@Test
	public void testExecute() {
		try {
			ConnectorProxy.execute(requestProperties);
		} catch (ExecuteConnectorException e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Test method for
	 * {@link com.autometrics.connectors.ConnectorProxy#getResource(com.autometrics.generics.vo.PropertiesVO)}
	 * .
	 */
	@Test
	public void testGetResource() throws UnavailableResourceException {
		resource = ConnectorProxy.getResource(requestProperties);

		assertNotNull("A problem occurred retrieving the request resource.",
				resource);
	}
}