/**
 * EnumMWSObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * EnumMWSObjectType bean class
 */

public class EnumMWSObjectType implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0", "EnumMWSObjectType",
			"ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSObjectType
	 */

	protected java.lang.String localEnumMWSObjectType;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSObjectType(java.lang.String value, boolean isRegisterValue) {
		localEnumMWSObjectType = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSObjectType, this);

		}

	}

	public static final java.lang.String _MWSUnknown = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUnknown");

	public static final java.lang.String _MWSReserved = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReserved");

	public static final java.lang.String _MWSFilter = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFilter");

	public static final java.lang.String _MWSTemplate = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTemplate");

	public static final java.lang.String _MWSReport = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReport");

	public static final java.lang.String _MWSMetric = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSMetric");

	public static final java.lang.String _MWSStyle = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSStyle");

	public static final java.lang.String _MWSAggMetric = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAggMetric");

	public static final java.lang.String _MWSFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFolder");

	public static final java.lang.String _MWSPrompt = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPrompt");

	public static final java.lang.String _MWSFunction = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFunction");

	public static final java.lang.String _MWSAttribute = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttribute");

	public static final java.lang.String _MWSFact = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFact");

	public static final java.lang.String _MWSHierarchy = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSHierarchy");

	public static final java.lang.String _MWSTable = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTable");

	public static final java.lang.String _MWSDatamartReport = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDatamartReport");

	public static final java.lang.String _MWSFactGroup = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFactGroup");

	public static final java.lang.String _MWSShortcut = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSShortcut");

	public static final java.lang.String _MWSResolution = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSResolution");

	public static final java.lang.String _MWSAttributeForm = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttributeForm");

	public static final java.lang.String _MWSSchema = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSchema");

	public static final java.lang.String _MWSFormat = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFormat");

	public static final java.lang.String _MWSCatalog = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCatalog");

	public static final java.lang.String _MWSCatalogDefn = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCatalogDefn");

	public static final java.lang.String _MWSColumn = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSColumn");

	public static final java.lang.String _MWSPropertySet = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPropertySet");

	public static final java.lang.String _MWSDBRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBRole");

	public static final java.lang.String _MWSDBLogin = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBLogin");

	public static final java.lang.String _MWSDBConnection = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBConnection");

	public static final java.lang.String _MWSProject = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSProject");

	public static final java.lang.String _MWSServerDef = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSServerDef");

	public static final java.lang.String _MWSUser = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUser");

	public static final java.lang.String _MWSConfiguration = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConfiguration");

	public static final java.lang.String _MWSRequest = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRequest");

	public static final java.lang.String _MWSScript = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSScript");

	public static final java.lang.String _MWSSearch = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSearch");

	public static final java.lang.String _MWSSearchFolder = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSearchFolder");

	public static final java.lang.String _MWSDatamart = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDatamart");

	public static final java.lang.String _MWSFunctionPackageDefinition = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFunctionPackageDefinition");

	public static final java.lang.String _MWSRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRole");

	public static final java.lang.String _MWSSecurityRole = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSecurityRole");

	public static final java.lang.String _MWSConsolidation = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConsolidation");

	public static final java.lang.String _MWSConsolidationElement = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConsolidationElement");

	public static final java.lang.String _MWSScheduleEvent = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSScheduleEvent");

	public static final java.lang.String _MWSScheduleObject = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSScheduleObject");

	public static final java.lang.String _MWSScheduleTrigger = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSScheduleTrigger");

	public static final java.lang.String _MWSLink = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSLink");

	public static final java.lang.String _MWSDbTable = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDbTable");

	public static final java.lang.String _MWSTableSource = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSTableSource");

	public static final java.lang.String _MWSDocumentDefinition = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDocumentDefinition");

	public static final java.lang.String _MWSDrillMap = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDrillMap");

	public static final java.lang.String _MWSDBMS = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDBMS");

	public static final java.lang.String _MWSMDSecurityFilter = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSMDSecurityFilter");

	public static final java.lang.String _MWSCustomGroup = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCustomGroup");

	public static final java.lang.String _MWSMonitor = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSMonitor");

	public static final java.lang.String _MWSSubscriptionDevice = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSSubscriptionDevice");

	public static final java.lang.String _MWSPromptAnswer = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPromptAnswer");

	public static final java.lang.String _MWSPromptAnswers = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPromptAnswers");

	public static final java.lang.String _MWSLocale = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSLocale");

	public static final java.lang.String _MWSReservedLastOne = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReservedLastOne");

	public static final EnumMWSObjectType MWSUnknown = new EnumMWSObjectType(
			_MWSUnknown, true);

	public static final EnumMWSObjectType MWSReserved = new EnumMWSObjectType(
			_MWSReserved, true);

	public static final EnumMWSObjectType MWSFilter = new EnumMWSObjectType(
			_MWSFilter, true);

	public static final EnumMWSObjectType MWSTemplate = new EnumMWSObjectType(
			_MWSTemplate, true);

	public static final EnumMWSObjectType MWSReport = new EnumMWSObjectType(
			_MWSReport, true);

	public static final EnumMWSObjectType MWSMetric = new EnumMWSObjectType(
			_MWSMetric, true);

	public static final EnumMWSObjectType MWSStyle = new EnumMWSObjectType(
			_MWSStyle, true);

	public static final EnumMWSObjectType MWSAggMetric = new EnumMWSObjectType(
			_MWSAggMetric, true);

	public static final EnumMWSObjectType MWSFolder = new EnumMWSObjectType(
			_MWSFolder, true);

	public static final EnumMWSObjectType MWSPrompt = new EnumMWSObjectType(
			_MWSPrompt, true);

	public static final EnumMWSObjectType MWSFunction = new EnumMWSObjectType(
			_MWSFunction, true);

	public static final EnumMWSObjectType MWSAttribute = new EnumMWSObjectType(
			_MWSAttribute, true);

	public static final EnumMWSObjectType MWSFact = new EnumMWSObjectType(
			_MWSFact, true);

	public static final EnumMWSObjectType MWSHierarchy = new EnumMWSObjectType(
			_MWSHierarchy, true);

	public static final EnumMWSObjectType MWSTable = new EnumMWSObjectType(
			_MWSTable, true);

	public static final EnumMWSObjectType MWSDatamartReport = new EnumMWSObjectType(
			_MWSDatamartReport, true);

	public static final EnumMWSObjectType MWSFactGroup = new EnumMWSObjectType(
			_MWSFactGroup, true);

	public static final EnumMWSObjectType MWSShortcut = new EnumMWSObjectType(
			_MWSShortcut, true);

	public static final EnumMWSObjectType MWSResolution = new EnumMWSObjectType(
			_MWSResolution, true);

	public static final EnumMWSObjectType MWSAttributeForm = new EnumMWSObjectType(
			_MWSAttributeForm, true);

	public static final EnumMWSObjectType MWSSchema = new EnumMWSObjectType(
			_MWSSchema, true);

	public static final EnumMWSObjectType MWSFormat = new EnumMWSObjectType(
			_MWSFormat, true);

	public static final EnumMWSObjectType MWSCatalog = new EnumMWSObjectType(
			_MWSCatalog, true);

	public static final EnumMWSObjectType MWSCatalogDefn = new EnumMWSObjectType(
			_MWSCatalogDefn, true);

	public static final EnumMWSObjectType MWSColumn = new EnumMWSObjectType(
			_MWSColumn, true);

	public static final EnumMWSObjectType MWSPropertySet = new EnumMWSObjectType(
			_MWSPropertySet, true);

	public static final EnumMWSObjectType MWSDBRole = new EnumMWSObjectType(
			_MWSDBRole, true);

	public static final EnumMWSObjectType MWSDBLogin = new EnumMWSObjectType(
			_MWSDBLogin, true);

	public static final EnumMWSObjectType MWSDBConnection = new EnumMWSObjectType(
			_MWSDBConnection, true);

	public static final EnumMWSObjectType MWSProject = new EnumMWSObjectType(
			_MWSProject, true);

	public static final EnumMWSObjectType MWSServerDef = new EnumMWSObjectType(
			_MWSServerDef, true);

	public static final EnumMWSObjectType MWSUser = new EnumMWSObjectType(
			_MWSUser, true);

	public static final EnumMWSObjectType MWSConfiguration = new EnumMWSObjectType(
			_MWSConfiguration, true);

	public static final EnumMWSObjectType MWSRequest = new EnumMWSObjectType(
			_MWSRequest, true);

	public static final EnumMWSObjectType MWSScript = new EnumMWSObjectType(
			_MWSScript, true);

	public static final EnumMWSObjectType MWSSearch = new EnumMWSObjectType(
			_MWSSearch, true);

	public static final EnumMWSObjectType MWSSearchFolder = new EnumMWSObjectType(
			_MWSSearchFolder, true);

	public static final EnumMWSObjectType MWSDatamart = new EnumMWSObjectType(
			_MWSDatamart, true);

	public static final EnumMWSObjectType MWSFunctionPackageDefinition = new EnumMWSObjectType(
			_MWSFunctionPackageDefinition, true);

	public static final EnumMWSObjectType MWSRole = new EnumMWSObjectType(
			_MWSRole, true);

	public static final EnumMWSObjectType MWSSecurityRole = new EnumMWSObjectType(
			_MWSSecurityRole, true);

	public static final EnumMWSObjectType MWSConsolidation = new EnumMWSObjectType(
			_MWSConsolidation, true);

	public static final EnumMWSObjectType MWSConsolidationElement = new EnumMWSObjectType(
			_MWSConsolidationElement, true);

	public static final EnumMWSObjectType MWSScheduleEvent = new EnumMWSObjectType(
			_MWSScheduleEvent, true);

	public static final EnumMWSObjectType MWSScheduleObject = new EnumMWSObjectType(
			_MWSScheduleObject, true);

	public static final EnumMWSObjectType MWSScheduleTrigger = new EnumMWSObjectType(
			_MWSScheduleTrigger, true);

	public static final EnumMWSObjectType MWSLink = new EnumMWSObjectType(
			_MWSLink, true);

	public static final EnumMWSObjectType MWSDbTable = new EnumMWSObjectType(
			_MWSDbTable, true);

	public static final EnumMWSObjectType MWSTableSource = new EnumMWSObjectType(
			_MWSTableSource, true);

	public static final EnumMWSObjectType MWSDocumentDefinition = new EnumMWSObjectType(
			_MWSDocumentDefinition, true);

	public static final EnumMWSObjectType MWSDrillMap = new EnumMWSObjectType(
			_MWSDrillMap, true);

	public static final EnumMWSObjectType MWSDBMS = new EnumMWSObjectType(
			_MWSDBMS, true);

	public static final EnumMWSObjectType MWSMDSecurityFilter = new EnumMWSObjectType(
			_MWSMDSecurityFilter, true);

	public static final EnumMWSObjectType MWSCustomGroup = new EnumMWSObjectType(
			_MWSCustomGroup, true);

	public static final EnumMWSObjectType MWSMonitor = new EnumMWSObjectType(
			_MWSMonitor, true);

	public static final EnumMWSObjectType MWSSubscriptionDevice = new EnumMWSObjectType(
			_MWSSubscriptionDevice, true);

	public static final EnumMWSObjectType MWSPromptAnswer = new EnumMWSObjectType(
			_MWSPromptAnswer, true);

	public static final EnumMWSObjectType MWSPromptAnswers = new EnumMWSObjectType(
			_MWSPromptAnswers, true);

	public static final EnumMWSObjectType MWSLocale = new EnumMWSObjectType(
			_MWSLocale, true);

	public static final EnumMWSObjectType MWSReservedLastOne = new EnumMWSObjectType(
			_MWSReservedLastOne, true);

	public java.lang.String getValue() {
		return localEnumMWSObjectType;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSObjectType.toString();

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
				EnumMWSObjectType.this.serialize(MY_QNAME, factory, xmlWriter);
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
						namespacePrefix + ":EnumMWSObjectType", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSObjectType", xmlWriter);
			}
		}

		if (localEnumMWSObjectType == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSObjectType);

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
								.convertToString(localEnumMWSObjectType) },
				null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSObjectType fromValue(java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSObjectType enumeration = (EnumMWSObjectType)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSObjectType fromString(java.lang.String value,
				java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSObjectType fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSObjectType.Factory.fromString(content,
						namespaceUri);
			} else {
				return EnumMWSObjectType.Factory.fromString(content, "");
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
		public static EnumMWSObjectType parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSObjectType object = null;
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
							object = EnumMWSObjectType.Factory.fromString(
									content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSObjectType.Factory.fromString(
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
