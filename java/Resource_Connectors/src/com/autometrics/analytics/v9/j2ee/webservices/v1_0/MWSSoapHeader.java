/**
 * MWSSoapHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.4  Built on : Apr 26, 2008 (06:25:17 EDT)
 */

package com.autometrics.analytics.v9.j2ee.webservices.v1_0;

/**
 * MWSSoapHeader bean class
 */

public class MWSSoapHeader implements org.apache.axis2.databinding.ADBBean {
	/*
	 * This type was generated from the piece of schema that had name =
	 * MWSSoapHeader Namespace URI = http://microstrategy.com/webservices/v1_0
	 * Namespace Prefix = ns2
	 */

	private static java.lang.String generatePrefix(java.lang.String namespace) {
		if (namespace.equals("http://microstrategy.com/webservices/v1_0")) {
			return "ns2";
		}
		return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
	}

	/**
	 * field for Xy199Val
	 */

	protected java.lang.String localXy199Val;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localXy199ValTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getXy199Val() {
		return localXy199Val;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Xy199Val
	 */
	public void setXy199Val(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localXy199ValTracker = true;
		} else {
			localXy199ValTracker = false;

		}

		this.localXy199Val = param;

	}

	/**
	 * field for Xy299Val
	 */

	protected java.lang.String localXy299Val;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localXy299ValTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getXy299Val() {
		return localXy299Val;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Xy299Val
	 */
	public void setXy299Val(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localXy299ValTracker = true;
		} else {
			localXy299ValTracker = false;

		}

		this.localXy299Val = param;

	}

	/**
	 * field for Xy399Val
	 */

	protected java.lang.String localXy399Val;

	/*
	 * This tracker boolean wil be used to detect whether the user called the
	 * set method for this attribute. It will be used to determine whether to
	 * include this field in the serialized XML
	 */
	protected boolean localXy399ValTracker = false;

	/**
	 * Auto generated getter method
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getXy399Val() {
		return localXy399Val;
	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            Xy399Val
	 */
	public void setXy399Val(java.lang.String param) {

		if (param != null) {
			// update the setting tracker
			localXy399ValTracker = true;
		} else {
			localXy399ValTracker = false;

		}

		this.localXy399Val = param;

	}

	/**
	 * field for ExtraAttributes This was an Attribute! This was an Array!
	 */

	protected org.apache.axiom.om.OMAttribute[] localExtraAttributes;

