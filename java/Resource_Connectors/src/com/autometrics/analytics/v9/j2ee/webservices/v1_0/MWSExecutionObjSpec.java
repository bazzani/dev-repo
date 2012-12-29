/**
 * MWSExecutionObjSpec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSExecutionObjSpec bean class
 */

public class MWSExecutionObjSpec implements
		org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSExecutionObjSpec Namespace URI =
	 * http://microstrategy.com/webservices/v1_0 Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for ExecObjType
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionObjType localExecObjType;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         EnumMWSExecutionObjType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionObjType getExecObjType() {
		return localExecObjType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ExecObjType
	 */
	public void setExecObjType(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionObjType param) {

		this.localExecObjType = param;

	}

	/**
	 * field for MessageID
	 */

	protected java.lang.String localMessageID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMessageIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMessageID() {
		return localMessageID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MessageID
	 */
	public void setMessageID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localMessageIDTracker = true;
		} else {
			localMessageIDTracker = false;

		}

		this.localMessageID = param;

	}

	/**
	 * field for StateID
	 */

	protected int localStateID;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getStateID() {
		return localStateID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            StateID
	 */
	public void setStateID(int param) {

		this.localStateID = param;

	}

	/**
	 * field for ObjectID
	 */

	protected java.lang.String localObjectID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjectIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjectID() {
		return localObjectID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjectID
	 */
	public void setObjectID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjectIDTracker = true;
		} else {
			localObjectIDTracker = false;

		}

		this.localObjectID = param;

	}

	/**
	 * field for ObjectName
	 */

	protected java.lang.String localObjectName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjectNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjectName() {
		return localObjectName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjectName
	 */
	public void setObjectName(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjectNameTracker = true;
		} else {
			localObjectNameTracker = false;

		}

		this.localObjectName = param;

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
				MWSExecutionObjSpec.this.serialize(parentQName, factory,
						xmlWriter);
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
						namespacePrefix + ":MWSExecutionObjSpec", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSExecutionObjSpec", xmlWriter);
			}

		}

		if (localExecObjType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ExecObjType cannot be null!!");
		}
		localExecObjType.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ExecObjType"),
				factory, xmlWriter);
		if (localMessageIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "MessageID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "MessageID");
				}

			} else {
				xmlWriter.writeStartElement("MessageID");
			}

			if (localMessageID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"MessageID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localMessageID);

			}

			xmlWriter.writeEndElement();
		}
		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "StateID", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "StateID");
			}

		} else {
			xmlWriter.writeStartElement("StateID");
		}

		if (localStateID == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"StateID cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localStateID));
		}

		xmlWriter.writeEndElement();
		if (localObjectIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjectID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjectID");
				}

			} else {
				xmlWriter.writeStartElement("ObjectID");
			}

			if (localObjectID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjectID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjectID);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjectNameTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter
							.writeStartElement(prefix, "ObjectName", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjectName");
				}

			} else {
				xmlWriter.writeStartElement("ObjectName");
			}

			if (localObjectName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjectName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjectName);

			}

			xmlWriter.writeEndElement();
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
				"http://microstrategy.com/webservices/v1_0", "ExecObjType"));

		if (localExecObjType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ExecObjType cannot be null!!");
		}
		elementList.add(localExecObjType);
		if (localMessageIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "MessageID"));

			if (localMessageID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localMessageID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"MessageID cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "StateID"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localStateID));
		if (localObjectIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjectID"));

			if (localObjectID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjectID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjectID cannot be null!!");
			}
		}
		if (localObjectNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjectName"));

			if (localObjectName != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjectName));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjectName cannot be null!!");
			}
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
		public static MWSExecutionObjSpec parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSExecutionObjSpec object = new MWSExecutionObjSpec();

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

						if (!"MWSExecutionObjSpec".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSExecutionObjSpec) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"ExecObjType").equals(reader.getName())) {

					object
							.setExecObjType(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionObjType.Factory
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
								"MessageID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setMessageID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"StateID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setStateID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjectID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjectID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjectName").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjectName(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToString(content));

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
