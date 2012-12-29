/**
 * ExecuteIncrementalBrowse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * ExecuteIncrementalBrowse bean class
 */

public class ExecuteIncrementalBrowse implements
		org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0",
			"ExecuteIncrementalBrowse", "ns2");

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
	 * field for ARestricts
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSRestriction localARestricts;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localARestrictsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSRestriction
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSRestriction getARestricts() {
		return localARestricts;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ARestricts
	 */
	public void setARestricts(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSRestriction param) {

		if (param != null) {
			// update the setting tracker
			localARestrictsTracker = true;
		} else {
			localARestrictsTracker = false;

		}

		this.localARestricts = param;

	}

	/**
	 * field for EType
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjectType localEType;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localETypeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfEnumMWSObjectType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjectType getEType() {
		return localEType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EType
	 */
	public void setEType(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjectType param) {

		if (param != null) {
			// update the setting tracker
			localETypeTracker = true;
		} else {
			localETypeTracker = false;

		}

		this.localEType = param;

	}

	/**
	 * field for EStype
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjSubType localEStype;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localEStypeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfEnumMWSObjSubType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjSubType getEStype() {
		return localEStype;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EStype
	 */
	public void setEStype(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjSubType param) {

		if (param != null) {
			// update the setting tracker
			localEStypeTracker = true;
		} else {
			localEStypeTracker = false;

		}

		this.localEStype = param;

	}

	/**
	 * field for EFlags
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSSearchFlags localEFlags;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSSearchFlags
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSSearchFlags getEFlags() {
		return localEFlags;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EFlags
	 */
	public void setEFlags(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSSearchFlags param) {

		this.localEFlags = param;

	}

	/**
	 * field for ASyncSettings
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSSyncCommunicationSetting localASyncSettings;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localASyncSettingsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSSyncCommunicationSetting
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSSyncCommunicationSetting getASyncSettings() {
		return localASyncSettings;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ASyncSettings
	 */
	public void setASyncSettings(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSSyncCommunicationSetting param) {

		if (param != null) {
			// update the setting tracker
			localASyncSettingsTracker = true;
		} else {
			localASyncSettingsTracker = false;

		}

		this.localASyncSettings = param;

	}

	/**
	 * field for IStartIndex
	 */

	protected int localIStartIndex;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getIStartIndex() {
		return localIStartIndex;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            IStartIndex
	 */
	public void setIStartIndex(int param) {

		this.localIStartIndex = param;

	}

	/**
	 * field for ICount
	 */

	protected int localICount;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getICount() {
		return localICount;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ICount
	 */
	public void setICount(int param) {

		this.localICount = param;

	}

	/**
	 * field for PropSetSpecs
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySetSpec localPropSetSpecs;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPropSetSpecsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSObjectInfoPropertySetSpec
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySetSpec getPropSetSpecs() {
		return localPropSetSpecs;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PropSetSpecs
	 */
	public void setPropSetSpecs(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySetSpec param) {

		if (param != null) {
			// update the setting tracker
			localPropSetSpecsTracker = true;
		} else {
			localPropSetSpecsTracker = false;

		}

		this.localPropSetSpecs = param;

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
				ExecuteIncrementalBrowse.this.serialize(MY_QNAME, factory,
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
						namespacePrefix + ":ExecuteIncrementalBrowse",
						xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"ExecuteIncrementalBrowse", xmlWriter);
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
		if (localARestrictsTracker) {
			if (localARestricts == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"aRestricts cannot be null!!");
			}
			localARestricts.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "aRestricts"),
					factory, xmlWriter);
		}
		if (localETypeTracker) {
			if (localEType == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"eType cannot be null!!");
			}
			localEType.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eType"),
					factory, xmlWriter);
		}
		if (localEStypeTracker) {
			if (localEStype == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"eStype cannot be null!!");
			}
			localEStype.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eStype"),
					factory, xmlWriter);
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
		if (localASyncSettingsTracker) {
			if (localASyncSettings == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"aSyncSettings cannot be null!!");
			}
			localASyncSettings.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"aSyncSettings"), factory, xmlWriter);
		}
		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "iStartIndex", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "iStartIndex");
			}

		} else {
			xmlWriter.writeStartElement("iStartIndex");
		}

		if (localIStartIndex == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"iStartIndex cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localIStartIndex));
		}

		xmlWriter.writeEndElement();

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "iCount", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "iCount");
			}

		} else {
			xmlWriter.writeStartElement("iCount");
		}

		if (localICount == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"iCount cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localICount));
		}

		xmlWriter.writeEndElement();
		if (localPropSetSpecsTracker) {
			if (localPropSetSpecs == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"propSetSpecs cannot be null!!");
			}
			localPropSetSpecs.serialize(
					new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"propSetSpecs"), factory, xmlWriter);
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

		if (localCInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "cInfo"));

			if (localCInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"cInfo cannot be null!!");
			}
			elementList.add(localCInfo);
		}
		if (localARestrictsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "aRestricts"));

			if (localARestricts == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"aRestricts cannot be null!!");
			}
			elementList.add(localARestricts);
		}
		if (localETypeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eType"));

			if (localEType == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"eType cannot be null!!");
			}
			elementList.add(localEType);
		}
		if (localEStypeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eStype"));

			if (localEStype == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"eStype cannot be null!!");
			}
			elementList.add(localEStype);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "eFlags"));

		elementList.add(localEFlags == null ? null : localEFlags);
		if (localASyncSettingsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"aSyncSettings"));

			if (localASyncSettings == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"aSyncSettings cannot be null!!");
			}
			elementList.add(localASyncSettings);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "iStartIndex"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localIStartIndex));

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "iCount"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localICount));
		if (localPropSetSpecsTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"propSetSpecs"));

			if (localPropSetSpecs == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"propSetSpecs cannot be null!!");
			}
			elementList.add(localPropSetSpecs);
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
		public static ExecuteIncrementalBrowse parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			ExecuteIncrementalBrowse object = new ExecuteIncrementalBrowse();

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

						if (!"ExecuteIncrementalBrowse".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (ExecuteIncrementalBrowse) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"aRestricts").equals(reader.getName())) {

					object
							.setARestricts(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSRestriction.Factory
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
								"eType").equals(reader.getName())) {

					object
							.setEType(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjectType.Factory
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
								"eStype").equals(reader.getName())) {

					object
							.setEStype(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfEnumMWSObjSubType.Factory
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
								.setEFlags(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSSearchFlags.Factory
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
								"aSyncSettings").equals(reader.getName())) {

					object
							.setASyncSettings(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSSyncCommunicationSetting.Factory
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
								"iStartIndex").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setIStartIndex(org.apache.axis2.databinding.utils.ConverterUtil
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
								"iCount").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setICount(org.apache.axis2.databinding.utils.ConverterUtil
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
								"propSetSpecs").equals(reader.getName())) {

					object
							.setPropSetSpecs(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySetSpec.Factory
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
