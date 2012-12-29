/**
 * MWSBrowseInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSBrowseInfo bean class
 */

public class MWSBrowseInfo implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSBrowseInfo Namespace URI = http://microstrategy.com/webservices/v1_0
	 * Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for ResultSize
	 */

	protected int localResultSize;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getResultSize() {
		return localResultSize;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ResultSize
	 */
	public void setResultSize(int param) {

		this.localResultSize = param;

	}

	/**
	 * field for BrowseID
	 */

	protected java.lang.String localBrowseID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localBrowseIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getBrowseID() {
		return localBrowseID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            BrowseID
	 */
	public void setBrowseID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localBrowseIDTracker = true;
		} else {
			localBrowseIDTracker = false;

		}

		this.localBrowseID = param;

	}

	/**
	 * field for Status
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSBrowseStatus localStatus;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSBrowseStatus
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSBrowseStatus getStatus() {
		return localStatus;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Status
	 */
	public void setStatus(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSBrowseStatus param) {

		this.localStatus = param;

	}

	/**
	 * field for ArrayObjectInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfo localArrayObjectInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localArrayObjectInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfo getArrayObjectInfo() {
		return localArrayObjectInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ArrayObjectInfo
	 */
	public void setArrayObjectInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfo param) {

		if (param != null) {
			// update the setting tracker
			localArrayObjectInfoTracker = true;
		} else {
			localArrayObjectInfoTracker = false;

		}

		this.localArrayObjectInfo = param;

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
				this, parentQName) {

			public void serialize(
					org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
					throws javax.xml.stream.XMLStreamException {
				MWSBrowseInfo.this.serialize(parentQName, factory, xmlWriter);
			}
		};
		return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
				parentQName, factory, dataSource);

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

		java.lang.String prefix = null;
		java.lang.String namespace = null;

		prefix = parentQName.getPrefix();
		namespace = parentQName.getNamespaceURI();

		if ((namespace != null) && (namespace.trim().length() > 0)) {
			java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
			if (writerPrefix != null) {
				xmlWriter.writeStartElement(namespace, parentQName
						.getLocalPart());
			} else {
				if (prefix == null) {
					prefix = generatePrefix(namespace);
				}

				xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(),
						namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);
			}
		} else {
			xmlWriter.writeStartElement(parentQName.getLocalPart());
		}

		if (serializeType) {

			java.lang.String namespacePrefix = registerPrefix(xmlWriter,
					"http://microstrategy.com/webservices/v1_0");
			if ((namespacePrefix != null)
					&& (namespacePrefix.trim().length() > 0)) {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						namespacePrefix + ":MWSBrowseInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSBrowseInfo", xmlWriter);
			}

		}

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "ResultSize", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "ResultSize");
			}

		} else {
			xmlWriter.writeStartElement("ResultSize");
		}

		if (localResultSize == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"ResultSize cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localResultSize));
		}

		xmlWriter.writeEndElement();
		if (localBrowseIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "BrowseID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "BrowseID");
				}

			} else {
				xmlWriter.writeStartElement("BrowseID");
			}

			if (localBrowseID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"BrowseID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localBrowseID);

			}

			xmlWriter.writeEndElement();
		}
		if (localStatus == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"Status cannot be null!!");
		}
		localStatus.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "Status"),
				factory, xmlWriter);
		if (localArrayObjectInfoTracker) {
			if (localArrayObjectInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ArrayObjectInfo cannot be null!!");
			}
			localArrayObjectInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ArrayObjectInfo"), factory, xmlWriter);
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

		java.util.ArrayList elementList = new java.util.ArrayList();
		java.util.ArrayList attribList = new java.util.ArrayList();

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ResultSize"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localResultSize));
		if (localBrowseIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "BrowseID"));

			if (localBrowseID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localBrowseID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"BrowseID cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "Status"));

		if (localStatus == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"Status cannot be null!!");
		}
		elementList.add(localStatus);
		if (localArrayObjectInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ArrayObjectInfo"));

			if (localArrayObjectInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ArrayObjectInfo cannot be null!!");
			}
			elementList.add(localArrayObjectInfo);
		}

		return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(
				qName, elementList.toArray(), attribList.toArray());

	}

	/**
	 * Factory class that keeps the parse method
	 */
	public static class Factory {

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
		public static MWSBrowseInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSBrowseInfo object = new MWSBrowseInfo();

			int event;
			java.lang.String nillableValue = null;
			java.lang.String prefix = "";
			java.lang.String namespaceuri = "";
			try {

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.getAttributeValue(
						"http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
					java.lang.String fullTypeName = reader
							.getAttributeValue(
									"http://www.w3.org/2001/XMLSchema-instance",
									"type");
					if (fullTypeName != null) {
						java.lang.String nsPrefix = null;
						if (fullTypeName.indexOf(":") > -1) {
							nsPrefix = fullTypeName.substring(0, fullTypeName
									.indexOf(":"));
						}
						nsPrefix = nsPrefix == null ? "" : nsPrefix;

						java.lang.String type = fullTypeName
								.substring(fullTypeName.indexOf(":") + 1);

						if (!"MWSBrowseInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSBrowseInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
									.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ResultSize").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setResultSize(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToInt(content));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getLocalName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"BrowseID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setBrowseID(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(content));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"Status").equals(reader.getName())) {

					object
							.setStatus(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSBrowseStatus.Factory
									.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {
					// A start element we are not expecting indicates an invalid
					// parameter was passed
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getLocalName());
				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ArrayObjectInfo").equals(reader.getName())) {

					object
							.setArrayObjectInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfo.Factory
									.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement())
					// A start element we are not expecting indicates a trailing
					// invalid property
					throw new org.apache.axis2.databinding.ADBException(
							"Unexpected subelement " + reader.getLocalName());

			} catch (javax.xml.stream.XMLStreamException e) {
				throw new java.lang.Exception(e);
			}

			return object;
		}

	}// end of factory class

}
