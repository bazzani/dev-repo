/**
 * MWSProjectSessionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSProjectSessionInfo bean class
 */

public class MWSProjectSessionInfo implements
		org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSProjectSessionInfo Namespace URI =
	 * http://microstrategy.com/webservices/v1_0 Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
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
	 * field for ProjectStatus
	 */

	protected java.lang.String localProjectStatus;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localProjectStatusTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getProjectStatus() {
		return localProjectStatus;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ProjectStatus
	 */
	public void setProjectStatus(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localProjectStatusTracker = true;
		} else {
			localProjectStatusTracker = false;

		}

		this.localProjectStatus = param;

	}

	/**
	 * field for Folders
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectFolderObj localFolders;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localFoldersTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSProjectFolderObj
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectFolderObj getFolders() {
		return localFolders;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Folders
	 */
	public void setFolders(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectFolderObj param) {

		if (param != null) {
			// update the setting tracker
			localFoldersTracker = true;
		} else {
			localFoldersTracker = false;

		}

		this.localFolders = param;

	}

	/**
	 * field for SessionProperties
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSessionProperty localSessionProperties;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localSessionPropertiesTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSProjectSessionProperty
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSessionProperty getSessionProperties() {
		return localSessionProperties;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            SessionProperties
	 */
	public void setSessionProperties(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSessionProperty param) {

		if (param != null) {
			// update the setting tracker
			localSessionPropertiesTracker = true;
		} else {
			localSessionPropertiesTracker = false;

		}

		this.localSessionProperties = param;

	}

	/**
	 * field for ProjectSettings
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSetting localProjectSettings;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localProjectSettingsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSProjectSetting
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSetting getProjectSettings() {
		return localProjectSettings;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ProjectSettings
	 */
	public void setProjectSettings(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSetting param) {

		if (param != null) {
			// update the setting tracker
			localProjectSettingsTracker = true;
		} else {
			localProjectSettingsTracker = false;

		}

		this.localProjectSettings = param;

	}

	/**
	 * field for WellKnownObjects
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectWellKnownObj localWellKnownObjects;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localWellKnownObjectsTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSProjectWellKnownObj
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectWellKnownObj getWellKnownObjects() {
		return localWellKnownObjects;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            WellKnownObjects
	 */
	public void setWellKnownObjects(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectWellKnownObj param) {

		if (param != null) {
			// update the setting tracker
			localWellKnownObjectsTracker = true;
		} else {
			localWellKnownObjectsTracker = false;

		}

		this.localWellKnownObjects = param;

	}

	/**
	 * field for UserPrivileges
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSUserPrivilege localUserPrivileges;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localUserPrivilegesTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSUserPrivilege
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSUserPrivilege getUserPrivileges() {
		return localUserPrivileges;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            UserPrivileges
	 */
	public void setUserPrivileges(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSUserPrivilege param) {

		if (param != null) {
			// update the setting tracker
			localUserPrivilegesTracker = true;
		} else {
			localUserPrivilegesTracker = false;

		}

		this.localUserPrivileges = param;

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
				MWSProjectSessionInfo.this.serialize(parentQName, factory,
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
						namespacePrefix + ":MWSProjectSessionInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSProjectSessionInfo", xmlWriter);
			}

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
		if (localProjectStatusTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ProjectStatus",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ProjectStatus");
				}

			} else {
				xmlWriter.writeStartElement("ProjectStatus");
			}

			if (localProjectStatus == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ProjectStatus cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localProjectStatus);

			}

			xmlWriter.writeEndElement();
		}
		if (localFoldersTracker) {
			if (localFolders == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"Folders cannot be null!!");
			}
			localFolders.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "Folders"),
					factory, xmlWriter);
		}
		if (localSessionPropertiesTracker) {
			if (localSessionProperties == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"SessionProperties cannot be null!!");
			}
			localSessionProperties.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"SessionProperties"), factory, xmlWriter);
		}
		if (localProjectSettingsTracker) {
			if (localProjectSettings == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ProjectSettings cannot be null!!");
			}
			localProjectSettings.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ProjectSettings"), factory, xmlWriter);
		}
		if (localWellKnownObjectsTracker) {
			if (localWellKnownObjects == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"WellKnownObjects cannot be null!!");
			}
			localWellKnownObjects.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"WellKnownObjects"), factory, xmlWriter);
		}
		if (localUserPrivilegesTracker) {
			if (localUserPrivileges == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"UserPrivileges cannot be null!!");
			}
			localUserPrivileges.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"UserPrivileges"), factory, xmlWriter);
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
		if (localProjectStatusTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ProjectStatus"));

			if (localProjectStatus != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localProjectStatus));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ProjectStatus cannot be null!!");
			}
		}
		if (localFoldersTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "Folders"));

			if (localFolders == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"Folders cannot be null!!");
			}
			elementList.add(localFolders);
		}
		if (localSessionPropertiesTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"SessionProperties"));

			if (localSessionProperties == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"SessionProperties cannot be null!!");
			}
			elementList.add(localSessionProperties);
		}
		if (localProjectSettingsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ProjectSettings"));

			if (localProjectSettings == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ProjectSettings cannot be null!!");
			}
			elementList.add(localProjectSettings);
		}
		if (localWellKnownObjectsTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"WellKnownObjects"));

			if (localWellKnownObjects == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"WellKnownObjects cannot be null!!");
			}
			elementList.add(localWellKnownObjects);
		}
		if (localUserPrivilegesTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"UserPrivileges"));

			if (localUserPrivileges == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"UserPrivileges cannot be null!!");
			}
			elementList.add(localUserPrivileges);
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
		public static MWSProjectSessionInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSProjectSessionInfo object = new MWSProjectSessionInfo();

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

						if (!"MWSProjectSessionInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSProjectSessionInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"ProjectStatus").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setProjectStatus(org.apache.axis2.databinding.utils.ConverterUtil
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
								"Folders").equals(reader.getName())) {

					object
							.setFolders(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectFolderObj.Factory
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
								"SessionProperties").equals(reader.getName())) {

					object
							.setSessionProperties(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSessionProperty.Factory
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
								"ProjectSettings").equals(reader.getName())) {

					object
							.setProjectSettings(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectSetting.Factory
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
								"WellKnownObjects").equals(reader.getName())) {

					object
							.setWellKnownObjects(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSProjectWellKnownObj.Factory
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
								"UserPrivileges").equals(reader.getName())) {

					object
							.setUserPrivileges(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSUserPrivilege.Factory
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
