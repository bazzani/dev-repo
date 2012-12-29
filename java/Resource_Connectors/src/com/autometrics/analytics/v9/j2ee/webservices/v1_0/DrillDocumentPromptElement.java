/**
 * DrillDocumentPromptElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * DrillDocumentPromptElement bean class
 */

public class DrillDocumentPromptElement implements
		org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0",
			"DrillDocumentPromptElement", "ns2");

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for CInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSConnectInfo localCInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localCInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSConnectInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSConnectInfo getCInfo() {
		return localCInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            CInfo
	 */
	public void setCInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSConnectInfo param) {

		if (param != null) {
			// update the setting tracker
			localCInfoTracker = true;
		} else {
			localCInfoTracker = false;

		}

		this.localCInfo = param;

	}

	/**
	 * field for OSpec
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionObjSpec localOSpec;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOSpecTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionObjSpec
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionObjSpec getOSpec() {
		return localOSpec;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OSpec
	 */
	public void setOSpec(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionObjSpec param) {

		if (param != null) {
			// update the setting tracker
			localOSpecTracker = true;
		} else {
			localOSpecTracker = false;

		}

		this.localOSpec = param;

	}

	/**
	 * field for PromptKey
	 */

	protected java.lang.String localPromptKey;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPromptKeyTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPromptKey() {
		return localPromptKey;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PromptKey
	 */
	public void setPromptKey(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localPromptKeyTracker = true;
		} else {
			localPromptKeyTracker = false;

		}

		this.localPromptKey = param;

	}

	/**
	 * field for FromElementFilters
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyElementFilter localFromElementFilters;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFromElementFiltersTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSHierarchyElementFilter
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyElementFilter getFromElementFilters() {
		return localFromElementFilters;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FromElementFilters
	 */
	public void setFromElementFilters(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyElementFilter param) {

		if (param != null) {
			// update the setting tracker
			localFromElementFiltersTracker = true;
		} else {
			localFromElementFiltersTracker = false;

		}

		this.localFromElementFilters = param;

	}

	/**
	 * field for ToAttributeInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSHierarchyAttributeInfo localToAttributeInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localToAttributeInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         MWSHierarchyAttributeInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSHierarchyAttributeInfo getToAttributeInfo() {
		return localToAttributeInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ToAttributeInfo
	 */
	public void setToAttributeInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSHierarchyAttributeInfo param) {

		if (param != null) {
			// update the setting tracker
			localToAttributeInfoTracker = true;
		} else {
			localToAttributeInfoTracker = false;

		}

		this.localToAttributeInfo = param;

	}

	/**
	 * field for ArrayRestrictions
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSElementRestriction localArrayRestrictions;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localArrayRestrictionsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSElementRestriction
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSElementRestriction getArrayRestrictions() {
		return localArrayRestrictions;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ArrayRestrictions
	 */
	public void setArrayRestrictions(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSElementRestriction param) {

		if (param != null) {
			// update the setting tracker
			localArrayRestrictionsTracker = true;
		} else {
			localArrayRestrictionsTracker = false;

		}

		this.localArrayRestrictions = param;

	}

	/**
	 * field for EFlags
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSElementSourceFlags localEFlags;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         EnumMWSElementSourceFlags
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSElementSourceFlags getEFlags() {
		return localEFlags;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EFlags
	 */
	public void setEFlags(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSElementSourceFlags param) {

		this.localEFlags = param;

	}

	/**
	 * field for IBlockBegin
	 */

	protected int localIBlockBegin;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getIBlockBegin() {
		return localIBlockBegin;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IBlockBegin
	 */
	public void setIBlockBegin(int param) {

		this.localIBlockBegin = param;

	}

	/**
	 * field for IBlockCount
	 */

	protected int localIBlockCount;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getIBlockCount() {
		return localIBlockCount;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IBlockCount
	 */
	public void setIBlockCount(int param) {

		this.localIBlockCount = param;

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
				DrillDocumentPromptElement.this.serialize(MY_QNAME, factory,
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
						namespacePrefix + ":DrillDocumentPromptElement",
						xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"DrillDocumentPromptElement", xmlWriter);
			}

		}
		if (localCInfoTracker) {
			if (localCInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"cInfo cannot be null!!");
			}
			localCInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "cInfo"),
					factory, xmlWriter);
		}
		if (localOSpecTracker) {
			if (localOSpec == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"oSpec cannot be null!!");
			}
			localOSpec.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "oSpec"),
					factory, xmlWriter);
		}
		if (localPromptKeyTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "promptKey", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "promptKey");
				}

			} else {
				xmlWriter.writeStartElement("promptKey");
			}

			if (localPromptKey == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"promptKey cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localPromptKey);

			}

			xmlWriter.writeEndElement();
		}
		if (localFromElementFiltersTracker) {
			if (localFromElementFilters == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"fromElementFilters cannot be null!!");
			}
			localFromElementFilters.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"fromElementFilters"), factory, xmlWriter);
		}
		if (localToAttributeInfoTracker) {
			if (localToAttributeInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"toAttributeInfo cannot be null!!");
			}
			localToAttributeInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"toAttributeInfo"), factory, xmlWriter);
		}
		if (localArrayRestrictionsTracker) {
			if (localArrayRestrictions == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"arrayRestrictions cannot be null!!");
			}
			localArrayRestrictions.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"arrayRestrictions"), factory, xmlWriter);
		}
		if (localEFlags == null) {

			java.lang.String namespace2 = "http://microstrategy.com/webservices/v1_0";

			if (!namespace2.equals("")) {
				java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

				if (prefix2 == null) {
					prefix2 = generatePrefix(namespace2);

					xmlWriter.writeStartElement(prefix2, "eFlags", namespace2);
					xmlWriter.writeNamespace(prefix2, namespace2);
					xmlWriter.setPrefix(prefix2, namespace2);

				} else {
					xmlWriter.writeStartElement(namespace2, "eFlags");
				}

			} else {
				xmlWriter.writeStartElement("eFlags");
			}

			// write the nil attribute
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);
			xmlWriter.writeEndElement();
		} else {
			localEFlags.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eFlags"),
					factory, xmlWriter);
		}

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "iBlockBegin", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "iBlockBegin");
			}

		} else {
			xmlWriter.writeStartElement("iBlockBegin");
		}

		if (localIBlockBegin == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"iBlockBegin cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localIBlockBegin));
		}

		xmlWriter.writeEndElement();

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "iBlockCount", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "iBlockCount");
			}

		} else {
			xmlWriter.writeStartElement("iBlockCount");
		}

		if (localIBlockCount == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"iBlockCount cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localIBlockCount));
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

		if (localCInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "cInfo"));

			if (localCInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"cInfo cannot be null!!");
			}
			elementList.add(localCInfo);
		}
		if (localOSpecTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "oSpec"));

			if (localOSpec == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"oSpec cannot be null!!");
			}
			elementList.add(localOSpec);
		}
		if (localPromptKeyTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "promptKey"));

			if (localPromptKey != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localPromptKey));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"promptKey cannot be null!!");
			}
		}
		if (localFromElementFiltersTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"fromElementFilters"));

			if (localFromElementFilters == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"fromElementFilters cannot be null!!");
			}
			elementList.add(localFromElementFilters);
		}
		if (localToAttributeInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"toAttributeInfo"));

			if (localToAttributeInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"toAttributeInfo cannot be null!!");
			}
			elementList.add(localToAttributeInfo);
		}
		if (localArrayRestrictionsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"arrayRestrictions"));

			if (localArrayRestrictions == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"arrayRestrictions cannot be null!!");
			}
			elementList.add(localArrayRestrictions);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "eFlags"));

		elementList.add(localEFlags == null ? null : localEFlags);

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "iBlockBegin"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localIBlockBegin));

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "iBlockCount"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localIBlockCount));

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
		public static DrillDocumentPromptElement parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			DrillDocumentPromptElement object = new DrillDocumentPromptElement();

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

						if (!"DrillDocumentPromptElement".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (DrillDocumentPromptElement) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"cInfo").equals(reader.getName())) {

					object
							.setCInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSConnectInfo.Factory
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
								"oSpec").equals(reader.getName())) {

					object
							.setOSpec(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionObjSpec.Factory
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
								"promptKey").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setPromptKey(org.apache.axis2.databinding.utils.ConverterUtil
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
								"fromElementFilters").equals(reader.getName())) {

					object
							.setFromElementFilters(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSHierarchyElementFilter.Factory
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
								"toAttributeInfo").equals(reader.getName())) {

					object
							.setToAttributeInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSHierarchyAttributeInfo.Factory
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
								"arrayRestrictions").equals(reader.getName())) {

					object
							.setArrayRestrictions(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSElementRestriction.Factory
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
								"eFlags").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						object.setEFlags(null);
						reader.next();

						reader.next();

					} else {

						object
								.setEFlags(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSElementSourceFlags.Factory
										.parse(reader));

						reader.next();
					}
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
								"iBlockBegin").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setIBlockBegin(org.apache.axis2.databinding.utils.ConverterUtil
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
								"iBlockCount").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setIBlockCount(org.apache.axis2.databinding.utils.ConverterUtil
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
