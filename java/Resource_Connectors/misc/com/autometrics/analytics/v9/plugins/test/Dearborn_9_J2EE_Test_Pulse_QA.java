package com.autometrics.analytics.v9.plugins.test;

import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.IResourceConnector;
import com.autometrics.generics.vo.PropertiesVO;

public class Dearborn_9_J2EE_Test_Pulse_QA {

	public static void main(String[] args) {

		// object for displaying the concatenated results
		StringBuilder resultsString = new StringBuilder();

		try {
			// create a data connector properties VO
			PropertiesVO vo = new PropertiesVO(new String[] { "server",
					"websvc", "project", "userid", "passwd", "report",
					"verbose", ResourceConnectorFactory.CONNECTOR_VERSION },
					new String[] { "localhost",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
							"Pulse Staging QA", "DASHBOARDS_PULSE",
							"d45hb04rd5", "Unknown Records Zips", "true",
							ResourceConnectorFactory.DEARBORN_V9_J2EE });

			// create the data connector from the factory
			IResourceConnector connector = ResourceConnectorFactory
					.CreateResourceConnector(vo);

			// execute the report
			results = (String[][]) connector.getResource().getData();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(resultsString.toString());
			results = null;
		}
	}
}