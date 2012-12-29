package com.autometrics.connectors;

/**
 * Value object that is used to transport data through classes in the
 * <code>com.autometrics.concurrent</code> and
 * <code>com.autometrics.connectors</code> packages.
 * <p>
 * Encapsulating the data helps to move the VO around, and it is the
 * responsibility of the object registering a request for a resource to cast the
 * data to the appropriate data type upon retrieval.
 * <p>
 * note: <i>The data property is a generic object, <b>it should be cast to a
 * specific type when be retrieved from the VO</b></i>.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class ResourceVO {
	/**
	 * The data that this VO encapsulates
	 */
	private Object data;

	/**
	 * Instantiate a ResourceVO object with a null data property.
	 */
	public ResourceVO() {
		this(null);
	}

	/**
	 * Instantiate a ResourceVO object, set its data property to the parameter
	 * supplied.
	 * 
	 * @param dataIn
	 *            The data this object will store.
	 */
	public ResourceVO(Object dataIn) {
		this.data = dataIn;
	}

	/**
	 * Set the data on the object.
	 * 
	 * @param dataIn
	 *            The data to store in this object.
	 */
	public void setData(Object dataIn) {
		this.data = dataIn;
	}

	/**
	 * Return the data the object stores.
	 * 
	 * @return data The data the object stores.
	 */
	public Object getData() {
		return data;
	}
}