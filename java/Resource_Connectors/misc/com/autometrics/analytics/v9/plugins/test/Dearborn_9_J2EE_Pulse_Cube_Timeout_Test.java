package com.autometrics.analytics.v9.plugins.test;

import com.autometrics.concurrent.ChannelManager;
import com.autometrics.connectors.DataConnectorFactory;
import com.autometrics.connectors.IDataConnector;
import com.autometrics.generics.vo.PropertiesVO;

public class Dearborn_9_J2EE_Pulse_Cube_Timeout_Test {

	public static void main(String[] args)
	{
		try
		{
			// the version of the data connector to create
			String version = DataConnectorFactory.DEARBORN_V9_J2EE;
			
			// create a data connector properties VO
			PropertiesVO vo = new PropertiesVO(
					new String[] {"server","websvc","project","userid","passwd","report","timeout","verbose"},
					new String[] {
							"localhost",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
							"PulseWS",
							"Administrator",
							"1911manning",
							"Live_DS1_P2_E1_Make_Segment_Model_Series_Cube",
							"540000",
							"true"
							});
			
			// create the data connector from the factory 
			IDataConnector connector = DataConnectorFactory.CreateDataConnector(version);
			
			// check the required properties are valid
			if(connector.validateProperties(vo));
			{
				// execute the report
				connector.executeReport(vo);
			}
		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	}
}