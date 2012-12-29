/**
 * MSTRWSJSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:24:30 EDT)
 */
package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MSTRWSJSkeletonInterface java skeleton interface for the axisService
 */
public interface MSTRWSJSkeletonInterface {

	/**
	 * Auto generated method signature Create an iServer session and return
	 * project specific information.&lt;BR&gt;&lt;BR&gt;MWSProjectSessionInfo
	 * ConnectToProject(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @param connectToProject
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProjectResponse ConnectToProject(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject connectToProject);

	/**
	 * Auto generated method signature Retrieves the list of items in the users
	 * inbox (history list).&lt;BR&gt;&lt;BR&gt;MWSHistoryInfo[]
	 * GetHistory(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @param getHistory
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistoryResponse GetHistory(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHistory getHistory);

	/**
	 * Auto generated method signature This method renames the specified message
	 * id on the history list. &lt;BR&gt;&lt;BR&gt;vois
	 * RenameHistoryListMessage(&lt;BR&gt;&amp;nbsp MWSConnectInfo connectInfo,
	 * &lt;BR&gt;&amp;nbsp String sMsgID, &lt;BR&gt;&amp;nbsp String sName)
	 * 
	 * @param renameHistoryListMessage
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessageResponse RenameHistoryListMessage(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.RenameHistoryListMessage renameHistoryListMessage);

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
	 * @param getContents
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContentsResponse GetContents(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetContents getContents);

	/**
	 * Auto generated method signature Retrieves informational web service
	 * properties.&lt;BR&gt;&lt;BR&gt;MWSInfoProperty[]
	 * GetMWSInfoProperties(&lt;BR&gt;&amp;nbsp string clientWsdlVersion,
	 * &lt;BR&gt;&amp;nbsp string displayLocale)
	 * 
	 * @param getMWSInfoProperties
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoPropertiesResponse GetMWSInfoProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSInfoProperties getMWSInfoProperties);

	/**
	 * Auto generated method signature Retrieves a list of attributes which are
	 * child attributes of the specified attribute. This method is used as part
	 * of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetAttributeChildren(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @param getAttributeChildren
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildrenResponse GetAttributeChildren(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeChildren getAttributeChildren);

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * report with default settings.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * SimpleExecuteReport (&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sReportName,&lt;BR&gt;&amp;nbsp string
	 * sAnswerPrompt,&lt;BR&gt;&amp;nbsp string sStyle)
	 * 
	 * @param simpleExecuteReport
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReportResponse SimpleExecuteReport(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteReport simpleExecuteReport);

	/**
	 * Auto generated method signature Returns objects requested from an
	 * ExecuteIncrementalBrowse.&lt;BR&gt;&lt;BR&gt;MWSBrowseInfo
	 * GetIncrementalBrowseResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string sBrowseID, &lt;BR&gt;&amp;nbsp
	 * MWSSyncCommunicationSetting[] aSyncSettings, &lt;BR&gt;&amp;nbsp int
	 * iStartIndex, &lt;BR&gt;&amp;nbsp int iCount, &lt;BR&gt;&amp;nbsp
	 * MWSObjectInfoPropertySetSpec[] propSetSpecs)
	 * 
	 * @param getIncrementalBrowseResults
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResultsResponse GetIncrementalBrowseResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetIncrementalBrowseResults getIncrementalBrowseResults);

	/**
	 * Auto generated method signature Retrieves MicroStrategy user preferences
	 * for the supplied session. The user can specify which preferences are
	 * returned.&lt;BR&gt;&lt;BR&gt;MWSUserPreference[]
	 * GetUserPreferences(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp MWSUserPreference[] preferences)
	 * 
	 * @param getUserPreferences
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferencesResponse GetUserPreferences(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetUserPreferences getUserPreferences);

	/**
	 * Auto generated method signature Create an iServer
	 * session.&lt;BR&gt;&lt;BR&gt;string Connect (&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo)
	 * 
	 * @param connect
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectResponse Connect(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Connect connect);

	/**
	 * Auto generated method signature Retrieves annotations/notes associated
	 * with the specified report services document.&lt;BR&gt;&lt;BR&gt;string
	 * GetRSDocumentAnnotations (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string rsDocumentObjID)
	 * 
	 * @param getRSDocumentAnnotations
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotationsResponse GetRSDocumentAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentAnnotations getRSDocumentAnnotations);

	/**
	 * Auto generated method signature Performs a test Connect,
	 * GetProjectSources, GetProjects, and Disconnect based on passed in
	 * credentials.&lt;BR&gt;&lt;BR&gt;string TestService(&lt;BR&gt;&amp;nbsp
	 * string Server,&lt;BR&gt;&amp;nbsp string ProjectName,&lt;BR&gt;&amp;nbsp
	 * string Login,&lt;BR&gt;&amp;nbsp string Password)
	 * 
	 * @param testService
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestServiceResponse TestService(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.TestService testService);

	/**
	 * Auto generated method signature Retrieves the MicroStrategy Office
	 * install (available at the server) URL and version
	 * number.&lt;BR&gt;&lt;BR&gt;MWSOfficeInstallInfo GetMWSOfficeInstallInfo()
	 * 
	 * @param getMWSOfficeInstallInfo
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfoResponse GetMWSOfficeInstallInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSOfficeInstallInfo getMWSOfficeInstallInfo);

	/**
	 * Auto generated method signature Retrieves the web service's WSDL Version
	 * (major#.minor#).&lt;BR&gt;&lt;BR&gt;string GetMWSIdentity()
	 * 
	 * @param getMWSIdentity
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentityResponse GetMWSIdentity(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSIdentity getMWSIdentity);

	/**
	 * Auto generated method signature Retrieves annotations/notes associated
	 * with the specified report.&lt;BR&gt;&lt;BR&gt;string GetReportAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * reportObjID)
	 * 
	 * @param getReportAnnotations
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotationsResponse GetReportAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportAnnotations getReportAnnotations);

	/**
	 * Auto generated method signature Retrieves one or more resources through
	 * the web service.&lt;BR&gt;&lt;BR&gt;MWSResourceReturnInfo[]
	 * RetrieveResources(&lt;BR&gt;&amp;nbsp MWSResourceRequestInfo[]
	 * arrResources)
	 * 
	 * @param getResources
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResourcesResponse GetResources(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetResources getResources);

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
	 * @param getDocumentPromptElements
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElementsResponse GetDocumentPromptElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentPromptElements getDocumentPromptElements);

	/**
	 * Auto generated method signature Retrieves visualizations, defined in the
	 * visualizations.xml file, by view mode (eg. 50 = flash). A value of -1
	 * means get all lists.&lt;BR&gt;&lt;BR&gt;MWSVisualizationList[]
	 * GetVisualizationLists(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp int viewMode)
	 * 
	 * @param getVisualizationLists
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationListsResponse GetVisualizationLists(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetVisualizationLists getVisualizationLists);

	/**
	 * Auto generated method signature Retrieves a list of attributes associated
	 * with the specified hierarchy. This method is used as part of prompt
	 * hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetHierarchyAttributes(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sHierarchyID,&lt;BR&gt;&amp;nbsp
	 * EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @param getHierarchyAttributes
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributesResponse GetHierarchyAttributes(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetHierarchyAttributes getHierarchyAttributes);

	/**
	 * Auto generated method signature Returns document execution results based
	 * on prompt input and other flags after a SimpleExecuteRSDocument has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * SimpleGetRSDocumentResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp string
	 * sMsgID,&lt;BR&gt;&amp;nbsp EnumMWSRSSimpleResultFlag eFormat)
	 * 
	 * @param simpleGetRSDocumentResults
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResultsResponse SimpleGetRSDocumentResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetRSDocumentResults simpleGetRSDocumentResults);

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
	 * @param drillRSDocumentPromptElement
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElementResponse DrillRSDocumentPromptElement(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillRSDocumentPromptElement drillRSDocumentPromptElement);

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
	 * @param getReportResults
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResultsResponse GetReportResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults getReportResults);

	/**
	 * Auto generated method signature Retrieves functionality web service
	 * properties. Functionality properties define web service functionality
	 * that has been added since that last web service compatibility break (WSDL
	 * namespace change).&lt;BR&gt;&lt;BR&gt;MWSFunctionalityProperty[]
	 * GetMWSFunctionalityProperties(&lt;BR&gt;&amp;nbsp string
	 * clientWsdlVersion, &lt;BR&gt;&amp;nbsp string displayLocale)
	 * 
	 * @param getMWSFunctionalityProperties
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityPropertiesResponse GetMWSFunctionalityProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetMWSFunctionalityProperties getMWSFunctionalityProperties);

	/**
	 * Auto generated method signature Returns information related to the
	 * specified project folder. Provides easy access to project folders without
	 * having to specifically browse for them.&lt;BR&gt;&lt;BR&gt;MWSObjectInfo
	 * GetProjectFolder(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp EnumMWSProjectFolders eFolder)
	 * 
	 * @param getProjectFolder
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolderResponse GetProjectFolder(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectFolder getProjectFolder);

	/**
	 * Auto generated method signature This method loads, edits and saves user
	 * prompt answers. &lt;BR&gt;&lt;BR&gt;String
	 * ManipulateUserAnswer(&lt;BR&gt;&amp;nbsp MWSConnectInfo connectInfo,
	 * &lt;BR&gt;&amp;nbsp String commandXML)
	 * 
	 * @param manipulateUserAnswer
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswerResponse ManipulateUserAnswer(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ManipulateUserAnswer manipulateUserAnswer);

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
	 * @param getDocumentResults
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResultsResponse GetDocumentResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDocumentResults getDocumentResults);

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
	 * @param executeIncrementalBrowse
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowseResponse ExecuteIncrementalBrowse(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteIncrementalBrowse executeIncrementalBrowse);

	/**
	 * Auto generated method signature Retrieves a list of attributes which are
	 * parent attributes of the specified attribute. This method is used as part
	 * of prompt hierarchy element
	 * browsing.&lt;BR&gt;&lt;BR&gt;MWSHierarchyAttributeInfo[]
	 * GetAttributeParents(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp MWSHierarchyAttributeInfo
	 * attributeInfo,&lt;BR&gt;&amp;nbsp EnumMWSAttributeFormsSetting eForms)
	 * 
	 * @param getAttributeParents
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParentsResponse GetAttributeParents(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeParents getAttributeParents);

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
	 * @param getRSDocumentPromptElements
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElementsResponse GetRSDocumentPromptElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentPromptElements getRSDocumentPromptElements);

	/**
	 * Auto generated method signature Cancels an asynchronous report
	 * execution.&lt;BR&gt;&lt;BR&gt;void CancelReport(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @param cancelReport
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReportResponse CancelReport(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelReport cancelReport);

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
	 * @param getMWSProperties2
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2Response GetMWSProperties(
			com.autometrics.analytics.v9.j2ee.webservices.GetMWSProperties2 getMWSProperties2);

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * document.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * ExecuteRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sDocID,&lt;BR&gt;&amp;nbsp string sAnswerPrompt,&lt;BR&gt;&amp;nbsp
	 * EnumMWSRSExecutionFlags eFlags,&lt;BR&gt;&amp;nbsp EnumMWSRSResultFlags
	 * eFormat,&lt;BR&gt;&amp;nbsp MWSRSExecutionSettings eSettings)
	 * 
	 * @param executeRSDocument
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocumentResponse ExecuteRSDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteRSDocument executeRSDocument);

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
	 * @param drillReportPromptElement
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElementResponse DrillReportPromptElement(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillReportPromptElement drillReportPromptElement);

	/**
	 * Auto generated method signature Disconnect one or more iServer
	 * sessions.&lt;BR&gt;&lt;BR&gt;void Disconnect (&lt;BR&gt;&amp;nbsp
	 * string[] arrSessions)
	 * 
	 * @param disconnect
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DisconnectResponse Disconnect(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect disconnect);

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
	 * @param getAttributeElements
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElementsResponse GetAttributeElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetAttributeElements getAttributeElements);

	/**
	 * Auto generated method signature This method provides the ability to
	 * delete and change status of history list message(s).
	 * &lt;BR&gt;&lt;BR&gt;void ModifyHistoryListMessages(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo connectInfo, &lt;BR&gt;&amp;nbsp String[] arrMsgIDs,
	 * &lt;BR&gt;&amp;nbsp EnumMWSHistoryListAction eType)
	 * 
	 * @param modifyHistoryListMessages
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessagesResponse ModifyHistoryListMessages(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ModifyHistoryListMessages modifyHistoryListMessages);

	/**
	 * Auto generated method signature Sets the complete set of
	 * annotations/notes associated with the specified
	 * report.&lt;BR&gt;&lt;BR&gt;void SetReportAnnotations (&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string reportObjID,
	 * &lt;BR&gt;&amp;nbsp string annotations)
	 * 
	 * @param setReportAnnotations
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotationsResponse SetReportAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetReportAnnotations setReportAnnotations);

	/**
	 * Auto generated method signature Retrieves a list of projects for a
	 * selected project source.&lt;BR&gt;&lt;BR&gt;MWSProjectInfo[] GetProjects
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo)
	 * 
	 * @param getProjects
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectsResponse GetProjects(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjects getProjects);

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
	 * @param getReportPromptElements
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElementsResponse GetReportPromptElements(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportPromptElements getReportPromptElements);

	/**
	 * Auto generated method signature Returns report execution results based on
	 * prompt input after a SimpleExecuteReport has been
	 * initiated.&lt;BR&gt;&lt;BR&gt;MWSExecuteInfo
	 * SimpleGetReportResults(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sPrompt,&lt;BR&gt;&amp;nbsp string
	 * sMsgID,&lt;BR&gt;&amp;nbsp string sStyle)
	 * 
	 * @param simpleGetReportResults
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResultsResponse SimpleGetReportResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleGetReportResults simpleGetReportResults);

	/**
	 * Auto generated method signature Retrieves all properties (eg. PMML)
	 * associated with the DMX function that exists in a DMX Metric expression
	 * tree.&lt;BR&gt;&lt;BR&gt;MWSObjectInfoProperty[]
	 * GetDMXMetricFunctionProperties(&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp string dmxMetricObjID)
	 * 
	 * @param getDMXMetricFunctionProperties
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionPropertiesResponse GetDMXMetricFunctionProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetDMXMetricFunctionProperties getDMXMetricFunctionProperties);

	/**
	 * Auto generated method signature Cancels an asynchronous HTML document
	 * execution.&lt;BR&gt;&lt;BR&gt;void CancelDocument(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @param cancelDocument
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocumentResponse CancelDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelDocument cancelDocument);

	/**
	 * Auto generated method signature Cancels an asynchronous document
	 * execution.&lt;BR&gt;&lt;BR&gt;void CancelRSDocument(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sMsgID)
	 * 
	 * @param cancelRSDocument
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocumentResponse CancelRSDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelRSDocument cancelRSDocument);

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
	 * @param executeReport
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReportResponse ExecuteReport(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport executeReport);

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
	 * @param drillDocumentPromptElement
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElementResponse DrillDocumentPromptElement(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.DrillDocumentPromptElement drillDocumentPromptElement);

	/**
	 * Auto generated method signature Sets the complete set of
	 * annotations/notes associated with the specified report services
	 * document.&lt;BR&gt;&lt;BR&gt;void SetRSDocumentAnnotations
	 * (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string
	 * rsDocumentObjID, &lt;BR&gt;&amp;nbsp string annotations)
	 * 
	 * @param setRSDocumentAnnotations
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotationsResponse SetRSDocumentAnnotations(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SetRSDocumentAnnotations setRSDocumentAnnotations);

	/**
	 * Auto generated method signature Cancels an asynchronous
	 * browse.&lt;BR&gt;&lt;BR&gt;void CancelBrowse(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo,&lt;BR&gt;&amp;nbsp string sBrowseID)
	 * 
	 * @param cancelBrowse
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowseResponse CancelBrowse(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.CancelBrowse cancelBrowse);

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
	 * @param executeDocument
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocumentResponse ExecuteDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteDocument executeDocument);

	/**
	 * Auto generated method signature Initiates the execution of a specified
	 * document using defaults.&lt;BR&gt;&lt;BR&gt;MWSObjectExecuteInfo
	 * SimpleExecuteRSDocument(&lt;BR&gt;&amp;nbsp MWSConnectInfo
	 * cInfo,&lt;BR&gt;&amp;nbsp string sDocName,&lt;BR&gt;&amp;nbsp string
	 * sAnswerPrompt,&lt;BR&gt;&amp;nbsp EnumMWSRSSimpleResultFlag eFormat)
	 * 
	 * @param simpleExecuteRSDocument
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocumentResponse SimpleExecuteRSDocument(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.SimpleExecuteRSDocument simpleExecuteRSDocument);

	/**
	 * Auto generated method signature Retrieves a list of configured
	 * (projectsources.xml) project
	 * sources.&lt;BR&gt;&lt;BR&gt;MWSProjectSourceInfo[] GetProjectSources ()
	 * 
	 * @param getProjectSources
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSourcesResponse GetProjectSources(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetProjectSources getProjectSources);

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
	 * @param getRSDocumentResults
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResultsResponse GetRSDocumentResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetRSDocumentResults getRSDocumentResults);

	/**
	 * Auto generated method signature Changes the users
	 * password.&lt;BR&gt;&lt;BR&gt;void ChangeUserPassword(&lt;BR&gt;&amp;nbsp
	 * MWSConnectInfo cInfo, &lt;BR&gt;&amp;nbsp string newPassword)
	 * 
	 * @param changeUserPassword
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPasswordResponse ChangeUserPassword(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ChangeUserPassword changeUserPassword);

	/**
	 * Auto generated method signature Retrieve the specifed set of property
	 * sets and properties for each specified object in the propertyGrps
	 * arrays.&lt;BR&gt;&lt;BR&gt;MWSObjectInfoPropertySetGroup[]
	 * GetObjectProperties (&lt;BR&gt;&amp;nbsp MWSConnectInfo cInfo,
	 * &lt;BR&gt;&amp;nbsp MWSObjectInfoPropertySetGroup[] propertyGrps)
	 * 
	 * @param getObjectProperties
	 */

	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectPropertiesResponse GetObjectProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetObjectProperties getObjectProperties);

}
