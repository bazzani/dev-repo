/**
 * MSTRWSMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MSTRWSMessageReceiverInOut message receiver
 */

public class MSTRWSMessageReceiverInOut extends
		org.apache.axis2.receivers.AbstractInOutMessageReceiver {

	public void invokeBusinessLogic(
			org.apache.axis2.context.MessageContext msgContext,
			org.apache.axis2.context.MessageContext newMsgContext)
			throws org.apache.axis2.AxisFault {

		try {

			// get the implementation class for the Web Service
			Object obj = getTheImplementationObject(msgContext);

			MSTRWSSkeletonInterface skel = (MSTRWSSkeletonInterface) obj;
			// Out Envelop
			org.apache.axiom.soap.SOAPEnvelope envelope = null;
			// Find the axisOperation that has been set by the Dispatch phase.
			org.apache.axis2.description.AxisOperation op = msgContext
					.getOperationContext().getAxisOperation();
			if (op == null) {
				throw new org.apache.axis2.AxisFault(
						"Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
			}

			java.lang.String methodName;
			if ((op.getName() != null)
					&& ((methodName = org.apache.axis2.util.JavaUtils
							.xmlNameToJava(op.getName().getLocalPart())) != null)) {

				if ("ConnectToProject".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse connectToProjectResponse191 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					connectToProjectResponse191 =

					skel.ConnectToProject(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							connectToProjectResponse191, false);
				} else

				if ("GetHistory".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse getHistoryResponse194 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getHistoryResponse194 =

					skel.GetHistory(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getHistoryResponse194, false);
				} else

				if ("RenameHistoryListMessage".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse renameHistoryListMessageResponse196 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					renameHistoryListMessageResponse196 =

					skel.RenameHistoryListMessage(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							renameHistoryListMessageResponse196, false);
				} else

				if ("GetContents".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse getContentsResponse199 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getContentsResponse199 =

					skel.GetContents(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getContentsResponse199, false);
				} else

				if ("GetMWSInfoProperties".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse getMWSInfoPropertiesResponse201 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getMWSInfoPropertiesResponse201 =

					skel.GetMWSInfoProperties(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getMWSInfoPropertiesResponse201, false);
				} else

				if ("GetAttributeChildren".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse getAttributeChildrenResponse204 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getAttributeChildrenResponse204 =

					skel.GetAttributeChildren(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getAttributeChildrenResponse204, false);
				} else

				if ("SimpleExecuteReport".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse simpleExecuteReportResponse207 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					simpleExecuteReportResponse207 =

					skel.SimpleExecuteReport(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							simpleExecuteReportResponse207, false);
				} else

				if ("GetIncrementalBrowseResults".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse getIncrementalBrowseResultsResponse210 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getIncrementalBrowseResultsResponse210 =

					skel.GetIncrementalBrowseResults(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getIncrementalBrowseResultsResponse210, false);
				} else

				if ("GetUserPreferences".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse getUserPreferencesResponse213 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getUserPreferencesResponse213 =

					skel.GetUserPreferences(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getUserPreferencesResponse213, false);
				} else

				if ("Connect".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse connectResponse216 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					connectResponse216 =

					skel.Connect(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							connectResponse216, false);
				} else

				if ("GetRSDocumentAnnotations".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse getRSDocumentAnnotationsResponse219 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getRSDocumentAnnotationsResponse219 =

					skel.GetRSDocumentAnnotations(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getRSDocumentAnnotationsResponse219, false);
				} else

				if ("TestService".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse testServiceResponse221 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					testServiceResponse221 =

					skel.TestService(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							testServiceResponse221, false);
				} else

				if ("GetMWSOfficeInstallInfo".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse getMWSOfficeInstallInfoResponse223 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getMWSOfficeInstallInfoResponse223 =

					skel.GetMWSOfficeInstallInfo(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getMWSOfficeInstallInfoResponse223, false);
				} else

				if ("GetMWSIdentity".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse getMWSIdentityResponse225 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getMWSIdentityResponse225 =

					skel.GetMWSIdentity(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getMWSIdentityResponse225, false);
				} else

				if ("GetReportAnnotations".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse getReportAnnotationsResponse228 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getReportAnnotationsResponse228 =

					skel.GetReportAnnotations(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getReportAnnotationsResponse228, false);
				} else

				if ("GetResources".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse getResourcesResponse230 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getResourcesResponse230 =

					skel.GetResources(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getResourcesResponse230, false);
				} else

				if ("GetDocumentPromptElements".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse getDocumentPromptElementsResponse233 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getDocumentPromptElementsResponse233 =

					skel.GetDocumentPromptElements(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getDocumentPromptElementsResponse233, false);
				} else

				if ("GetVisualizationLists".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse getVisualizationListsResponse236 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getVisualizationListsResponse236 =

					skel.GetVisualizationLists(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getVisualizationListsResponse236, false);
				} else

				if ("GetHierarchyAttributes".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse getHierarchyAttributesResponse239 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getHierarchyAttributesResponse239 =

					skel.GetHierarchyAttributes(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getHierarchyAttributesResponse239, false);
				} else

				if ("SimpleGetRSDocumentResults".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse simpleGetRSDocumentResultsResponse242 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					simpleGetRSDocumentResultsResponse242 =

					skel.SimpleGetRSDocumentResults(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							simpleGetRSDocumentResultsResponse242, false);
				} else

				if ("DrillRSDocumentPromptElement".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse drillRSDocumentPromptElementResponse245 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					drillRSDocumentPromptElementResponse245 =

					skel.DrillRSDocumentPromptElement(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							drillRSDocumentPromptElementResponse245, false);
				} else

				if ("GetReportResults".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse getReportResultsResponse248 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getReportResultsResponse248 =

					skel.GetReportResults(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getReportResultsResponse248, false);
				} else

				if ("GetMWSFunctionalityProperties".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse getMWSFunctionalityPropertiesResponse250 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getMWSFunctionalityPropertiesResponse250 =

					skel.GetMWSFunctionalityProperties(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getMWSFunctionalityPropertiesResponse250, false);
				} else

				if ("GetProjectFolder".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse getProjectFolderResponse253 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getProjectFolderResponse253 =

					skel.GetProjectFolder(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getProjectFolderResponse253, false);
				} else

				if ("ManipulateUserAnswer".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse manipulateUserAnswerResponse255 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					manipulateUserAnswerResponse255 =

					skel.ManipulateUserAnswer(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							manipulateUserAnswerResponse255, false);
				} else

				if ("GetDocumentResults".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse getDocumentResultsResponse258 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getDocumentResultsResponse258 =

					skel.GetDocumentResults(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getDocumentResultsResponse258, false);
				} else

				if ("ExecuteIncrementalBrowse".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse executeIncrementalBrowseResponse261 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					executeIncrementalBrowseResponse261 =

					skel.ExecuteIncrementalBrowse(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							executeIncrementalBrowseResponse261, false);
				} else

				if ("GetAttributeParents".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse getAttributeParentsResponse264 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getAttributeParentsResponse264 =

					skel.GetAttributeParents(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getAttributeParentsResponse264, false);
				} else

				if ("GetRSDocumentPromptElements".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse getRSDocumentPromptElementsResponse267 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getRSDocumentPromptElementsResponse267 =

					skel.GetRSDocumentPromptElements(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getRSDocumentPromptElementsResponse267, false);
				} else

				if ("CancelReport".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse cancelReportResponse270 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					cancelReportResponse270 =

					skel.CancelReport(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							cancelReportResponse270, false);
				} else

				if ("GetMWSProperties".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response getMWSProperties2Response273 = null;
					com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2 wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getMWSProperties2Response273 =

					skel.GetMWSProperties(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getMWSProperties2Response273, false);
				} else

				if ("ExecuteRSDocument".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse executeRSDocumentResponse276 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					executeRSDocumentResponse276 =

					skel.ExecuteRSDocument(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							executeRSDocumentResponse276, false);
				} else

				if ("DrillReportPromptElement".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse drillReportPromptElementResponse279 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					drillReportPromptElementResponse279 =

					skel.DrillReportPromptElement(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							drillReportPromptElementResponse279, false);
				} else

				if ("Disconnect".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse disconnectResponse282 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					disconnectResponse282 =

					skel.Disconnect(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							disconnectResponse282, false);
				} else

				if ("GetAttributeElements".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse getAttributeElementsResponse285 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getAttributeElementsResponse285 =

					skel.GetAttributeElements(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getAttributeElementsResponse285, false);
				} else

				if ("ModifyHistoryListMessages".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse modifyHistoryListMessagesResponse287 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					modifyHistoryListMessagesResponse287 =

					skel.ModifyHistoryListMessages(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							modifyHistoryListMessagesResponse287, false);
				} else

				if ("SetReportAnnotations".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse setReportAnnotationsResponse290 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					setReportAnnotationsResponse290 =

					skel.SetReportAnnotations(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							setReportAnnotationsResponse290, false);
				} else

				if ("GetProjects".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse getProjectsResponse293 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getProjectsResponse293 =

					skel.GetProjects(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getProjectsResponse293, false);
				} else

				if ("GetReportPromptElements".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse getReportPromptElementsResponse296 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getReportPromptElementsResponse296 =

					skel.GetReportPromptElements(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getReportPromptElementsResponse296, false);
				} else

				if ("SimpleGetReportResults".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse simpleGetReportResultsResponse299 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					simpleGetReportResultsResponse299 =

					skel.SimpleGetReportResults(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							simpleGetReportResultsResponse299, false);
				} else

				if ("GetDMXMetricFunctionProperties".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse getDMXMetricFunctionPropertiesResponse302 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getDMXMetricFunctionPropertiesResponse302 =

					skel.GetDMXMetricFunctionProperties(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getDMXMetricFunctionPropertiesResponse302, false);
				} else

				if ("CancelDocument".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse cancelDocumentResponse305 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					cancelDocumentResponse305 =

					skel.CancelDocument(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							cancelDocumentResponse305, false);
				} else

				if ("CancelRSDocument".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse cancelRSDocumentResponse307 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					cancelRSDocumentResponse307 =

					skel.CancelRSDocument(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							cancelRSDocumentResponse307, false);
				} else

				if ("ExecuteReport".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse executeReportResponse310 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					executeReportResponse310 =

					skel.ExecuteReport(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							executeReportResponse310, false);
				} else

				if ("DrillDocumentPromptElement".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse drillDocumentPromptElementResponse313 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					drillDocumentPromptElementResponse313 =

					skel.DrillDocumentPromptElement(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							drillDocumentPromptElementResponse313, false);
				} else

				if ("SetRSDocumentAnnotations".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse setRSDocumentAnnotationsResponse316 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					setRSDocumentAnnotationsResponse316 =

					skel.SetRSDocumentAnnotations(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							setRSDocumentAnnotationsResponse316, false);
				} else

				if ("CancelBrowse".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse cancelBrowseResponse319 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					cancelBrowseResponse319 =

					skel.CancelBrowse(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							cancelBrowseResponse319, false);
				} else

				if ("ExecuteDocument".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse executeDocumentResponse322 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					executeDocumentResponse322 =

					skel.ExecuteDocument(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							executeDocumentResponse322, false);
				} else

				if ("SimpleExecuteRSDocument".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse simpleExecuteRSDocumentResponse325 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					simpleExecuteRSDocumentResponse325 =

					skel.SimpleExecuteRSDocument(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							simpleExecuteRSDocumentResponse325, false);
				} else

				if ("GetProjectSources".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse getProjectSourcesResponse328 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getProjectSourcesResponse328 =

					skel.GetProjectSources(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getProjectSourcesResponse328, false);
				} else

				if ("GetRSDocumentResults".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse getRSDocumentResultsResponse330 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getRSDocumentResultsResponse330 =

					skel.GetRSDocumentResults(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getRSDocumentResultsResponse330, false);
				} else

				if ("ChangeUserPassword".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse changeUserPasswordResponse333 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					changeUserPasswordResponse333 =

					skel.ChangeUserPassword(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							changeUserPasswordResponse333, false);
				} else

				if ("GetObjectProperties".equals(methodName)) {

					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse getObjectPropertiesResponse336 = null;
					com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties wrappedParam = (com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties) fromOM(
							msgContext.getEnvelope().getBody()
									.getFirstElement(),
							com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties.class,
							getEnvelopeNamespaces(msgContext.getEnvelope()));

					getObjectPropertiesResponse336 =

					skel.GetObjectProperties(wrappedParam);

					envelope = toEnvelope(getSOAPFactory(msgContext),
							getObjectPropertiesResponse336, false);

				} else {
					throw new java.lang.RuntimeException("method not found");
				}

				newMsgContext.setEnvelope(envelope);
			}
		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	//
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
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse wrapConnectToProject() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse wrapGetHistory() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse wrapRenameHistoryListMessage() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse wrapGetContents() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse wrapGetMWSInfoProperties() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse wrapGetAttributeChildren() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse wrapSimpleExecuteReport() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse wrapGetIncrementalBrowseResults() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse wrapGetUserPreferences() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse wrapConnect() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse wrapGetRSDocumentAnnotations() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse wrapTestService() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse wrapGetMWSOfficeInstallInfo() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse wrapGetMWSIdentity() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse wrapGetReportAnnotations() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse wrapGetResources() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse wrapGetDocumentPromptElements() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse wrapGetVisualizationLists() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse wrapGetHierarchyAttributes() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse wrapSimpleGetRSDocumentResults() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse wrapDrillRSDocumentPromptElement() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse wrapGetReportResults() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse wrapGetMWSFunctionalityProperties() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse wrapGetProjectFolder() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse wrapManipulateUserAnswer() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse wrapGetDocumentResults() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse wrapExecuteIncrementalBrowse() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse wrapGetAttributeParents() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse wrapGetRSDocumentPromptElements() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse wrapCancelReport() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response wrapGetMWSProperties() {
		com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse wrapExecuteRSDocument() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse wrapDrillReportPromptElement() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse wrapDisconnect() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse wrapGetAttributeElements() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse wrapModifyHistoryListMessages() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse wrapSetReportAnnotations() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse wrapGetProjects() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse wrapGetReportPromptElements() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse wrapSimpleGetReportResults() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse wrapGetDMXMetricFunctionProperties() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse wrapCancelDocument() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse wrapCancelRSDocument() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse wrapExecuteReport() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse wrapDrillDocumentPromptElement() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse wrapSetRSDocumentAnnotations() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse wrapCancelBrowse() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse wrapExecuteDocument() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse wrapSimpleExecuteRSDocument() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse wrapGetProjectSources() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse wrapGetRSDocumentResults() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse wrapChangeUserPassword() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse();
		return wrappedElement;
	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
			org.apache.axiom.soap.SOAPFactory factory,
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {
		try {
			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory
					.getDefaultEnvelope();

			emptyEnvelope
					.getBody()
					.addChild(
							param
									.getOMElement(
											com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse.MY_QNAME,
											factory));

			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
	}

	private com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse wrapGetObjectProperties() {
		com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse wrappedElement = new com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse();
		return wrappedElement;
	}

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

	private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
		org.apache.axis2.AxisFault f;
		Throwable cause = e.getCause();
		if (cause != null) {
			f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
		} else {
			f = new org.apache.axis2.AxisFault(e.getMessage());
		}

		return f;
	}

}// end of class
