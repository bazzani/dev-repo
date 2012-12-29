package com.autometrics.connectors.exceptions;

/**
 * Thrown when a problem occurs during a resource connector creation attempt.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class CreateConnectorException extends ConnectorException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new resource connector creation exception with the specified
	 * detail message.
	 * 
	 * @param message
	 *            The detail message.
	 */
	public CreateConnectorException(String message) {
		super(message);
	}

	/**
	 * Constructs a new resource connector creation exception with the specified
	 * cause and a detail message of
	 * <code>(cause==null ? null : cause.toString())</code> (which typically
	 * contains the class and detail message of cause).
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public CreateConnectorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new resource connector creation exception with the specified
	 * detail message and cause.
	 * 
	 * @param message
	 *            The detail message.
	 * @param cause
	 *            The cause of the exception.
	 */
	public CreateConnectorException(String message, Throwable cause) {
		super(message, cause);
	}
}