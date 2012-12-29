/**
 * MWSHierarchyAttributeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSHierarchyAttributeInfo bean class
 */

public class MWSHierarchyAttributeInfo implements
		org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSHierarchyAttributeInfo Namespace URI =
	 * http://microstrategy.com/webservices/v1_0 Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for HierarchyName
	 */

	protected java.lang.String localHierarchyName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localHierarchyNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getHierarchyName() {
		return localHierarchyName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            HierarchyName
	 */
	public void setHierarchyName(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localHierarchyNameTracker = true;
		} else {
			localHierarchyNameTracker = false;

		}

		this.localHierarchyName = param;

	}

	/**
	 * field for HierarchyID
	 */

	protected java.lang.String localHierarchyID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localHierarchyIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getHierarchyID() {
		return localHierarchyID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            HierarchyID
	 */
	public void setHierarchyID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localHierarchyIDTracker = true;
		} else {
			localHierarchyIDTracker = false;

		}

		this.localHierarchyID = param;

	}

	/**
	 * field for AttributeName
	 */

	protected java.lang.String localAttributeName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAttributeNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAttributeName() {
		return localAttributeName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AttributeName
	 */
	public void setAttributeName(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localAttributeNameTracker = true;
		} else {
			localAttributeNameTracker = false;

		}

		this.localAttributeName = param;

	}

	/**
	 * field for AttributeID
	 */

	protected java.lang.String localAttributeID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAttributeIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAttributeID() {
		return localAttributeID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AttributeID
	 */
	public void setAttributeID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localAttributeIDTracker = true;
		} else {
			localAttributeIDTracker = false;

		}

		this.localAttributeID = param;

	}

	/**
	 * field for ArrayAttributeForms
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyAttributeFormInfo localArrayAttributeForms;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localArrayAttributeFormsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSHierarchyAttributeFormInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyAttributeFormInfo getArrayAttributeForms() {
		return localArrayAttributeForms;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ArrayAttributeForms
	 */
	public void setArrayAttributeForms(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyAttributeFormInfo param) {

		if (param != null) {
			// update the setting tracker
			localArrayAttributeFormsTracker = true;
		} else {
			localArrayAttributeFormsTracker = false;

		}

		this.localArrayAttributeForms = param;

	}

	/**
	 * field for LockInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSAttributeLockInfo localLockInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLockInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSAttributeLockInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSAttributeLockInfo getLockInfo() {
		return localLockInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LockInfo
	 */
	public void setLockInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSAttributeLockInfo param) {

		if (param != null) {
			// update the setting tracker
			localLockInfoTracker = true;
		} else {
			localLockInfoTracker = false;

		}

		this.localLockInfo = param;

	}

	/**
	 * field for EntryPoint
	 */

	protected boolean localEntryPoint;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getEntryPoint() {
		return localEntryPoint;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EntryPoint
	 */
	public void setEntryPoint(boolean param) {

		this.localEntryPoint = param;

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
				MWSHierarchyAttributeInfo.this.serialize(parentQName, factory,
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
						namespacePrefix + ":MWSHierarchyAttributeInfo",
						xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSHierarchyAttributeInfo", xmlWriter);
			}

		}
		if (localHierarchyNameTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "HierarchyName",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "HierarchyName");
				}

			} else {
				xmlWriter.writeStartElement("HierarchyName");
			}

			if (localHierarchyName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"HierarchyName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localHierarchyName);

			}

			xmlWriter.writeEndElement();
		}
		if (localHierarchyIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "HierarchyID",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "HierarchyID");
				}

			} else {
				xmlWriter.writeStartElement("HierarchyID");
			}

			if (localHierarchyID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"HierarchyID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localHierarchyID);

			}

			xmlWriter.writeEndElement();
		}
		if (localAttributeNameTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "AttributeName",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "AttributeName");
				}

			} else {
				xmlWriter.writeStartElement("AttributeName");
			}

			if (localAttributeName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"AttributeName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localAttributeName);

			}

			xmlWriter.writeEndElement();
		}
		if (localAttributeIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "AttributeID",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "AttributeID");
				}

			} else {
				xmlWriter.writeStartElement("AttributeID");
			}

			if (localAttributeID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"AttributeID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localAttributeID);

			}

			xmlWriter.writeEndElement();
		}
		if (localArrayAttributeFormsTracker) {
			if (localArrayAttributeForms == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ArrayAttributeForms cannot be null!!");
			}
			localArrayAttributeForms.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ArrayAttributeForms"), factory, xmlWriter);
		}
		if (localLockInfoTracker) {
			if (localLockInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"LockInfo cannot be null!!");
			}
			localLockInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "LockInfo"),
					factory, xmlWriter);
		}
		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "EntryPoint", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "EntryPoint");
			}

		} else {
			xmlWriter.writeStartElement("EntryPoint");
		}

		if (false) {

			throw new org.apache.axis2.databinding.ADBException(
					"EntryPoint cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localEntryPoint));
		}

		xmlWriter.writeEndElement();

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

		if (localHierarchyNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"HierarchyName"));

			if (localHierarchyName != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localHierarchyName));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"HierarchyName cannot be null!!");
			}
		}
		if (localHierarchyIDTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"HierarchyID"));

			if (localHierarchyID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localHierarchyID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"HierarchyID cannot be null!!");
			}
		}
		if (localAttributeNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"AttributeName"));

			if (localAttributeName != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAttributeName));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"AttributeName cannot be null!!");
			}
		}
		if (localAttributeIDTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"AttributeID"));

			if (localAttributeID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localAttributeID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"AttributeID cannot be null!!");
			}
		}
		if (localArrayAttributeFormsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ArrayAttributeForms"));

			if (localArrayAttributeForms == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ArrayAttributeForms cannot be null!!");
			}
			elementList.add(localArrayAttributeForms);
		}
		if (localLockInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "LockInfo"));

			if (localLockInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"LockInfo cannot be null!!");
			}
			elementList.add(localLockInfo);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "EntryPoint"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localEntryPoint));

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
		public static MWSHierarchyAttributeInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSHierarchyAttributeInfo object = new MWSHierarchyAttributeInfo();

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

						if (!"MWSHierarchyAttributeInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSHierarchyAttributeInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"HierarchyName").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setHierarchyName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"HierarchyID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setHierarchyID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"AttributeName").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setAttributeName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"AttributeID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setAttributeID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ArrayAttributeForms").equals(reader.getName())) {

					object
							.setArrayAttributeForms(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyAttributeFormInfo.Factory
									.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"LockInfo").equals(reader.getName())) {

					object
							.setLockInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSAttributeLockInfo.Factory
									.parse(reader));

					reader.next();

				} // End of if for expected property start element

				else {

				}

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"EntryPoint").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setEntryPoint(org.apache.axis2.databinding.utils.ConverterUtil
									.convertToBoolean(content));

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
