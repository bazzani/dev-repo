<%@ page
	import="com.autometrics.concurrent.test.TestChannelManager"%>

<%
	String numChannels = request.getParameter("channels");
	String numRequests = request.getParameter("requests");

	TestChannelManager test;

	if (numChannels != null && numRequests != null) {
		test = new TestChannelManager(Integer.parseInt(numChannels),
				Integer.parseInt(numRequests));
	} else if (numChannels != null && numRequests == null) {
		test = new TestChannelManager(Integer.parseInt(numChannels));
	} else {
		test = new TestChannelManager();
	}
%>