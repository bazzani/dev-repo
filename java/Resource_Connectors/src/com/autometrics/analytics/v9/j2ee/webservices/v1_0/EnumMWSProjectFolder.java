/**
 * EnumMWSProjectFolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * EnumMWSProjectFolder bean class
 */

public class EnumMWSProjectFolder implements
		org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0",
			"EnumMWSProjectFolder", "ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSProjectFolder
	 */

	protected java.lang.String localEnumMWSProjectFolder;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSProjectFolder(java.lang.String value,
			boolean isRegisterValue) {
		localEnumMWSProjectFolder = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSProjectFolder, this);

		}

	}

	public static final java.lang.String _MWSPublicObjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicObjectsFolder");

	public static final java.lang.String _MWSPublicConsolidationsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicConsolidationsFolder");

	public static final java.lang.String _MWSPublicCustomGroupsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicCustomGroupsFolder");

	public static final java.lang.String _MWSPublicFiltersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicFiltersFolder");

	public static final java.lang.String _MWSPublicMetricsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicMetricsFolder");

	public static final java.lang.String _MWSPublicPromptsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicPromptsFolder");

	public static final java.lang.String _MWSPublicReportsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicReportsFolder");

	public static final java.lang.String _MWSPublicSearchesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicSearchesFolder");

	public static final java.lang.String _MWSPublicTemplatesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPublicTemplatesFolder");

	public static final java.lang.String _MWSTemplateObjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateObjectsFolder");

	public static final java.lang.String _MWSTemplateConsolidationsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateConsolidationsFolder");

	public static final java.lang.String _MWSTemplateCustomGroupsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateCustomGroupsFolder");

	public static final java.lang.String _MWSTemplateFiltersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateFiltersFolder");

	public static final java.lang.String _MWSTemplateMetricsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateMetricsFolder");

	public static final java.lang.String _MWSTemplatePromptsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplatePromptsFolder");

	public static final java.lang.String _MWSTemplateReportsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateReportsFolder");

	public static final java.lang.String _MWSTemplateSearchesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateSearchesFolder");

	public static final java.lang.String _MWSTemplateTemplatesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateTemplatesFolder");

	public static final java.lang.String _MWSProfileObjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProfileObjectsFolder");

	public static final java.lang.String _MWSProfileReportsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProfileReportsFolder");

	public static final java.lang.String _MWSProfileAnswersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProfileAnswersFolder");

	public static final java.lang.String _MWSProfileFavoritesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProfileFavoritesFolder");

	public static final java.lang.String _MWSProfileOtherFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProfileOtherFolder");

	public static final java.lang.String _MWSSchemaObjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaObjectsFolder");

	public static final java.lang.String _MWSSchemaAttributeFormsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaAttributeFormsFolder");

	public static final java.lang.String _MWSSchemaAttributesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaAttributesFolder");

	public static final java.lang.String _MWSSchemaColumnsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaColumnsFolder");

	public static final java.lang.String _MWSSchemaDataExplorerFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaDataExplorerFolder");

	public static final java.lang.String _MWSSchemaFactsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaFactsFolder");

	public static final java.lang.String _MWSSchemaFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaFunctionsFolder");

	public static final java.lang.String _MWSSchemaHierarchiesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaHierarchiesFolder");

	public static final java.lang.String _MWSSchemaPartitionFiltersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaPartitionFiltersFolder");

	public static final java.lang.String _MWSSchemaPartitionMappingsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaPartitionMappingsFolder");

	public static final java.lang.String _MWSSchemaSubtotalsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaSubtotalsFolder");

	public static final java.lang.String _MWSSchemaTablesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaTablesFolder");

	public static final java.lang.String _MWSSchemaWarehouseTablesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaWarehouseTablesFolder");

	public static final java.lang.String _MWSSchemaTransformationAttributesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaTransformationAttributesFolder");

	public static final java.lang.String _MWSSchemaTransformationsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaTransformationsFolder");

	public static final java.lang.String _MWSRootFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRootFolder");

	public static final java.lang.String _MWSSchemaFunctionsNestedFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaFunctionsNestedFolder");

	public static final java.lang.String _MWSSchemaBasicFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaBasicFunctionsFolder");

	public static final java.lang.String _MWSSchemaDateAndTimeFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaDateAndTimeFunctionsFolder");

	public static final java.lang.String _MWSSchemaInternalFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaInternalFunctionsFolder");

	public static final java.lang.String _MWSSchemaNullZeroFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaNullZeroFunctionsFolder");

	public static final java.lang.String _MWSSchemaOlapFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaOlapFunctionsFolder");

	public static final java.lang.String _MWSSchemaRankAndNTileFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaRankAndNTileFunctionsFolder");

	public static final java.lang.String _MWSSchemaStringFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaStringFunctionsFolder");

	public static final java.lang.String _MWSSchemaOperatorsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaOperatorsFolder");

	public static final java.lang.String _MWSSchemaArithmeticOperatorsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaArithmeticOperatorsFolder");

	public static final java.lang.String _MWSSchemaComparisonOperatorsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaComparisonOperatorsFolder");

	public static final java.lang.String _MWSSchemaComparisonForRankOperatorsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaComparisonForRankOperatorsFolder");

	public static final java.lang.String _MWSSchemaLogicalOperatorsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaLogicalOperatorsFolder");

	public static final java.lang.String _MWSSchemaPlugInPackagesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaPlugInPackagesFolder");

	public static final java.lang.String _MWSSchemaFinancialFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaFinancialFunctionsFolder");

	public static final java.lang.String _MWSSchemaMathFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaMathFunctionsFolder");

	public static final java.lang.String _MWSSchemaStatisticalFunctionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchemaStatisticalFunctionsFolder");

	public static final java.lang.String _MWSAutoStylesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAutoStylesFolder");

	public static final java.lang.String _MWSConfigureMonitorsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConfigureMonitorsFolder");

	public static final java.lang.String _MWSConfigureServerDefsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConfigureServerDefsFolder");

	public static final java.lang.String _MWSTemplateDocumentsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateDocumentsFolder");

	public static final java.lang.String _MWSSystemObjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemObjectsFolder");

	public static final java.lang.String _MWSSystemLinksFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemLinksFolder");

	public static final java.lang.String _MWSSystemPropertySetsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemPropertySetsFolder");

	public static final java.lang.String _MWSSystemParserFolderFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemParserFolderFolder");

	public static final java.lang.String _MWSSystemSchemaFolderFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemSchemaFolderFolder");

	public static final java.lang.String _MWSSystemWarehouseCatalogFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemWarehouseCatalogFolder");

	public static final java.lang.String _MWSSystemSystemHierarchyFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemSystemHierarchyFolder");

	public static final java.lang.String _MWSSystemDrillMapFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemDrillMapFolder");

	public static final java.lang.String _MWSSystemMDSecurityFiltersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemMDSecurityFiltersFolder");

	public static final java.lang.String _MWSSystemDummyPartitionTablesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemDummyPartitionTablesFolder");

	public static final java.lang.String _MWSSystemSystemPromptsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSystemSystemPromptsFolder");

	public static final java.lang.String _MWSEventsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSEventsFolder");

	public static final java.lang.String _MWSConfigureDBRolesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConfigureDBRolesFolder");

	public static final java.lang.String _MWSLocalesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSLocalesFolder");

	public static final java.lang.String _MWSPropertySetsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPropertySetsFolder");

	public static final java.lang.String _MWSDBMSFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBMSFolder");

	public static final java.lang.String _MWSProjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProjectsFolder");

	public static final java.lang.String _MWSUsersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUsersFolder");

	public static final java.lang.String _MWSUserGroupsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUserGroupsFolder");

	public static final java.lang.String _MWSSecurityRolesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSecurityRolesFolder");

	public static final java.lang.String _MWSDBConnectionsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBConnectionsFolder");

	public static final java.lang.String _MWSDBLoginsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBLoginsFolder");

	public static final java.lang.String _MWSLinksFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSLinksFolder");

	public static final java.lang.String _MWSScheduleObjectsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSScheduleObjectsFolder");

	public static final java.lang.String _MWSScheduleTriggersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSScheduleTriggersFolder");

	public static final java.lang.String _MWSTableSourcesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTableSourcesFolder");

	public static final java.lang.String _MWSVersionUpdateHistoryFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSVersionUpdateHistoryFolder");

	public static final java.lang.String _MWSDevicesFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDevicesFolder");

	public static final java.lang.String _MWSTransmittersFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTransmittersFolder");

	public static final java.lang.String _MWSTemplateDashboardsFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplateDashboardsFolder");

	public static final java.lang.String _MWSMaximumFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSMaximumFolder");

	public static final EnumMWSProjectFolder MWSPublicObjectsFolder = new EnumMWSProjectFolder(
			_MWSPublicObjectsFolder, true);

	public static final EnumMWSProjectFolder MWSPublicConsolidationsFolder = new EnumMWSProjectFolder(
			_MWSPublicConsolidationsFolder, true);

	public static final EnumMWSProjectFolder MWSPublicCustomGroupsFolder = new EnumMWSProjectFolder(
			_MWSPublicCustomGroupsFolder, true);

	public static final EnumMWSProjectFolder MWSPublicFiltersFolder = new EnumMWSProjectFolder(
			_MWSPublicFiltersFolder, true);

	public static final EnumMWSProjectFolder MWSPublicMetricsFolder = new EnumMWSProjectFolder(
			_MWSPublicMetricsFolder, true);

	public static final EnumMWSProjectFolder MWSPublicPromptsFolder = new EnumMWSProjectFolder(
			_MWSPublicPromptsFolder, true);

	public static final EnumMWSProjectFolder MWSPublicReportsFolder = new EnumMWSProjectFolder(
			_MWSPublicReportsFolder, true);

	public static final EnumMWSProjectFolder MWSPublicSearchesFolder = new EnumMWSProjectFolder(
			_MWSPublicSearchesFolder, true);

	public static final EnumMWSProjectFolder MWSPublicTemplatesFolder = new EnumMWSProjectFolder(
			_MWSPublicTemplatesFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateObjectsFolder = new EnumMWSProjectFolder(
			_MWSTemplateObjectsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateConsolidationsFolder = new EnumMWSProjectFolder(
			_MWSTemplateConsolidationsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateCustomGroupsFolder = new EnumMWSProjectFolder(
			_MWSTemplateCustomGroupsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateFiltersFolder = new EnumMWSProjectFolder(
			_MWSTemplateFiltersFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateMetricsFolder = new EnumMWSProjectFolder(
			_MWSTemplateMetricsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplatePromptsFolder = new EnumMWSProjectFolder(
			_MWSTemplatePromptsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateReportsFolder = new EnumMWSProjectFolder(
			_MWSTemplateReportsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateSearchesFolder = new EnumMWSProjectFolder(
			_MWSTemplateSearchesFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateTemplatesFolder = new EnumMWSProjectFolder(
			_MWSTemplateTemplatesFolder, true);

	public static final EnumMWSProjectFolder MWSProfileObjectsFolder = new EnumMWSProjectFolder(
			_MWSProfileObjectsFolder, true);

	public static final EnumMWSProjectFolder MWSProfileReportsFolder = new EnumMWSProjectFolder(
			_MWSProfileReportsFolder, true);

	public static final EnumMWSProjectFolder MWSProfileAnswersFolder = new EnumMWSProjectFolder(
			_MWSProfileAnswersFolder, true);

	public static final EnumMWSProjectFolder MWSProfileFavoritesFolder = new EnumMWSProjectFolder(
			_MWSProfileFavoritesFolder, true);

	public static final EnumMWSProjectFolder MWSProfileOtherFolder = new EnumMWSProjectFolder(
			_MWSProfileOtherFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaObjectsFolder = new EnumMWSProjectFolder(
			_MWSSchemaObjectsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaAttributeFormsFolder = new EnumMWSProjectFolder(
			_MWSSchemaAttributeFormsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaAttributesFolder = new EnumMWSProjectFolder(
			_MWSSchemaAttributesFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaColumnsFolder = new EnumMWSProjectFolder(
			_MWSSchemaColumnsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaDataExplorerFolder = new EnumMWSProjectFolder(
			_MWSSchemaDataExplorerFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaFactsFolder = new EnumMWSProjectFolder(
			_MWSSchemaFactsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaHierarchiesFolder = new EnumMWSProjectFolder(
			_MWSSchemaHierarchiesFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaPartitionFiltersFolder = new EnumMWSProjectFolder(
			_MWSSchemaPartitionFiltersFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaPartitionMappingsFolder = new EnumMWSProjectFolder(
			_MWSSchemaPartitionMappingsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaSubtotalsFolder = new EnumMWSProjectFolder(
			_MWSSchemaSubtotalsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaTablesFolder = new EnumMWSProjectFolder(
			_MWSSchemaTablesFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaWarehouseTablesFolder = new EnumMWSProjectFolder(
			_MWSSchemaWarehouseTablesFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaTransformationAttributesFolder = new EnumMWSProjectFolder(
			_MWSSchemaTransformationAttributesFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaTransformationsFolder = new EnumMWSProjectFolder(
			_MWSSchemaTransformationsFolder, true);

	public static final EnumMWSProjectFolder MWSRootFolder = new EnumMWSProjectFolder(
			_MWSRootFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaFunctionsNestedFolder = new EnumMWSProjectFolder(
			_MWSSchemaFunctionsNestedFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaBasicFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaBasicFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaDateAndTimeFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaDateAndTimeFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaInternalFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaInternalFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaNullZeroFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaNullZeroFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaOlapFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaOlapFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaRankAndNTileFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaRankAndNTileFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaStringFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaStringFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaOperatorsFolder = new EnumMWSProjectFolder(
			_MWSSchemaOperatorsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaArithmeticOperatorsFolder = new EnumMWSProjectFolder(
			_MWSSchemaArithmeticOperatorsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaComparisonOperatorsFolder = new EnumMWSProjectFolder(
			_MWSSchemaComparisonOperatorsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaComparisonForRankOperatorsFolder = new EnumMWSProjectFolder(
			_MWSSchemaComparisonForRankOperatorsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaLogicalOperatorsFolder = new EnumMWSProjectFolder(
			_MWSSchemaLogicalOperatorsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaPlugInPackagesFolder = new EnumMWSProjectFolder(
			_MWSSchemaPlugInPackagesFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaFinancialFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaFinancialFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaMathFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaMathFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSSchemaStatisticalFunctionsFolder = new EnumMWSProjectFolder(
			_MWSSchemaStatisticalFunctionsFolder, true);

	public static final EnumMWSProjectFolder MWSAutoStylesFolder = new EnumMWSProjectFolder(
			_MWSAutoStylesFolder, true);

	public static final EnumMWSProjectFolder MWSConfigureMonitorsFolder = new EnumMWSProjectFolder(
			_MWSConfigureMonitorsFolder, true);

	public static final EnumMWSProjectFolder MWSConfigureServerDefsFolder = new EnumMWSProjectFolder(
			_MWSConfigureServerDefsFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateDocumentsFolder = new EnumMWSProjectFolder(
			_MWSTemplateDocumentsFolder, true);

	public static final EnumMWSProjectFolder MWSSystemObjectsFolder = new EnumMWSProjectFolder(
			_MWSSystemObjectsFolder, true);

	public static final EnumMWSProjectFolder MWSSystemLinksFolder = new EnumMWSProjectFolder(
			_MWSSystemLinksFolder, true);

	public static final EnumMWSProjectFolder MWSSystemPropertySetsFolder = new EnumMWSProjectFolder(
			_MWSSystemPropertySetsFolder, true);

	public static final EnumMWSProjectFolder MWSSystemParserFolderFolder = new EnumMWSProjectFolder(
			_MWSSystemParserFolderFolder, true);

	public static final EnumMWSProjectFolder MWSSystemSchemaFolderFolder = new EnumMWSProjectFolder(
			_MWSSystemSchemaFolderFolder, true);

	public static final EnumMWSProjectFolder MWSSystemWarehouseCatalogFolder = new EnumMWSProjectFolder(
			_MWSSystemWarehouseCatalogFolder, true);

	public static final EnumMWSProjectFolder MWSSystemSystemHierarchyFolder = new EnumMWSProjectFolder(
			_MWSSystemSystemHierarchyFolder, true);

	public static final EnumMWSProjectFolder MWSSystemDrillMapFolder = new EnumMWSProjectFolder(
			_MWSSystemDrillMapFolder, true);

	public static final EnumMWSProjectFolder MWSSystemMDSecurityFiltersFolder = new EnumMWSProjectFolder(
			_MWSSystemMDSecurityFiltersFolder, true);

	public static final EnumMWSProjectFolder MWSSystemDummyPartitionTablesFolder = new EnumMWSProjectFolder(
			_MWSSystemDummyPartitionTablesFolder, true);

	public static final EnumMWSProjectFolder MWSSystemSystemPromptsFolder = new EnumMWSProjectFolder(
			_MWSSystemSystemPromptsFolder, true);

	public static final EnumMWSProjectFolder MWSEventsFolder = new EnumMWSProjectFolder(
			_MWSEventsFolder, true);

	public static final EnumMWSProjectFolder MWSConfigureDBRolesFolder = new EnumMWSProjectFolder(
			_MWSConfigureDBRolesFolder, true);

	public static final EnumMWSProjectFolder MWSLocalesFolder = new EnumMWSProjectFolder(
			_MWSLocalesFolder, true);

	public static final EnumMWSProjectFolder MWSPropertySetsFolder = new EnumMWSProjectFolder(
			_MWSPropertySetsFolder, true);

	public static final EnumMWSProjectFolder MWSDBMSFolder = new EnumMWSProjectFolder(
			_MWSDBMSFolder, true);

	public static final EnumMWSProjectFolder MWSProjectsFolder = new EnumMWSProjectFolder(
			_MWSProjectsFolder, true);

	public static final EnumMWSProjectFolder MWSUsersFolder = new EnumMWSProjectFolder(
			_MWSUsersFolder, true);

	public static final EnumMWSProjectFolder MWSUserGroupsFolder = new EnumMWSProjectFolder(
			_MWSUserGroupsFolder, true);

	public static final EnumMWSProjectFolder MWSSecurityRolesFolder = new EnumMWSProjectFolder(
			_MWSSecurityRolesFolder, true);

	public static final EnumMWSProjectFolder MWSDBConnectionsFolder = new EnumMWSProjectFolder(
			_MWSDBConnectionsFolder, true);

	public static final EnumMWSProjectFolder MWSDBLoginsFolder = new EnumMWSProjectFolder(
			_MWSDBLoginsFolder, true);

	public static final EnumMWSProjectFolder MWSLinksFolder = new EnumMWSProjectFolder(
			_MWSLinksFolder, true);

	public static final EnumMWSProjectFolder MWSScheduleObjectsFolder = new EnumMWSProjectFolder(
			_MWSScheduleObjectsFolder, true);

	public static final EnumMWSProjectFolder MWSScheduleTriggersFolder = new EnumMWSProjectFolder(
			_MWSScheduleTriggersFolder, true);

	public static final EnumMWSProjectFolder MWSTableSourcesFolder = new EnumMWSProjectFolder(
			_MWSTableSourcesFolder, true);

	public static final EnumMWSProjectFolder MWSVersionUpdateHistoryFolder = new EnumMWSProjectFolder(
			_MWSVersionUpdateHistoryFolder, true);

	public static final EnumMWSProjectFolder MWSDevicesFolder = new EnumMWSProjectFolder(
			_MWSDevicesFolder, true);

	public static final EnumMWSProjectFolder MWSTransmittersFolder = new EnumMWSProjectFolder(
			_MWSTransmittersFolder, true);

	public static final EnumMWSProjectFolder MWSTemplateDashboardsFolder = new EnumMWSProjectFolder(
			_MWSTemplateDashboardsFolder, true);

	public static final EnumMWSProjectFolder MWSMaximumFolder = new EnumMWSProjectFolder(
			_MWSMaximumFolder, true);

	public java.lang.String getValue() {
		return localEnumMWSProjectFolder;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSProjectFolder.toString();

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
				EnumMWSProjectFolder.this.serialize(MY_QNAME, factory,
						xmlWriter);
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
						namespacePrefix + ":EnumMWSProjectFolder", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSProjectFolder", xmlWriter);
			}
		}

		if (localEnumMWSProjectFolder == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSProjectFolder);

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
								.convertToString(localEnumMWSProjectFolder) },
				null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSProjectFolder fromValue(java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSProjectFolder enumeration = (EnumMWSProjectFolder)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSProjectFolder fromString(java.lang.String value,
				java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSProjectFolder fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSProjectFolder.Factory.fromString(content,
						namespaceUri);
			} else {
				return EnumMWSProjectFolder.Factory.fromString(content, "");
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
		public static EnumMWSProjectFolder parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSProjectFolder object = null;
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
							object = EnumMWSProjectFolder.Factory.fromString(
									content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSProjectFolder.Factory.fromString(
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
