/**
 * EnumMWSDataType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * EnumMWSDataType bean class
 */

public class EnumMWSDataType implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0", "EnumMWSDataType",
			"ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSDataType
	 */

	protected java.lang.String localEnumMWSDataType;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSDataType(java.lang.String value, boolean isRegisterValue) {
		localEnumMWSDataType = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSDataType, this);

		}

	}

	public static final java.lang.String _MWSDataTypeUnknown = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeUnknown");

	public static final java.lang.String _MWSDataTypeReserved = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeReserved");

	public static final java.lang.String _MWSDataTypeInteger = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeInteger");

	public static final java.lang.String _MWSDataTypeUnsigned = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeUnsigned");

	public static final java.lang.String _MWSDataTypeNumeric = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeNumeric");

	public static final java.lang.String _MWSDataTypeDecimal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeDecimal");

	public static final java.lang.String _MWSDataTypeReal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeReal");

	public static final java.lang.String _MWSDataTypeDouble = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeDouble");

	public static final java.lang.String _MWSDataTypeFloat = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeFloat");

	public static final java.lang.String _MWSDataTypeChar = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeChar");

	public static final java.lang.String _MWSDataTypeVarChar = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeVarChar");

	public static final java.lang.String _MWSDataTypeLongVarChar = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeLongVarChar");

	public static final java.lang.String _MWSDataTypeBinary = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeBinary");

	public static final java.lang.String _MWSDataTypeVarBin = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeVarBin");

	public static final java.lang.String _MWSDataTypeLongVarBin = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeLongVarBin");

	public static final java.lang.String _MWSDataTypeDate = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeDate");

	public static final java.lang.String _MWSDataTypeTime = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeTime");

	public static final java.lang.String _MWSDataTypeTimeStamp = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeTimeStamp");

	public static final java.lang.String _MWSDataTypeShort = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeShort");

	public static final java.lang.String _MWSDataTypeLong = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeLong");

	public static final java.lang.String _MWSDataTypeMBChar = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeMBChar");

	public static final java.lang.String _MWSDataTypeBool = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeBool");

	public static final java.lang.String _MWSDataTypePattern = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypePattern");

	public static final java.lang.String _MWSDataTypeBigDecimal = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSDataTypeBigDecimal");

	public static final EnumMWSDataType MWSDataTypeUnknown = new EnumMWSDataType(
			_MWSDataTypeUnknown, true);

	public static final EnumMWSDataType MWSDataTypeReserved = new EnumMWSDataType(
			_MWSDataTypeReserved, true);

	public static final EnumMWSDataType MWSDataTypeInteger = new EnumMWSDataType(
			_MWSDataTypeInteger, true);

	public static final EnumMWSDataType MWSDataTypeUnsigned = new EnumMWSDataType(
			_MWSDataTypeUnsigned, true);

	public static final EnumMWSDataType MWSDataTypeNumeric = new EnumMWSDataType(
			_MWSDataTypeNumeric, true);

	public static final EnumMWSDataType MWSDataTypeDecimal = new EnumMWSDataType(
			_MWSDataTypeDecimal, true);

	public static final EnumMWSDataType MWSDataTypeReal = new EnumMWSDataType(
			_MWSDataTypeReal, true);

	public static final EnumMWSDataType MWSDataTypeDouble = new EnumMWSDataType(
			_MWSDataTypeDouble, true);

	public static final EnumMWSDataType MWSDataTypeFloat = new EnumMWSDataType(
			_MWSDataTypeFloat, true);

	public static final EnumMWSDataType MWSDataTypeChar = new EnumMWSDataType(
			_MWSDataTypeChar, true);

	public static final EnumMWSDataType MWSDataTypeVarChar = new EnumMWSDataType(
			_MWSDataTypeVarChar, true);

	public static final EnumMWSDataType MWSDataTypeLongVarChar = new EnumMWSDataType(
			_MWSDataTypeLongVarChar, true);

	public static final EnumMWSDataType MWSDataTypeBinary = new EnumMWSDataType(
			_MWSDataTypeBinary, true);

	public static final EnumMWSDataType MWSDataTypeVarBin = new EnumMWSDataType(
			_MWSDataTypeVarBin, true);

	public static final EnumMWSDataType MWSDataTypeLongVarBin = new EnumMWSDataType(
			_MWSDataTypeLongVarBin, true);

	public static final EnumMWSDataType MWSDataTypeDate = new EnumMWSDataType(
			_MWSDataTypeDate, true);

	public static final EnumMWSDataType MWSDataTypeTime = new EnumMWSDataType(
			_MWSDataTypeTime, true);

	public static final EnumMWSDataType MWSDataTypeTimeStamp = new EnumMWSDataType(
			_MWSDataTypeTimeStamp, true);

	public static final EnumMWSDataType MWSDataTypeShort = new EnumMWSDataType(
			_MWSDataTypeShort, true);

	public static final EnumMWSDataType MWSDataTypeLong = new EnumMWSDataType(
			_MWSDataTypeLong, true);

	public static final EnumMWSDataType MWSDataTypeMBChar = new EnumMWSDataType(
			_MWSDataTypeMBChar, true);

	public static final EnumMWSDataType MWSDataTypeBool = new EnumMWSDataType(
			_MWSDataTypeBool, true);

	public static final EnumMWSDataType MWSDataTypePattern = new EnumMWSDataType(
			_MWSDataTypePattern, true);

	public static final EnumMWSDataType MWSDataTypeBigDecimal = new EnumMWSDataType(
			_MWSDataTypeBigDecimal, true);

	public java.lang.String getValue() {
		return localEnumMWSDataType;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSDataType.toString();

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
				EnumMWSDataType.this.serialize(MY_QNAME, factory, xmlWriter);
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
						namespacePrefix + ":EnumMWSDataType", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSDataType", xmlWriter);
			}
		}

		if (localEnumMWSDataType == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSDataType);

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
								.convertToString(localEnumMWSDataType) }, null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSDataType fromValue(java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSDataType enumeration = (EnumMWSDataType)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSDataType fromString(java.lang.String value,
				java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSDataType fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSDataType.Factory
						.fromString(content, namespaceUri);
			} else {
				return EnumMWSDataType.Factory.fromString(content, "");
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
		public static EnumMWSDataType parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSDataType object = null;
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
							object = EnumMWSDataType.Factory.fromString(
									content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSDataType.Factory.fromString(
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
