/**
 * MWSHistoryInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSHistoryInfo bean class
 */

public class MWSHistoryInfo implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSHistoryInfo Namespace URI = http://microstrategy.com/webservices/v1_0
	 * Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for ObjName
	 */

	protected java.lang.String localObjName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjName() {
		return localObjName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjName
	 */
	public void setObjName(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjNameTracker = true;
		} else {
			localObjNameTracker = false;

		}

		this.localObjName = param;

	}

	/**
	 * field for ObjID
	 */

	protected java.lang.String localObjID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjID() {
		return localObjID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjID
	 */
	public void setObjID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjIDTracker = true;
		} else {
			localObjIDTracker = false;

		}

		this.localObjID = param;

	}

	/**
	 * field for ObjDescription
	 */

	protected java.lang.String localObjDescription;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjDescriptionTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjDescription() {
		return localObjDescription;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjDescription
	 */
	public void setObjDescription(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjDescriptionTracker = true;
		} else {
			localObjDescriptionTracker = false;

		}

		this.localObjDescription = param;

	}

	/**
	 * field for Status
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryRequestStatus localStatus;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         EnumMWSHistoryRequestStatus
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryRequestStatus getStatus() {
		return localStatus;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Status
	 */
	public void setStatus(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryRequestStatus param) {

		this.localStatus = param;

	}

	/**
	 * field for FolderName
	 */

	protected java.lang.String localFolderName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFolderNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getFolderName() {
		return localFolderName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FolderName
	 */
	public void setFolderName(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localFolderNameTracker = true;
		} else {
			localFolderNameTracker = false;

		}

		this.localFolderName = param;

	}

	/**
	 * field for MessageText
	 */

	protected java.lang.String localMessageText;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMessageTextTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMessageText() {
		return localMessageText;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MessageText
	 */
	public void setMessageText(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localMessageTextTracker = true;
		} else {
			localMessageTextTracker = false;

		}

		this.localMessageText = param;

	}

	/**
	 * field for StartTime
	 */

	protected java.lang.String localStartTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localStartTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getStartTime() {
		return localStartTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            StartTime
	 */
	public void setStartTime(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localStartTimeTracker = true;
		} else {
			localStartTimeTracker = false;

		}

		this.localStartTime = param;

	}

	/**
	 * field for FinishTime
	 */

	protected java.lang.String localFinishTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFinishTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getFinishTime() {
		return localFinishTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            FinishTime
	 */
	public void setFinishTime(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localFinishTimeTracker = true;
		} else {
			localFinishTimeTracker = false;

		}

		this.localFinishTime = param;

	}

	/**
	 * field for LastUpdateTime
	 */

	protected java.lang.String localLastUpdateTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLastUpdateTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getLastUpdateTime() {
		return localLastUpdateTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            LastUpdateTime
	 */
	public void setLastUpdateTime(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localLastUpdateTimeTracker = true;
		} else {
			localLastUpdateTimeTracker = false;

		}

		this.localLastUpdateTime = param;

	}

	/**
	 * field for MsgID
	 */

	protected java.lang.String localMsgID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMsgIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getMsgID() {
		return localMsgID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MsgID
	 */
	public void setMsgID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localMsgIDTracker = true;
		} else {
			localMsgIDTracker = false;

		}

		this.localMsgID = param;

	}

	/**
	 * field for ObjectInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSObjectInfo localObjectInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjectInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSObjectInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSObjectInfo getObjectInfo() {
		return localObjectInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjectInfo
	 */
	public void setObjectInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSObjectInfo param) {

		if (param != null) {
			// update the setting tracker
			localObjectInfoTracker = true;
		} else {
			localObjectInfoTracker = false;

		}

		this.localObjectInfo = param;

	}

	/**
	 * field for MessageStatus
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryMessageStatus localMessageStatus;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMessageStatusTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         EnumMWSHistoryMessageStatus
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryMessageStatus getMessageStatus() {
		return localMessageStatus;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MessageStatus
	 */
	public void setMessageStatus(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryMessageStatus param) {

		if (param != null) {
			// update the setting tracker
			localMessageStatusTracker = true;
		} else {
			localMessageStatusTracker = false;

		}

		this.localMessageStatus = param;

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
				MWSHistoryInfo.this.serialize(parentQName, factory, xmlWriter);
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
						namespacePrefix + ":MWSHistoryInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSHistoryInfo", xmlWriter);
			}

		}
		if (localObjNameTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjName", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjName");
				}

			} else {
				xmlWriter.writeStartElement("ObjName");
			}

			if (localObjName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjName);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjID");
				}

			} else {
				xmlWriter.writeStartElement("ObjID");
			}

			if (localObjID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjID);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjDescriptionTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjDescription",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjDescription");
				}

			} else {
				xmlWriter.writeStartElement("ObjDescription");
			}

			if (localObjDescription == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjDescription cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjDescription);

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
		if (localFolderNameTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter
							.writeStartElement(prefix, "FolderName", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "FolderName");
				}

			} else {
				xmlWriter.writeStartElement("FolderName");
			}

			if (localFolderName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"FolderName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localFolderName);

			}

			xmlWriter.writeEndElement();
		}
		if (localMessageTextTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "MessageText",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "MessageText");
				}

			} else {
				xmlWriter.writeStartElement("MessageText");
			}

			if (localMessageText == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"MessageText cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localMessageText);

			}

			xmlWriter.writeEndElement();
		}
		if (localStartTimeTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "StartTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "StartTime");
				}

			} else {
				xmlWriter.writeStartElement("StartTime");
			}

			if (localStartTime == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"StartTime cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localStartTime);

			}

			xmlWriter.writeEndElement();
		}
		if (localFinishTimeTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter
							.writeStartElement(prefix, "FinishTime", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "FinishTime");
				}

			} else {
				xmlWriter.writeStartElement("FinishTime");
			}

			if (localFinishTime == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"FinishTime cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localFinishTime);

			}

			xmlWriter.writeEndElement();
		}
		if (localLastUpdateTimeTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "LastUpdateTime",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "LastUpdateTime");
				}

			} else {
				xmlWriter.writeStartElement("LastUpdateTime");
			}

			if (localLastUpdateTime == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"LastUpdateTime cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localLastUpdateTime);

			}

			xmlWriter.writeEndElement();
		}
		if (localMsgIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "MsgID", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "MsgID");
				}

			} else {
				xmlWriter.writeStartElement("MsgID");
			}

			if (localMsgID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"MsgID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localMsgID);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjectInfoTracker) {
			if (localObjectInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjectInfo cannot be null!!");
			}
			localObjectInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjectInfo"),
					factory, xmlWriter);
		}
		if (localMessageStatusTracker) {
			if (localMessageStatus == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"MessageStatus cannot be null!!");
			}
			localMessageStatus.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"MessageStatus"), factory, xmlWriter);
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

		if (localObjNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjName"));

			if (localObjName != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjName));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjName cannot be null!!");
			}
		}
		if (localObjIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjID"));

			if (localObjID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjID cannot be null!!");
			}
		}
		if (localObjDescriptionTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ObjDescription"));

			if (localObjDescription != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjDescription));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjDescription cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "Status"));

		if (localStatus == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"Status cannot be null!!");
		}
		elementList.add(localStatus);
		if (localFolderNameTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "FolderName"));

			if (localFolderName != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localFolderName));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"FolderName cannot be null!!");
			}
		}
		if (localMessageTextTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"MessageText"));

			if (localMessageText != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localMessageText));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"MessageText cannot be null!!");
			}
		}
		if (localStartTimeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "StartTime"));

			if (localStartTime != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localStartTime));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"StartTime cannot be null!!");
			}
		}
		if (localFinishTimeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "FinishTime"));

			if (localFinishTime != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localFinishTime));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"FinishTime cannot be null!!");
			}
		}
		if (localLastUpdateTimeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"LastUpdateTime"));

			if (localLastUpdateTime != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localLastUpdateTime));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"LastUpdateTime cannot be null!!");
			}
		}
		if (localMsgIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "MsgID"));

			if (localMsgID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localMsgID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"MsgID cannot be null!!");
			}
		}
		if (localObjectInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjectInfo"));

			if (localObjectInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjectInfo cannot be null!!");
			}
			elementList.add(localObjectInfo);
		}
		if (localMessageStatusTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"MessageStatus"));

			if (localMessageStatus == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"MessageStatus cannot be null!!");
			}
			elementList.add(localMessageStatus);
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
		public static MWSHistoryInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSHistoryInfo object = new MWSHistoryInfo();

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

						if (!"MWSHistoryInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSHistoryInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"ObjName").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjDescription").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjDescription(org.apache.axis2.databinding.utils.ConverterUtil
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
							.setStatus(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryRequestStatus.Factory
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
								"FolderName").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setFolderName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"MessageText").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setMessageText(org.apache.axis2.databinding.utils.ConverterUtil
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
								"StartTime").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setStartTime(org.apache.axis2.databinding.utils.ConverterUtil
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
								"FinishTime").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setFinishTime(org.apache.axis2.databinding.utils.ConverterUtil
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
								"LastUpdateTime").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setLastUpdateTime(org.apache.axis2.databinding.utils.ConverterUtil
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
								"MsgID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setMsgID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjectInfo").equals(reader.getName())) {

					object
							.setObjectInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSObjectInfo.Factory
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
								"MessageStatus").equals(reader.getName())) {

					object
							.setMessageStatus(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSHistoryMessageStatus.Factory
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
