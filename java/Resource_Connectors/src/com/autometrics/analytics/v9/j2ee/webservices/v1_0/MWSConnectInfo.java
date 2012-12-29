/**
 * MWSConnectInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSConnectInfo bean class
 */

public class MWSConnectInfo implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSConnectInfo Namespace URI = http://microstrategy.com/webservices/v1_0
	 * Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for Login
	 */

	protected java.lang.String localLogin;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localLoginTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getLogin() {
		return localLogin;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Login
	 */
	public void setLogin(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localLoginTracker = true;
		} else {
			localLoginTracker = false;

		}

		this.localLogin = param;

	}

	/**
	 * field for Password
	 */

	protected java.lang.String localPassword;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localPasswordTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getPassword() {
		return localPassword;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Password
	 */
	public void setPassword(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localPasswordTracker = true;
		} else {
			localPasswordTracker = false;

		}

		this.localPassword = param;

	}

	/**
	 * field for ProjectName
	 */

	protected java.lang.String localProjectName;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localProjectNameTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getProjectName() {
		return localProjectName;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ProjectName
	 */
	public void setProjectName(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localProjectNameTracker = true;
		} else {
			localProjectNameTracker = false;

		}

		this.localProjectName = param;

	}

	/**
	 * field for ProjectSource
	 */

	protected java.lang.String localProjectSource;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localProjectSourceTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getProjectSource() {
		return localProjectSource;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ProjectSource
	 */
	public void setProjectSource(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localProjectSourceTracker = true;
		} else {
			localProjectSourceTracker = false;

		}

		this.localProjectSource = param;

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
	 * field for AuthMode
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAuthMode localAuthMode;

	/**
	 * Auto generated getter method
	 * 
	 * @return 
	 *         com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAuthMode
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAuthMode getAuthMode() {
		return localAuthMode;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            AuthMode
	 */
	public void setAuthMode(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAuthMode param) {

		this.localAuthMode = param;

	}

	/**
	 * field for HasHeuristics
	 */

	protected boolean localHasHeuristics;

	/**
	 * Auto generated getter method
	 * 
	 * @return boolean
	 */
	public boolean getHasHeuristics() {
		return localHasHeuristics;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            HasHeuristics
	 */
	public void setHasHeuristics(boolean param) {

		this.localHasHeuristics = param;

	}

	/**
	 * field for PortNumber
	 */

	protected int localPortNumber;

	/**
	 * Auto generated getter method
	 * 
	 * @return int
	 */
	public int getPortNumber() {
		return localPortNumber;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            PortNumber
	 */
	public void setPortNumber(int param) {

		this.localPortNumber = param;

	}

	/**
	 * field for ArrayConnectProperty
	 */

	protected com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSConnectProperty2 localArrayConnectProperty;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localArrayConnectPropertyTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return com.autometrics.analytics.v9.j2ee.webservices.v1_0.
	 *         ArrayOfMWSConnectProperty2
	 */
	public com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSConnectProperty2 getArrayConnectProperty() {
		return localArrayConnectProperty;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ArrayConnectProperty
	 */
	public void setArrayConnectProperty(
			com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSConnectProperty2 param) {

		if (param != null) {
			// update the setting tracker
			localArrayConnectPropertyTracker = true;
		} else {
			localArrayConnectPropertyTracker = false;

		}

		this.localArrayConnectProperty = param;

	}

	/**
	 * field for ClientIPAddress
	 */

	protected java.lang.String localClientIPAddress;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localClientIPAddressTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getClientIPAddress() {
		return localClientIPAddress;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ClientIPAddress
	 */
	public void setClientIPAddress(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localClientIPAddressTracker = true;
		} else {
			localClientIPAddressTracker = false;

		}

		this.localClientIPAddress = param;

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
				MWSConnectInfo.this.serialize(parentQName, factory, xmlWriter);
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
						namespacePrefix + ":MWSConnectInfo", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSConnectInfo", xmlWriter);
			}

		}
		if (localLoginTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "Login", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "Login");
				}

			} else {
				xmlWriter.writeStartElement("Login");
			}

			if (localLogin == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"Login cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localLogin);

			}

			xmlWriter.writeEndElement();
		}
		if (localPasswordTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "Password", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "Password");
				}

			} else {
				xmlWriter.writeStartElement("Password");
			}

			if (localPassword == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"Password cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localPassword);

			}

			xmlWriter.writeEndElement();
		}
		if (localProjectNameTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ProjectName",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ProjectName");
				}

			} else {
				xmlWriter.writeStartElement("ProjectName");
			}

			if (localProjectName == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ProjectName cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localProjectName);

			}

			xmlWriter.writeEndElement();
		}
		if (localProjectSourceTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ProjectSource",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ProjectSource");
				}

			} else {
				xmlWriter.writeStartElement("ProjectSource");
			}

			if (localProjectSource == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ProjectSource cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localProjectSource);

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
		if (localAuthMode == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"AuthMode cannot be null!!");
		}
		localAuthMode.serialize(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "AuthMode"),
				factory, xmlWriter);

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "HasHeuristics", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "HasHeuristics");
			}

		} else {
			xmlWriter.writeStartElement("HasHeuristics");
		}

		if (false) {

			throw new org.apache.axis2.databinding.ADBException(
					"HasHeuristics cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localHasHeuristics));
		}

		xmlWriter.writeEndElement();

		namespace = "http://microstrategy.com/webservices/v1_0";
		if (!namespace.equals("")) {
			prefix = xmlWriter.getPrefix(namespace);

			if (prefix == null) {
				prefix = generatePrefix(namespace);

				xmlWriter.writeStartElement(prefix, "PortNumber", namespace);
				xmlWriter.writeNamespace(prefix, namespace);
				xmlWriter.setPrefix(prefix, namespace);

			} else {
				xmlWriter.writeStartElement(namespace, "PortNumber");
			}

		} else {
			xmlWriter.writeStartElement("PortNumber");
		}

		if (localPortNumber == java.lang.Integer.MIN_VALUE) {

			throw new org.apache.axis2.databinding.ADBException(
					"PortNumber cannot be null!!");

		} else {
			xmlWriter
					.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil
							.convertToString(localPortNumber));
		}

		xmlWriter.writeEndElement();
		if (localArrayConnectPropertyTracker) {
			if (localArrayConnectProperty == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ArrayConnectProperty cannot be null!!");
			}
			localArrayConnectProperty.serialize(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ArrayConnectProperty"), factory, xmlWriter);
		}
		if (localClientIPAddressTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "ClientIPAddress",
							namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "ClientIPAddress");
				}

			} else {
				xmlWriter.writeStartElement("ClientIPAddress");
			}

			if (localClientIPAddress == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"ClientIPAddress cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localClientIPAddress);

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

		if (localLoginTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "Login"));

			if (localLogin != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localLogin));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"Login cannot be null!!");
			}
		}
		if (localPasswordTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "Password"));

			if (localPassword != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localPassword));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"Password cannot be null!!");
			}
		}
		if (localProjectNameTracker) {
			elementList
					.add(new javax.xml.namespace.QName(
							"http://microstrategy.com/webservices/v1_0",
							"ProjectName"));

			if (localProjectName != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localProjectName));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ProjectName cannot be null!!");
			}
		}
		if (localProjectSourceTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ProjectSource"));

			if (localProjectSource != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localProjectSource));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ProjectSource cannot be null!!");
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
				"http://microstrategy.com/webservices/v1_0", "AuthMode"));

		if (localAuthMode == null) {
			throw new org.apache.axis2.databinding.ADBException(
					"AuthMode cannot be null!!");
		}
		elementList.add(localAuthMode);

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "HasHeuristics"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localHasHeuristics));

		elementList.add(new javax.xml.namespace.QName(
				"http://microstrategy.com/webservices/v1_0", "PortNumber"));

		elementList.add(org.apache.axis2.databinding.utils.ConverterUtil
				.convertToString(localPortNumber));
		if (localArrayConnectPropertyTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ArrayConnectProperty"));

			if (localArrayConnectProperty == null) {
				throw new org.apache.axis2.databinding.ADBException(
						"ArrayConnectProperty cannot be null!!");
			}
			elementList.add(localArrayConnectProperty);
		}
		if (localClientIPAddressTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0",
					"ClientIPAddress"));

			if (localClientIPAddress != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localClientIPAddress));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"ClientIPAddress cannot be null!!");
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
		public static MWSConnectInfo parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSConnectInfo object = new MWSConnectInfo();

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

						if (!"MWSConnectInfo".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSConnectInfo) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
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
								"Login").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setLogin(org.apache.axis2.databinding.utils.ConverterUtil
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
								"Password").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setPassword(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ProjectName").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setProjectName(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ProjectSource").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setProjectSource(org.apache.axis2.databinding.utils.ConverterUtil
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
								"AuthMode").equals(reader.getName())) {

					object
							.setAuthMode(com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAuthMode.Factory
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
								"HasHeuristics").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setHasHeuristics(org.apache.axis2.databinding.utils.ConverterUtil
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
								"PortNumber").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setPortNumber(org.apache.axis2.databinding.utils.ConverterUtil
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
								"ArrayConnectProperty")
								.equals(reader.getName())) {

					object
							.setArrayConnectProperty(com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfMWSConnectProperty2.Factory
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
								"ClientIPAddress").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setClientIPAddress(org.apache.axis2.databinding.utils.ConverterUtil
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
