package com.autometrics.analytics.v9.plugins.test;

import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.IResourceConnector;
import com.autometrics.generics.vo.PropertiesVO;
import com.autometrics.generics.vo.PropertyVO;

public class Dearborn_9_J2EE_Test_Paid_Search {

	public static void main(String[] args)
	{
		try
		{
			// the version of the data connector to create
			String version = ResourceConnectorFactory.DEARBORN_V9_J2EE;
			
			// create a data connector properties VO
			PropertiesVO vo = new PropertiesVO(
					new String[] {"server","websvc","project","userid","passwd",
							"report",
							"params","verbose"},
					new String[] {
							"localhost",
//							"http://192.168.1.41/AutometricsWS/services/MSTRWSJ",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
							"PaidSearchWS",
							"TRVLEUCtrl",
							"D4shB04rds",
							"Dev2 Valid Attributes",
							"Enter a valid Client ID:TVL;Enter a valid Dashboard Name:Paid Search;",
							"false"});
			
			// create the data connector from the factory 
			IResourceConnector connector = ResourceConnectorFactory.CreateResourceConnector(version);
			
			// check the required properties are valid
			if(connector.validateProperties(vo));
			{
				// execute the report
				connector.getReportResults(vo);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/**
server:localhost;
client:PaidSearchWS;
pluginversion:v9j2ee;
userid:${dashboard.DBUSER};;passwd:${dashboard.BDPWD};;
report:LIVE_DS1_P1_E3_MTD;
websvc:http\://192.168.1.41/AutometricsWS/services/MSTRWSJ;
params:Enter a Market ID\:${request.market};\;Enter a Brand\:${request.brand};\;Enter an Intention Category\:${request.cats};\;Enter a Date\:${request.dateTo};\;;


server:localhost;
client:PaidSearchWS;
pluginversion:v9j2ee;
userid:${dashboard.DBUSER};;
passwd:${dashboard.BDPWD};;
report:Dev2 Valid Attributes;
websvc:http\://192.168.1.41/AutometricsWS/services/MSTRWSJ;
params:Enter a valid Client ID\:TVL\;Enter a valid Dashboard Name\:Paid Search\;;
 */