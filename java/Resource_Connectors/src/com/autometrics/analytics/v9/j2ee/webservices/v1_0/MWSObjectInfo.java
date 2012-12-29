/**
 * MWSObjectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSObjectInfo bean class
 */

public class MWSObjectInfo implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSObjectInfo Namespace URI = http://microstrategy.com/webservices/v1_0
	 * Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
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
	 * field for ObjCreationTime
	 */

	protected java.lang.String localObjCreationTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjCreationTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjCreationTime() {
		return localObjCreationTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjCreationTime
	 */
	public void setObjCreationTime(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjCreationTimeTracker = true;
		} else {
			localObjCreationTimeTracker = false;

		}

		this.localObjCreationTime = param;

	}

	/**
	 * field for ObjModificationTime
	 */

	protected java.lang.String localObjModificationTime;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjModificationTimeTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjModificationTime() {
		return localObjModificationTime;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjModificationTime
	 */
	public void setObjModificationTime(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjModificationTimeTracker = true;
		} else {
			localObjModificationTimeTracker = false;

		}

		this.localObjModificationTime = param;

	}

	/**
	 * field for ObjOwner
	 */

	protected java.lang.String localObjOwner;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjOwnerTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjOwner() {
		return localObjOwner;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjOwner
	 */
	public void setObjOwner(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjOwnerTracker = true;
		} else {
			localObjOwnerTracker = false;

		}

		this.localObjOwner = param;

	}

	/**
	 * field for ObjPath
	 */

	protected java.lang.String localObjPath;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjPathTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjPath() {
		return localObjPath;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjPath
	 */
	public void setObjPath(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjPathTracker = true;
		} else {
			localObjPathTracker = false;

		}

		this.localObjPath = param;

	}

	/**
	 * field for ObjAccessRights
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAccessRights localObjAccessRights;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjAccessRightsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAccessRights
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAccessRights getObjAccessRights() {
		return localObjAccessRights;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjAccessRights
	 */
	public void setObjAccessRights(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAccessRights param) {

		if (param != null) {
			// update the setting tracker
			localObjAccessRightsTracker = true;
		} else {
			localObjAccessRightsTracker = false;

		}

		this.localObjAccessRights = param;

	}

	/**
	 * field for ObjIsHidden
	 */

	protected boolean localObjIsHidden;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getObjIsHidden() {
		return localObjIsHidden;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjIsHidden
	 */
	public void setObjIsHidden(boolean param) {

		this.localObjIsHidden = param;

	}

	/**
	 * field for ObjVersion
	 */

	protected int localObjVersion;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getObjVersion() {
		return localObjVersion;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjVersion
	 */
	public void setObjVersion(int param) {

		this.localObjVersion = param;

	}

	/**
	 * field for ObjState
	 */

	protected int localObjState;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getObjState() {
		return localObjState;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjState
	 */
	public void setObjState(int param) {

		this.localObjState = param;

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
	 * field for ObjParentFolderID
	 */

	protected java.lang.String localObjParentFolderID;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localObjParentFolderIDTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getObjParentFolderID() {
		return localObjParentFolderID;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ObjParentFolderID
	 */
	public void setObjParentFolderID(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localObjParentFolderIDTracker = true;
		} else {
			localObjParentFolderIDTracker = false;

		}

		this.localObjParentFolderID = param;

	}

	/**
	 * field for PropertySets
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySet localPropertySets;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPropertySetsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSObjectInfoPropertySet
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySet getPropertySets() {
		return localPropertySets;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PropertySets
	 */
	public void setPropertySets(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySet param) {

		if (param != null) {
			// update the setting tracker
			localPropertySetsTracker = true;
		} else {
			localPropertySetsTracker = false;

		}

		this.localPropertySets = param;

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
				MWSObjectInfo.this.serialize(parentQName, factory, xmlWriter);
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
						namespacePrefix + ":MWSObjectInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSObjectInfo", xmlWriter);
			}

		}

		if (localObjType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjType cannot be null!!");
		}
		localObjType.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjType"),
				factory, xmlWriter);
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
		if (localObjCreationTimeTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjCreationTime",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjCreationTime");
				}

			} else {
				xmlWriter.writeStartElement("ObjCreationTime");
			}

			if (localObjCreationTime == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjCreationTime cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjCreationTime);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjModificationTimeTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjModificationTime",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace,
							"ObjModificationTime");
				}

			} else {
				xmlWriter.writeStartElement("ObjModificationTime");
			}

			if (localObjModificationTime == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjModificationTime cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjModificationTime);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjOwnerTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjOwner", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjOwner");
				}

			} else {
				xmlWriter.writeStartElement("ObjOwner");
			}

			if (localObjOwner == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjOwner cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjOwner);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjPathTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjPath", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjPath");
				}

			} else {
				xmlWriter.writeStartElement("ObjPath");
			}

			if (localObjPath == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjPath cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjPath);

			}

			xmlWriter.writeEndElement();
		}
		if (localObjAccessRightsTracker) {
			if (localObjAccessRights == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjAccessRights cannot be null!!");
			}
			localObjAccessRights.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ObjAccessRights"), factory, xmlWriter);
		}
		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "ObjIsHidden", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "ObjIsHidden");
			}

		} else {
			xmlWriter.writeStartElement("ObjIsHidden");
		}

		if (false) {

			throw new org.apache.axis2.databinding.ADBException(
					"ObjIsHidden cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localObjIsHidden));
		}

		xmlWriter.writeEndElement();

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "ObjVersion", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "ObjVersion");
			}

		} else {
			xmlWriter.writeStartElement("ObjVersion");
		}

		if (localObjVersion == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"ObjVersion cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localObjVersion));
		}

		xmlWriter.writeEndElement();

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "ObjState", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "ObjState");
			}

		} else {
			xmlWriter.writeStartElement("ObjState");
		}

		if (localObjState == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"ObjState cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localObjState));
		}

		xmlWriter.writeEndElement();

		if (localObjSubType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjSubType cannot be null!!");
		}
		localObjSubType.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjSubType"),
				factory, xmlWriter);
		if (localObjParentFolderIDTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ObjParentFolderID",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ObjParentFolderID");
				}

			} else {
				xmlWriter.writeStartElement("ObjParentFolderID");
			}

			if (localObjParentFolderID == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ObjParentFolderID cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localObjParentFolderID);

			}

			xmlWriter.writeEndElement();
		}
		if (localPropertySetsTracker) {
			if (localPropertySets == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"PropertySets cannot be null!!");
			}
			localPropertySets.serialize(
					new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"PropertySets"), factory, xmlWriter);
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
				"http://microstrategy.com/webservices/v1_0", "ObjType"));

		if (localObjType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjType cannot be null!!");
		}
		elementList.add(localObjType);
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
		if (localObjCreationTimeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ObjCreationTime"));

			if (localObjCreationTime != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjCreationTime));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjCreationTime cannot be null!!");
			}
		}
		if (localObjModificationTimeTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ObjModificationTime"));

			if (localObjModificationTime != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjModificationTime));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjModificationTime cannot be null!!");
			}
		}
		if (localObjOwnerTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjOwner"));

			if (localObjOwner != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjOwner));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjOwner cannot be null!!");
			}
		}
		if (localObjPathTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "ObjPath"));

			if (localObjPath != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjPath));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjPath cannot be null!!");
			}
		}
		if (localObjAccessRightsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ObjAccessRights"));

			if (localObjAccessRights == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjAccessRights cannot be null!!");
			}
			elementList.add(localObjAccessRights);
		}
		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjIsHidden"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localObjIsHidden));

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjVersion"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localObjVersion));

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjState"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localObjState));

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "ObjSubType"));

		if (localObjSubType == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"ObjSubType cannot be null!!");
		}
		elementList.add(localObjSubType);
		if (localObjParentFolderIDTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ObjParentFolderID"));

			if (localObjParentFolderID != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localObjParentFolderID));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ObjParentFolderID cannot be null!!");
			}
		}
		if (localPropertySetsTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"PropertySets"));

			if (localPropertySets == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"PropertySets cannot be null!!");
			}
			elementList.add(localPropertySets);
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
		public static MWSObjectInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSObjectInfo object = new MWSObjectInfo();

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

						if (!"MWSObjectInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSObjectInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"ObjCreationTime").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjCreationTime(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjModificationTime").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjModificationTime(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjOwner").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjOwner(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjPath").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjPath(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjAccessRights").equals(reader.getName())) {

					object
							.setObjAccessRights(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAccessRights.Factory
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
								"ObjIsHidden").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjIsHidden(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjVersion").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjVersion(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjState").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjState(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ObjParentFolderID").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setObjParentFolderID(org.apache.axis2.databinding.utils.ConverterUtil
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
								"PropertySets").equals(reader.getName())) {

					object
							.setPropertySets(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSObjectInfoPropertySet.Factory
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
