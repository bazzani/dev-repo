package com.autometrics.connectors.exceptions;

/**
 * Thrown when a problem occurs initialising a resource connector.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see InvalidConnectorPropertiesException
 */
public class InitConnectorException extends ConnectorException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new resource connector initialisation exception with the
	 * specified detail message.
	 * 
	 * @param message
	 *            The detail message.
	 */
	public InitConnectorException(String message) {
		super(message);
	}

	/**
	 * Constructs a new resource connector initialisation exception with the
	 * specified cause.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public InitConnectorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new resource connector initialisation exception with the
	 * specified detail message and cause.
	 * 
	 * @param message
	 *            The detail message.
	 * @param cause
	 *            The cause of the exception.
	 */
	public InitConnectorException(String message, Throwable cause) {
		super(message, cause);
	}
}