/**
 * EnumMWSObjSubType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * EnumMWSObjSubType bean class
 */

public class EnumMWSObjSubType implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0", "EnumMWSObjSubType",
			"ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSObjSubType
	 */

	protected java.lang.String localEnumMWSObjSubType;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSObjSubType(java.lang.String value, boolean isRegisterValue) {
		localEnumMWSObjSubType = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSObjSubType, this);

		}

	}

	public static final java.lang.String _MWSSubTypeUnknown = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeUnknown");

	public static final java.lang.String _MWSSubTypeReserved = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReserved");

	public static final java.lang.String _MWSSubTypeFilter = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFilter");

	public static final java.lang.String _MWSSubTypeCustomGroup = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeCustomGroup");

	public static final java.lang.String _MWSSubTypeTemplate = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeTemplate");

	public static final java.lang.String _MWSSubTypeReportGrid = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportGrid");

	public static final java.lang.String _MWSSubTypeReportGraph = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportGraph");

	public static final java.lang.String _MWSSubTypeReportEngine = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportEngine");

	public static final java.lang.String _MWSSubTypeReportText = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportText");

	public static final java.lang.String _MWSSubTypeReportDatamart = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportDatamart");

	public static final java.lang.String _MWSSubTypeReportBase = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportBase");

	public static final java.lang.String _MWSSubTypeMetric = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMetric");

	public static final java.lang.String _MWSSubTypeSubtotalDefinition = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeSubtotalDefinition");

	public static final java.lang.String _MWSSubTypeSystemSubtotal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeSystemSubtotal");

	public static final java.lang.String _MWSSubTypeStyle = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeStyle");

	public static final java.lang.String _MWSSubTypeAggMetric = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeAggMetric");

	public static final java.lang.String _MWSSubTypeFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFolder");

	public static final java.lang.String _MWSSubTypePrompt = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePrompt");

	public static final java.lang.String _MWSSubTypePromptBoolean = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptBoolean");

	public static final java.lang.String _MWSSubTypePromptLong = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptLong");

	public static final java.lang.String _MWSSubTypePromptString = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptString");

	public static final java.lang.String _MWSSubTypePromptDouble = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptDouble");

	public static final java.lang.String _MWSSubTypePromptDate = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptDate");

	public static final java.lang.String _MWSSubTypePromptObjects = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptObjects");

	public static final java.lang.String _MWSSubTypePromptElements = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptElements");

	public static final java.lang.String _MWSSubTypePromptExpression = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptExpression");

	public static final java.lang.String _MWSSubTypePromptExpressionDraft = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptExpressionDraft");

	public static final java.lang.String _MWSSubTypePromptDimty = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptDimty");

	public static final java.lang.String _MWSSubTypeFunction = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFunction");

	public static final java.lang.String _MWSSubTypeAttribute = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeAttribute");

	public static final java.lang.String _MWSSubTypeAttributeRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeAttributeRole");

	public static final java.lang.String _MWSSubTypeAttributeTransformation = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeAttributeTransformation");

	public static final java.lang.String _MWSSubTypeAttributeAbstract = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeAttributeAbstract");

	public static final java.lang.String _MWSSubTypeFact = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFact");

	public static final java.lang.String _MWSSubTypeDimensionSystem = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDimensionSystem");

	public static final java.lang.String _MWSSubTypeDimensionUser = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDimensionUser");

	public static final java.lang.String _MWSSubTypeDimensionOrdered = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDimensionOrdered");

	public static final java.lang.String _MWSSubTypeDimensionUserHierarchy = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDimensionUserHierarchy");

	public static final java.lang.String _MWSSubTypeTable = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeTable");

	public static final java.lang.String _MWSSubTypeTablePartitionMD = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeTablePartitionMD");

	public static final java.lang.String _MWSSubTypeTablePartitionWH = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeTablePartitionWH");

	public static final java.lang.String _MWSSubTypeDatamartReport = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDatamartReport");

	public static final java.lang.String _MWSSubTypeFactGroup = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFactGroup");

	public static final java.lang.String _MWSSubTypeResolution = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeResolution");

	public static final java.lang.String _MWSSubTypeAttributeForm = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeAttributeForm");

	public static final java.lang.String _MWSSubTypeFormSystem = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFormSystem");

	public static final java.lang.String _MWSSubTypeFormNormal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFormNormal");

	public static final java.lang.String _MWSSubTypeSchema = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeSchema");

	public static final java.lang.String _MWSSubTypeFormat = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFormat");

	public static final java.lang.String _MWSSubTypeCatalog = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeCatalog");

	public static final java.lang.String _MWSSubTypeCatalogDefn = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeCatalogDefn");

	public static final java.lang.String _MWSSubTypeColumn = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeColumn");

	public static final java.lang.String _MWSSubTypePropertyGroup = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePropertyGroup");

	public static final java.lang.String _MWSSubTypePropertySet = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePropertySet");

	public static final java.lang.String _MWSSubTypeDBRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDBRole");

	public static final java.lang.String _MWSSubTypeDBLogin = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDBLogin");

	public static final java.lang.String _MWSSubTypeDBConnection = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDBConnection");

	public static final java.lang.String _MWSSubTypeProject = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeProject");

	public static final java.lang.String _MWSSubTypeServerDef = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeServerDef");

	public static final java.lang.String _MWSSubTypeUser = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeUser");

	public static final java.lang.String _MWSSubTypeUserGroup = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeUserGroup");

	public static final java.lang.String _MWSSubTypeConfiguration = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeConfiguration");

	public static final java.lang.String _MWSSubTypeRequest = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeRequest");

	public static final java.lang.String _MWSSubTypeSearch = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeSearch");

	public static final java.lang.String _MWSSubTypeSearchFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeSearchFolder");

	public static final java.lang.String _MWSSubTypeDatamart = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDatamart");

	public static final java.lang.String _MWSSubTypeFunctionPackageDefinition = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeFunctionPackageDefinition");

	public static final java.lang.String _MWSSubTypeRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeRole");

	public static final java.lang.String _MWSSubTypeRoleTransformation = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeRoleTransformation");

	public static final java.lang.String _MWSSubTypeSecurityRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeSecurityRole");

	public static final java.lang.String _MWSSubTypeInBox = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeInBox");

	public static final java.lang.String _MWSSubTypeInBoxMsg = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeInBoxMsg");

	public static final java.lang.String _MWSSubTypeConsolidation = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeConsolidation");

	public static final java.lang.String _MWSSubTypeConsolidationElement = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeConsolidationElement");

	public static final java.lang.String _MWSSubTypeScheduleEvent = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeScheduleEvent");

	public static final java.lang.String _MWSSubTypeScheduleObject = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeScheduleObject");

	public static final java.lang.String _MWSSubTypeScheduleTrigger = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeScheduleTrigger");

	public static final java.lang.String _MWSSubTypeLink = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeLink");

	public static final java.lang.String _MWSSubTypeDBTable = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDBTable");

	public static final java.lang.String _MWSSubTypeDBTablePMT = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDBTablePMT");

	public static final java.lang.String _MWSSubTypeTableSource = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeTableSource");

	public static final java.lang.String _MWSSubTypeDocumentDefinition = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDocumentDefinition");

	public static final java.lang.String _MWSSubTypeDrillMap = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDrillMap");

	public static final java.lang.String _MWSSubTypeDBMS = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeDBMS");

	public static final java.lang.String _MWSSubTypeMDSecurityFilter = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMDSecurityFilter");

	public static final java.lang.String _MWSSubTypeReportWritingDocument = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportWritingDocument");

	public static final java.lang.String _MWSSubTypeReportGridAndGraph = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportGridAndGraph");

	public static final java.lang.String _MWSSubTypeReportNonInteractive = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportNonInteractive");

	public static final java.lang.String _MWSSubTypeMetricDMX = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMetricDMX");

	public static final java.lang.String _MWSSubTypePromptBigDecimal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptBigDecimal");

	public static final java.lang.String _MWSSubTypeMonitorPerformance = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMonitorPerformance");

	public static final java.lang.String _MWSSubTypeMonitorJobs = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMonitorJobs");

	public static final java.lang.String _MWSSubTypeMonitorUserConnections = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMonitorUserConnections");

	public static final java.lang.String _MWSSubTypeMonitorDBConnections = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeMonitorDBConnections");

	public static final java.lang.String _MWSSubTypeReportCube = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypeReportCube");

	public static final java.lang.String _MWSSubTypePromptAnswer = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswer");

	public static final java.lang.String _MWSSubTypePromptAnswers = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswers");

	public static final java.lang.String _MWSSubTypePromptAnswerBoolean = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerBoolean");

	public static final java.lang.String _MWSSubTypePromptAnswerLong = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerLong");

	public static final java.lang.String _MWSSubTypePromptAnswerString = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerString");

	public static final java.lang.String _MWSSubTypePromptAnswerDouble = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerDouble");

	public static final java.lang.String _MWSSubTypePromptAnswerDate = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerDate");

	public static final java.lang.String _MWSSubTypePromptAnswerObjects = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerObjects");

	public static final java.lang.String _MWSSubTypePromptAnswerElements = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerElements");

	public static final java.lang.String _MWSSubTypePromptAnswerExpression = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerExpression");

	public static final java.lang.String _MWSSubTypePromptAnswerExpressionDraft = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerExpressionDraft");

	public static final java.lang.String _MWSSubTypePromptAnswerDimty = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerDimty");

	public static final java.lang.String _MWSSubTypePromptAnswerBigDecimal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubTypePromptAnswerBigDecimal");

	public static final EnumMWSObjSubType MWSSubTypeUnknown = new EnumMWSObjSubType(
			_MWSSubTypeUnknown, true);

	public static final EnumMWSObjSubType MWSSubTypeReserved = new EnumMWSObjSubType(
			_MWSSubTypeReserved, true);

	public static final EnumMWSObjSubType MWSSubTypeFilter = new EnumMWSObjSubType(
			_MWSSubTypeFilter, true);

	public static final EnumMWSObjSubType MWSSubTypeCustomGroup = new EnumMWSObjSubType(
			_MWSSubTypeCustomGroup, true);

	public static final EnumMWSObjSubType MWSSubTypeTemplate = new EnumMWSObjSubType(
			_MWSSubTypeTemplate, true);

	public static final EnumMWSObjSubType MWSSubTypeReportGrid = new EnumMWSObjSubType(
			_MWSSubTypeReportGrid, true);

	public static final EnumMWSObjSubType MWSSubTypeReportGraph = new EnumMWSObjSubType(
			_MWSSubTypeReportGraph, true);

	public static final EnumMWSObjSubType MWSSubTypeReportEngine = new EnumMWSObjSubType(
			_MWSSubTypeReportEngine, true);

	public static final EnumMWSObjSubType MWSSubTypeReportText = new EnumMWSObjSubType(
			_MWSSubTypeReportText, true);

	public static final EnumMWSObjSubType MWSSubTypeReportDatamart = new EnumMWSObjSubType(
			_MWSSubTypeReportDatamart, true);

	public static final EnumMWSObjSubType MWSSubTypeReportBase = new EnumMWSObjSubType(
			_MWSSubTypeReportBase, true);

	public static final EnumMWSObjSubType MWSSubTypeMetric = new EnumMWSObjSubType(
			_MWSSubTypeMetric, true);

	public static final EnumMWSObjSubType MWSSubTypeSubtotalDefinition = new EnumMWSObjSubType(
			_MWSSubTypeSubtotalDefinition, true);

	public static final EnumMWSObjSubType MWSSubTypeSystemSubtotal = new EnumMWSObjSubType(
			_MWSSubTypeSystemSubtotal, true);

	public static final EnumMWSObjSubType MWSSubTypeStyle = new EnumMWSObjSubType(
			_MWSSubTypeStyle, true);

	public static final EnumMWSObjSubType MWSSubTypeAggMetric = new EnumMWSObjSubType(
			_MWSSubTypeAggMetric, true);

	public static final EnumMWSObjSubType MWSSubTypeFolder = new EnumMWSObjSubType(
			_MWSSubTypeFolder, true);

	public static final EnumMWSObjSubType MWSSubTypePrompt = new EnumMWSObjSubType(
			_MWSSubTypePrompt, true);

	public static final EnumMWSObjSubType MWSSubTypePromptBoolean = new EnumMWSObjSubType(
			_MWSSubTypePromptBoolean, true);

	public static final EnumMWSObjSubType MWSSubTypePromptLong = new EnumMWSObjSubType(
			_MWSSubTypePromptLong, true);

	public static final EnumMWSObjSubType MWSSubTypePromptString = new EnumMWSObjSubType(
			_MWSSubTypePromptString, true);

	public static final EnumMWSObjSubType MWSSubTypePromptDouble = new EnumMWSObjSubType(
			_MWSSubTypePromptDouble, true);

	public static final EnumMWSObjSubType MWSSubTypePromptDate = new EnumMWSObjSubType(
			_MWSSubTypePromptDate, true);

	public static final EnumMWSObjSubType MWSSubTypePromptObjects = new EnumMWSObjSubType(
			_MWSSubTypePromptObjects, true);

	public static final EnumMWSObjSubType MWSSubTypePromptElements = new EnumMWSObjSubType(
			_MWSSubTypePromptElements, true);

	public static final EnumMWSObjSubType MWSSubTypePromptExpression = new EnumMWSObjSubType(
			_MWSSubTypePromptExpression, true);

	public static final EnumMWSObjSubType MWSSubTypePromptExpressionDraft = new EnumMWSObjSubType(
			_MWSSubTypePromptExpressionDraft, true);

	public static final EnumMWSObjSubType MWSSubTypePromptDimty = new EnumMWSObjSubType(
			_MWSSubTypePromptDimty, true);

	public static final EnumMWSObjSubType MWSSubTypeFunction = new EnumMWSObjSubType(
			_MWSSubTypeFunction, true);

	public static final EnumMWSObjSubType MWSSubTypeAttribute = new EnumMWSObjSubType(
			_MWSSubTypeAttribute, true);

	public static final EnumMWSObjSubType MWSSubTypeAttributeRole = new EnumMWSObjSubType(
			_MWSSubTypeAttributeRole, true);

	public static final EnumMWSObjSubType MWSSubTypeAttributeTransformation = new EnumMWSObjSubType(
			_MWSSubTypeAttributeTransformation, true);

	public static final EnumMWSObjSubType MWSSubTypeAttributeAbstract = new EnumMWSObjSubType(
			_MWSSubTypeAttributeAbstract, true);

	public static final EnumMWSObjSubType MWSSubTypeFact = new EnumMWSObjSubType(
			_MWSSubTypeFact, true);

	public static final EnumMWSObjSubType MWSSubTypeDimensionSystem = new EnumMWSObjSubType(
			_MWSSubTypeDimensionSystem, true);

	public static final EnumMWSObjSubType MWSSubTypeDimensionUser = new EnumMWSObjSubType(
			_MWSSubTypeDimensionUser, true);

	public static final EnumMWSObjSubType MWSSubTypeDimensionOrdered = new EnumMWSObjSubType(
			_MWSSubTypeDimensionOrdered, true);

	public static final EnumMWSObjSubType MWSSubTypeDimensionUserHierarchy = new EnumMWSObjSubType(
			_MWSSubTypeDimensionUserHierarchy, true);

	public static final EnumMWSObjSubType MWSSubTypeTable = new EnumMWSObjSubType(
			_MWSSubTypeTable, true);

	public static final EnumMWSObjSubType MWSSubTypeTablePartitionMD = new EnumMWSObjSubType(
			_MWSSubTypeTablePartitionMD, true);

	public static final EnumMWSObjSubType MWSSubTypeTablePartitionWH = new EnumMWSObjSubType(
			_MWSSubTypeTablePartitionWH, true);

	public static final EnumMWSObjSubType MWSSubTypeDatamartReport = new EnumMWSObjSubType(
			_MWSSubTypeDatamartReport, true);

	public static final EnumMWSObjSubType MWSSubTypeFactGroup = new EnumMWSObjSubType(
			_MWSSubTypeFactGroup, true);

	public static final EnumMWSObjSubType MWSSubTypeResolution = new EnumMWSObjSubType(
			_MWSSubTypeResolution, true);

	public static final EnumMWSObjSubType MWSSubTypeAttributeForm = new EnumMWSObjSubType(
			_MWSSubTypeAttributeForm, true);

	public static final EnumMWSObjSubType MWSSubTypeFormSystem = new EnumMWSObjSubType(
			_MWSSubTypeFormSystem, true);

	public static final EnumMWSObjSubType MWSSubTypeFormNormal = new EnumMWSObjSubType(
			_MWSSubTypeFormNormal, true);

	public static final EnumMWSObjSubType MWSSubTypeSchema = new EnumMWSObjSubType(
			_MWSSubTypeSchema, true);

	public static final EnumMWSObjSubType MWSSubTypeFormat = new EnumMWSObjSubType(
			_MWSSubTypeFormat, true);

	public static final EnumMWSObjSubType MWSSubTypeCatalog = new EnumMWSObjSubType(
			_MWSSubTypeCatalog, true);

	public static final EnumMWSObjSubType MWSSubTypeCatalogDefn = new EnumMWSObjSubType(
			_MWSSubTypeCatalogDefn, true);

	public static final EnumMWSObjSubType MWSSubTypeColumn = new EnumMWSObjSubType(
			_MWSSubTypeColumn, true);

	public static final EnumMWSObjSubType MWSSubTypePropertyGroup = new EnumMWSObjSubType(
			_MWSSubTypePropertyGroup, true);

	public static final EnumMWSObjSubType MWSSubTypePropertySet = new EnumMWSObjSubType(
			_MWSSubTypePropertySet, true);

	public static final EnumMWSObjSubType MWSSubTypeDBRole = new EnumMWSObjSubType(
			_MWSSubTypeDBRole, true);

	public static final EnumMWSObjSubType MWSSubTypeDBLogin = new EnumMWSObjSubType(
			_MWSSubTypeDBLogin, true);

	public static final EnumMWSObjSubType MWSSubTypeDBConnection = new EnumMWSObjSubType(
			_MWSSubTypeDBConnection, true);

	public static final EnumMWSObjSubType MWSSubTypeProject = new EnumMWSObjSubType(
			_MWSSubTypeProject, true);

	public static final EnumMWSObjSubType MWSSubTypeServerDef = new EnumMWSObjSubType(
			_MWSSubTypeServerDef, true);

	public static final EnumMWSObjSubType MWSSubTypeUser = new EnumMWSObjSubType(
			_MWSSubTypeUser, true);

	public static final EnumMWSObjSubType MWSSubTypeUserGroup = new EnumMWSObjSubType(
			_MWSSubTypeUserGroup, true);

	public static final EnumMWSObjSubType MWSSubTypeConfiguration = new EnumMWSObjSubType(
			_MWSSubTypeConfiguration, true);

	public static final EnumMWSObjSubType MWSSubTypeRequest = new EnumMWSObjSubType(
			_MWSSubTypeRequest, true);

	public static final EnumMWSObjSubType MWSSubTypeSearch = new EnumMWSObjSubType(
			_MWSSubTypeSearch, true);

	public static final EnumMWSObjSubType MWSSubTypeSearchFolder = new EnumMWSObjSubType(
			_MWSSubTypeSearchFolder, true);

	public static final EnumMWSObjSubType MWSSubTypeDatamart = new EnumMWSObjSubType(
			_MWSSubTypeDatamart, true);

	public static final EnumMWSObjSubType MWSSubTypeFunctionPackageDefinition = new EnumMWSObjSubType(
			_MWSSubTypeFunctionPackageDefinition, true);

	public static final EnumMWSObjSubType MWSSubTypeRole = new EnumMWSObjSubType(
			_MWSSubTypeRole, true);

	public static final EnumMWSObjSubType MWSSubTypeRoleTransformation = new EnumMWSObjSubType(
			_MWSSubTypeRoleTransformation, true);

	public static final EnumMWSObjSubType MWSSubTypeSecurityRole = new EnumMWSObjSubType(
			_MWSSubTypeSecurityRole, true);

	public static final EnumMWSObjSubType MWSSubTypeInBox = new EnumMWSObjSubType(
			_MWSSubTypeInBox, true);

	public static final EnumMWSObjSubType MWSSubTypeInBoxMsg = new EnumMWSObjSubType(
			_MWSSubTypeInBoxMsg, true);

	public static final EnumMWSObjSubType MWSSubTypeConsolidation = new EnumMWSObjSubType(
			_MWSSubTypeConsolidation, true);

	public static final EnumMWSObjSubType MWSSubTypeConsolidationElement = new EnumMWSObjSubType(
			_MWSSubTypeConsolidationElement, true);

	public static final EnumMWSObjSubType MWSSubTypeScheduleEvent = new EnumMWSObjSubType(
			_MWSSubTypeScheduleEvent, true);

	public static final EnumMWSObjSubType MWSSubTypeScheduleObject = new EnumMWSObjSubType(
			_MWSSubTypeScheduleObject, true);

	public static final EnumMWSObjSubType MWSSubTypeScheduleTrigger = new EnumMWSObjSubType(
			_MWSSubTypeScheduleTrigger, true);

	public static final EnumMWSObjSubType MWSSubTypeLink = new EnumMWSObjSubType(
			_MWSSubTypeLink, true);

	public static final EnumMWSObjSubType MWSSubTypeDBTable = new EnumMWSObjSubType(
			_MWSSubTypeDBTable, true);

	public static final EnumMWSObjSubType MWSSubTypeDBTablePMT = new EnumMWSObjSubType(
			_MWSSubTypeDBTablePMT, true);

	public static final EnumMWSObjSubType MWSSubTypeTableSource = new EnumMWSObjSubType(
			_MWSSubTypeTableSource, true);

	public static final EnumMWSObjSubType MWSSubTypeDocumentDefinition = new EnumMWSObjSubType(
			_MWSSubTypeDocumentDefinition, true);

	public static final EnumMWSObjSubType MWSSubTypeDrillMap = new EnumMWSObjSubType(
			_MWSSubTypeDrillMap, true);

	public static final EnumMWSObjSubType MWSSubTypeDBMS = new EnumMWSObjSubType(
			_MWSSubTypeDBMS, true);

	public static final EnumMWSObjSubType MWSSubTypeMDSecurityFilter = new EnumMWSObjSubType(
			_MWSSubTypeMDSecurityFilter, true);

	public static final EnumMWSObjSubType MWSSubTypeReportWritingDocument = new EnumMWSObjSubType(
			_MWSSubTypeReportWritingDocument, true);

	public static final EnumMWSObjSubType MWSSubTypeReportGridAndGraph = new EnumMWSObjSubType(
			_MWSSubTypeReportGridAndGraph, true);

	public static final EnumMWSObjSubType MWSSubTypeReportNonInteractive = new EnumMWSObjSubType(
			_MWSSubTypeReportNonInteractive, true);

	public static final EnumMWSObjSubType MWSSubTypeMetricDMX = new EnumMWSObjSubType(
			_MWSSubTypeMetricDMX, true);

	public static final EnumMWSObjSubType MWSSubTypePromptBigDecimal = new EnumMWSObjSubType(
			_MWSSubTypePromptBigDecimal, true);

	public static final EnumMWSObjSubType MWSSubTypeMonitorPerformance = new EnumMWSObjSubType(
			_MWSSubTypeMonitorPerformance, true);

	public static final EnumMWSObjSubType MWSSubTypeMonitorJobs = new EnumMWSObjSubType(
			_MWSSubTypeMonitorJobs, true);

	public static final EnumMWSObjSubType MWSSubTypeMonitorUserConnections = new EnumMWSObjSubType(
			_MWSSubTypeMonitorUserConnections, true);

	public static final EnumMWSObjSubType MWSSubTypeMonitorDBConnections = new EnumMWSObjSubType(
			_MWSSubTypeMonitorDBConnections, true);

	public static final EnumMWSObjSubType MWSSubTypeReportCube = new EnumMWSObjSubType(
			_MWSSubTypeReportCube, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswer = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswer, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswers = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswers, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerBoolean = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerBoolean, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerLong = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerLong, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerString = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerString, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerDouble = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerDouble, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerDate = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerDate, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerObjects = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerObjects, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerElements = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerElements, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerExpression = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerExpression, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerExpressionDraft = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerExpressionDraft, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerDimty = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerDimty, true);

	public static final EnumMWSObjSubType MWSSubTypePromptAnswerBigDecimal = new EnumMWSObjSubType(
			_MWSSubTypePromptAnswerBigDecimal, true);

	public java.lang.String getValue() {
		return localEnumMWSObjSubType;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSObjSubType.toString();

	}

	/**
	 * isReaderMTOMAware
	 * 
	 * @return true if the reader supports MTOM
	 */
	public static boolean isReaderMTOMAware(
			javax.xml.stream.XMLStreamReader reader) {
		boolean isReaderMTOMAware = false;

		try {
			isReaderMTOMAware = java.lang.Boolean.TRUE
					.equals(reader
							.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
		} catch (java.lang.IllegalArgumentException e) {
			isReaderMTOMAware = false;
		}
		return isReaderMTOMAware;
	}

	/**
	 * 
	 * @param parentQName
	 * @param factory
	 * @return org.apache.axiom.om.OMElement
	 */
	public org.apache.axiom.om.OMElement getOMElement(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory)
			throws org.apache.axis2.databinding.ADBException {

		org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(
				this, MY_QNAME) {

			public void serialize(
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException {
				EnumMWSObjSubType.this.serialize(MY_QNAME, factory, xmlWriter);
			}
		};
		return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(MY_QNAME,
				factory, dataSource);

	}

	public void serialize(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {
		serialize(parentQName, factory, xmlWriter, false);
	}

	public void serialize(
			final javax.xml.namespace.QName parentQName,
			final org.apache.axiom.om.OMFactory factory,
			org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
			boolean serializeType) throws javax.xml.stream.XMLStreamException,
			org.apache.axis2.databinding.ADBException {

		// We can safely assume an element has only one type associated with it

		java.lang.String namespace = parentQName.getNamespaceURI();
		java.lang.String localName = parentQName.getLocalPart();

		if (!namespace.equals("")) {
			java.lang.String prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, localName, namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, localName);
			}

		} else {
			xmlWriter.writeStartElement(localName);
		}

		// add the type details if this is used in a simple type
		if (serializeType) {
			java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://microstrategy.com/webservices/v1_0");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":EnumMWSObjSubType", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSObjSubType", xmlWriter);
			}
		}

		if (localEnumMWSObjSubType == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSObjSubType);

		}

		xmlWriter.writeEndElement();

	}

	/**
	 * Util method to write an attribute with the ns prefix
	 */
	private void writeAttribute(java.lang.String prefix,
			java.lang.String namespace, java.lang.String attName,
			java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (xmlWriter.getPrefix(namespace) == null) {
			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);

		}

		xmlWriter.writeAttribute(namespace, attName, attValue);

	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeAttribute(java.lang.String namespace,
			java.lang.String attName, java.lang.String attValue,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attValue);
		}
	}

	/**
	 * Util method to write an attribute without the ns prefix
	 */
	private void writeQNameAttribute(java.lang.String namespace,
			java.lang.String attName, javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		java.lang.String attributeNamespace = qname.getNamespaceURI();
		java.lang.String attributePrefix = xmlWriter
				.getPrefix(attributeNamespace);
		if (attributePrefix == null) {
			attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
		}
		java.lang.String attributeValue;
		if (attributePrefix.trim().length() > 0) {
			attributeValue = attributePrefix + ":" + qname.getLocalPart();
		} else {
			attributeValue = qname.getLocalPart();
		}

		if (namespace.equals("")) {
			xmlWriter.writeAttribute(attName, attributeValue);
		} else {
			registerPrefix(xmlWriter, namespace);
			xmlWriter.writeAttribute(namespace, attName, attributeValue);
		}
	}

	/**
	 * method to handle Qnames
	 */

	private void writeQName(javax.xml.namespace.QName qname,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String namespaceURI = qname.getNamespaceURI();
		if (namespaceURI != null) {
			java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
			if (prefix == null) {
				prefix = generatePrefix(namespaceURI);
				xmlWriter.writeNamespace(prefix, namespaceURI);
				xmlWriter.setPrefix(prefix, namespaceURI);
			}

			if (prefix.trim().length() > 0) {
				xmlWriter.writeCharacters(prefix
						+ ":"
						+ org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			} else {
				// i.e this is the default namespace
				xmlWriter
						.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(qname));
			}

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(qname));
		}
	}

	private void writeQNames(javax.xml.namespace.QName[] qnames,
			javax.xml.stream.XMLStreamWriter xmlWriter)
			throws javax.xml.stream.XMLStreamException {

		if (qnames != null) {
			// we have to store this data until last moment since it is not
			// possible to write any
			// namespace data after writing the charactor data
			java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
			java.lang.String namespaceURI = null;
			java.lang.String prefix = null;

			for (int i = 0; i < qnames.length; i++) {
				if (i > 0) {
					stringToWrite.append(" ");
				}
				namespaceURI = qnames[i].getNamespaceURI();
				if (namespaceURI != null) {
					prefix = xmlWriter.getPrefix(namespaceURI);
					if ((prefix == null) || (prefix.length() == 0)) {
						prefix = generatePrefix(namespaceURI);
						xmlWriter.writeNamespace(prefix, namespaceURI);
						xmlWriter.setPrefix(prefix, namespaceURI);
					}

					if (prefix.trim().length() > 0) {
						stringToWrite
								.append(prefix)
								.append(":")
								.append(
										org.apache.axis2.databinding.utils.ConverterUtil
												.convertToString(qnames[i]));
					} else {
						stringToWrite
								.append(org.apache.axis2.databinding.utils.ConverterUtil
										.convertToString(qnames[i]));
					}
				} else {
					stringToWrite
							.append(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(qnames[i]));
				}
			}
			xmlWriter.writeCharacters(stringToWrite.toString());
		}

	}

	/**
	 * Register a namespace prefix
	 */
	private java.lang.String registerPrefix(
			javax.xml.stream.XMLStreamWriter xmlWriter,
			java.lang.String namespace)
			throws javax.xml.stream.XMLStreamException {
		java.lang.String prefix = xmlWriter.getPrefix(namespace);

		if (prefix == null) {
			prefix = generatePrefix(namespace);

			while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
				prefix = org.apache.axis2.databinding.utils.BeanUtil
						.getUniquePrefix();
			}

			xmlWriter.writeNamespace(prefix, namespace);
			xmlWriter.setPrefix(prefix, namespace);
		}

		return prefix;
	}

	/**
	 * databinding method to get an XML representation of this object
	 * 
	 */
	public javax.xml.stream.XMLStreamReader getPullParser(
			javax.xml.namespace.QName qName)
			throws org.apache.axis2.databinding.ADBException {

		// We can safely assume an element has only one type associated with it
		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
				MY_QNAME,
				new java.lang.Object[] {
						org.apache.axis2.databinding.utils.reader.ADBXMLStreamReader.ELEMENT_TEXT,
						org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localEnumMWSObjSubType) },
				null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSObjSubType fromValue(java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSObjSubType enumeration = (EnumMWSObjSubType)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSObjSubType fromString(java.lang.String value,
				java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSObjSubType fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSObjSubType.Factory.fromString(content,
						namespaceUri);
			} else {
				return EnumMWSObjSubType.Factory.fromString(content, "");
			}
		}

		/**
		 * static method to create the object Precondition: If this object is an
		 * element, the current or next start element starts this object and any
		 * intervening reader events are ignorable If this object is not an
		 * element, it is a complex type and the reader is at the event just
		 * after the outer start element Postcondition: If this object is an
		 * element, the reader is positioned at its end element If this object
		 * is a complex type, the reader is positioned at the end element of its
		 * outer element
		 */
		public static EnumMWSObjSubType parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSObjSubType object = null;
			// initialize a hash map to keep values
			java.util.Map attributeMap = new java.util.HashMap();
			java.util.List extraAttributeList = new java.util.ArrayList();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				while (!reader.isEndElement()) {
					if (reader.isStartElement() || reader.hasText()) {

						java.lang.String content = reader.getElementText();

						if (content.indexOf(":") > 0) {
							// this seems to be a Qname so find the namespace
							// and send
							prefix = content.substring(0, content.indexOf(":"));
							namespaceuri = reader.getNamespaceURI(prefix);
							object = EnumMWSObjSubType.Factory.fromString(
									content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSObjSubType.Factory.fromString(
									content, "");
						}

					} else {
						reader.next();
					}
				} // end of while loop

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
