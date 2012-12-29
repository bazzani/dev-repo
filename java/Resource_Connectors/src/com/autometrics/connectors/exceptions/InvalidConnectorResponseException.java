package com.autometrics.connectors.exceptions;

/**
 * Thrown when a resource connector returns an invalid response.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class InvalidConnectorResponseException extends
		ConnectorException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new invalid response exception with the specified detail
	 * message.
	 * 
	 * @param message
	 *            The detail message of the exception.
	 */
	public InvalidConnectorResponseException(String message) {
		super(message);
	}

	/**
	 * Constructs a new invalid response exception with the specified detail
	 * message and cause.
	 * 
	 * @param message
	 *            The detail message of the exception.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public InvalidConnectorResponseException(String message,
			Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new invalid response exception with the specified cause.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public InvalidConnectorResponseException(Throwable cause) {
		super(cause);
	}
}