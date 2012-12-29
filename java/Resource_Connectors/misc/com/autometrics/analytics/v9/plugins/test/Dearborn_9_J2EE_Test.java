package com.autometrics.analytics.v9.plugins.test;

import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.IResourceConnector;
import com.autometrics.generics.vo.PropertiesVO;

public class Dearborn_9_J2EE_Test {

	public static void main(String[] args)
	{
		// object containing the results 
		String[][] results;
		
		// object for displaying the concatenated results
		StringBuilder resultsString = new StringBuilder();
		
		try
		{
			// the version of the data connector to create
			String version = ResourceConnectorFactory.DEARBORN_V9_J2EE;
			
			// create a data connector properties VO
			PropertiesVO vo = new PropertiesVO(
//					new String[] {"server","websvc","project","userid","passwd","report","verbose"},
					new String[] {"server","websvc","project","userid","passwd","report","timeout"},
//					new String[] {
//							"localhost",
//							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
//							"PulseWS",
//							"Administrator",
//							"",
////							"Live_DS1_P1_E5_Make_Segment_Model_Cube",
////							"LIVE_DS1_P1_E5_TOP_DMA_BY_MAKE_TABLE_SPARK",
////							"LIVE_DS1_P1_E3_MAKE_TABLE_INDEX",
////							"Enter a Serial Sales Month:114;Enter a Sales Day:29",
////							"Dev_WS_Cube",
////							"",
//							"true"});
					new String[] {
							"localhost",
//							"http://www.travelocity.autometrics.com/AnalyticsWS/services/MSTRWSJ",
//							"PulseWS",
//							"http://www.pulse.autometrics.com/AnalyticsWS/services/MSTRWSJ",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",

							"PulseWS",
							"DASHBOARDS_PULSE",
							"d45hb04rd5",
							"DEV_Enterprise_Monitoring_Test_Pulse",

//							"PaidSearchWS",
//							"TRVLEUCtrl",
//							"D4shB04rds",
//							"DEV_Enterprise_Monitoring_Test_PaidSearch",

//							"Administrator",
//							"1911manning",
							
//							"true"
							"300000"
							});
			
			// create the data connector from the factory 
			IResourceConnector connector = ResourceConnectorFactory.CreateResourceConnector(version);
			
			// check the required properties are valid
			if(connector.validateProperties(vo));
			{
				// execute the report
				results = connector.getReportResults(vo);
			}
			
			
			// if any results were returned
			if(results != null && results.length > 0) {
				for(int i = 0; i < results.length; i++) {
					for(int j = 0; j < results[i].length; j++) {
						resultsString.append(results[i][j]);
					}
					
					if(i < results[i].length) {
						resultsString.append(": ");
					}
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			System.out.println(resultsString.toString());
			
			results = null;
		}
	}
}