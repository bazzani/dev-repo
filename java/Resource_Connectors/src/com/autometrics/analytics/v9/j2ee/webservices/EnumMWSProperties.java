/**
 * EnumMWSProperties.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices;

/**
 * EnumMWSProperties bean class
 */

public class EnumMWSProperties implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/", "EnumMWSProperties", "ns1");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/")) {
			return "ns1";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSProperties
	 */

	protected java.lang.String localEnumMWSProperties;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSProperties(java.lang.String value, boolean isRegisterValue) {
		localEnumMWSProperties = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSProperties, this);

		}

	}

	public static final java.lang.String _MWSAllProperties = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAllProperties");

	public static final java.lang.String _MWSBuildVersion = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSBuildVersion");

	public static final java.lang.String _MWSWSDLVersion = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSWSDLVersion");

	public static final java.lang.String _MWSReleaseVersion = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReleaseVersion");

	public static final java.lang.String _MWSAsyncCapability = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAsyncCapability");

	public static final java.lang.String _MWSExpandedOwnerSearch = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSExpandedOwnerSearch");

	public static final java.lang.String _MWSBrowseBySubtypes = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSBrowseBySubtypes");

	public static final java.lang.String _MWSUTCBasedTime = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUTCBasedTime");

	public static final java.lang.String _MWSBrowseHierarchyElements = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSBrowseHierarchyElements");

	public static final java.lang.String _MWSShortcutInformation = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSShortcutInformation");

	public static final java.lang.String _MWSFolderIDBrowsing = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFolderIDBrowsing");

	public static final java.lang.String _MWSReportIncrDataRetrieval = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReportIncrDataRetrieval");

	public static final java.lang.String _MWSOfficeInstallVersion = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSOfficeInstallVersion");

	public static final java.lang.String _MWSFlattenedCSV = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSFlattenedCSV");

	public static final java.lang.String _MWSImages = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSImages");

	public static final java.lang.String _MWSGraphImages = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSGraphImages");

	public static final java.lang.String _MWSCubeAttributePrompts = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCubeAttributePrompts");

	public static final java.lang.String _MWSAttributeLocking = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttributeLocking");

	public static final java.lang.String _MWSGraphImagesBmpPng = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSGraphImagesBmpPng");

	public static final java.lang.String _MWSIncrementalBrowsing = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSIncrementalBrowsing");

	public static final java.lang.String _MWSOfficeInstallExecutable = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSOfficeInstallExecutable");

	public static final java.lang.String _MWSReportAsChart = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReportAsChart");

	public static final java.lang.String _MWSUseHTTP1_0_Protocol = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUseHTTP1_0_Protocol");

	public static final java.lang.String _MWSReportQueryString = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReportQueryString");

	public static final java.lang.String _MWSMultiThreadedReportsSupport = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSMultiThreadedReportsSupport");

	public static final java.lang.String _MWSReportDataMart = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReportDataMart");

	public static final java.lang.String _MWSRSDocumentAsPDF = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRSDocumentAsPDF");

	public static final java.lang.String _MWSPageByForCSV = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPageByForCSV");

	public static final java.lang.String _MWSReportHdrDataType = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReportHdrDataType");

	public static final java.lang.String _MWSManyToManyPromptFiltering = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSManyToManyPromptFiltering");

	public static final java.lang.String _MWSAttributeEntryPoint = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttributeEntryPoint");

	public static final java.lang.String _MWSImplicitExecution = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSImplicitExecution");

	public static final java.lang.String _MWSAttributeObjectInfo = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttributeObjectInfo");

	public static final java.lang.String _MWSReportTransforms = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReportTransforms");

	public static final java.lang.String _MWSAttrFormImages = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttrFormImages");

	public static final java.lang.String _MWSADORecordset = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSADORecordset");

	public static final java.lang.String _MWSResourceRetrieval = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSResourceRetrieval");

	public static final java.lang.String _MWSRSDocumentObjectInfo = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRSDocumentObjectInfo");

	public static final java.lang.String _MWSRSDocumentFlashEnabled = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRSDocumentFlashEnabled");

	public static final java.lang.String _MWSClientUILocaleID = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSClientUILocaleID");

	public static final java.lang.String _MWSAttachmentIndex = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSAttachmentIndex");

	public static final java.lang.String _MWSDashboardVersion = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDashboardVersion");

	public static final EnumMWSProperties MWSAllProperties = new EnumMWSProperties(
			_MWSAllProperties, true);

	public static final EnumMWSProperties MWSBuildVersion = new EnumMWSProperties(
			_MWSBuildVersion, true);

	public static final EnumMWSProperties MWSWSDLVersion = new EnumMWSProperties(
			_MWSWSDLVersion, true);

	public static final EnumMWSProperties MWSReleaseVersion = new EnumMWSProperties(
			_MWSReleaseVersion, true);

	public static final EnumMWSProperties MWSAsyncCapability = new EnumMWSProperties(
			_MWSAsyncCapability, true);

	public static final EnumMWSProperties MWSExpandedOwnerSearch = new EnumMWSProperties(
			_MWSExpandedOwnerSearch, true);

	public static final EnumMWSProperties MWSBrowseBySubtypes = new EnumMWSProperties(
			_MWSBrowseBySubtypes, true);

	public static final EnumMWSProperties MWSUTCBasedTime = new EnumMWSProperties(
			_MWSUTCBasedTime, true);

	public static final EnumMWSProperties MWSBrowseHierarchyElements = new EnumMWSProperties(
			_MWSBrowseHierarchyElements, true);

	public static final EnumMWSProperties MWSShortcutInformation = new EnumMWSProperties(
			_MWSShortcutInformation, true);

	public static final EnumMWSProperties MWSFolderIDBrowsing = new EnumMWSProperties(
			_MWSFolderIDBrowsing, true);

	public static final EnumMWSProperties MWSReportIncrDataRetrieval = new EnumMWSProperties(
			_MWSReportIncrDataRetrieval, true);

	public static final EnumMWSProperties MWSOfficeInstallVersion = new EnumMWSProperties(
			_MWSOfficeInstallVersion, true);

	public static final EnumMWSProperties MWSFlattenedCSV = new EnumMWSProperties(
			_MWSFlattenedCSV, true);

	public static final EnumMWSProperties MWSImages = new EnumMWSProperties(
			_MWSImages, true);

	public static final EnumMWSProperties MWSGraphImages = new EnumMWSProperties(
			_MWSGraphImages, true);

	public static final EnumMWSProperties MWSCubeAttributePrompts = new EnumMWSProperties(
			_MWSCubeAttributePrompts, true);

	public static final EnumMWSProperties MWSAttributeLocking = new EnumMWSProperties(
			_MWSAttributeLocking, true);

	public static final EnumMWSProperties MWSGraphImagesBmpPng = new EnumMWSProperties(
			_MWSGraphImagesBmpPng, true);

	public static final EnumMWSProperties MWSIncrementalBrowsing = new EnumMWSProperties(
			_MWSIncrementalBrowsing, true);

	public static final EnumMWSProperties MWSOfficeInstallExecutable = new EnumMWSProperties(
			_MWSOfficeInstallExecutable, true);

	public static final EnumMWSProperties MWSReportAsChart = new EnumMWSProperties(
			_MWSReportAsChart, true);

	public static final EnumMWSProperties MWSUseHTTP1_0_Protocol = new EnumMWSProperties(
			_MWSUseHTTP1_0_Protocol, true);

	public static final EnumMWSProperties MWSReportQueryString = new EnumMWSProperties(
			_MWSReportQueryString, true);

	public static final EnumMWSProperties MWSMultiThreadedReportsSupport = new EnumMWSProperties(
			_MWSMultiThreadedReportsSupport, true);

	public static final EnumMWSProperties MWSReportDataMart = new EnumMWSProperties(
			_MWSReportDataMart, true);

	public static final EnumMWSProperties MWSRSDocumentAsPDF = new EnumMWSProperties(
			_MWSRSDocumentAsPDF, true);

	public static final EnumMWSProperties MWSPageByForCSV = new EnumMWSProperties(
			_MWSPageByForCSV, true);

	public static final EnumMWSProperties MWSReportHdrDataType = new EnumMWSProperties(
			_MWSReportHdrDataType, true);

	public static final EnumMWSProperties MWSManyToManyPromptFiltering = new EnumMWSProperties(
			_MWSManyToManyPromptFiltering, true);

	public static final EnumMWSProperties MWSAttributeEntryPoint = new EnumMWSProperties(
			_MWSAttributeEntryPoint, true);

	public static final EnumMWSProperties MWSImplicitExecution = new EnumMWSProperties(
			_MWSImplicitExecution, true);

	public static final EnumMWSProperties MWSAttributeObjectInfo = new EnumMWSProperties(
			_MWSAttributeObjectInfo, true);

	public static final EnumMWSProperties MWSReportTransforms = new EnumMWSProperties(
			_MWSReportTransforms, true);

	public static final EnumMWSProperties MWSAttrFormImages = new EnumMWSProperties(
			_MWSAttrFormImages, true);

	public static final EnumMWSProperties MWSADORecordset = new EnumMWSProperties(
			_MWSADORecordset, true);

	public static final EnumMWSProperties MWSResourceRetrieval = new EnumMWSProperties(
			_MWSResourceRetrieval, true);

	public static final EnumMWSProperties MWSRSDocumentObjectInfo = new EnumMWSProperties(
			_MWSRSDocumentObjectInfo, true);

	public static final EnumMWSProperties MWSRSDocumentFlashEnabled = new EnumMWSProperties(
			_MWSRSDocumentFlashEnabled, true);

	public static final EnumMWSProperties MWSClientUILocaleID = new EnumMWSProperties(
			_MWSClientUILocaleID, true);

	public static final EnumMWSProperties MWSAttachmentIndex = new EnumMWSProperties(
			_MWSAttachmentIndex, true);

	public static final EnumMWSProperties MWSDashboardVersion = new EnumMWSProperties(
			_MWSDashboardVersion, true);

	public java.lang.String getValue() {
		return localEnumMWSProperties;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSProperties.toString();

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
				EnumMWSProperties.this.serialize(MY_QNAME, factory, xmlWriter);
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
					"http://microstrategy.com/webservices/");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":EnumMWSProperties", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSProperties", xmlWriter);
			}
		}

		if (localEnumMWSProperties == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSProperties);

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
								.convertToString(localEnumMWSProperties) },
				null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSProperties fromValue(java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSProperties enumeration = (EnumMWSProperties)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSProperties fromString(java.lang.String value,
				java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSProperties fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSProperties.Factory.fromString(content,
						namespaceUri);
			} else {
				return EnumMWSProperties.Factory.fromString(content, "");
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
		public static EnumMWSProperties parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSProperties object = null;
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
							object = EnumMWSProperties.Factory.fromString(
									content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSProperties.Factory.fromString(
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
