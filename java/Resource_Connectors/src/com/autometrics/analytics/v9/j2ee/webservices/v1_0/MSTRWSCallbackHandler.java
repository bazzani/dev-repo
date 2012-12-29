/**
 * MSTRWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MSTRWSCallbackHandler Callback class, Users can extend this class and
 * implement their own receiveResult and receiveError methods.
 */
public abstract class MSTRWSCallbackHandler {

	protected Object clientData;

	/**
	 * User can pass in any object that needs to be accessed once the
	 * NonBlocking Web service call is finished and appropriate method of this
	 * CallBack is called.
	 * 
	 * @param clientData
	 *            Object mechanism by which the user can pass in user data that
	 *            will be avilable at the time this callback is called.
	 */
	public MSTRWSCallbackHandler(Object clientData) {
		this.clientData = clientData;
	}

	/**
	 * Please use this constructor if you don't want to set any clientData
	 */
	public MSTRWSCallbackHandler() {
		this.clientData = null;
	}

	/**
	 * Get the client data
	 */

	public Object getClientData() {
		return clientData;
	}

	/**
	 * auto generated Axis2 call back method for ConnectToProject method
	 * override this method for handling normal response from ConnectToProject
	 * operation
	 */
	public void receiveResultConnectToProject(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ConnectToProject operation
	 */
	public void receiveErrorConnectToProject(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetHistory method override this
	 * method for handling normal response from GetHistory operation
	 */
	public void receiveResultGetHistory(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetHistory operation
	 */
	public void receiveErrorGetHistory(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for RenameHistoryListMessage method
	 * override this method for handling normal response from
	 * RenameHistoryListMessage operation
	 */
	public void receiveResultRenameHistoryListMessage(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from RenameHistoryListMessage operation
	 */
	public void receiveErrorRenameHistoryListMessage(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetContents method override
	 * this method for handling normal response from GetContents operation
	 */
	public void receiveResultGetContents(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetContents operation
	 */
	public void receiveErrorGetContents(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetMWSInfoProperties method
	 * override this method for handling normal response from
	 * GetMWSInfoProperties operation
	 */
	public void receiveResultGetMWSInfoProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetMWSInfoProperties operation
	 */
	public void receiveErrorGetMWSInfoProperties(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetAttributeChildren method
	 * override this method for handling normal response from
	 * GetAttributeChildren operation
	 */
	public void receiveResultGetAttributeChildren(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetAttributeChildren operation
	 */
	public void receiveErrorGetAttributeChildren(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for SimpleExecuteReport method
	 * override this method for handling normal response from
	 * SimpleExecuteReport operation
	 */
	public void receiveResultSimpleExecuteReport(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from SimpleExecuteReport operation
	 */
	public void receiveErrorSimpleExecuteReport(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetIncrementalBrowseResults
	 * method override this method for handling normal response from
	 * GetIncrementalBrowseResults operation
	 */
	public void receiveResultGetIncrementalBrowseResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetIncrementalBrowseResults operation
	 */
	public void receiveErrorGetIncrementalBrowseResults(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetUserPreferences method
	 * override this method for handling normal response from GetUserPreferences
	 * operation
	 */
	public void receiveResultGetUserPreferences(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetUserPreferences operation
	 */
	public void receiveErrorGetUserPreferences(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for Connect method override this
	 * method for handling normal response from Connect operation
	 */
	public void receiveResultConnect(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from Connect operation
	 */
	public void receiveErrorConnect(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetRSDocumentAnnotations method
	 * override this method for handling normal response from
	 * GetRSDocumentAnnotations operation
	 */
	public void receiveResultGetRSDocumentAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetRSDocumentAnnotations operation
	 */
	public void receiveErrorGetRSDocumentAnnotations(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for TestService method override
	 * this method for handling normal response from TestService operation
	 */
	public void receiveResultTestService(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from TestService operation
	 */
	public void receiveErrorTestService(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetMWSOfficeInstallInfo method
	 * override this method for handling normal response from
	 * GetMWSOfficeInstallInfo operation
	 */
	public void receiveResultGetMWSOfficeInstallInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetMWSOfficeInstallInfo operation
	 */
	public void receiveErrorGetMWSOfficeInstallInfo(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetMWSIdentity method override
	 * this method for handling normal response from GetMWSIdentity operation
	 */
	public void receiveResultGetMWSIdentity(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetMWSIdentity operation
	 */
	public void receiveErrorGetMWSIdentity(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetReportAnnotations method
	 * override this method for handling normal response from
	 * GetReportAnnotations operation
	 */
	public void receiveResultGetReportAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetReportAnnotations operation
	 */
	public void receiveErrorGetReportAnnotations(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetResources method override
	 * this method for handling normal response from GetResources operation
	 */
	public void receiveResultGetResources(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetResources operation
	 */
	public void receiveErrorGetResources(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetDocumentPromptElements
	 * method override this method for handling normal response from
	 * GetDocumentPromptElements operation
	 */
	public void receiveResultGetDocumentPromptElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetDocumentPromptElements operation
	 */
	public void receiveErrorGetDocumentPromptElements(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetVisualizationLists method
	 * override this method for handling normal response from
	 * GetVisualizationLists operation
	 */
	public void receiveResultGetVisualizationLists(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetVisualizationLists operation
	 */
	public void receiveErrorGetVisualizationLists(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetHierarchyAttributes method
	 * override this method for handling normal response from
	 * GetHierarchyAttributes operation
	 */
	public void receiveResultGetHierarchyAttributes(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetHierarchyAttributes operation
	 */
	public void receiveErrorGetHierarchyAttributes(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for SimpleGetRSDocumentResults
	 * method override this method for handling normal response from
	 * SimpleGetRSDocumentResults operation
	 */
	public void receiveResultSimpleGetRSDocumentResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from SimpleGetRSDocumentResults operation
	 */
	public void receiveErrorSimpleGetRSDocumentResults(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for DrillRSDocumentPromptElement
	 * method override this method for handling normal response from
	 * DrillRSDocumentPromptElement operation
	 */
	public void receiveResultDrillRSDocumentPromptElement(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from DrillRSDocumentPromptElement operation
	 */
	public void receiveErrorDrillRSDocumentPromptElement(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetReportResults method
	 * override this method for handling normal response from GetReportResults
	 * operation
	 */
	public void receiveResultGetReportResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetReportResults operation
	 */
	public void receiveErrorGetReportResults(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetMWSFunctionalityProperties
	 * method override this method for handling normal response from
	 * GetMWSFunctionalityProperties operation
	 */
	public void receiveResultGetMWSFunctionalityProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetMWSFunctionalityProperties operation
	 */
	public void receiveErrorGetMWSFunctionalityProperties(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetProjectFolder method
	 * override this method for handling normal response from GetProjectFolder
	 * operation
	 */
	public void receiveResultGetProjectFolder(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetProjectFolder operation
	 */
	public void receiveErrorGetProjectFolder(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ManipulateUserAnswer method
	 * override this method for handling normal response from
	 * ManipulateUserAnswer operation
	 */
	public void receiveResultManipulateUserAnswer(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ManipulateUserAnswer operation
	 */
	public void receiveErrorManipulateUserAnswer(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetDocumentResults method
	 * override this method for handling normal response from GetDocumentResults
	 * operation
	 */
	public void receiveResultGetDocumentResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetDocumentResults operation
	 */
	public void receiveErrorGetDocumentResults(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ExecuteIncrementalBrowse method
	 * override this method for handling normal response from
	 * ExecuteIncrementalBrowse operation
	 */
	public void receiveResultExecuteIncrementalBrowse(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ExecuteIncrementalBrowse operation
	 */
	public void receiveErrorExecuteIncrementalBrowse(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetAttributeParents method
	 * override this method for handling normal response from
	 * GetAttributeParents operation
	 */
	public void receiveResultGetAttributeParents(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetAttributeParents operation
	 */
	public void receiveErrorGetAttributeParents(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetRSDocumentPromptElements
	 * method override this method for handling normal response from
	 * GetRSDocumentPromptElements operation
	 */
	public void receiveResultGetRSDocumentPromptElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetRSDocumentPromptElements operation
	 */
	public void receiveErrorGetRSDocumentPromptElements(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for CancelReport method override
	 * this method for handling normal response from CancelReport operation
	 */
	public void receiveResultCancelReport(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from CancelReport operation
	 */
	public void receiveErrorCancelReport(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetMWSProperties method
	 * override this method for handling normal response from GetMWSProperties
	 * operation
	 */
	public void receiveResultGetMWSProperties(
			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetMWSProperties operation
	 */
	public void receiveErrorGetMWSProperties(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ExecuteRSDocument method
	 * override this method for handling normal response from ExecuteRSDocument
	 * operation
	 */
	public void receiveResultExecuteRSDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ExecuteRSDocument operation
	 */
	public void receiveErrorExecuteRSDocument(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for DrillReportPromptElement method
	 * override this method for handling normal response from
	 * DrillReportPromptElement operation
	 */
	public void receiveResultDrillReportPromptElement(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from DrillReportPromptElement operation
	 */
	public void receiveErrorDrillReportPromptElement(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for Disconnect method override this
	 * method for handling normal response from Disconnect operation
	 */
	public void receiveResultDisconnect(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from Disconnect operation
	 */
	public void receiveErrorDisconnect(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetAttributeElements method
	 * override this method for handling normal response from
	 * GetAttributeElements operation
	 */
	public void receiveResultGetAttributeElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetAttributeElements operation
	 */
	public void receiveErrorGetAttributeElements(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ModifyHistoryListMessages
	 * method override this method for handling normal response from
	 * ModifyHistoryListMessages operation
	 */
	public void receiveResultModifyHistoryListMessages(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ModifyHistoryListMessages operation
	 */
	public void receiveErrorModifyHistoryListMessages(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for SetReportAnnotations method
	 * override this method for handling normal response from
	 * SetReportAnnotations operation
	 */
	public void receiveResultSetReportAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from SetReportAnnotations operation
	 */
	public void receiveErrorSetReportAnnotations(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetProjects method override
	 * this method for handling normal response from GetProjects operation
	 */
	public void receiveResultGetProjects(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetProjects operation
	 */
	public void receiveErrorGetProjects(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetReportPromptElements method
	 * override this method for handling normal response from
	 * GetReportPromptElements operation
	 */
	public void receiveResultGetReportPromptElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetReportPromptElements operation
	 */
	public void receiveErrorGetReportPromptElements(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for SimpleGetReportResults method
	 * override this method for handling normal response from
	 * SimpleGetReportResults operation
	 */
	public void receiveResultSimpleGetReportResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from SimpleGetReportResults operation
	 */
	public void receiveErrorSimpleGetReportResults(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetDMXMetricFunctionProperties
	 * method override this method for handling normal response from
	 * GetDMXMetricFunctionProperties operation
	 */
	public void receiveResultGetDMXMetricFunctionProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetDMXMetricFunctionProperties operation
	 */
	public void receiveErrorGetDMXMetricFunctionProperties(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for CancelDocument method override
	 * this method for handling normal response from CancelDocument operation
	 */
	public void receiveResultCancelDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from CancelDocument operation
	 */
	public void receiveErrorCancelDocument(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for CancelRSDocument method
	 * override this method for handling normal response from CancelRSDocument
	 * operation
	 */
	public void receiveResultCancelRSDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from CancelRSDocument operation
	 */
	public void receiveErrorCancelRSDocument(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ExecuteReport method override
	 * this method for handling normal response from ExecuteReport operation
	 */
	public void receiveResultExecuteReport(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ExecuteReport operation
	 */
	public void receiveErrorExecuteReport(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for DrillDocumentPromptElement
	 * method override this method for handling normal response from
	 * DrillDocumentPromptElement operation
	 */
	public void receiveResultDrillDocumentPromptElement(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from DrillDocumentPromptElement operation
	 */
	public void receiveErrorDrillDocumentPromptElement(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for SetRSDocumentAnnotations method
	 * override this method for handling normal response from
	 * SetRSDocumentAnnotations operation
	 */
	public void receiveResultSetRSDocumentAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from SetRSDocumentAnnotations operation
	 */
	public void receiveErrorSetRSDocumentAnnotations(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for CancelBrowse method override
	 * this method for handling normal response from CancelBrowse operation
	 */
	public void receiveResultCancelBrowse(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from CancelBrowse operation
	 */
	public void receiveErrorCancelBrowse(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ExecuteDocument method override
	 * this method for handling normal response from ExecuteDocument operation
	 */
	public void receiveResultExecuteDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ExecuteDocument operation
	 */
	public void receiveErrorExecuteDocument(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for SimpleExecuteRSDocument method
	 * override this method for handling normal response from
	 * SimpleExecuteRSDocument operation
	 */
	public void receiveResultSimpleExecuteRSDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from SimpleExecuteRSDocument operation
	 */
	public void receiveErrorSimpleExecuteRSDocument(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetProjectSources method
	 * override this method for handling normal response from GetProjectSources
	 * operation
	 */
	public void receiveResultGetProjectSources(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetProjectSources operation
	 */
	public void receiveErrorGetProjectSources(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetRSDocumentResults method
	 * override this method for handling normal response from
	 * GetRSDocumentResults operation
	 */
	public void receiveResultGetRSDocumentResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetRSDocumentResults operation
	 */
	public void receiveErrorGetRSDocumentResults(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for ChangeUserPassword method
	 * override this method for handling normal response from ChangeUserPassword
	 * operation
	 */
	public void receiveResultChangeUserPassword(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from ChangeUserPassword operation
	 */
	public void receiveErrorChangeUserPassword(java.lang.Exception e) {
	}

	/**
	 * auto generated Axis2 call back method for GetObjectProperties method
	 * override this method for handling normal response from
	 * GetObjectProperties operation
	 */
	public void receiveResultGetObjectProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse result) {
	}

	/**
	 * auto generated Axis2 Error handler override this method for handling
	 * error response from GetObjectProperties operation
	 */
	public void receiveErrorGetObjectProperties(java.lang.Exception e) {
	}

}