	/**
	 * Auto generated getter method
	 * 
	 * @return org.apache.axiom.om.OMAttribute[]
	 */
	public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
		return localExtraAttributes;
	}

	/**
	 * validate the array for ExtraAttributes
	 */
	protected void validateExtraAttributes(
			org.apache.axiom.om.OMAttribute[] param) {

		if ((param != null) && (param.length > 1)) {
			throw new java.lang.RuntimeException();
		}

		if ((param != null) && (param.length < 1)) {
			throw new java.lang.RuntimeException();
		}

	}

	/**
	 * Auto generated setter method
	 * 
	 * @param param
	 *            ExtraAttributes
	 */
	public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

		validateExtraAttributes(param);

		this.localExtraAttributes = param;
	}

	/**
	 * Auto generated add method for the array for convenience
	 * 
	 * @param param
	 *            org.apache.axiom.om.OMAttribute
	 */
	public void addExtraAttributes(org.apache.axiom.om.OMAttribute param) {
		if (localExtraAttributes == null) {
			localExtraAttributes = new org.apache.axiom.om.OMAttribute[] {};
		}

		java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil
				.toList(localExtraAttributes);
		list.add(param);
		this.localExtraAttributes = (org.apache.axiom.om.OMAttribute[]) list
				.toArray(new org.apache.axiom.om.OMAttribute[list.size()]);

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
				MWSSoapHeader.this.serialize(parentQName, factory, xmlWriter);
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
						namespacePrefix + ":MWSSoapHeader", xmlWriter);
			} else {
				writeAttribute("xsi",
						"http://www.w3.org/2001/XMLSchema-instance", "type",
						"MWSSoapHeader", xmlWriter);
			}

		}

		if (localExtraAttributes != null) {
			for (int i = 0; i < localExtraAttributes.length; i++) {
				writeAttribute(
						localExtraAttributes[i].getNamespace().getName(),
						localExtraAttributes[i].getLocalName(),
						localExtraAttributes[i].getAttributeValue(), xmlWriter);
			}
		}
		if (localXy199ValTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "xy199Val", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "xy199Val");
				}

			} else {
				xmlWriter.writeStartElement("xy199Val");
			}

			if (localXy199Val == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"xy199Val cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localXy199Val);

			}

			xmlWriter.writeEndElement();
		}
		if (localXy299ValTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "xy299Val", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "xy299Val");
				}

			} else {
				xmlWriter.writeStartElement("xy299Val");
			}

			if (localXy299Val == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"xy299Val cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localXy299Val);

			}

			xmlWriter.writeEndElement();
		}
		if (localXy399ValTracker) {
			namespace = "http://microstrategy.com/webservices/v1_0";
			if (!namespace.equals("")) {
				prefix = xmlWriter.getPrefix(namespace);

				if (prefix == null) {
					prefix = generatePrefix(namespace);

					xmlWriter.writeStartElement(prefix, "xy399Val", namespace);
					xmlWriter.writeNamespace(prefix, namespace);
					xmlWriter.setPrefix(prefix, namespace);

				} else {
					xmlWriter.writeStartElement(namespace, "xy399Val");
				}

			} else {
				xmlWriter.writeStartElement("xy399Val");
			}

			if (localXy399Val == null) {
				// write the nil attribute

				throw new org.apache.axis2.databinding.ADBException(
						"xy399Val cannot be null!!");

			} else {

				xmlWriter.writeCharacters(localXy399Val);

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

		if (localXy199ValTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "xy199Val"));

			if (localXy199Val != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localXy199Val));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"xy199Val cannot be null!!");
			}
		}
		if (localXy299ValTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "xy299Val"));

			if (localXy299Val != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localXy299Val));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"xy299Val cannot be null!!");
			}
		}
		if (localXy399ValTracker) {
			elementList.add(new javax.xml.namespace.QName(
					"http://microstrategy.com/webservices/v1_0", "xy399Val"));

			if (localXy399Val != null) {
				elementList
						.add(org.apache.axis2.databinding.utils.ConverterUtil
								.convertToString(localXy399Val));
			} else {
				throw new org.apache.axis2.databinding.ADBException(
						"xy399Val cannot be null!!");
			}
		}
		for (int i = 0; i < localExtraAttributes.length; i++) {
			attribList
					.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
			attribList.add(localExtraAttributes[i]);
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
		public static MWSSoapHeader parse(
				javax.xml.stream.XMLStreamReader reader)
				throws java.lang.Exception {
			MWSSoapHeader object = new MWSSoapHeader();

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

						if (!"MWSSoapHeader".equals(type)) {
							// find namespace for the prefix
							java.lang.String nsUri = reader
									.getNamespaceContext().getNamespaceURI(
											nsPrefix);
							return (MWSSoapHeader) com.autometrics.analytics.v9.j2ee.webservices.ExtensionMapper
									.getTypeObject(nsUri, type, reader);
						}

					}

				}

				// Note all attributes that were handled. Used to differ normal
				// attributes
				// from anyAttributes.
				java.util.Vector handledAttributes = new java.util.Vector();

				// now run through all any or extra attributes
				// which were not reflected until now
				for (int i = 0; i < reader.getAttributeCount(); i++) {
					if (!handledAttributes.contains(reader
							.getAttributeLocalName(i))) {
						// this is an anyAttribute and we create
						// an OMAttribute for this
						org.apache.axiom.om.impl.llom.OMAttributeImpl attr = new org.apache.axiom.om.impl.llom.OMAttributeImpl(
								reader.getAttributeLocalName(i),
								new org.apache.axiom.om.impl.dom.NamespaceImpl(
										reader.getAttributeNamespace(i), reader
												.getAttributePrefix(i)), reader
										.getAttributeValue(i),
								org.apache.axiom.om.OMAbstractFactory
										.getOMFactory());

						// and add it to the extra attributes

						object.addExtraAttributes(attr);

					}
				}

				reader.next();

				while (!reader.isStartElement() && !reader.isEndElement())
					reader.next();

				if (reader.isStartElement()
						&& new javax.xml.namespace.QName(
								"http://microstrategy.com/webservices/v1_0",
								"xy199Val").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setXy199Val(org.apache.axis2.databinding.utils.ConverterUtil
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
								"xy299Val").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setXy299Val(org.apache.axis2.databinding.utils.ConverterUtil
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
								"xy399Val").equals(reader.getName())) {

					java.lang.String content = reader.getElementText();

					object
							.setXy399Val(org.apache.axis2.databinding.utils.ConverterUtil
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
