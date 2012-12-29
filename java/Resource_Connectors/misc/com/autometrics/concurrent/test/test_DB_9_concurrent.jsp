<%@page import="java.util.ArrayList"%>
<%@page import="com.autometrics.generics.vo.PropertiesVO"%>
<%@page import="com.autometrics.concurrent.test.TestChannelManager"%>

<%
	ArrayList<PropertiesVO> props = new ArrayList<PropertiesVO>();

	// non-concurrent properties
	PropertiesVO non_concurrent_properties = new PropertiesVO(
			new String[] { "connectorversion", "verbose", "index",
					"server", "project", "report", "websvc", "params",
					"userid", "passwd" },
			new String[] {
					"dbv9j2ee",
					"false",
					"server,websvc,project,userid,passwd,report,params,verbose",
					"localhost",
					"PulseWS",
					"LIVE_DS1_P2_E2_MODEL_TREND",
					"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
					"Enter a Serial Sales Month:116;Enter a Sales Day:31;Enter a segment:Compact Car",
					"DASHBOARDS_PULSE", "d45hb04rd5" });

	// concurrent properties
	PropertiesVO concurrent_properties = new PropertiesVO(
			new String[] { "connectorversion", "verbose", "index",
					"server", "project", "report", "websvc", "params",
					"userid", "passwd", "concurrent" },
			new String[] {
					"dbv9j2ee",
					"false",
					"server,websvc,project,userid,passwd,report,params,verbose,concurrent",
					"localhost",
					"PulseWS",
					"LIVE_DS1_P2_E2_MODEL_TREND",
					"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
					"Enter a Serial Sales Month:116;Enter a Sales Day:31;Enter a segment:Compact Car",
					"DASHBOARDS_PULSE", "d45hb04rd5", "true" });

	// add three concurrent requests
	props.add(concurrent_properties);
	props.add(concurrent_properties);
	props.add(concurrent_properties);

	// run the requests
	TestChannelManager test = new TestChannelManager(props);
%>