/**
 * EnumMWSHistoryRequestStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * EnumMWSHistoryRequestStatus bean class
 */

public class EnumMWSHistoryRequestStatus implements
		org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0",
			"EnumMWSHistoryRequestStatus", "ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for EnumMWSHistoryRequestStatus
	 */

	protected java.lang.String localEnumMWSHistoryRequestStatus;

	private static java.util.HashMap _table_ = new java.util.HashMap();

	// Constructor

	protected EnumMWSHistoryRequestStatus(java.lang.String value,
			boolean isRegisterValue) {
		localEnumMWSHistoryRequestStatus = value;
		if (isRegisterValue) {

			_table_.put(localEnumMWSHistoryRequestStatus, this);

		}

	}

	public static final java.lang.String _MWSUnknown = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUnknown");

	public static final java.lang.String _MWSMsgID = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSMsgID");

	public static final java.lang.String _MWSResult = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSResult");

	public static final java.lang.String _MWSPromptXML = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPromptXML");

	public static final java.lang.String _MWSErrMsgXML = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSErrMsgXML");

	public static final java.lang.String _MWSJobRunning = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSJobRunning");

	public static final java.lang.String _MWSInSQLEngine = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSInSQLEngine");

	public static final java.lang.String _MWSInQueryEngine = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSInQueryEngine");

	public static final java.lang.String _MWSInAnalyticalEngine = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSInAnalyticalEngine");

	public static final java.lang.String _MWSInResolution = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSInResolution");

	public static final java.lang.String _MWSWaitingForCache = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSWaitingForCache");

	public static final java.lang.String _MWSUpdatingCache = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSUpdatingCache");

	public static final java.lang.String _MWSWaiting = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSWaiting");

	public static final java.lang.String _MWSWaitingOnGovernor = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSWaitingOnGovernor");

	public static final java.lang.String _MWSWaitingForProject = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSWaitingForProject");

	public static final java.lang.String _MWSWaitingForChildren = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSWaitingForChildren");

	public static final java.lang.String _MWSPreparingOutput = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSPreparingOutput");

	public static final java.lang.String _MWSConstructResult = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSConstructResult");

	public static final java.lang.String _MWSHTMLResult = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSHTMLResult");

	public static final java.lang.String _MWSXMLResult = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSXMLResult");

	public static final java.lang.String _MWSRunningOnOtherNode = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSRunningOnOtherNode");

	public static final java.lang.String _MWSLoadingPrompt = org.apache.axis2.databinding.utils.ConverterUtil
			.convertToString("MWSLoadingPrompt");

	public static final EnumMWSHistoryRequestStatus MWSUnknown = new EnumMWSHistoryRequestStatus(
			_MWSUnknown, true);

	public static final EnumMWSHistoryRequestStatus MWSMsgID = new EnumMWSHistoryRequestStatus(
			_MWSMsgID, true);

	public static final EnumMWSHistoryRequestStatus MWSResult = new EnumMWSHistoryRequestStatus(
			_MWSResult, true);

	public static final EnumMWSHistoryRequestStatus MWSPromptXML = new EnumMWSHistoryRequestStatus(
			_MWSPromptXML, true);

	public static final EnumMWSHistoryRequestStatus MWSErrMsgXML = new EnumMWSHistoryRequestStatus(
			_MWSErrMsgXML, true);

	public static final EnumMWSHistoryRequestStatus MWSJobRunning = new EnumMWSHistoryRequestStatus(
			_MWSJobRunning, true);

	public static final EnumMWSHistoryRequestStatus MWSInSQLEngine = new EnumMWSHistoryRequestStatus(
			_MWSInSQLEngine, true);

	public static final EnumMWSHistoryRequestStatus MWSInQueryEngine = new EnumMWSHistoryRequestStatus(
			_MWSInQueryEngine, true);

	public static final EnumMWSHistoryRequestStatus MWSInAnalyticalEngine = new EnumMWSHistoryRequestStatus(
			_MWSInAnalyticalEngine, true);

	public static final EnumMWSHistoryRequestStatus MWSInResolution = new EnumMWSHistoryRequestStatus(
			_MWSInResolution, true);

	public static final EnumMWSHistoryRequestStatus MWSWaitingForCache = new EnumMWSHistoryRequestStatus(
			_MWSWaitingForCache, true);

	public static final EnumMWSHistoryRequestStatus MWSUpdatingCache = new EnumMWSHistoryRequestStatus(
			_MWSUpdatingCache, true);

	public static final EnumMWSHistoryRequestStatus MWSWaiting = new EnumMWSHistoryRequestStatus(
			_MWSWaiting, true);

	public static final EnumMWSHistoryRequestStatus MWSWaitingOnGovernor = new EnumMWSHistoryRequestStatus(
			_MWSWaitingOnGovernor, true);

	public static final EnumMWSHistoryRequestStatus MWSWaitingForProject = new EnumMWSHistoryRequestStatus(
			_MWSWaitingForProject, true);

	public static final EnumMWSHistoryRequestStatus MWSWaitingForChildren = new EnumMWSHistoryRequestStatus(
			_MWSWaitingForChildren, true);

	public static final EnumMWSHistoryRequestStatus MWSPreparingOutput = new EnumMWSHistoryRequestStatus(
			_MWSPreparingOutput, true);

	public static final EnumMWSHistoryRequestStatus MWSConstructResult = new EnumMWSHistoryRequestStatus(
			_MWSConstructResult, true);

	public static final EnumMWSHistoryRequestStatus MWSHTMLResult = new EnumMWSHistoryRequestStatus(
			_MWSHTMLResult, true);

	public static final EnumMWSHistoryRequestStatus MWSXMLResult = new EnumMWSHistoryRequestStatus(
			_MWSXMLResult, true);

	public static final EnumMWSHistoryRequestStatus MWSRunningOnOtherNode = new EnumMWSHistoryRequestStatus(
			_MWSRunningOnOtherNode, true);

	public static final EnumMWSHistoryRequestStatus MWSLoadingPrompt = new EnumMWSHistoryRequestStatus(
			_MWSLoadingPrompt, true);

	public java.lang.String getValue() {
		return localEnumMWSHistoryRequestStatus;
	}

	public boolean equals(java.lang.Object obj) {
		return (obj == this);
	}

	public int hashCode() {
		return toString().hashCode();
	}

	public java.lang.String toString() {

		return localEnumMWSHistoryRequestStatus.toString();

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
				EnumMWSHistoryRequestStatus.this.serialize(MY_QNAME, factory,
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
						namespacePrefix + ":EnumMWSHistoryRequestStatus",
						xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"EnumMWSHistoryRequestStatus", xmlWriter);
			}
		}

		if (localEnumMWSHistoryRequestStatus == null) {

			throw new org.apache.axis2.databinding.ADBException(
					"Value cannot be null !!");

		} else {

			xmlWriter.writeCharacters(localEnumMWSHistoryRequestStatus);

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
								.convertToString(localEnumMWSHistoryRequestStatus) },
				null);

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

		public static EnumMWSHistoryRequestStatus fromValue(
				java.lang.String value)
				throws java.lang.IllegalArgumentException {
			EnumMWSHistoryRequestStatus enumeration = (EnumMWSHistoryRequestStatus)

			_table_.get(value);

			if (enumeration == null)
				throw new java.lang.IllegalArgumentException();
			return enumeration;
		}

		public static EnumMWSHistoryRequestStatus fromString(
				java.lang.String value, java.lang.String namespaceURI)
				throws java.lang.IllegalArgumentException {
			try {

				return fromValue(org.apache.axis2.databinding.utils.ConverterUtil
						.convertToString(value));

			} catch (java.lang.Exception e) {
				throw new java.lang.IllegalArgumentException();
			}
		}

		public static EnumMWSHistoryRequestStatus fromString(
				javax.xml.stream.XMLStreamReader xmlStreamReader,
				java.lang.String content) {
			if (content.indexOf(":") > -1) {
				java.lang.String prefix = content.substring(0, content
						.indexOf(":"));
				java.lang.String namespaceUri = xmlStreamReader
						.getNamespaceContext().getNamespaceURI(prefix);
				return EnumMWSHistoryRequestStatus.Factory.fromString(content,
						namespaceUri);
			} else {
				return EnumMWSHistoryRequestStatus.Factory.fromString(content,
						"");
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
		public static EnumMWSHistoryRequestStatus parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			EnumMWSHistoryRequestStatus object = null;
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
							object = EnumMWSHistoryRequestStatus.Factory
									.fromString(content, namespaceuri);
						} else {
							// this seems to be not a qname send and empty
							// namespace incase of it is
							// check is done in fromString method
							object = EnumMWSHistoryRequestStatus.Factory
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
