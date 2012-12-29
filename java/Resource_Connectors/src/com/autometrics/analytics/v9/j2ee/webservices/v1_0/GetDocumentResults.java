/**
 * GetDocumentResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * GetDocumentResults bean class
 */

public class GetDocumentResults implements org.apache.axis2.databinding.ADBBean {

	public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
			"http://microstrategy.com/webservices/v1_0", "GetDocumentResults",
			"ns2");

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
	 * field for SPrompt
	 */

	protected java.lang.String localSPrompt;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSPromptTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSPrompt() {
		return localSPrompt;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SPrompt
	 */
	public void setSPrompt(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localSPromptTracker = true;
		} else {
			localSPromptTracker = false;

		}

		this.localSPrompt = param;

	}

	/**
	 * field for SDocID
	 */

	protected java.lang.String localSDocID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSDocIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSDocID() {
		return localSDocID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SDocID
	 */
	public void setSDocID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localSDocIDTracker = true;
		} else {
			localSDocIDTracker = false;

		}

		this.localSDocID = param;

	}

	/**
	 * field for SMsgID
	 */

	protected java.lang.String localSMsgID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSMsgIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSMsgID() {
		return localSMsgID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SMsgID
	 */
	public void setSMsgID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localSMsgIDTracker = true;
		} else {
			localSMsgIDTracker = false;

		}

		this.localSMsgID = param;

	}

	/**
	 * field for EFlags
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags localEFlags;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags getEFlags() {
		return localEFlags;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EFlags
	 */
	public void setEFlags(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags param) {

		this.localEFlags = param;

	}

	/**
	 * field for ResultsWindow
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsWindow localResultsWindow;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localResultsWindowTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsWindow
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsWindow getResultsWindow() {
		return localResultsWindow;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ResultsWindow
	 */
	public void setResultsWindow(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsWindow param) {

		if (param != null) {
			// update the setting tracker
			localResultsWindowTracker = true;
		} else {
			localResultsWindowTracker = false;

		}

		this.localResultsWindow = param;

	}

	/**
	 * field for EResults
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags localEResults;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags getEResults() {
		return localEResults;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            EResults
	 */
	public void setEResults(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags param) {

		this.localEResults = param;

	}

	/**
	 * field for ESettings
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionSettings localESettings;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localESettingsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionSettings
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionSettings getESettings() {
		return localESettings;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ESettings
	 */
	public void setESettings(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionSettings param) {

		if (param != null) {
			// update the setting tracker
			localESettingsTracker = true;
		} else {
			localESettingsTracker = false;

		}

		this.localESettings = param;

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
				GetDocumentResults.this.serialize(MY_QNAME, factory, xmlWriter);
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
						namespacePrefix + ":GetDocumentResults", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"GetDocumentResults", xmlWriter);
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
		if (localSPromptTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "sPrompt", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "sPrompt");
				}

			} else {
				xmlWriter.writeStartElement("sPrompt");
			}

			if (localSPrompt == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"sPrompt cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localSPrompt);

			}

			xmlWriter.writeEndElement();
		}
		if (localSDocIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "sDocID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "sDocID");
				}

			} else {
				xmlWriter.writeStartElement("sDocID");
			}

			if (localSDocID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"sDocID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localSDocID);

			}

			xmlWriter.writeEndElement();
		}
		if (localSMsgIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "sMsgID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "sMsgID");
				}

			} else {
				xmlWriter.writeStartElement("sMsgID");
			}

			if (localSMsgID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"sMsgID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localSMsgID);

			}

			xmlWriter.writeEndElement();
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
		if (localResultsWindowTracker) {
			if (localResultsWindow == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ResultsWindow cannot be null!!");
			}
			localResultsWindow.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ResultsWindow"), factory, xmlWriter);
		}
		if (localEResults == null) {

			java.lang.String namespace2 = "http://microstrategy.com/webservices/v1_0";

			if (!namespace2.equals("")) {
				java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

				if (prefix2 == null) {
					prefix2 = generatePrefix(namespace2);

					xmlWriter
							.writeStartElement(prefix2, "eResults", namespace2);
					xmlWriter.writeNamespace(prefix2, namespace2);
					xmlWriter.setPrefix(prefix2, namespace2);

				} else {
					xmlWriter.writeStartElement(namespace2, "eResults");
				}

			} else {
				xmlWriter.writeStartElement("eResults");
			}

			// write the nil attribute
			writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
					"nil", "1", xmlWriter);
			xmlWriter.writeEndElement();
		} else {
			localEResults.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eResults"),
					factory, xmlWriter);
		}
		if (localESettingsTracker) {
			if (localESettings == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"eSettings cannot be null!!");
			}
			localESettings.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eSettings"),
					factory, xmlWriter);
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
		if (localSPromptTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "sPrompt"));

			if (localSPrompt != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSPrompt));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"sPrompt cannot be null!!");
			}
		}
		if (localSDocIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "sDocID"));

			if (localSDocID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSDocID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"sDocID cannot be null!!");
			}
		}
		if (localSMsgIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "sMsgID"));

			if (localSMsgID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSMsgID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"sMsgID cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "eFlags"));

		elementList.add(localEFlags == null ? null : localEFlags);
		if (localResultsWindowTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ResultsWindow"));

			if (localResultsWindow == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ResultsWindow cannot be null!!");
			}
			elementList.add(localResultsWindow);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "eResults"));

		elementList.add(localEResults == null ? null : localEResults);
		if (localESettingsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "eSettings"));

			if (localESettings == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"eSettings cannot be null!!");
			}
			elementList.add(localESettings);
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
		public static GetDocumentResults parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			GetDocumentResults object = new GetDocumentResults();

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

						if (!"GetDocumentResults".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (GetDocumentResults) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"sPrompt").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setSPrompt(org.apache.axis2.databinding.utils.ConverterUtil
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
								"sDocID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setSDocID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"sMsgID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setSMsgID(org.apache.axis2.databinding.utils.ConverterUtil
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
								.setEFlags(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags.Factory
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
								"ResultsWindow").equals(reader.getName())) {

					object
							.setResultsWindow(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsWindow.Factory
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
								"eResults").equals(reader.getName())) {

					nillableValue = reader.getAttributeValue(
							"http://www.w3.org/2001/XMLSchema-instance", "nil");
					if ("true".equals(nillableValue)
							|| "1".equals(nillableValue)) {
						object.setEResults(null);
						reader.next();

						reader.next();

					} else {

						object
								.setEResults(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags.Factory
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
								"eSettings").equals(reader.getName())) {

					object
							.setESettings(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecutionSettings.Factory
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
