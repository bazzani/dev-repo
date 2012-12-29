/**
 * MWSExecuteInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSExecuteInfo bean class
 */

public class MWSExecuteInfo implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSExecuteInfo Namespace URI = http://microstrategy.com/webservices/v1_0
	 * Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for ResultXML
	 */

	protected java.lang.String localResultXML;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localResultXMLTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getResultXML() {
		return localResultXML;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ResultXML
	 */
	public void setResultXML(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localResultXMLTracker = true;
		} else {
			localResultXMLTracker = false;

		}

		this.localResultXML = param;

	}

	/**
	 * field for ResultHTML
	 */

	protected java.lang.String localResultHTML;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localResultHTMLTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getResultHTML() {
		return localResultHTML;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ResultHTML
	 */
	public void setResultHTML(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localResultHTMLTracker = true;
		} else {
			localResultHTMLTracker = false;

		}

		this.localResultHTML = param;

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
	 * field for Session
	 */

	protected java.lang.String localSession;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSessionTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getSession() {
		return localSession;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Session
	 */
	public void setSession(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localSessionTracker = true;
		} else {
			localSessionTracker = false;

		}

		this.localSession = param;

	}

	/**
	 * field for ExecuteStatus
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSRunStatusType localExecuteStatus;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSRunStatusType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSRunStatusType getExecuteStatus() {
		return localExecuteStatus;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ExecuteStatus
	 */
	public void setExecuteStatus(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSRunStatusType param) {

		this.localExecuteStatus = param;

	}

	/**
	 * field for GraphType
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSGraphType localGraphType;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSGraphType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSGraphType getGraphType() {
		return localGraphType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            GraphType
	 */
	public void setGraphType(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSGraphType param) {

		this.localGraphType = param;

	}

	/**
	 * field for PromptSuggestions
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSPromptSuggestions localPromptSuggestions;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPromptSuggestionsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSPromptSuggestions
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSPromptSuggestions getPromptSuggestions() {
		return localPromptSuggestions;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PromptSuggestions
	 */
	public void setPromptSuggestions(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSPromptSuggestions param) {

		if (param != null) {
			// update the setting tracker
			localPromptSuggestionsTracker = true;
		} else {
			localPromptSuggestionsTracker = false;

		}

		this.localPromptSuggestions = param;

	}

	/**
	 * field for HasMoreData
	 */

	protected boolean localHasMoreData;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getHasMoreData() {
		return localHasMoreData;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            HasMoreData
	 */
	public void setHasMoreData(boolean param) {

		this.localHasMoreData = param;

	}

	/**
	 * field for ResultsInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsSizeInfo localResultsInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localResultsInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsSizeInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsSizeInfo getResultsInfo() {
		return localResultsInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ResultsInfo
	 */
	public void setResultsInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsSizeInfo param) {

		if (param != null) {
			// update the setting tracker
			localResultsInfoTracker = true;
		} else {
			localResultsInfoTracker = false;

		}

		this.localResultsInfo = param;

	}

	/**
	 * field for OriginalLayout
	 */

	protected java.lang.String localOriginalLayout;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localOriginalLayoutTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getOriginalLayout() {
		return localOriginalLayout;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            OriginalLayout
	 */
	public void setOriginalLayout(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localOriginalLayoutTracker = true;
		} else {
			localOriginalLayoutTracker = false;

		}

		this.localOriginalLayout = param;

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
	 * field for HeaderInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSReportHeader localHeaderInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localHeaderInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSReportHeader
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSReportHeader getHeaderInfo() {
		return localHeaderInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            HeaderInfo
	 */
	public void setHeaderInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSReportHeader param) {

		if (param != null) {
			// update the setting tracker
			localHeaderInfoTracker = true;
		} else {
			localHeaderInfoTracker = false;

		}

		this.localHeaderInfo = param;

	}

	/**
	 * field for ObjType
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjectType localObjType;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjectType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjectType getObjType() {
		return localObjType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjType
	 */
	public void setObjType(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjectType param) {

		this.localObjType = param;

	}

	/**
	 * field for ObjSubType
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjSubType localObjSubType;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjSubType
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjSubType getObjSubType() {
		return localObjSubType;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjSubType
	 */
	public void setObjSubType(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjSubType param) {

		this.localObjSubType = param;

	}

	/**
	 * field for MetricInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSMetricInfo localMetricInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localMetricInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSMetricInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSMetricInfo getMetricInfo() {
		return localMetricInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            MetricInfo
	 */
	public void setMetricInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSMetricInfo param) {

		if (param != null) {
			// update the setting tracker
			localMetricInfoTracker = true;
		} else {
			localMetricInfoTracker = false;

		}

		this.localMetricInfo = param;

	}

	/**
	 * field for AttachInfo
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSAttachmentInfo localAttachInfo;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localAttachInfoTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSAttachmentInfo
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSAttachmentInfo getAttachInfo() {
		return localAttachInfo;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AttachInfo
	 */
	public void setAttachInfo(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSAttachmentInfo param) {

		if (param != null) {
			// update the setting tracker
			localAttachInfoTracker = true;
		} else {
			localAttachInfoTracker = false;

		}

		this.localAttachInfo = param;

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
				MWSExecuteInfo.this.serialize(parentQName, factory, xmlWriter);
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
						namespacePrefix + ":MWSExecuteInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSExecuteInfo", xmlWriter);
			}

		}
		if (localResultXMLTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ResultXML", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ResultXML");
				}

			} else {
				xmlWriter.writeStartElement("ResultXML");
			}

			if (localResultXML == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ResultXML cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localResultXML);

			}

			xmlWriter.writeEndElement();
		}
		if (localResultHTMLTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter
							.writeStartElement(prefix, "ResultHTML", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ResultHTML");
				}

			} else {
				xmlWriter.writeStartElement("ResultHTML");
			}

			if (localResultHTML == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ResultHTML cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localResultHTML);

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
		if (localSessionTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "Session", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "Session");
				}

			} else {
				xmlWriter.writeStartElement("Session");
			}

			if (localSession == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"Session cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localSession);

			}

			xmlWriter.writeEndElement();
		}
		if (localExecuteStatus == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ExecuteStatus cannot be null!!");
		}
		localExecuteStatus.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ExecuteStatus"),
				factory, xmlWriter);

		if (localGraphType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"GraphType cannot be null!!");
		}
		localGraphType.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GraphType"),
				factory, xmlWriter);
		if (localPromptSuggestionsTracker) {
			if (localPromptSuggestions == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"PromptSuggestions cannot be null!!");
			}
			localPromptSuggestions.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"PromptSuggestions"), factory, xmlWriter);
		}
		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "HasMoreData", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "HasMoreData");
			}

		} else {
			xmlWriter.writeStartElement("HasMoreData");
		}

		if (false) {

			throw new org.apache.axis2.databinding.ADBException(
					"HasMoreData cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localHasMoreData));
		}

		xmlWriter.writeEndElement();
		if (localResultsInfoTracker) {
			if (localResultsInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ResultsInfo cannot be null!!");
			}
			localResultsInfo.serialize(
					new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ResultsInfo"), factory, xmlWriter);
		}
		if (localOriginalLayoutTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "OriginalLayout",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "OriginalLayout");
				}

			} else {
				xmlWriter.writeStartElement("OriginalLayout");
			}

			if (localOriginalLayout == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"OriginalLayout cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localOriginalLayout);

			}

			xmlWriter.writeEndElement();
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
		if (localHeaderInfoTracker) {
			if (localHeaderInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"HeaderInfo cannot be null!!");
			}
			localHeaderInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "HeaderInfo"),
					factory, xmlWriter);
		}
		if (localObjType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjType cannot be null!!");
		}
		localObjType.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjType"),
				factory, xmlWriter);

		if (localObjSubType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjSubType cannot be null!!");
		}
		localObjSubType.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjSubType"),
				factory, xmlWriter);
		if (localMetricInfoTracker) {
			if (localMetricInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"MetricInfo cannot be null!!");
			}
			localMetricInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "MetricInfo"),
					factory, xmlWriter);
		}
		if (localAttachInfoTracker) {
			if (localAttachInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"AttachInfo cannot be null!!");
			}
			localAttachInfo.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "AttachInfo"),
					factory, xmlWriter);
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

		if (localResultXMLTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ResultXML"));

			if (localResultXML != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localResultXML));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ResultXML cannot be null!!");
			}
		}
		if (localResultHTMLTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ResultHTML"));

			if (localResultHTML != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localResultHTML));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ResultHTML cannot be null!!");
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
		if (localSessionTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "Session"));

			if (localSession != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localSession));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"Session cannot be null!!");
			}
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ExecuteStatus"));

		if (localExecuteStatus == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ExecuteStatus cannot be null!!");
		}
		elementList.add(localExecuteStatus);

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "GraphType"));

		if (localGraphType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"GraphType cannot be null!!");
		}
		elementList.add(localGraphType);
		if (localPromptSuggestionsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"PromptSuggestions"));

			if (localPromptSuggestions == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"PromptSuggestions cannot be null!!");
			}
			elementList.add(localPromptSuggestions);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "HasMoreData"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localHasMoreData));
		if (localResultsInfoTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ResultsInfo"));

			if (localResultsInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ResultsInfo cannot be null!!");
			}
			elementList.add(localResultsInfo);
		}
		if (localOriginalLayoutTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"OriginalLayout"));

			if (localOriginalLayout != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localOriginalLayout));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"OriginalLayout cannot be null!!");
			}
		}
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
		if (localHeaderInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "HeaderInfo"));

			if (localHeaderInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"HeaderInfo cannot be null!!");
			}
			elementList.add(localHeaderInfo);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjType"));

		if (localObjType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjType cannot be null!!");
		}
		elementList.add(localObjType);

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjSubType"));

		if (localObjSubType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjSubType cannot be null!!");
		}
		elementList.add(localObjSubType);
		if (localMetricInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "MetricInfo"));

			if (localMetricInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"MetricInfo cannot be null!!");
			}
			elementList.add(localMetricInfo);
		}
		if (localAttachInfoTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "AttachInfo"));

			if (localAttachInfo == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"AttachInfo cannot be null!!");
			}
			elementList.add(localAttachInfo);
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
		public static MWSExecuteInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSExecuteInfo object = new MWSExecuteInfo();

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

						if (!"MWSExecuteInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSExecuteInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"ResultXML").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setResultXML(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ResultHTML").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setResultHTML(org.apache.axis2.databinding.utils.ConverterUtil
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
								"Session").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setSession(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ExecuteStatus").equals(reader.getName())) {

					object
							.setExecuteStatus(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSRunStatusType.Factory
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
								"GraphType").equals(reader.getName())) {

					object
							.setGraphType(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSGraphType.Factory
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
								"PromptSuggestions").equals(reader.getName())) {

					object
							.setPromptSuggestions(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSPromptSuggestions.Factory
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
								"HasMoreData").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setHasMoreData(org.apache.axis2.databinding.utils.ConverterUtil
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

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"ResultsInfo").equals(reader.getName())) {

					object
							.setResultsInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsSizeInfo.Factory
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
								"OriginalLayout").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setOriginalLayout(org.apache.axis2.databinding.utils.ConverterUtil
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
								"HeaderInfo").equals(reader.getName())) {

					object
							.setHeaderInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSReportHeader.Factory
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
								"ObjType").equals(reader.getName())) {

					object
							.setObjType(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjectType.Factory
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
								"ObjSubType").equals(reader.getName())) {

					object
							.setObjSubType(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSObjSubType.Factory
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
								"MetricInfo").equals(reader.getName())) {

					object
							.setMetricInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSMetricInfo.Factory
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
								"AttachInfo").equals(reader.getName())) {

					object
							.setAttachInfo(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSAttachmentInfo.Factory
									.parse(reader));

					reader.next();

					/**
					 * Fix by Barry Evans (barry.evans@autometrics.com)
					 * 
					 * 01/07/2009
					 * 
					 * We need to move on to the next element so that the
					 * following <ObjectInfo> element can be processed correctly
					 * as many reports were failing to return attachment data
					 * correctly
					 */
					// read the next element twice so we process the closing
					// <AttachInfo>
					// element and move on to the next element opening element
					// --> <ObjectInfo>
					if (reader.isEndElement()) {
						event = reader.next();
					}

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
