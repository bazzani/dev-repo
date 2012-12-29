/**
 * MSTRWSJStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/*
 * MSTRWSJStub java implementation
 */

public class MSTRWSJStub extends org.apache.axis2.client.Stub {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return Long.toString(System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("MSTRWSJ"
				+ getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[53];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ConnectToProject"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GetHistory"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"RenameHistoryListMessage"));
		_service.addOperation(__operation);

		_operations[2] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GetContents"));
		_service.addOperation(__operation);

		_operations[3] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetMWSInfoProperties"));
		_service.addOperation(__operation);

		_operations[4] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetAttributeChildren"));
		_service.addOperation(__operation);

		_operations[5] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"SimpleExecuteReport"));
		_service.addOperation(__operation);

		_operations[6] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetIncrementalBrowseResults"));
		_service.addOperation(__operation);

		_operations[7] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetUserPreferences"));
		_service.addOperation(__operation);

		_operations[8] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "Connect"));
		_service.addOperation(__operation);

		_operations[9] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetRSDocumentAnnotations"));
		_service.addOperation(__operation);

		_operations[10] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "TestService"));
		_service.addOperation(__operation);

		_operations[11] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetMWSOfficeInstallInfo"));
		_service.addOperation(__operation);

		_operations[12] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GetMWSIdentity"));
		_service.addOperation(__operation);

		_operations[13] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetReportAnnotations"));
		_service.addOperation(__operation);

		_operations[14] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GetResources"));
		_service.addOperation(__operation);

		_operations[15] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetDocumentPromptElements"));
		_service.addOperation(__operation);

		_operations[16] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetVisualizationLists"));
		_service.addOperation(__operation);

		_operations[17] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetHierarchyAttributes"));
		_service.addOperation(__operation);

		_operations[18] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"SimpleGetRSDocumentResults"));
		_service.addOperation(__operation);

		_operations[19] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"DrillRSDocumentPromptElement"));
		_service.addOperation(__operation);

		_operations[20] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetReportResults"));
		_service.addOperation(__operation);

		_operations[21] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetMWSFunctionalityProperties"));
		_service.addOperation(__operation);

		_operations[22] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetProjectFolder"));
		_service.addOperation(__operation);

		_operations[23] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"ManipulateUserAnswer"));
		_service.addOperation(__operation);

		_operations[24] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetDocumentResults"));
		_service.addOperation(__operation);

		_operations[25] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"ExecuteIncrementalBrowse"));
		_service.addOperation(__operation);

		_operations[26] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetAttributeParents"));
		_service.addOperation(__operation);

		_operations[27] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetRSDocumentPromptElements"));
		_service.addOperation(__operation);

		_operations[28] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "CancelReport"));
		_service.addOperation(__operation);

		_operations[29] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetMWSProperties"));
		_service.addOperation(__operation);

		_operations[30] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"ExecuteRSDocument"));
		_service.addOperation(__operation);

		_operations[31] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"DrillReportPromptElement"));
		_service.addOperation(__operation);

		_operations[32] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "Disconnect"));
		_service.addOperation(__operation);

		_operations[33] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetAttributeElements"));
		_service.addOperation(__operation);

		_operations[34] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"ModifyHistoryListMessages"));
		_service.addOperation(__operation);

		_operations[35] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"SetReportAnnotations"));
		_service.addOperation(__operation);

		_operations[36] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GetProjects"));
		_service.addOperation(__operation);

		_operations[37] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetReportPromptElements"));
		_service.addOperation(__operation);

		_operations[38] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"SimpleGetReportResults"));
		_service.addOperation(__operation);

		_operations[39] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetDMXMetricFunctionProperties"));
		_service.addOperation(__operation);

		_operations[40] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "CancelDocument"));
		_service.addOperation(__operation);

		_operations[41] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"CancelRSDocument"));
		_service.addOperation(__operation);

		_operations[42] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ExecuteReport"));
		_service.addOperation(__operation);

		_operations[43] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"DrillDocumentPromptElement"));
		_service.addOperation(__operation);

		_operations[44] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"SetRSDocumentAnnotations"));
		_service.addOperation(__operation);

		_operations[45] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "CancelBrowse"));
		_service.addOperation(__operation);

		_operations[46] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation
				.setName(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ExecuteDocument"));
		_service.addOperation(__operation);

		_operations[47] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"SimpleExecuteRSDocument"));
		_service.addOperation(__operation);

		_operations[48] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetProjectSources"));
		_service.addOperation(__operation);

		_operations[49] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetRSDocumentResults"));
		_service.addOperation(__operation);

		_operations[50] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"ChangeUserPassword"));
		_service.addOperation(__operation);

		_operations[51] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0",
				"GetObjectProperties"));
		_service.addOperation(__operation);

		_operations[52] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public MSTRWSJStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public MSTRWSJStub(
			org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener)
			throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(
				configurationContext, _service);

		configurationContext = _serviceClient.getServiceContext()
				.getConfigurationContext();

		_serviceClient.getOptions().setTo(
				new org.apache.axis2.addressing.EndpointReference(
						targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient
				.getOptions()
				.setSoapVersionURI(
						org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Default Constructor
	 */
	public MSTRWSJStub(
			org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext,
				"http://localhost:8080/MicroStrategyWS/services/MSTRWSJ");

	}

	/**
	 * Default Constructor
	 */
	public MSTRWSJStub() throws org.apache.axis2.AxisFault {

		this("http://localhost:8080/MicroStrategyWS/services/MSTRWSJ");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public MSTRWSJStub(java.lang.String targetEndpoint)
			throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature Create an iServer session and return
	 * project specific information.&lt;BR&gt;&lt;BR&gt;MWSProjectSessionInfo
	 * ConnectToProject(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ConnectToProject
	 * @param connectToProject77
	 * 
	 * @param mWSSoapHeader78
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse ConnectToProject(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject connectToProject77,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader78)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ConnectToProject");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), connectToProject77,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ConnectToProject")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader78 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader78 = toOM(
						mWSSoapHeader78,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ConnectToProject")));
				addHeader(omElementmWSSoapHeader78, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Create an
	 * iServer session and return project specific
	 * information.&lt;BR&gt;&lt;BR&gt;MWSProjectSessionInfo
	 * ConnectToProject(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startConnectToProject
	 * @param connectToProject77
	 * 
	 * @param mWSSoapHeader78
	 * 
	 */
	public void startConnectToProject(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject connectToProject77,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader78,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[0].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/ConnectToProject");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), connectToProject77,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ConnectToProject")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader78 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader78 = toOM(
					mWSSoapHeader78,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ConnectToProject")));
			addHeader(omElementmWSSoapHeader78, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultConnectToProject((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorConnectToProject(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorConnectToProject(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorConnectToProject(f);
									}
								} else {
									callback.receiveErrorConnectToProject(f);
								}
							} else {
								callback.receiveErrorConnectToProject(f);
							}
						} else {
							callback.receiveErrorConnectToProject(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorConnectToProject(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[0].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[0].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves the list of items in the users
	 * inbox (history list).&lt;BR&gt;&lt;BR&gt;MWSHistoryInfo[]
	 * GetHistory(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetHistory
	 * @param getHistory80
	 * 
	 * @param mWSSoapHeader81
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse GetHistory(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory getHistory80,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader81)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/GetHistory");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getHistory80,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetHistory")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader81 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader81 = toOM(
						mWSSoapHeader81,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetHistory")));
				addHeader(omElementmWSSoapHeader81, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * the list of items in the users inbox (history
	 * list).&lt;BR&gt;&lt;BR&gt;MWSHistoryInfo[] GetHistory(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetHistory
	 * @param getHistory80
	 * 
	 * @param mWSSoapHeader81
	 * 
	 */
	public void startGetHistory(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory getHistory80,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader81,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[1].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetHistory");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getHistory80,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetHistory")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader81 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader81 = toOM(
					mWSSoapHeader81,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetHistory")));
			addHeader(omElementmWSSoapHeader81, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetHistory((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetHistory(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetHistory(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetHistory(f);
									}
								} else {
									callback.receiveErrorGetHistory(f);
								}
							} else {
								callback.receiveErrorGetHistory(f);
							}
						} else {
							callback.receiveErrorGetHistory(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetHistory(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[1].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[1].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature This method renames the specified message
	 * id on the history list. &lt;BR&gt;&lt;BR&gt;vois
	 * RenameHistoryListMessage(&lt;BR&gt;&amp;nbsp MWSConnectInfo connectInfo,
	 * &lt;BR&gt;&amp;nbsp String sMsgID, &lt;BR&gt;&amp;nbsp String sName)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#RenameHistoryListMessage
	 * @param renameHistoryListMessage83
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse RenameHistoryListMessage(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage renameHistoryListMessage83)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[2].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/RenameHistoryListMessage");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), renameHistoryListMessage83,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"RenameHistoryListMessage")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations This method
	 * renames the specified message id on the history list.
	 * &lt;BR&gt;&lt;BR&gt;vois RenameHistoryListMessage(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo connectInfo, &lt;BR&gt;&amp;nbsp String sMsgID,
	 * &lt;BR&gt;&amp;nbsp String sName)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startRenameHistoryListMessage
	 * @param renameHistoryListMessage83
	 * 
	 */
	public void startRenameHistoryListMessage(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage renameHistoryListMessage83,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[2].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/RenameHistoryListMessage");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), renameHistoryListMessage83,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"RenameHistoryListMessage")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultRenameHistoryListMessage((com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorRenameHistoryListMessage(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorRenameHistoryListMessage(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorRenameHistoryListMessage(f);
									}
								} else {
									callback
											.receiveErrorRenameHistoryListMessage(f);
								}
							} else {
								callback
										.receiveErrorRenameHistoryListMessage(f);
							}
						} else {
							callback
									.receiveErrorRenameHistoryListMessage(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorRenameHistoryListMessage(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[2].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[2].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns the contents of the specified
	 * folder. Object type and subtype can be specified to restrict objects
	 * returned. Each object's properties can also be returned if property set
	 * specs are defined.&lt;BR&gt;&lt;BR&gt;MWSObjectInfo[]
	 * GetContents(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp
	 * string folderID,&lt;BR&gt;&amp;nbsp EnumMWSObjectType[]
	 * eType,&lt;BR&gt;&amp;nbsp EnumMWSObjSubType[] eSType,&lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetContents
	 * @param getContents85
	 * 
	 * @param mWSSoapHeader86
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse GetContents(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents getContents85,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader86)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[3].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/GetContents");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getContents85,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetContents")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader86 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader86 = toOM(
						mWSSoapHeader86,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetContents")));
				addHeader(omElementmWSSoapHeader86, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns the
	 * contents of the specified folder. Object type and subtype can be
	 * specified to restrict objects returned. Each object's properties can also
	 * be returned if property set specs are
	 * defined.&lt;BR&gt;&lt;BR&gt;MWSObjectInfo[]
	 * GetContents(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp
	 * string folderID,&lt;BR&gt;&amp;nbsp EnumMWSObjectType[]
	 * eType,&lt;BR&gt;&amp;nbsp EnumMWSObjSubType[] eSType,&lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetContents
	 * @param getContents85
	 * 
	 * @param mWSSoapHeader86
	 * 
	 */
	public void startGetContents(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents getContents85,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader86,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[3].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetContents");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getContents85,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetContents")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader86 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader86 = toOM(
					mWSSoapHeader86,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetContents")));
			addHeader(omElementmWSSoapHeader86, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetContents((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetContents(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetContents(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetContents(f);
									}
								} else {
									callback.receiveErrorGetContents(f);
								}
							} else {
								callback.receiveErrorGetContents(f);
							}
						} else {
							callback.receiveErrorGetContents(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetContents(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[3].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[3].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves informational web service
	 * properties.&lt;BR&gt;&lt;BR&gt;MWSInfoProperty[]
	 * GetMWSInfoProperties(&lt;BR&gt;&amp;nbsp string clientWsdlVersion,
	 * &lt;BR&gt;&amp;nbsp string displayLocale)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetMWSInfoProperties
	 * @param getMWSInfoProperties88
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse GetMWSInfoProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties getMWSInfoProperties88)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[4].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetMWSInfoProperties");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getMWSInfoProperties88,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetMWSInfoProperties")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * informational web service
	 * properties.&lt;BR&gt;&lt;BR&gt;MWSInfoProperty[]
	 * GetMWSInfoProperties(&lt;BR&gt;&amp;nbsp string clientWsdlVersion,
	 * &lt;BR&gt;&amp;nbsp string displayLocale)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetMWSInfoProperties
	 * @param getMWSInfoProperties88
	 * 
	 */
	public void startGetMWSInfoProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties getMWSInfoProperties88,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[4].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetMWSInfoProperties");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getMWSInfoProperties88,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetMWSInfoProperties")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetMWSInfoProperties((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetMWSInfoProperties(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetMWSInfoProperties(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSInfoProperties(f);
									}
								} else {
									callback
											.receiveErrorGetMWSInfoProperties(f);
								}
							} else {
								callback.receiveErrorGetMWSInfoProperties(f);
							}
						} else {
							callback.receiveErrorGetMWSInfoProperties(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetMWSInfoProperties(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[4].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[4].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves a list of attributes which are
	 * child attributes of the specified attribute. This method is used as part
	 * of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetAttributeChildren(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetAttributeChildren
	 * @param getAttributeChildren90
	 * 
	 * @param mWSSoapHeader91
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse GetAttributeChildren(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren getAttributeChildren90,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader91)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[5].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetAttributeChildren");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getAttributeChildren90,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetAttributeChildren")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader91 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader91 = toOM(
						mWSSoapHeader91,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetAttributeChildren")));
				addHeader(omElementmWSSoapHeader91, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves a
	 * list of attributes which are child attributes of the specified attribute.
	 * This method is used as part of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetAttributeChildren(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetAttributeChildren
	 * @param getAttributeChildren90
	 * 
	 * @param mWSSoapHeader91
	 * 
	 */
	public void startGetAttributeChildren(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren getAttributeChildren90,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader91,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[5].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetAttributeChildren");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getAttributeChildren90,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetAttributeChildren")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader91 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader91 = toOM(
					mWSSoapHeader91,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetAttributeChildren")));
			addHeader(omElementmWSSoapHeader91, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetAttributeChildren((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetAttributeChildren(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetAttributeChildren(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeChildren(f);
									}
								} else {
									callback
											.receiveErrorGetAttributeChildren(f);
								}
							} else {
								callback.receiveErrorGetAttributeChildren(f);
							}
						} else {
							callback.receiveErrorGetAttributeChildren(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetAttributeChildren(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[5].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[5].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * report with default settings.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * SimpleExecuteReport (&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sReportName,&lt;BR&gt;&amp;nbsp string
	 * sAnswerPrompt,&lt;BR&gt;&amp;nbsp string sStyle)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#SimpleExecuteReport
	 * @param simpleExecuteReport93
	 * 
	 * @param mWSSoapHeader94
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse SimpleExecuteReport(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport simpleExecuteReport93,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader94)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[6].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/SimpleExecuteReport");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), simpleExecuteReport93,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleExecuteReport")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader94 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader94 = toOM(
						mWSSoapHeader94,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"SimpleExecuteReport")));
				addHeader(omElementmWSSoapHeader94, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Initiates
	 * the execution of a specified report with default
	 * settings.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo SimpleExecuteReport
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string
	 * sReportName,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * string sStyle)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startSimpleExecuteReport
	 * @param simpleExecuteReport93
	 * 
	 * @param mWSSoapHeader94
	 * 
	 */
	public void startSimpleExecuteReport(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport simpleExecuteReport93,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader94,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[6].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/SimpleExecuteReport");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), simpleExecuteReport93,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"SimpleExecuteReport")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader94 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader94 = toOM(
					mWSSoapHeader94,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleExecuteReport")));
			addHeader(omElementmWSSoapHeader94, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultSimpleExecuteReport((com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorSimpleExecuteReport(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorSimpleExecuteReport(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteReport(f);
									}
								} else {
									callback.receiveErrorSimpleExecuteReport(f);
								}
							} else {
								callback.receiveErrorSimpleExecuteReport(f);
							}
						} else {
							callback.receiveErrorSimpleExecuteReport(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorSimpleExecuteReport(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[6].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[6].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns objects requested from an
	 * ExecuteIncrementalBrowse.&lt;BR&gt;&lt;BR&gt;MWSBrowseInfo
	 * GetIncrementalBrowseResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string sBrowseID, &lt;BR&gt;&amp;nbsp
	 * MWSSyncCommunicationSetting[] aSyncSettings, &lt;BR&gt;&amp;nbsp int
	 * iStartIndex, &lt;BR&gt;&amp;nbsp int iCount, &lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetIncrementalBrowseResults
	 * @param getIncrementalBrowseResults96
	 * 
	 * @param mWSSoapHeader97
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse GetIncrementalBrowseResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults getIncrementalBrowseResults96,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader97)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[7].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetIncrementalBrowseResults");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getIncrementalBrowseResults96,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetIncrementalBrowseResults")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader97 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader97 = toOM(
						mWSSoapHeader97,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetIncrementalBrowseResults")));
				addHeader(omElementmWSSoapHeader97, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * objects requested from an
	 * ExecuteIncrementalBrowse.&lt;BR&gt;&lt;BR&gt;MWSBrowseInfo
	 * GetIncrementalBrowseResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string sBrowseID, &lt;BR&gt;&amp;nbsp
	 * MWSSyncCommunicationSetting[] aSyncSettings, &lt;BR&gt;&amp;nbsp int
	 * iStartIndex, &lt;BR&gt;&amp;nbsp int iCount, &lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetIncrementalBrowseResults
	 * @param getIncrementalBrowseResults96
	 * 
	 * @param mWSSoapHeader97
	 * 
	 */
	public void startGetIncrementalBrowseResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults getIncrementalBrowseResults96,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader97,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[7].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetIncrementalBrowseResults");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getIncrementalBrowseResults96,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetIncrementalBrowseResults")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader97 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader97 = toOM(
					mWSSoapHeader97,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetIncrementalBrowseResults")));
			addHeader(omElementmWSSoapHeader97, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetIncrementalBrowseResults((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetIncrementalBrowseResults(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetIncrementalBrowseResults(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetIncrementalBrowseResults(f);
									}
								} else {
									callback
											.receiveErrorGetIncrementalBrowseResults(f);
								}
							} else {
								callback
										.receiveErrorGetIncrementalBrowseResults(f);
							}
						} else {
							callback
									.receiveErrorGetIncrementalBrowseResults(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetIncrementalBrowseResults(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[7].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[7].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves MicroStrategy user preferences
	 * for the supplied session. The user can specify which preferences are
	 * returned.&lt;BR&gt;&lt;BR&gt;MWSUserPreference[]
	 * GetUserPreferences(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp MWSUserPreference[] preferences)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetUserPreferences
	 * @param getUserPreferences99
	 * 
	 * @param mWSSoapHeader100
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse GetUserPreferences(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences getUserPreferences99,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader100)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[8].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetUserPreferences");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getUserPreferences99,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetUserPreferences")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader100 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader100 = toOM(
						mWSSoapHeader100,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetUserPreferences")));
				addHeader(omElementmWSSoapHeader100, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * MicroStrategy user preferences for the supplied session. The user can
	 * specify which preferences are
	 * returned.&lt;BR&gt;&lt;BR&gt;MWSUserPreference[]
	 * GetUserPreferences(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp MWSUserPreference[] preferences)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetUserPreferences
	 * @param getUserPreferences99
	 * 
	 * @param mWSSoapHeader100
	 * 
	 */
	public void startGetUserPreferences(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences getUserPreferences99,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader100,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[8].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetUserPreferences");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getUserPreferences99,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetUserPreferences")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader100 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader100 = toOM(
					mWSSoapHeader100,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetUserPreferences")));
			addHeader(omElementmWSSoapHeader100, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetUserPreferences((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetUserPreferences(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetUserPreferences(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetUserPreferences(f);
									}
								} else {
									callback.receiveErrorGetUserPreferences(f);
								}
							} else {
								callback.receiveErrorGetUserPreferences(f);
							}
						} else {
							callback.receiveErrorGetUserPreferences(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetUserPreferences(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[8].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[8].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Create an iServer
	 * session.&lt;BR&gt;&lt;BR&gt;string Connect (&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#Connect
	 * @param connect102
	 * 
	 * @param mWSSoapHeader103
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse Connect(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect connect102,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader103)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[9].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/Connect");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), connect102,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"Connect")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader103 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader103 = toOM(
						mWSSoapHeader103,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"Connect")));
				addHeader(omElementmWSSoapHeader103, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Create an
	 * iServer session.&lt;BR&gt;&lt;BR&gt;string Connect (&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startConnect
	 * @param connect102
	 * 
	 * @param mWSSoapHeader103
	 * 
	 */
	public void startConnect(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect connect102,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader103,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[9].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/Connect");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(
				getFactory(_operationClient.getOptions().getSoapVersionURI()),
				connect102,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0", "Connect")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader103 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader103 = toOM(
					mWSSoapHeader103,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"Connect")));
			addHeader(omElementmWSSoapHeader103, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultConnect((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorConnect(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorConnect(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorConnect(f);
									}
								} else {
									callback.receiveErrorConnect(f);
								}
							} else {
								callback.receiveErrorConnect(f);
							}
						} else {
							callback.receiveErrorConnect(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorConnect(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[9].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[9].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves annotations/notes associated
	 * with the specified report services document.&lt;BR&gt;&lt;BR&gt;string
	 * GetRSDocumentAnnotations (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string rsDocumentObjID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetRSDocumentAnnotations
	 * @param getRSDocumentAnnotations105
	 * 
	 * @param mWSSoapHeader106
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse GetRSDocumentAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations getRSDocumentAnnotations105,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader106)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[10].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetRSDocumentAnnotations");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getRSDocumentAnnotations105,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetRSDocumentAnnotations")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader106 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader106 = toOM(
						mWSSoapHeader106,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetRSDocumentAnnotations")));
				addHeader(omElementmWSSoapHeader106, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * annotations/notes associated with the specified report services
	 * document.&lt;BR&gt;&lt;BR&gt;string GetRSDocumentAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * rsDocumentObjID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetRSDocumentAnnotations
	 * @param getRSDocumentAnnotations105
	 * 
	 * @param mWSSoapHeader106
	 * 
	 */
	public void startGetRSDocumentAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations getRSDocumentAnnotations105,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader106,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[10].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetRSDocumentAnnotations");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getRSDocumentAnnotations105,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetRSDocumentAnnotations")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader106 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader106 = toOM(
					mWSSoapHeader106,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetRSDocumentAnnotations")));
			addHeader(omElementmWSSoapHeader106, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetRSDocumentAnnotations((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetRSDocumentAnnotations(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetRSDocumentAnnotations(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentAnnotations(f);
									}
								} else {
									callback
											.receiveErrorGetRSDocumentAnnotations(f);
								}
							} else {
								callback
										.receiveErrorGetRSDocumentAnnotations(f);
							}
						} else {
							callback
									.receiveErrorGetRSDocumentAnnotations(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetRSDocumentAnnotations(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[10].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[10].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Performs a test Connect,
	 * GetProjectSources, GetProjects, and Disconnect based on passed in
	 * credentials.&lt;BR&gt;&lt;BR&gt;string TestService(&lt;BR&gt;&amp;nbsp
	 * string Server,&lt;BR&gt;&amp;nbsp string ProjectName,&lt;BR&gt;&amp;nbsp
	 * string Login,&lt;BR&gt;&amp;nbsp string Password)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#TestService
	 * @param testService108
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse TestService(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService testService108)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[11].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/TestService");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), testService108,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"TestService")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Performs a
	 * test Connect, GetProjectSources, GetProjects, and Disconnect based on
	 * passed in credentials.&lt;BR&gt;&lt;BR&gt;string
	 * TestService(&lt;BR&gt;&amp;nbsp string Server,&lt;BR&gt;&amp;nbsp string
	 * ProjectName,&lt;BR&gt;&amp;nbsp string Login,&lt;BR&gt;&amp;nbsp string
	 * Password)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startTestService
	 * @param testService108
	 * 
	 */
	public void startTestService(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService testService108,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[11].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/TestService");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), testService108,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"TestService")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultTestService((com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorTestService(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorTestService(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorTestService(f);
									}
								} else {
									callback.receiveErrorTestService(f);
								}
							} else {
								callback.receiveErrorTestService(f);
							}
						} else {
							callback.receiveErrorTestService(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorTestService(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[11].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[11].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves the MicroStrategy Office
	 * install (available at the server) URL and version
	 * number.&lt;BR&gt;&lt;BR&gt;MWSOfficeInstallInfo GetMWSOfficeInstallInfo()
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetMWSOfficeInstallInfo
	 * @param getMWSOfficeInstallInfo110
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse GetMWSOfficeInstallInfo(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo getMWSOfficeInstallInfo110)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[12].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetMWSOfficeInstallInfo");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getMWSOfficeInstallInfo110,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetMWSOfficeInstallInfo")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * the MicroStrategy Office install (available at the server) URL and
	 * version number.&lt;BR&gt;&lt;BR&gt;MWSOfficeInstallInfo
	 * GetMWSOfficeInstallInfo()
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetMWSOfficeInstallInfo
	 * @param getMWSOfficeInstallInfo110
	 * 
	 */
	public void startGetMWSOfficeInstallInfo(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo getMWSOfficeInstallInfo110,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[12].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetMWSOfficeInstallInfo");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getMWSOfficeInstallInfo110,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetMWSOfficeInstallInfo")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetMWSOfficeInstallInfo((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetMWSOfficeInstallInfo(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetMWSOfficeInstallInfo(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSOfficeInstallInfo(f);
									}
								} else {
									callback
											.receiveErrorGetMWSOfficeInstallInfo(f);
								}
							} else {
								callback.receiveErrorGetMWSOfficeInstallInfo(f);
							}
						} else {
							callback.receiveErrorGetMWSOfficeInstallInfo(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetMWSOfficeInstallInfo(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[12].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[12].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves the web service's WSDL Version
	 * (major#.minor#).&lt;BR&gt;&lt;BR&gt;string GetMWSIdentity()
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetMWSIdentity
	 * @param getMWSIdentity112
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse GetMWSIdentity(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity getMWSIdentity112)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[13].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/GetMWSIdentity");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getMWSIdentity112,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetMWSIdentity")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * the web service's WSDL Version (major#.minor#).&lt;BR&gt;&lt;BR&gt;string
	 * GetMWSIdentity()
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetMWSIdentity
	 * @param getMWSIdentity112
	 * 
	 */
	public void startGetMWSIdentity(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity getMWSIdentity112,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[13].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetMWSIdentity");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getMWSIdentity112,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetMWSIdentity")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetMWSIdentity((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetMWSIdentity(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetMWSIdentity(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetMWSIdentity(f);
									}
								} else {
									callback.receiveErrorGetMWSIdentity(f);
								}
							} else {
								callback.receiveErrorGetMWSIdentity(f);
							}
						} else {
							callback.receiveErrorGetMWSIdentity(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetMWSIdentity(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[13].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[13].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves annotations/notes associated
	 * with the specified report.&lt;BR&gt;&lt;BR&gt;string GetReportAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * reportObjID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetReportAnnotations
	 * @param getReportAnnotations114
	 * 
	 * @param mWSSoapHeader115
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse GetReportAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations getReportAnnotations114,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader115)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[14].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetReportAnnotations");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getReportAnnotations114,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetReportAnnotations")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader115 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader115 = toOM(
						mWSSoapHeader115,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetReportAnnotations")));
				addHeader(omElementmWSSoapHeader115, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * annotations/notes associated with the specified
	 * report.&lt;BR&gt;&lt;BR&gt;string GetReportAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * reportObjID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetReportAnnotations
	 * @param getReportAnnotations114
	 * 
	 * @param mWSSoapHeader115
	 * 
	 */
	public void startGetReportAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations getReportAnnotations114,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader115,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[14].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetReportAnnotations");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getReportAnnotations114,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetReportAnnotations")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader115 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader115 = toOM(
					mWSSoapHeader115,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetReportAnnotations")));
			addHeader(omElementmWSSoapHeader115, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetReportAnnotations((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetReportAnnotations(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetReportAnnotations(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportAnnotations(f);
									}
								} else {
									callback
											.receiveErrorGetReportAnnotations(f);
								}
							} else {
								callback.receiveErrorGetReportAnnotations(f);
							}
						} else {
							callback.receiveErrorGetReportAnnotations(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetReportAnnotations(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[14].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[14].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves one or more resources through
	 * the web service.&lt;BR&gt;&lt;BR&gt;MWSResourceReturnInfo[]
	 * RetrieveResources(&lt;BR&gt;&amp;nbsp MWSResourceRequestInfo[]
	 * arrResources)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetResources
	 * @param getResources117
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse GetResources(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources getResources117)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[15].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/GetResources");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getResources117,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetResources")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * one or more resources through the web
	 * service.&lt;BR&gt;&lt;BR&gt;MWSResourceReturnInfo[]
	 * RetrieveResources(&lt;BR&gt;&amp;nbsp MWSResourceRequestInfo[]
	 * arrResources)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetResources
	 * @param getResources117
	 * 
	 */
	public void startGetResources(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources getResources117,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[15].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetResources");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getResources117,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetResources")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetResources((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetResources(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetResources(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetResources(f);
									}
								} else {
									callback.receiveErrorGetResources(f);
								}
							} else {
								callback.receiveErrorGetResources(f);
							}
						} else {
							callback.receiveErrorGetResources(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetResources(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[15].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[15].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified document prompt, based on the
	 * prompt origin and specified filters (name pattern, letter case, etc).
	 * Attribute information is used to further specify, if the prompt origin is
	 * a dimension. The prompt is used to retrieve the element source, which
	 * ensures that cube attributes can be browsed. This method is used as part
	 * of document prompt hierarchy element browsing, and replaces
	 * GetAttributeElements.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetDocumentPromptElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetDocumentPromptElements
	 * @param getDocumentPromptElements119
	 * 
	 * @param mWSSoapHeader120
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse GetDocumentPromptElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements getDocumentPromptElements119,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader120)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[16].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetDocumentPromptElements");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getDocumentPromptElements119,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetDocumentPromptElements")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader120 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader120 = toOM(
						mWSSoapHeader120,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetDocumentPromptElements")));
				addHeader(omElementmWSSoapHeader120, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * document prompt, based on the prompt origin and specified filters (name
	 * pattern, letter case, etc). Attribute information is used to further
	 * specify, if the prompt origin is a dimension. The prompt is used to
	 * retrieve the element source, which ensures that cube attributes can be
	 * browsed. This method is used as part of document prompt hierarchy element
	 * browsing, and replaces
	 * GetAttributeElements.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetDocumentPromptElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetDocumentPromptElements
	 * @param getDocumentPromptElements119
	 * 
	 * @param mWSSoapHeader120
	 * 
	 */
	public void startGetDocumentPromptElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements getDocumentPromptElements119,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader120,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[16].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetDocumentPromptElements");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getDocumentPromptElements119,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetDocumentPromptElements")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader120 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader120 = toOM(
					mWSSoapHeader120,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetDocumentPromptElements")));
			addHeader(omElementmWSSoapHeader120, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetDocumentPromptElements((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetDocumentPromptElements(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetDocumentPromptElements(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentPromptElements(f);
									}
								} else {
									callback
											.receiveErrorGetDocumentPromptElements(f);
								}
							} else {
								callback
										.receiveErrorGetDocumentPromptElements(f);
							}
						} else {
							callback
									.receiveErrorGetDocumentPromptElements(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetDocumentPromptElements(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[16].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[16].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves visualizations, defined in the
	 * visualizations.xml file, by view mode (eg. 50 = flash). A value of -1
	 * means get all lists.&lt;BR&gt;&lt;BR&gt;MWSVisualizationList[]
	 * GetVisualizationLists(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp int viewMode)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetVisualizationLists
	 * @param getVisualizationLists122
	 * 
	 * @param mWSSoapHeader123
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse GetVisualizationLists(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists getVisualizationLists122,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader123)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[17].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetVisualizationLists");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getVisualizationLists122,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetVisualizationLists")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader123 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader123 = toOM(
						mWSSoapHeader123,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetVisualizationLists")));
				addHeader(omElementmWSSoapHeader123, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * visualizations, defined in the visualizations.xml file, by view mode (eg.
	 * 50 = flash). A value of -1 means get all
	 * lists.&lt;BR&gt;&lt;BR&gt;MWSVisualizationList[]
	 * GetVisualizationLists(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp int viewMode)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetVisualizationLists
	 * @param getVisualizationLists122
	 * 
	 * @param mWSSoapHeader123
	 * 
	 */
	public void startGetVisualizationLists(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists getVisualizationLists122,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader123,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[17].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetVisualizationLists");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getVisualizationLists122,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetVisualizationLists")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader123 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader123 = toOM(
					mWSSoapHeader123,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetVisualizationLists")));
			addHeader(omElementmWSSoapHeader123, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetVisualizationLists((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetVisualizationLists(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetVisualizationLists(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetVisualizationLists(f);
									}
								} else {
									callback
											.receiveErrorGetVisualizationLists(f);
								}
							} else {
								callback.receiveErrorGetVisualizationLists(f);
							}
						} else {
							callback.receiveErrorGetVisualizationLists(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetVisualizationLists(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[17].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[17].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves a list of attributes associated
	 * with the specified hierarchy. This method is used as part of prompt
	 * hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetHierarchyAttributes(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sHierarchyID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetHierarchyAttributes
	 * @param getHierarchyAttributes125
	 * 
	 * @param mWSSoapHeader126
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse GetHierarchyAttributes(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes getHierarchyAttributes125,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader126)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[18].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetHierarchyAttributes");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getHierarchyAttributes125,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetHierarchyAttributes")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader126 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader126 = toOM(
						mWSSoapHeader126,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetHierarchyAttributes")));
				addHeader(omElementmWSSoapHeader126, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves a
	 * list of attributes associated with the specified hierarchy. This method
	 * is used as part of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetHierarchyAttributes(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sHierarchyID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetHierarchyAttributes
	 * @param getHierarchyAttributes125
	 * 
	 * @param mWSSoapHeader126
	 * 
	 */
	public void startGetHierarchyAttributes(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes getHierarchyAttributes125,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader126,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[18].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetHierarchyAttributes");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getHierarchyAttributes125,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetHierarchyAttributes")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader126 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader126 = toOM(
					mWSSoapHeader126,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetHierarchyAttributes")));
			addHeader(omElementmWSSoapHeader126, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetHierarchyAttributes((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetHierarchyAttributes(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetHierarchyAttributes(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetHierarchyAttributes(f);
									}
								} else {
									callback
											.receiveErrorGetHierarchyAttributes(f);
								}
							} else {
								callback.receiveErrorGetHierarchyAttributes(f);
							}
						} else {
							callback.receiveErrorGetHierarchyAttributes(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetHierarchyAttributes(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[18].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[18].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns document execution results based
	 * on prompt input and other flags after a SimpleExecuteRSDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * SimpleGetRSDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp string
	 * sMsgID,&lt;BR&gt;&amp;nbsp EnumMWSRSSimpleResultFlag eFormat)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#SimpleGetRSDocumentResults
	 * @param simpleGetRSDocumentResults128
	 * 
	 * @param mWSSoapHeader129
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse SimpleGetRSDocumentResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults simpleGetRSDocumentResults128,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader129)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[19].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/SimpleGetRSDocumentResults");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), simpleGetRSDocumentResults128,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleGetRSDocumentResults")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader129 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader129 = toOM(
						mWSSoapHeader129,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"SimpleGetRSDocumentResults")));
				addHeader(omElementmWSSoapHeader129, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * document execution results based on prompt input and other flags after a
	 * SimpleExecuteRSDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * SimpleGetRSDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp string
	 * sMsgID,&lt;BR&gt;&amp;nbsp EnumMWSRSSimpleResultFlag eFormat)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startSimpleGetRSDocumentResults
	 * @param simpleGetRSDocumentResults128
	 * 
	 * @param mWSSoapHeader129
	 * 
	 */
	public void startSimpleGetRSDocumentResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults simpleGetRSDocumentResults128,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader129,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[19].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/SimpleGetRSDocumentResults");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), simpleGetRSDocumentResults128,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"SimpleGetRSDocumentResults")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader129 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader129 = toOM(
					mWSSoapHeader129,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleGetRSDocumentResults")));
			addHeader(omElementmWSSoapHeader129, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultSimpleGetRSDocumentResults((com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorSimpleGetRSDocumentResults(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorSimpleGetRSDocumentResults(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetRSDocumentResults(f);
									}
								} else {
									callback
											.receiveErrorSimpleGetRSDocumentResults(f);
								}
							} else {
								callback
										.receiveErrorSimpleGetRSDocumentResults(f);
							}
						} else {
							callback
									.receiveErrorSimpleGetRSDocumentResults(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorSimpleGetRSDocumentResults(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[19].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[19].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified attribute, which are ancestors or
	 * descendants of the specified element list. The element list defines all
	 * of the parent or child elements related to the target attribute being
	 * drilled to. This is necessary to correctly handle many-to-many attribute
	 * relationships. Other filter restrictions are also applied (name pattern,
	 * letter case, etc). The report services document prompt is used to
	 * retrieve the element source, which ensures that cube attributes can be
	 * browsed. This method is used as part of report services document prompt
	 * hierarchy element browsing.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * DrillRSDocumentPromptElement(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyElementFilter[]
	 * fromElementFilters,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * toAttributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#DrillRSDocumentPromptElement
	 * @param drillRSDocumentPromptElement131
	 * 
	 * @param mWSSoapHeader132
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse DrillRSDocumentPromptElement(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement drillRSDocumentPromptElement131,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader132)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[20].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/DrillRSDocumentPromptElement");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), drillRSDocumentPromptElement131,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"DrillRSDocumentPromptElement")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader132 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader132 = toOM(
						mWSSoapHeader132,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"DrillRSDocumentPromptElement")));
				addHeader(omElementmWSSoapHeader132, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * attribute, which are ancestors or descendants of the specified element
	 * list. The element list defines all of the parent or child elements
	 * related to the target attribute being drilled to. This is necessary to
	 * correctly handle many-to-many attribute relationships. Other filter
	 * restrictions are also applied (name pattern, letter case, etc). The
	 * report services document prompt is used to retrieve the element source,
	 * which ensures that cube attributes can be browsed. This method is used as
	 * part of report services document prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * DrillRSDocumentPromptElement(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyElementFilter[]
	 * fromElementFilters,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * toAttributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startDrillRSDocumentPromptElement
	 * @param drillRSDocumentPromptElement131
	 * 
	 * @param mWSSoapHeader132
	 * 
	 */
	public void startDrillRSDocumentPromptElement(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement drillRSDocumentPromptElement131,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader132,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[20].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/DrillRSDocumentPromptElement");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), drillRSDocumentPromptElement131,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"DrillRSDocumentPromptElement")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader132 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader132 = toOM(
					mWSSoapHeader132,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"DrillRSDocumentPromptElement")));
			addHeader(omElementmWSSoapHeader132, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultDrillRSDocumentPromptElement((com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback
									.receiveErrorDrillRSDocumentPromptElement(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorDrillRSDocumentPromptElement(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillRSDocumentPromptElement(f);
									}
								} else {
									callback
											.receiveErrorDrillRSDocumentPromptElement(f);
								}
							} else {
								callback
										.receiveErrorDrillRSDocumentPromptElement(f);
							}
						} else {
							callback
									.receiveErrorDrillRSDocumentPromptElement(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorDrillRSDocumentPromptElement(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[20].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[20].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns report execution results based on
	 * prompt input and other flags after an ExecuteReport has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * GetReportResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sRptID,&lt;BR&gt;&amp;nbsp string sMsgID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow,&lt;BR&gt;&amp;nbsp string sStyle,&lt;BR&gt;&amp;nbsp
	 * EnumMWSResultFlags eResults,&lt;BR&gt;&amp;nbsp MWSExecutionSettings
	 * eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetReportResults
	 * @param getReportResults134
	 * 
	 * @param mWSSoapHeader135
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse GetReportResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults getReportResults134,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader135)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[21].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetReportResults");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getReportResults134,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetReportResults")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader135 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader135 = toOM(
						mWSSoapHeader135,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetReportResults")));
				addHeader(omElementmWSSoapHeader135, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * report execution results based on prompt input and other flags after an
	 * ExecuteReport has been initiated.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * GetReportResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sRptID,&lt;BR&gt;&amp;nbsp string sMsgID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow,&lt;BR&gt;&amp;nbsp string sStyle,&lt;BR&gt;&amp;nbsp
	 * EnumMWSResultFlags eResults,&lt;BR&gt;&amp;nbsp MWSExecutionSettings
	 * eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetReportResults
	 * @param getReportResults134
	 * 
	 * @param mWSSoapHeader135
	 * 
	 */
	public void startGetReportResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults getReportResults134,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader135,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[21].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetReportResults");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getReportResults134,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetReportResults")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader135 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader135 = toOM(
					mWSSoapHeader135,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetReportResults")));
			addHeader(omElementmWSSoapHeader135, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetReportResults((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetReportResults(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetReportResults(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportResults(f);
									}
								} else {
									callback.receiveErrorGetReportResults(f);
								}
							} else {
								callback.receiveErrorGetReportResults(f);
							}
						} else {
							callback.receiveErrorGetReportResults(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetReportResults(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[21].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[21].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves functionality web service
	 * properties. Functionality properties define web service functionality
	 * that has been added since that last web service compatibility break (WSDL
	 * namespace change).&lt;BR&gt;&lt;BR&gt;MWSFunctionalityProperty[]
	 * GetMWSFunctionalityProperties(&lt;BR&gt;&amp;nbsp string
	 * clientWsdlVersion, &lt;BR&gt;&amp;nbsp string displayLocale)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetMWSFunctionalityProperties
	 * @param getMWSFunctionalityProperties137
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse GetMWSFunctionalityProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties getMWSFunctionalityProperties137)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[22].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetMWSFunctionalityProperties");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getMWSFunctionalityProperties137,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetMWSFunctionalityProperties")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * functionality web service properties. Functionality properties define web
	 * service functionality that has been added since that last web service
	 * compatibility break (WSDL namespace
	 * change).&lt;BR&gt;&lt;BR&gt;MWSFunctionalityProperty[]
	 * GetMWSFunctionalityProperties(&lt;BR&gt;&amp;nbsp string
	 * clientWsdlVersion, &lt;BR&gt;&amp;nbsp string displayLocale)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetMWSFunctionalityProperties
	 * @param getMWSFunctionalityProperties137
	 * 
	 */
	public void startGetMWSFunctionalityProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties getMWSFunctionalityProperties137,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[22].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetMWSFunctionalityProperties");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getMWSFunctionalityProperties137,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetMWSFunctionalityProperties")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetMWSFunctionalityProperties((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback
									.receiveErrorGetMWSFunctionalityProperties(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetMWSFunctionalityProperties(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSFunctionalityProperties(f);
									}
								} else {
									callback
											.receiveErrorGetMWSFunctionalityProperties(f);
								}
							} else {
								callback
										.receiveErrorGetMWSFunctionalityProperties(f);
							}
						} else {
							callback
									.receiveErrorGetMWSFunctionalityProperties(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetMWSFunctionalityProperties(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[22].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[22].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns information related to the
	 * specified project folder. Provides easy access to project folders without
	 * having to specifically browse for them.&lt;BR&gt;&lt;BR&gt;MWSObjectInfo
	 * GetProjectFolder(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp EnumMWSProjectFolders eFolder)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetProjectFolder
	 * @param getProjectFolder139
	 * 
	 * @param mWSSoapHeader140
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse GetProjectFolder(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder getProjectFolder139,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader140)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[23].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetProjectFolder");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getProjectFolder139,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetProjectFolder")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader140 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader140 = toOM(
						mWSSoapHeader140,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetProjectFolder")));
				addHeader(omElementmWSSoapHeader140, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * information related to the specified project folder. Provides easy access
	 * to project folders without having to specifically browse for
	 * them.&lt;BR&gt;&lt;BR&gt;MWSObjectInfo
	 * GetProjectFolder(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp EnumMWSProjectFolders eFolder)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetProjectFolder
	 * @param getProjectFolder139
	 * 
	 * @param mWSSoapHeader140
	 * 
	 */
	public void startGetProjectFolder(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder getProjectFolder139,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader140,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[23].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetProjectFolder");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getProjectFolder139,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetProjectFolder")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader140 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader140 = toOM(
					mWSSoapHeader140,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetProjectFolder")));
			addHeader(omElementmWSSoapHeader140, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetProjectFolder((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetProjectFolder(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetProjectFolder(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectFolder(f);
									}
								} else {
									callback.receiveErrorGetProjectFolder(f);
								}
							} else {
								callback.receiveErrorGetProjectFolder(f);
							}
						} else {
							callback.receiveErrorGetProjectFolder(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetProjectFolder(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[23].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[23].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature This method loads, edits and saves user
	 * prompt answers. &lt;BR&gt;&lt;BR&gt;String
	 * ManipulateUserAnswer(&lt;BR&gt;&amp;nbsp MWSConnectInfo connectInfo,
	 * &lt;BR&gt;&amp;nbsp String commandXML)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ManipulateUserAnswer
	 * @param manipulateUserAnswer142
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse ManipulateUserAnswer(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer manipulateUserAnswer142)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[24].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ManipulateUserAnswer");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), manipulateUserAnswer142,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ManipulateUserAnswer")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations This method
	 * loads, edits and saves user prompt answers. &lt;BR&gt;&lt;BR&gt;String
	 * ManipulateUserAnswer(&lt;BR&gt;&amp;nbsp MWSConnectInfo connectInfo,
	 * &lt;BR&gt;&amp;nbsp String commandXML)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startManipulateUserAnswer
	 * @param manipulateUserAnswer142
	 * 
	 */
	public void startManipulateUserAnswer(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer manipulateUserAnswer142,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[24].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/ManipulateUserAnswer");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), manipulateUserAnswer142,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ManipulateUserAnswer")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultManipulateUserAnswer((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorManipulateUserAnswer(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorManipulateUserAnswer(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorManipulateUserAnswer(f);
									}
								} else {
									callback
											.receiveErrorManipulateUserAnswer(f);
								}
							} else {
								callback.receiveErrorManipulateUserAnswer(f);
							}
						} else {
							callback.receiveErrorManipulateUserAnswer(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorManipulateUserAnswer(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[24].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[24].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns HTML document execution results
	 * based on prompt input and other flags after an ExecuteDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * GetDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sMsgID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow, &lt;BR&gt;&amp;nbsp EnumMWSResultFlags eResults,
	 * &lt;BR&gt;&amp;nbsp MWSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetDocumentResults
	 * @param getDocumentResults144
	 * 
	 * @param mWSSoapHeader145
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse GetDocumentResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults getDocumentResults144,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader145)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[25].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetDocumentResults");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getDocumentResults144,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetDocumentResults")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader145 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader145 = toOM(
						mWSSoapHeader145,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetDocumentResults")));
				addHeader(omElementmWSSoapHeader145, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns HTML
	 * document execution results based on prompt input and other flags after an
	 * ExecuteDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * GetDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sMsgID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow, &lt;BR&gt;&amp;nbsp EnumMWSResultFlags eResults,
	 * &lt;BR&gt;&amp;nbsp MWSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetDocumentResults
	 * @param getDocumentResults144
	 * 
	 * @param mWSSoapHeader145
	 * 
	 */
	public void startGetDocumentResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults getDocumentResults144,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader145,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[25].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetDocumentResults");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getDocumentResults144,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetDocumentResults")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader145 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader145 = toOM(
					mWSSoapHeader145,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetDocumentResults")));
			addHeader(omElementmWSSoapHeader145, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetDocumentResults((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetDocumentResults(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetDocumentResults(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDocumentResults(f);
									}
								} else {
									callback.receiveErrorGetDocumentResults(f);
								}
							} else {
								callback.receiveErrorGetDocumentResults(f);
							}
						} else {
							callback.receiveErrorGetDocumentResults(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetDocumentResults(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[25].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[25].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Performs an incremental browse that
	 * returns objects defined by type/subtype and other filters (folder path,
	 * name pattern, etc). Each object's properties can also be returned if
	 * property set specs are defined.&lt;BR&gt;&lt;BR&gt;MWSBrowseInfo
	 * ExecuteIncrementalBrowse(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSRestriction[] aRestricts,&lt;BR&gt;&amp;nbsp
	 * EnumMWSObjectType[] eType,&lt;BR&gt;&amp;nbsp EnumMWSObjSubType[]
	 * eStype,&lt;BR&gt;&amp;nbsp EnumMWSSearchFlags eFlags,&lt;BR&gt;&amp;nbsp
	 * MWSSyncCommunicationSetting[] aSyncSettings, &lt;BR&gt;&amp;nbsp int
	 * iStartIndex, &lt;BR&gt;&amp;nbsp int iCount, &lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ExecuteIncrementalBrowse
	 * @param executeIncrementalBrowse147
	 * 
	 * @param mWSSoapHeader148
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse ExecuteIncrementalBrowse(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse executeIncrementalBrowse147,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader148)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[26].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ExecuteIncrementalBrowse");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), executeIncrementalBrowse147,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteIncrementalBrowse")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader148 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader148 = toOM(
						mWSSoapHeader148,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ExecuteIncrementalBrowse")));
				addHeader(omElementmWSSoapHeader148, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Performs an
	 * incremental browse that returns objects defined by type/subtype and other
	 * filters (folder path, name pattern, etc). Each object's properties can
	 * also be returned if property set specs are
	 * defined.&lt;BR&gt;&lt;BR&gt;MWSBrowseInfo
	 * ExecuteIncrementalBrowse(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSRestriction[] aRestricts,&lt;BR&gt;&amp;nbsp
	 * EnumMWSObjectType[] eType,&lt;BR&gt;&amp;nbsp EnumMWSObjSubType[]
	 * eStype,&lt;BR&gt;&amp;nbsp EnumMWSSearchFlags eFlags,&lt;BR&gt;&amp;nbsp
	 * MWSSyncCommunicationSetting[] aSyncSettings, &lt;BR&gt;&amp;nbsp int
	 * iStartIndex, &lt;BR&gt;&amp;nbsp int iCount, &lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startExecuteIncrementalBrowse
	 * @param executeIncrementalBrowse147
	 * 
	 * @param mWSSoapHeader148
	 * 
	 */
	public void startExecuteIncrementalBrowse(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse executeIncrementalBrowse147,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader148,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[26].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/ExecuteIncrementalBrowse");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), executeIncrementalBrowse147,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ExecuteIncrementalBrowse")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader148 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader148 = toOM(
					mWSSoapHeader148,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteIncrementalBrowse")));
			addHeader(omElementmWSSoapHeader148, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultExecuteIncrementalBrowse((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorExecuteIncrementalBrowse(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorExecuteIncrementalBrowse(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteIncrementalBrowse(f);
									}
								} else {
									callback
											.receiveErrorExecuteIncrementalBrowse(f);
								}
							} else {
								callback
										.receiveErrorExecuteIncrementalBrowse(f);
							}
						} else {
							callback
									.receiveErrorExecuteIncrementalBrowse(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorExecuteIncrementalBrowse(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[26].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[26].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves a list of attributes which are
	 * parent attributes of the specified attribute. This method is used as part
	 * of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetAttributeParents(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetAttributeParents
	 * @param getAttributeParents150
	 * 
	 * @param mWSSoapHeader151
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse GetAttributeParents(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents getAttributeParents150,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader151)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[27].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetAttributeParents");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getAttributeParents150,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetAttributeParents")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader151 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader151 = toOM(
						mWSSoapHeader151,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetAttributeParents")));
				addHeader(omElementmWSSoapHeader151, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves a
	 * list of attributes which are parent attributes of the specified
	 * attribute. This method is used as part of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetAttributeParents(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetAttributeParents
	 * @param getAttributeParents150
	 * 
	 * @param mWSSoapHeader151
	 * 
	 */
	public void startGetAttributeParents(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents getAttributeParents150,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader151,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[27].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetAttributeParents");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getAttributeParents150,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetAttributeParents")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader151 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader151 = toOM(
					mWSSoapHeader151,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetAttributeParents")));
			addHeader(omElementmWSSoapHeader151, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetAttributeParents((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetAttributeParents(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetAttributeParents(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeParents(f);
									}
								} else {
									callback.receiveErrorGetAttributeParents(f);
								}
							} else {
								callback.receiveErrorGetAttributeParents(f);
							}
						} else {
							callback.receiveErrorGetAttributeParents(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetAttributeParents(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[27].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[27].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified report services document prompt,
	 * based on the prompt origin and specified filters (name pattern, letter
	 * case, etc). Attribute information is used to further specify, if the
	 * prompt origin is a dimension. The prompt is used to retrieve the element
	 * source, which ensures that cube attributes can be browsed. This method is
	 * used as part of report services document prompt hierarchy element
	 * browsing, and replaces
	 * GetAttributeElements.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetRSDocumentPromptElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetRSDocumentPromptElements
	 * @param getRSDocumentPromptElements153
	 * 
	 * @param mWSSoapHeader154
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse GetRSDocumentPromptElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements getRSDocumentPromptElements153,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader154)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[28].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetRSDocumentPromptElements");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getRSDocumentPromptElements153,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetRSDocumentPromptElements")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader154 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader154 = toOM(
						mWSSoapHeader154,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetRSDocumentPromptElements")));
				addHeader(omElementmWSSoapHeader154, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * report services document prompt, based on the prompt origin and specified
	 * filters (name pattern, letter case, etc). Attribute information is used
	 * to further specify, if the prompt origin is a dimension. The prompt is
	 * used to retrieve the element source, which ensures that cube attributes
	 * can be browsed. This method is used as part of report services document
	 * prompt hierarchy element browsing, and replaces
	 * GetAttributeElements.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetRSDocumentPromptElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetRSDocumentPromptElements
	 * @param getRSDocumentPromptElements153
	 * 
	 * @param mWSSoapHeader154
	 * 
	 */
	public void startGetRSDocumentPromptElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements getRSDocumentPromptElements153,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader154,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[28].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetRSDocumentPromptElements");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getRSDocumentPromptElements153,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetRSDocumentPromptElements")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader154 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader154 = toOM(
					mWSSoapHeader154,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetRSDocumentPromptElements")));
			addHeader(omElementmWSSoapHeader154, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetRSDocumentPromptElements((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetRSDocumentPromptElements(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetRSDocumentPromptElements(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentPromptElements(f);
									}
								} else {
									callback
											.receiveErrorGetRSDocumentPromptElements(f);
								}
							} else {
								callback
										.receiveErrorGetRSDocumentPromptElements(f);
							}
						} else {
							callback
									.receiveErrorGetRSDocumentPromptElements(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetRSDocumentPromptElements(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[28].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[28].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Cancels an asynchronous report
	 * execution.&lt;BR&gt;&lt;BR&gt;void CancelReport(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#CancelReport
	 * @param cancelReport156
	 * 
	 * @param mWSSoapHeader157
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse CancelReport(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport cancelReport156,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader157)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[29].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/CancelReport");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), cancelReport156,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelReport")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader157 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader157 = toOM(
						mWSSoapHeader157,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"CancelReport")));
				addHeader(omElementmWSSoapHeader157, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Cancels an
	 * asynchronous report execution.&lt;BR&gt;&lt;BR&gt;void
	 * CancelReport(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp
	 * string sMsgID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startCancelReport
	 * @param cancelReport156
	 * 
	 * @param mWSSoapHeader157
	 * 
	 */
	public void startCancelReport(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport cancelReport156,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader157,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[29].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/CancelReport");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), cancelReport156,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"CancelReport")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader157 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader157 = toOM(
					mWSSoapHeader157,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelReport")));
			addHeader(omElementmWSSoapHeader157, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultCancelReport((com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorCancelReport(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorCancelReport(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelReport(f);
									}
								} else {
									callback.receiveErrorCancelReport(f);
								}
							} else {
								callback.receiveErrorCancelReport(f);
							}
						} else {
							callback.receiveErrorCancelReport(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorCancelReport(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[29].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[29].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns properties of the MWS Web Service
	 * (version numbers, new functionalities). GetMWSProperties2 is actually the
	 * name used in the actual SOAP message sent to the service (vestige of
	 * operator overloading). If you generate the client proxy code, the API is
	 * referred to as GetMWSProperties. This method has been deprecated and is
	 * replaced by GetMWSInfoProperties and
	 * GetMWSFunctionalityProperties.&lt;BR&gt;&lt;BR&gt;MWSProperty[]
	 * GetMWSProperties(&lt;BR&gt;&amp;nbsp EnumMWSProperties
	 * eProps,&lt;BR&gt;&amp;nbsp MWSConnectProperty[] aConnectProps)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetMWSProperties
	 * @param getMWSProperties2159
	 * 
	 * @param mWSSoapHeader160
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response GetMWSProperties(

			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2 getMWSProperties2159,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader160)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[30].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/GetMWSProperties2");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getMWSProperties2159,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetMWSProperties")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader160 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader160 = toOM(
						mWSSoapHeader160,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetMWSProperties")));
				addHeader(omElementmWSSoapHeader160, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * properties of the MWS Web Service (version numbers, new functionalities).
	 * GetMWSProperties2 is actually the name used in the actual SOAP message
	 * sent to the service (vestige of operator overloading). If you generate
	 * the client proxy code, the API is referred to as GetMWSProperties. This
	 * method has been deprecated and is replaced by GetMWSInfoProperties and
	 * GetMWSFunctionalityProperties.&lt;BR&gt;&lt;BR&gt;MWSProperty[]
	 * GetMWSProperties(&lt;BR&gt;&amp;nbsp EnumMWSProperties
	 * eProps,&lt;BR&gt;&amp;nbsp MWSConnectProperty[] aConnectProps)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetMWSProperties
	 * @param getMWSProperties2159
	 * 
	 * @param mWSSoapHeader160
	 * 
	 */
	public void startGetMWSProperties(

			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2 getMWSProperties2159,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader160,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[30].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/GetMWSProperties2");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getMWSProperties2159,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetMWSProperties")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader160 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader160 = toOM(
					mWSSoapHeader160,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetMWSProperties")));
			addHeader(omElementmWSSoapHeader160, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetMWSProperties((com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetMWSProperties(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetMWSProperties(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetMWSProperties(f);
									}
								} else {
									callback.receiveErrorGetMWSProperties(f);
								}
							} else {
								callback.receiveErrorGetMWSProperties(f);
							}
						} else {
							callback.receiveErrorGetMWSProperties(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetMWSProperties(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[30].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[30].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * document.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * ExecuteRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * EnumMWSRSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp EnumMWSRSResultFlags
	 * eFormat,&lt;BR&gt;&amp;nbsp MWSRSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ExecuteRSDocument
	 * @param executeRSDocument162
	 * 
	 * @param mWSSoapHeader163
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse ExecuteRSDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument executeRSDocument162,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader163)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[31].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ExecuteRSDocument");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), executeRSDocument162,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteRSDocument")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader163 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader163 = toOM(
						mWSSoapHeader163,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ExecuteRSDocument")));
				addHeader(omElementmWSSoapHeader163, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Initiates
	 * the execution of a specified
	 * document.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * ExecuteRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * EnumMWSRSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp EnumMWSRSResultFlags
	 * eFormat,&lt;BR&gt;&amp;nbsp MWSRSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startExecuteRSDocument
	 * @param executeRSDocument162
	 * 
	 * @param mWSSoapHeader163
	 * 
	 */
	public void startExecuteRSDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument executeRSDocument162,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader163,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[31].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/ExecuteRSDocument");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), executeRSDocument162,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ExecuteRSDocument")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader163 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader163 = toOM(
					mWSSoapHeader163,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteRSDocument")));
			addHeader(omElementmWSSoapHeader163, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultExecuteRSDocument((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorExecuteRSDocument(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorExecuteRSDocument(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorExecuteRSDocument(f);
									}
								} else {
									callback.receiveErrorExecuteRSDocument(f);
								}
							} else {
								callback.receiveErrorExecuteRSDocument(f);
							}
						} else {
							callback.receiveErrorExecuteRSDocument(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorExecuteRSDocument(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[31].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[31].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified attribute, which are ancestors or
	 * descendants of the specified element list. The element list defines all
	 * of the parent or child elements related to the target attribute being
	 * drilled to. This is necessary to correctly handle many-to-many attribute
	 * relationships. Other filter restrictions are also applied (name pattern,
	 * letter case, etc). The report prompt is used to retrieve the element
	 * source, which ensures that cube attributes can be browsed. This method is
	 * used as part of report prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * DrillReportPromptElement(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyElementFilter[]
	 * fromElementFilters,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * toAttributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#DrillReportPromptElement
	 * @param drillReportPromptElement165
	 * 
	 * @param mWSSoapHeader166
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse DrillReportPromptElement(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement drillReportPromptElement165,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader166)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[32].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/DrillReportPromptElement");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), drillReportPromptElement165,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"DrillReportPromptElement")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader166 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader166 = toOM(
						mWSSoapHeader166,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"DrillReportPromptElement")));
				addHeader(omElementmWSSoapHeader166, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * attribute, which are ancestors or descendants of the specified element
	 * list. The element list defines all of the parent or child elements
	 * related to the target attribute being drilled to. This is necessary to
	 * correctly handle many-to-many attribute relationships. Other filter
	 * restrictions are also applied (name pattern, letter case, etc). The
	 * report prompt is used to retrieve the element source, which ensures that
	 * cube attributes can be browsed. This method is used as part of report
	 * prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * DrillReportPromptElement(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyElementFilter[]
	 * fromElementFilters,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * toAttributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startDrillReportPromptElement
	 * @param drillReportPromptElement165
	 * 
	 * @param mWSSoapHeader166
	 * 
	 */
	public void startDrillReportPromptElement(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement drillReportPromptElement165,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader166,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[32].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/DrillReportPromptElement");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), drillReportPromptElement165,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"DrillReportPromptElement")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader166 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader166 = toOM(
					mWSSoapHeader166,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"DrillReportPromptElement")));
			addHeader(omElementmWSSoapHeader166, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultDrillReportPromptElement((com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorDrillReportPromptElement(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorDrillReportPromptElement(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillReportPromptElement(f);
									}
								} else {
									callback
											.receiveErrorDrillReportPromptElement(f);
								}
							} else {
								callback
										.receiveErrorDrillReportPromptElement(f);
							}
						} else {
							callback
									.receiveErrorDrillReportPromptElement(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorDrillReportPromptElement(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[32].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[32].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Disconnect one or more iServer
	 * sessions.&lt;BR&gt;&lt;BR&gt;void Disconnect (&lt;BR&gt;&amp;nbsp
	 * string[] arrSessions)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#Disconnect
	 * @param disconnect168
	 * 
	 * @param mWSSoapHeader169
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse Disconnect(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect disconnect168,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader169)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[33].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/Disconnect");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), disconnect168,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"Disconnect")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader169 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader169 = toOM(
						mWSSoapHeader169,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"Disconnect")));
				addHeader(omElementmWSSoapHeader169, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Disconnect
	 * one or more iServer sessions.&lt;BR&gt;&lt;BR&gt;void Disconnect
	 * (&lt;BR&gt;&amp;nbsp string[] arrSessions)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startDisconnect
	 * @param disconnect168
	 * 
	 * @param mWSSoapHeader169
	 * 
	 */
	public void startDisconnect(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect disconnect168,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader169,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[33].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/Disconnect");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), disconnect168,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"Disconnect")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader169 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader169 = toOM(
					mWSSoapHeader169,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"Disconnect")));
			addHeader(omElementmWSSoapHeader169, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultDisconnect((com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorDisconnect(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorDisconnect(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorDisconnect(f);
									}
								} else {
									callback.receiveErrorDisconnect(f);
								}
							} else {
								callback.receiveErrorDisconnect(f);
							}
						} else {
							callback.receiveErrorDisconnect(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorDisconnect(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[33].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[33].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified attribute, based on specified
	 * filters (name pattern, letter case, etc). This method can be used to do
	 * prompt hierarchy element browsing. However, if the attribute elements are
	 * defined in a cube context, GetReportPromptElements,
	 * GetDocumentPromptElements, or GetRSDocumentPromptElements should be
	 * used.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetAttributeElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetAttributeElements
	 * @param getAttributeElements171
	 * 
	 * @param mWSSoapHeader172
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse GetAttributeElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements getAttributeElements171,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader172)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[34].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetAttributeElements");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getAttributeElements171,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetAttributeElements")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader172 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader172 = toOM(
						mWSSoapHeader172,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetAttributeElements")));
				addHeader(omElementmWSSoapHeader172, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * attribute, based on specified filters (name pattern, letter case, etc).
	 * This method can be used to do prompt hierarchy element browsing. However,
	 * if the attribute elements are defined in a cube context,
	 * GetReportPromptElements, GetDocumentPromptElements, or
	 * GetRSDocumentPromptElements should be
	 * used.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetAttributeElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetAttributeElements
	 * @param getAttributeElements171
	 * 
	 * @param mWSSoapHeader172
	 * 
	 */
	public void startGetAttributeElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements getAttributeElements171,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader172,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[34].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetAttributeElements");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getAttributeElements171,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetAttributeElements")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader172 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader172 = toOM(
					mWSSoapHeader172,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetAttributeElements")));
			addHeader(omElementmWSSoapHeader172, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetAttributeElements((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetAttributeElements(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetAttributeElements(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetAttributeElements(f);
									}
								} else {
									callback
											.receiveErrorGetAttributeElements(f);
								}
							} else {
								callback.receiveErrorGetAttributeElements(f);
							}
						} else {
							callback.receiveErrorGetAttributeElements(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetAttributeElements(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[34].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[34].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature This method provides the ability to
	 * delete and change status of history list message(s).
	 * &lt;BR&gt;&lt;BR&gt;void ModifyHistoryListMessages(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo connectInfo, &lt;BR&gt;&amp;nbsp String[] arrMsgIDs,
	 * &lt;BR&gt;&amp;nbsp EnumMWSHistoryListAction eType)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ModifyHistoryListMessages
	 * @param modifyHistoryListMessages174
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse ModifyHistoryListMessages(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages modifyHistoryListMessages174)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[35].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ModifyHistoryListMessages");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), modifyHistoryListMessages174,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ModifyHistoryListMessages")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations This method
	 * provides the ability to delete and change status of history list
	 * message(s). &lt;BR&gt;&lt;BR&gt;void
	 * ModifyHistoryListMessages(&lt;BR&gt;&amp;nbsp MWSConnectInfo connectInfo,
	 * &lt;BR&gt;&amp;nbsp String[] arrMsgIDs, &lt;BR&gt;&amp;nbsp
	 * EnumMWSHistoryListAction eType)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startModifyHistoryListMessages
	 * @param modifyHistoryListMessages174
	 * 
	 */
	public void startModifyHistoryListMessages(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages modifyHistoryListMessages174,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[35].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/ModifyHistoryListMessages");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), modifyHistoryListMessages174,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ModifyHistoryListMessages")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultModifyHistoryListMessages((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorModifyHistoryListMessages(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorModifyHistoryListMessages(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorModifyHistoryListMessages(f);
									}
								} else {
									callback
											.receiveErrorModifyHistoryListMessages(f);
								}
							} else {
								callback
										.receiveErrorModifyHistoryListMessages(f);
							}
						} else {
							callback
									.receiveErrorModifyHistoryListMessages(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorModifyHistoryListMessages(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[35].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[35].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Sets the complete set of
	 * annotations/notes associated with the specified
	 * report.&lt;BR&gt;&lt;BR&gt;void SetReportAnnotations (&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string reportObjID,
	 * &lt;BR&gt;&amp;nbsp string annotations)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#SetReportAnnotations
	 * @param setReportAnnotations176
	 * 
	 * @param mWSSoapHeader177
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse SetReportAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations setReportAnnotations176,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader177)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[36].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/SetReportAnnotations");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), setReportAnnotations176,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SetReportAnnotations")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader177 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader177 = toOM(
						mWSSoapHeader177,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"SetReportAnnotations")));
				addHeader(omElementmWSSoapHeader177, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Sets the
	 * complete set of annotations/notes associated with the specified
	 * report.&lt;BR&gt;&lt;BR&gt;void SetReportAnnotations (&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string reportObjID,
	 * &lt;BR&gt;&amp;nbsp string annotations)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startSetReportAnnotations
	 * @param setReportAnnotations176
	 * 
	 * @param mWSSoapHeader177
	 * 
	 */
	public void startSetReportAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations setReportAnnotations176,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader177,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[36].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/SetReportAnnotations");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), setReportAnnotations176,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"SetReportAnnotations")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader177 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader177 = toOM(
					mWSSoapHeader177,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SetReportAnnotations")));
			addHeader(omElementmWSSoapHeader177, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultSetReportAnnotations((com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorSetReportAnnotations(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorSetReportAnnotations(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetReportAnnotations(f);
									}
								} else {
									callback
											.receiveErrorSetReportAnnotations(f);
								}
							} else {
								callback.receiveErrorSetReportAnnotations(f);
							}
						} else {
							callback.receiveErrorSetReportAnnotations(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorSetReportAnnotations(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[36].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[36].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves a list of projects for a
	 * selected project source.&lt;BR&gt;&lt;BR&gt;MWSProjectInfo[] GetProjects
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetProjects
	 * @param getProjects179
	 * 
	 * @param mWSSoapHeader180
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse GetProjects(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects getProjects179,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader180)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[37].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/GetProjects");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getProjects179,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetProjects")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader180 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader180 = toOM(
						mWSSoapHeader180,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetProjects")));
				addHeader(omElementmWSSoapHeader180, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves a
	 * list of projects for a selected project
	 * source.&lt;BR&gt;&lt;BR&gt;MWSProjectInfo[] GetProjects
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetProjects
	 * @param getProjects179
	 * 
	 * @param mWSSoapHeader180
	 * 
	 */
	public void startGetProjects(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects getProjects179,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader180,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[37].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetProjects");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getProjects179,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetProjects")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader180 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader180 = toOM(
					mWSSoapHeader180,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetProjects")));
			addHeader(omElementmWSSoapHeader180, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetProjects((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetProjects(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetProjects(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorGetProjects(f);
									}
								} else {
									callback.receiveErrorGetProjects(f);
								}
							} else {
								callback.receiveErrorGetProjects(f);
							}
						} else {
							callback.receiveErrorGetProjects(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetProjects(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[37].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[37].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified report prompt, based on the prompt
	 * origin and specified filters (name pattern, letter case, etc). Attribute
	 * information is used to further specify, if the prompt origin is a
	 * dimension. The prompt is used to retrieve the element source, which
	 * ensures that cube attributes can be browsed. This method is used as part
	 * of report prompt hierarchy element browsing, and replaces
	 * GetAttributeElements.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetReportPromptElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetReportPromptElements
	 * @param getReportPromptElements182
	 * 
	 * @param mWSSoapHeader183
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse GetReportPromptElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements getReportPromptElements182,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader183)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[38].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetReportPromptElements");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getReportPromptElements182,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetReportPromptElements")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader183 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader183 = toOM(
						mWSSoapHeader183,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetReportPromptElements")));
				addHeader(omElementmWSSoapHeader183, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * report prompt, based on the prompt origin and specified filters (name
	 * pattern, letter case, etc). Attribute information is used to further
	 * specify, if the prompt origin is a dimension. The prompt is used to
	 * retrieve the element source, which ensures that cube attributes can be
	 * browsed. This method is used as part of report prompt hierarchy element
	 * browsing, and replaces
	 * GetAttributeElements.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * GetReportPromptElements(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetReportPromptElements
	 * @param getReportPromptElements182
	 * 
	 * @param mWSSoapHeader183
	 * 
	 */
	public void startGetReportPromptElements(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements getReportPromptElements182,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader183,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[38].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetReportPromptElements");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getReportPromptElements182,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetReportPromptElements")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader183 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader183 = toOM(
					mWSSoapHeader183,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetReportPromptElements")));
			addHeader(omElementmWSSoapHeader183, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetReportPromptElements((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetReportPromptElements(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetReportPromptElements(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetReportPromptElements(f);
									}
								} else {
									callback
											.receiveErrorGetReportPromptElements(f);
								}
							} else {
								callback.receiveErrorGetReportPromptElements(f);
							}
						} else {
							callback.receiveErrorGetReportPromptElements(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetReportPromptElements(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[38].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[38].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns report execution results based on
	 * prompt input after a SimpleExecuteReport has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * SimpleGetReportResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sMsgID,&lt;BR&gt;&amp;nbsp string sStyle)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#SimpleGetReportResults
	 * @param simpleGetReportResults185
	 * 
	 * @param mWSSoapHeader186
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse SimpleGetReportResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults simpleGetReportResults185,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader186)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[39].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/SimpleGetReportResults");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), simpleGetReportResults185,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleGetReportResults")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader186 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader186 = toOM(
						mWSSoapHeader186,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"SimpleGetReportResults")));
				addHeader(omElementmWSSoapHeader186, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * report execution results based on prompt input after a
	 * SimpleExecuteReport has been initiated.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * SimpleGetReportResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sMsgID,&lt;BR&gt;&amp;nbsp string sStyle)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startSimpleGetReportResults
	 * @param simpleGetReportResults185
	 * 
	 * @param mWSSoapHeader186
	 * 
	 */
	public void startSimpleGetReportResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults simpleGetReportResults185,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader186,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[39].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/SimpleGetReportResults");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), simpleGetReportResults185,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"SimpleGetReportResults")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader186 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader186 = toOM(
					mWSSoapHeader186,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleGetReportResults")));
			addHeader(omElementmWSSoapHeader186, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultSimpleGetReportResults((com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorSimpleGetReportResults(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorSimpleGetReportResults(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleGetReportResults(f);
									}
								} else {
									callback
											.receiveErrorSimpleGetReportResults(f);
								}
							} else {
								callback.receiveErrorSimpleGetReportResults(f);
							}
						} else {
							callback.receiveErrorSimpleGetReportResults(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorSimpleGetReportResults(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[39].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[39].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves all properties (eg. PMML)
	 * associated with the DMX function that exists in a DMX Metric expression
	 * tree.&lt;BR&gt;&lt;BR&gt;MWSObjectInfoProperty[]
	 * GetDMXMetricFunctionProperties(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string dmxMetricObjID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetDMXMetricFunctionProperties
	 * @param getDMXMetricFunctionProperties188
	 * 
	 * @param mWSSoapHeader189
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse GetDMXMetricFunctionProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties getDMXMetricFunctionProperties188,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader189)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[40].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetDMXMetricFunctionProperties");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getDMXMetricFunctionProperties188,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetDMXMetricFunctionProperties")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader189 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader189 = toOM(
						mWSSoapHeader189,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetDMXMetricFunctionProperties")));
				addHeader(omElementmWSSoapHeader189, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves
	 * all properties (eg. PMML) associated with the DMX function that exists in
	 * a DMX Metric expression tree.&lt;BR&gt;&lt;BR&gt;MWSObjectInfoProperty[]
	 * GetDMXMetricFunctionProperties(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string dmxMetricObjID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetDMXMetricFunctionProperties
	 * @param getDMXMetricFunctionProperties188
	 * 
	 * @param mWSSoapHeader189
	 * 
	 */
	public void startGetDMXMetricFunctionProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties getDMXMetricFunctionProperties188,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader189,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[40].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetDMXMetricFunctionProperties");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getDMXMetricFunctionProperties188,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetDMXMetricFunctionProperties")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader189 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader189 = toOM(
					mWSSoapHeader189,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetDMXMetricFunctionProperties")));
			addHeader(omElementmWSSoapHeader189, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetDMXMetricFunctionProperties((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback
									.receiveErrorGetDMXMetricFunctionProperties(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetDMXMetricFunctionProperties(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetDMXMetricFunctionProperties(f);
									}
								} else {
									callback
											.receiveErrorGetDMXMetricFunctionProperties(f);
								}
							} else {
								callback
										.receiveErrorGetDMXMetricFunctionProperties(f);
							}
						} else {
							callback
									.receiveErrorGetDMXMetricFunctionProperties(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetDMXMetricFunctionProperties(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[40].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[40].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Cancels an asynchronous HTML document
	 * execution.&lt;BR&gt;&lt;BR&gt;void CancelDocument(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#CancelDocument
	 * @param cancelDocument191
	 * 
	 * @param mWSSoapHeader192
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse CancelDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument cancelDocument191,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader192)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[41].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/CancelDocument");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), cancelDocument191,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelDocument")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader192 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader192 = toOM(
						mWSSoapHeader192,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"CancelDocument")));
				addHeader(omElementmWSSoapHeader192, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Cancels an
	 * asynchronous HTML document execution.&lt;BR&gt;&lt;BR&gt;void
	 * CancelDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startCancelDocument
	 * @param cancelDocument191
	 * 
	 * @param mWSSoapHeader192
	 * 
	 */
	public void startCancelDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument cancelDocument191,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader192,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[41].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/CancelDocument");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), cancelDocument191,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"CancelDocument")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader192 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader192 = toOM(
					mWSSoapHeader192,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelDocument")));
			addHeader(omElementmWSSoapHeader192, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultCancelDocument((com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorCancelDocument(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorCancelDocument(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelDocument(f);
									}
								} else {
									callback.receiveErrorCancelDocument(f);
								}
							} else {
								callback.receiveErrorCancelDocument(f);
							}
						} else {
							callback.receiveErrorCancelDocument(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorCancelDocument(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[41].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[41].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Cancels an asynchronous document
	 * execution.&lt;BR&gt;&lt;BR&gt;void CancelRSDocument(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#CancelRSDocument
	 * @param cancelRSDocument194
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse CancelRSDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument cancelRSDocument194)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[42].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/CancelRSDocument");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), cancelRSDocument194,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelRSDocument")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Cancels an
	 * asynchronous document execution.&lt;BR&gt;&lt;BR&gt;void
	 * CancelRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startCancelRSDocument
	 * @param cancelRSDocument194
	 * 
	 */
	public void startCancelRSDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument cancelRSDocument194,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[42].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/CancelRSDocument");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), cancelRSDocument194,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"CancelRSDocument")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultCancelRSDocument((com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorCancelRSDocument(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorCancelRSDocument(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorCancelRSDocument(f);
									}
								} else {
									callback.receiveErrorCancelRSDocument(f);
								}
							} else {
								callback.receiveErrorCancelRSDocument(f);
							}
						} else {
							callback.receiveErrorCancelRSDocument(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorCancelRSDocument(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[42].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[42].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * report.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo ExecuteReport
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string
	 * sReportName,&lt;BR&gt;&amp;nbsp string sReportID,&lt;BR&gt;&amp;nbsp
	 * string sAnswerPrompt,&lt;BR&gt;&amp;nbsp EnumMWSExecutionFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow,&lt;BR&gt;&amp;nbsp string sStyle,&lt;BR&gt;&amp;nbsp
	 * EnumMWSResultFlags eResults,&lt;BR&gt;&amp;nbsp MWSExecutionSettings
	 * eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ExecuteReport
	 * @param executeReport196
	 * 
	 * @param mWSSoapHeader197
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse ExecuteReport(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport executeReport196,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader197)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[43].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/ExecuteReport");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), executeReport196,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteReport")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader197 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader197 = toOM(
						mWSSoapHeader197,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ExecuteReport")));
				addHeader(omElementmWSSoapHeader197, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Initiates
	 * the execution of a specified report.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * ExecuteReport (&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sReportName,&lt;BR&gt;&amp;nbsp string
	 * sReportID,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow,&lt;BR&gt;&amp;nbsp string sStyle,&lt;BR&gt;&amp;nbsp
	 * EnumMWSResultFlags eResults,&lt;BR&gt;&amp;nbsp MWSExecutionSettings
	 * eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startExecuteReport
	 * @param executeReport196
	 * 
	 * @param mWSSoapHeader197
	 * 
	 */
	public void startExecuteReport(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport executeReport196,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader197,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[43].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/ExecuteReport");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), executeReport196,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ExecuteReport")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader197 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader197 = toOM(
					mWSSoapHeader197,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteReport")));
			addHeader(omElementmWSSoapHeader197, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultExecuteReport((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorExecuteReport(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorExecuteReport(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteReport(f);
									}
								} else {
									callback.receiveErrorExecuteReport(f);
								}
							} else {
								callback.receiveErrorExecuteReport(f);
							}
						} else {
							callback.receiveErrorExecuteReport(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorExecuteReport(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[43].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[43].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Incrementally retrieves a list of
	 * elements associated with the specified attribute, which are ancestors or
	 * descendants of the specified element list. The element list defines all
	 * of the parent or child elements related to the target attribute being
	 * drilled to. This is necessary to correctly handle many-to-many attribute
	 * relationships. Other filter restrictions are also applied (name pattern,
	 * letter case, etc). The document prompt is used to retrieve the element
	 * source, which ensures that cube attributes can be browsed. This method is
	 * used as part of document prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * DrillDocumentPromptElement(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyElementFilter[]
	 * fromElementFilters,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * toAttributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#DrillDocumentPromptElement
	 * @param drillDocumentPromptElement199
	 * 
	 * @param mWSSoapHeader200
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse DrillDocumentPromptElement(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement drillDocumentPromptElement199,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader200)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[44].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/DrillDocumentPromptElement");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), drillDocumentPromptElement199,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"DrillDocumentPromptElement")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader200 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader200 = toOM(
						mWSSoapHeader200,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"DrillDocumentPromptElement")));
				addHeader(omElementmWSSoapHeader200, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations
	 * Incrementally retrieves a list of elements associated with the specified
	 * attribute, which are ancestors or descendants of the specified element
	 * list. The element list defines all of the parent or child elements
	 * related to the target attribute being drilled to. This is necessary to
	 * correctly handle many-to-many attribute relationships. Other filter
	 * restrictions are also applied (name pattern, letter case, etc). The
	 * document prompt is used to retrieve the element source, which ensures
	 * that cube attributes can be browsed. This method is used as part of
	 * document prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSElementBrowseInfo
	 * DrillDocumentPromptElement(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSExecutionObjSpec oSpec,&lt;BR&gt;&amp;nbsp
	 * string promptKey,&lt;BR&gt;&amp;nbsp MWSHierarchyElementFilter[]
	 * fromElementFilters,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * toAttributeInfo,&lt;BR&gt;&amp;nbsp MWSElementRestriction[]
	 * arrayRestrictions,&lt;BR&gt;&amp;nbsp EnumMWSElementSourceFlags
	 * eFlags,&lt;BR&gt;&amp;nbsp int iBlockBegin,&lt;BR&gt;&amp;nbsp int
	 * iBlockCount)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startDrillDocumentPromptElement
	 * @param drillDocumentPromptElement199
	 * 
	 * @param mWSSoapHeader200
	 * 
	 */
	public void startDrillDocumentPromptElement(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement drillDocumentPromptElement199,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader200,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[44].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/DrillDocumentPromptElement");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), drillDocumentPromptElement199,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"DrillDocumentPromptElement")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader200 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader200 = toOM(
					mWSSoapHeader200,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"DrillDocumentPromptElement")));
			addHeader(omElementmWSSoapHeader200, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultDrillDocumentPromptElement((com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorDrillDocumentPromptElement(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorDrillDocumentPromptElement(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorDrillDocumentPromptElement(f);
									}
								} else {
									callback
											.receiveErrorDrillDocumentPromptElement(f);
								}
							} else {
								callback
										.receiveErrorDrillDocumentPromptElement(f);
							}
						} else {
							callback
									.receiveErrorDrillDocumentPromptElement(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorDrillDocumentPromptElement(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[44].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[44].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Sets the complete set of
	 * annotations/notes associated with the specified report services
	 * document.&lt;BR&gt;&lt;BR&gt;void SetRSDocumentAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * rsDocumentObjID, &lt;BR&gt;&amp;nbsp string annotations)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#SetRSDocumentAnnotations
	 * @param setRSDocumentAnnotations202
	 * 
	 * @param mWSSoapHeader203
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse SetRSDocumentAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations setRSDocumentAnnotations202,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader203)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[45].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/SetRSDocumentAnnotations");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), setRSDocumentAnnotations202,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SetRSDocumentAnnotations")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader203 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader203 = toOM(
						mWSSoapHeader203,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"SetRSDocumentAnnotations")));
				addHeader(omElementmWSSoapHeader203, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Sets the
	 * complete set of annotations/notes associated with the specified report
	 * services document.&lt;BR&gt;&lt;BR&gt;void SetRSDocumentAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * rsDocumentObjID, &lt;BR&gt;&amp;nbsp string annotations)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startSetRSDocumentAnnotations
	 * @param setRSDocumentAnnotations202
	 * 
	 * @param mWSSoapHeader203
	 * 
	 */
	public void startSetRSDocumentAnnotations(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations setRSDocumentAnnotations202,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader203,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[45].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/SetRSDocumentAnnotations");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), setRSDocumentAnnotations202,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"SetRSDocumentAnnotations")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader203 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader203 = toOM(
					mWSSoapHeader203,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SetRSDocumentAnnotations")));
			addHeader(omElementmWSSoapHeader203, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultSetRSDocumentAnnotations((com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorSetRSDocumentAnnotations(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorSetRSDocumentAnnotations(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSetRSDocumentAnnotations(f);
									}
								} else {
									callback
											.receiveErrorSetRSDocumentAnnotations(f);
								}
							} else {
								callback
										.receiveErrorSetRSDocumentAnnotations(f);
							}
						} else {
							callback
									.receiveErrorSetRSDocumentAnnotations(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorSetRSDocumentAnnotations(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[45].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[45].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Cancels an asynchronous
	 * browse.&lt;BR&gt;&lt;BR&gt;void CancelBrowse(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sBrowseID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#CancelBrowse
	 * @param cancelBrowse205
	 * 
	 * @param mWSSoapHeader206
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse CancelBrowse(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse cancelBrowse205,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader206)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[46].getName());
			_operationClient.getOptions().setAction(
					"http://microstrategy.com/webservices/v1_0/CancelBrowse");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), cancelBrowse205,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelBrowse")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader206 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader206 = toOM(
						mWSSoapHeader206,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"CancelBrowse")));
				addHeader(omElementmWSSoapHeader206, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Cancels an
	 * asynchronous browse.&lt;BR&gt;&lt;BR&gt;void
	 * CancelBrowse(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp
	 * string sBrowseID)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startCancelBrowse
	 * @param cancelBrowse205
	 * 
	 * @param mWSSoapHeader206
	 * 
	 */
	public void startCancelBrowse(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse cancelBrowse205,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader206,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[46].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/CancelBrowse");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), cancelBrowse205,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"CancelBrowse")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader206 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader206 = toOM(
					mWSSoapHeader206,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"CancelBrowse")));
			addHeader(omElementmWSSoapHeader206, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultCancelBrowse((com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorCancelBrowse(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorCancelBrowse(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorCancelBrowse(f);
									}
								} else {
									callback.receiveErrorCancelBrowse(f);
								}
							} else {
								callback.receiveErrorCancelBrowse(f);
							}
						} else {
							callback.receiveErrorCancelBrowse(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorCancelBrowse(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[46].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[46].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * HTML document.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * ExecuteDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow, &lt;BR&gt;&amp;nbsp EnumMWSResultFlags eResults,
	 * &lt;BR&gt;&amp;nbsp MWSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ExecuteDocument
	 * @param executeDocument208
	 * 
	 * @param mWSSoapHeader209
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse ExecuteDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument executeDocument208,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader209)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[47].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ExecuteDocument");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), executeDocument208,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteDocument")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader209 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader209 = toOM(
						mWSSoapHeader209,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ExecuteDocument")));
				addHeader(omElementmWSSoapHeader209, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Initiates
	 * the execution of a specified HTML
	 * document.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * ExecuteDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * EnumMWSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp MWSResultsWindow
	 * ResultsWindow, &lt;BR&gt;&amp;nbsp EnumMWSResultFlags eResults,
	 * &lt;BR&gt;&amp;nbsp MWSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startExecuteDocument
	 * @param executeDocument208
	 * 
	 * @param mWSSoapHeader209
	 * 
	 */
	public void startExecuteDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument executeDocument208,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader209,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[47].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/ExecuteDocument");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), executeDocument208,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ExecuteDocument")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader209 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader209 = toOM(
					mWSSoapHeader209,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ExecuteDocument")));
			addHeader(omElementmWSSoapHeader209, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultExecuteDocument((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorExecuteDocument(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorExecuteDocument(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback.receiveErrorExecuteDocument(f);
									}
								} else {
									callback.receiveErrorExecuteDocument(f);
								}
							} else {
								callback.receiveErrorExecuteDocument(f);
							}
						} else {
							callback.receiveErrorExecuteDocument(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorExecuteDocument(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[47].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[47].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * document using defaults.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * SimpleExecuteRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sAnswerPrompt,&lt;BR&gt;&amp;nbsp EnumMWSRSSimpleResultFlag eFormat)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#SimpleExecuteRSDocument
	 * @param simpleExecuteRSDocument211
	 * 
	 * @param mWSSoapHeader212
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse SimpleExecuteRSDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument simpleExecuteRSDocument211,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader212)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[48].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/SimpleExecuteRSDocument");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), simpleExecuteRSDocument211,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleExecuteRSDocument")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader212 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader212 = toOM(
						mWSSoapHeader212,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"SimpleExecuteRSDocument")));
				addHeader(omElementmWSSoapHeader212, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Initiates
	 * the execution of a specified document using
	 * defaults.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * SimpleExecuteRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sAnswerPrompt,&lt;BR&gt;&amp;nbsp EnumMWSRSSimpleResultFlag eFormat)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startSimpleExecuteRSDocument
	 * @param simpleExecuteRSDocument211
	 * 
	 * @param mWSSoapHeader212
	 * 
	 */
	public void startSimpleExecuteRSDocument(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument simpleExecuteRSDocument211,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader212,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[48].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/SimpleExecuteRSDocument");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), simpleExecuteRSDocument211,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"SimpleExecuteRSDocument")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader212 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader212 = toOM(
					mWSSoapHeader212,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"SimpleExecuteRSDocument")));
			addHeader(omElementmWSSoapHeader212, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultSimpleExecuteRSDocument((com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorSimpleExecuteRSDocument(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorSimpleExecuteRSDocument(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorSimpleExecuteRSDocument(f);
									}
								} else {
									callback
											.receiveErrorSimpleExecuteRSDocument(f);
								}
							} else {
								callback.receiveErrorSimpleExecuteRSDocument(f);
							}
						} else {
							callback.receiveErrorSimpleExecuteRSDocument(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorSimpleExecuteRSDocument(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[48].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[48].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieves a list of configured
	 * (projectsources.xml) project
	 * sources.&lt;BR&gt;&lt;BR&gt;MWSProjectSourceInfo[] GetProjectSources ()
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetProjectSources
	 * @param getProjectSources214
	 * 
	 * @param mWSSoapHeader215
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse GetProjectSources(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources getProjectSources214,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader215)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[49].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetProjectSources");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getProjectSources214,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetProjectSources")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader215 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader215 = toOM(
						mWSSoapHeader215,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetProjectSources")));
				addHeader(omElementmWSSoapHeader215, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieves a
	 * list of configured (projectsources.xml) project
	 * sources.&lt;BR&gt;&lt;BR&gt;MWSProjectSourceInfo[] GetProjectSources ()
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetProjectSources
	 * @param getProjectSources214
	 * 
	 * @param mWSSoapHeader215
	 * 
	 */
	public void startGetProjectSources(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources getProjectSources214,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader215,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[49].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/GetProjectSources");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getProjectSources214,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetProjectSources")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader215 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader215 = toOM(
					mWSSoapHeader215,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetProjectSources")));
			addHeader(omElementmWSSoapHeader215, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetProjectSources((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetProjectSources(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetProjectSources(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetProjectSources(f);
									}
								} else {
									callback.receiveErrorGetProjectSources(f);
								}
							} else {
								callback.receiveErrorGetProjectSources(f);
							}
						} else {
							callback.receiveErrorGetProjectSources(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetProjectSources(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[49].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[49].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Returns document execution results based
	 * on prompt input and other flags after an ExecuteRSDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * GetRSDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sMsgID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSRSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp EnumMWSRSResultFlags
	 * eFormat,&lt;BR&gt;&amp;nbsp MWSRSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetRSDocumentResults
	 * @param getRSDocumentResults217
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse GetRSDocumentResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults getRSDocumentResults217)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[50].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetRSDocumentResults");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getRSDocumentResults217,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetRSDocumentResults")));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Returns
	 * document execution results based on prompt input and other flags after an
	 * ExecuteRSDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * GetRSDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sMsgID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSRSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp EnumMWSRSResultFlags
	 * eFormat,&lt;BR&gt;&amp;nbsp MWSRSExecutionSettings eSettings)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetRSDocumentResults
	 * @param getRSDocumentResults217
	 * 
	 */
	public void startGetRSDocumentResults(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults getRSDocumentResults217,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[50].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetRSDocumentResults");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getRSDocumentResults217,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetRSDocumentResults")));

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetRSDocumentResults((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetRSDocumentResults(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetRSDocumentResults(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetRSDocumentResults(f);
									}
								} else {
									callback
											.receiveErrorGetRSDocumentResults(f);
								}
							} else {
								callback.receiveErrorGetRSDocumentResults(f);
							}
						} else {
							callback.receiveErrorGetRSDocumentResults(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback
									.receiveErrorGetRSDocumentResults(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[50].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[50].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Changes the users
	 * password.&lt;BR&gt;&lt;BR&gt;void ChangeUserPassword(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string newPassword)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#ChangeUserPassword
	 * @param changeUserPassword219
	 * 
	 * @param mWSSoapHeader220
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse ChangeUserPassword(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword changeUserPassword219,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader220)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[51].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/ChangeUserPassword");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), changeUserPassword219,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ChangeUserPassword")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader220 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader220 = toOM(
						mWSSoapHeader220,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ChangeUserPassword")));
				addHeader(omElementmWSSoapHeader220, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Changes the
	 * users password.&lt;BR&gt;&lt;BR&gt;void
	 * ChangeUserPassword(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string newPassword)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startChangeUserPassword
	 * @param changeUserPassword219
	 * 
	 * @param mWSSoapHeader220
	 * 
	 */
	public void startChangeUserPassword(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword changeUserPassword219,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader220,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[51].getName());
		_operationClient.getOptions().setAction(
				"http://microstrategy.com/webservices/v1_0/ChangeUserPassword");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), changeUserPassword219,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"ChangeUserPassword")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader220 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader220 = toOM(
					mWSSoapHeader220,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ChangeUserPassword")));
			addHeader(omElementmWSSoapHeader220, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultChangeUserPassword((com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorChangeUserPassword(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorChangeUserPassword(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorChangeUserPassword(f);
									}
								} else {
									callback.receiveErrorChangeUserPassword(f);
								}
							} else {
								callback.receiveErrorChangeUserPassword(f);
							}
						} else {
							callback.receiveErrorChangeUserPassword(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorChangeUserPassword(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[51].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[51].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * Auto generated method signature Retrieve the specifed set of property
	 * sets and properties for each specified object in the propertyGrps
	 * arrays.&lt;BR&gt;&lt;BR&gt;MWSObjectInfoPropertySetGroup[]
	 * GetObjectProperties (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp MWSObjectInfoPropertySetGroup[] propertyGrps)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#GetObjectProperties
	 * @param getObjectProperties222
	 * 
	 * @param mWSSoapHeader223
	 * 
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse GetObjectProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties getObjectProperties222,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader223)

	throws java.rmi.RemoteException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[52].getName());
			_operationClient
					.getOptions()
					.setAction(
							"http://microstrategy.com/webservices/v1_0/GetObjectProperties");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(
					true);

			addPropertyToOperationClient(
					_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
					"&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions()
					.getSoapVersionURI()), getObjectProperties222,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetObjectProperties")));

			env.build();

			// add the children only if the parameter is not null
			if (mWSSoapHeader223 != null) {

				org.apache.axiom.om.OMElement omElementmWSSoapHeader223 = toOM(
						mWSSoapHeader223,
						optimizeContent(new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"GetObjectProperties")));
				addHeader(omElementmWSSoapHeader223, env);

			}

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext
					.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse.class,
					getEnvelopeNamespaces(_returnEnv));

			return (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(faultElt.getQName())) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(faultElt.getQName());
						java.lang.Class exceptionClass = java.lang.Class
								.forName(exceptionClassName);
						java.lang.Exception ex = (java.lang.Exception) exceptionClass
								.newInstance();
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(faultElt.getQName());
						java.lang.Class messageClass = java.lang.Class
								.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt,
								messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod(
								"setFaultMessage",
								new java.lang.Class[] { messageClass });
						m.invoke(ex, new java.lang.Object[] { messageObject });

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original
						// Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			_messageContext.getTransportOut().getSender().cleanup(
					_messageContext);
		}
	}

	/**
	 * Auto generated method signature for Asynchronous Invocations Retrieve the
	 * specifed set of property sets and properties for each specified object in
	 * the propertyGrps
	 * arrays.&lt;BR&gt;&lt;BR&gt;MWSObjectInfoPropertySetGroup[]
	 * GetObjectProperties (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp MWSObjectInfoPropertySetGroup[] propertyGrps)
	 * 
	 * @see com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJ#startGetObjectProperties
	 * @param getObjectProperties222
	 * 
	 * @param mWSSoapHeader223
	 * 
	 */
	public void startGetObjectProperties(

			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties getObjectProperties222,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE mWSSoapHeader223,

			final com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJCallbackHandler callback)

	throws java.rmi.RemoteException {

		org.apache.axis2.client.OperationClient _operationClient = _serviceClient
				.createClient(_operations[52].getName());
		_operationClient
				.getOptions()
				.setAction(
						"http://microstrategy.com/webservices/v1_0/GetObjectProperties");
		_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

		addPropertyToOperationClient(
				_operationClient,
				org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
				"&");

		// create SOAP envelope with that payload
		org.apache.axiom.soap.SOAPEnvelope env = null;
		final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

		// Style is Doc.

		env = toEnvelope(getFactory(_operationClient.getOptions()
				.getSoapVersionURI()), getObjectProperties222,
				optimizeContent(new javax.xml.namespace.QName(
						"http://microstrategy.com/webservices/v1_0",
						"GetObjectProperties")));

		// add the soap_headers only if they are not null
		if (mWSSoapHeader223 != null) {

			org.apache.axiom.om.OMElement omElementmWSSoapHeader223 = toOM(
					mWSSoapHeader223,
					optimizeContent(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"GetObjectProperties")));
			addHeader(omElementmWSSoapHeader223, env);

		}

		// adding SOAP soap_headers
		_serviceClient.addHeadersToEnvelope(env);
		// create message context with that soap envelope
		_messageContext.setEnvelope(env);

		// add the message context to the operation client
		_operationClient.addMessageContext(_messageContext);

		_operationClient
				.setCallback(new org.apache.axis2.client.async.AxisCallback() {
					public void onMessage(
							org.apache.axis2.context.MessageContext resultContext) {
						try {
							org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext
									.getEnvelope();

							java.lang.Object object = fromOM(
									resultEnv.getBody().getFirstElement(),
									com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse.class,
									getEnvelopeNamespaces(resultEnv));
							callback
									.receiveResultGetObjectProperties((com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse) object);

						} catch (org.apache.axis2.AxisFault e) {
							callback.receiveErrorGetObjectProperties(e);
						}
					}

					public void onError(java.lang.Exception error) {
						if (error instanceof org.apache.axis2.AxisFault) {
							org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
							org.apache.axiom.om.OMElement faultElt = f
									.getDetail();
							if (faultElt != null) {
								if (faultExceptionNameMap.containsKey(faultElt
										.getQName())) {
									// make the fault by reflection
									try {
										java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
												.get(faultElt.getQName());
										java.lang.Class exceptionClass = java.lang.Class
												.forName(exceptionClassName);
										java.lang.Exception ex = (java.lang.Exception) exceptionClass
												.newInstance();
										// message class
										java.lang.String messageClassName = (java.lang.String) faultMessageMap
												.get(faultElt.getQName());
										java.lang.Class messageClass = java.lang.Class
												.forName(messageClassName);
										java.lang.Object messageObject = fromOM(
												faultElt, messageClass, null);
										java.lang.reflect.Method m = exceptionClass
												.getMethod(
														"setFaultMessage",
														new java.lang.Class[] { messageClass });
										m
												.invoke(
														ex,
														new java.lang.Object[] { messageObject });

										callback
												.receiveErrorGetObjectProperties(new java.rmi.RemoteException(
														ex.getMessage(), ex));
									} catch (java.lang.ClassCastException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									} catch (java.lang.ClassNotFoundException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									} catch (java.lang.NoSuchMethodException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									} catch (java.lang.reflect.InvocationTargetException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									} catch (java.lang.IllegalAccessException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									} catch (java.lang.InstantiationException e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									} catch (org.apache.axis2.AxisFault e) {
										// we cannot intantiate the class -
										// throw the original Axis fault
										callback
												.receiveErrorGetObjectProperties(f);
									}
								} else {
									callback.receiveErrorGetObjectProperties(f);
								}
							} else {
								callback.receiveErrorGetObjectProperties(f);
							}
						} else {
							callback.receiveErrorGetObjectProperties(error);
						}
					}

					public void onFault(
							org.apache.axis2.context.MessageContext faultContext) {
						org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils
								.getInboundFaultFromMessageContext(faultContext);
						onError(fault);
					}

					public void onComplete() {
						try {
							_messageContext.getTransportOut().getSender()
									.cleanup(_messageContext);
						} catch (org.apache.axis2.AxisFault axisFault) {
							callback.receiveErrorGetObjectProperties(axisFault);
						}
					}
				});

		org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
		if (_operations[52].getMessageReceiver() == null
				&& _operationClient.getOptions().isUseSeparateListener()) {
			_callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
			_operations[52].setMessageReceiver(_callbackReceiver);
		}

		// execute the operation client
		_operationClient.execute(false);

	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(
			org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator
					.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://localhost:8080/MicroStrategyWS/services/MSTRWSJ
	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory
									.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2 param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties.MY_QNAME,
											factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
			java.lang.Class type, java.util.Map extraNamespaces)
			throws org.apache.axis2.AxisFault {

		try {

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.class
					.equals(type)) {

				return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSSoapHeaderE.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
