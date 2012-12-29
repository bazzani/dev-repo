/**
 * EnumMWSResultFlags_type0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * EnumMWSResultFlags_type0 bean class
 */

public class EnumMWSResultFlags_type0 implements
		org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0",
			"EnumMWSResultFlags_type0", "ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSResultFlags_type0
	 */

	protected java.lang.String localEnumMWSResultFlags_type0;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSResultFlags_type0(java.lang.String value,
			boolean isRegisterValue) {
		localEnumMWSResultFlags_type0 = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSResultFlags_type0, this);

		}

	}

	public static final java.lang.String _MWSReturnAsHTML = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnAsHTML");

	public static final java.lang.String _MWSReturnFlattened = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnFlattened");

	public static final java.lang.String _MWSResultSizeOnly = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSResultSizeOnly");

	public static final java.lang.String _MWSReturnAsCSV = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnAsCSV");

	public static final java.lang.String _MWSReturnAsXML = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnAsXML");

	public static final java.lang.String _MWSReturnHeaderInfo = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnHeaderInfo");

	public static final java.lang.String _MWSReturnGraphBytes = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnGraphBytes");

	public static final java.lang.String _MWSReturnImages = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnImages");

	public static final java.lang.String _MWSGraphImgJPEG = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSGraphImgJPEG");

	public static final java.lang.String _MWSCSVNoMetricsColumn = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCSVNoMetricsColumn");

	public static final java.lang.String _MWSCSVNoThresholds = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCSVNoThresholds");

	public static final java.lang.String _MWSCSVNoFormatting = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSCSVNoFormatting");

	public static final java.lang.String _MWSGraphImgBMP = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSGraphImgBMP");

	public static final java.lang.String _MWSGraphImgPNG = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSGraphImgPNG");

	public static final java.lang.String _MWSReturnQueryString = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnQueryString");

	public static final java.lang.String _MWSXMLAsAttachment = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSXMLAsAttachment");

	public static final java.lang.String _MWSReturnAttachmentIndex = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSReturnAttachmentIndex");

	public static final java.lang.String _MWSPDF = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPDF");

	public static final java.lang.String _MWSExportAll = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSExportAll");

	public static final java.lang.String _MWSExportCurrentPage = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSExportCurrentPage");

	public static final java.lang.String _MWSExportCurrentWindow = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSExportCurrentWindow");

	public static final java.lang.String _MWSExportDefault = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSExportDefault");

	public static final java.lang.String _MWSVisualizationXML = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSVisualizationXML");

	public static final java.lang.String _MWSVisualizationSWF = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSVisualizationSWF");

	public static final EnumMWSResultFlags_type0 MWSReturnAsHTML = new EnumMWSResultFlags_type0(
			_MWSReturnAsHTML, true);

	public static final EnumMWSResultFlags_type0 MWSReturnFlattened = new EnumMWSResultFlags_type0(
			_MWSReturnFlattened, true);

	public static final EnumMWSResultFlags_type0 MWSResultSizeOnly = new EnumMWSResultFlags_type0(
			_MWSResultSizeOnly, true);

	public static final EnumMWSResultFlags_type0 MWSReturnAsCSV = new EnumMWSResultFlags_type0(
			_MWSReturnAsCSV, true);

	public static final EnumMWSResultFlags_type0 MWSReturnAsXML = new EnumMWSResultFlags_type0(
			_MWSReturnAsXML, true);

	public static final EnumMWSResultFlags_type0 MWSReturnHeaderInfo = new EnumMWSResultFlags_type0(
			_MWSReturnHeaderInfo, true);

	public static final EnumMWSResultFlags_type0 MWSReturnGraphBytes = new EnumMWSResultFlags_type0(
			_MWSReturnGraphBytes, true);

	public static final EnumMWSResultFlags_type0 MWSReturnImages = new EnumMWSResultFlags_type0(
			_MWSReturnImages, true);

	public static final EnumMWSResultFlags_type0 MWSGraphImgJPEG = new EnumMWSResultFlags_type0(
			_MWSGraphImgJPEG, true);

	public static final EnumMWSResultFlags_type0 MWSCSVNoMetricsColumn = new EnumMWSResultFlags_type0(
			_MWSCSVNoMetricsColumn, true);

	public static final EnumMWSResultFlags_type0 MWSCSVNoThresholds = new EnumMWSResultFlags_type0(
			_MWSCSVNoThresholds, true);

	public static final EnumMWSResultFlags_type0 MWSCSVNoFormatting = new EnumMWSResultFlags_type0(
			_MWSCSVNoFormatting, true);

	public static final EnumMWSResultFlags_type0 MWSGraphImgBMP = new EnumMWSResultFlags_type0(
			_MWSGraphImgBMP, true);

	public static final EnumMWSResultFlags_type0 MWSGraphImgPNG = new EnumMWSResultFlags_type0(
			_MWSGraphImgPNG, true);

	public static final EnumMWSResultFlags_type0 MWSReturnQueryString = new EnumMWSResultFlags_type0(
			_MWSReturnQueryString, true);

	public static final EnumMWSResultFlags_type0 MWSXMLAsAttachment = new EnumMWSResultFlags_type0(
			_MWSXMLAsAttachment, true);

	public static final EnumMWSResultFlags_type0 MWSReturnAttachmentIndex = new EnumMWSResultFlags_type0(
			_MWSReturnAttachmentIndex, true);

	public static final EnumMWSResultFlags_type0 MWSPDF = new EnumMWSResultFlags_type0(
			_MWSPDF, true);

	public static final EnumMWSResultFlags_type0 MWSExportAll = new EnumMWSResultFlags_type0(
			_MWSExportAll, true);

	public static final EnumMWSResultFlags_type0 MWSExportCurrentPage = new EnumMWSResultFlags_type0(
			_MWSExportCurrentPage, true);

	public static final EnumMWSResultFlags_type0 MWSExportCurrentWindow = new EnumMWSResultFlags_type0(
			_MWSExportCurrentWindow, true);

	public static final EnumMWSResultFlags_type0 MWSExportDefault = new EnumMWSResultFlags_type0(
			_MWSExportDefault, true);

	public static final EnumMWSResultFlags_type0 MWSVisualizationXML = new EnumMWSResultFlags_type0(
			_MWSVisualizationXML, true);

	public static final EnumMWSResultFlags_type0 MWSVisualizationSWF = new EnumMWSResultFlags_type0(
			_MWSVisualizationSWF, true);

	public java.lang.String getValue() {
		return localEnumMWSResultFlags_type0;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSResultFlags_type0.toString();

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
				EnumMWSResultFlags_type0.this.serialize(MY_QNAME, factory,
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
						namespacePrefix + ":EnumMWSResultFlags_type0",
						xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSResultFlags_type0", xmlWriter);
			}
		}

		if (localEnumMWSResultFlags_type0 == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSResultFlags_type0);

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
								.convertToString(localEnumMWSResultFlags_type0) },
				null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSResultFlags_type0 fromValue(java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSResultFlags_type0 enumeration = (EnumMWSResultFlags_type0)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSResultFlags_type0 fromString(
				java.lang.String value, java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSResultFlags_type0 fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSResultFlags_type0.Factory.fromString(content,
						namespaceUri);
			} else {
				return EnumMWSResultFlags_type0.Factory.fromString(content, "");
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
		public static EnumMWSResultFlags_type0 parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSResultFlags_type0 object = null;
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
							object = EnumMWSResultFlags_type0.Factory
									.fromString(content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSResultFlags_type0.Factory
									.fromString(content, "");
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
