package com.autometrics.connectors.exceptions;

/**
 * Thrown when a problem occurs validating resource connector request
 * properties.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see InitConnectorException
 */
public class InvalidConnectorPropertiesException extends
		InitConnectorException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new invalid resource connector properties exception with the
	 * specified detail message.
	 * 
	 * @param message
	 */
	public InvalidConnectorPropertiesException(String message) {
		super(message);
	}
}