package com.autometrics.connectors.exceptions;

/**
 * Thrown when a problem occurs performing an operation on a resource connector.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class ExecuteConnectorException extends
		ConnectorException {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new resource connector execution exception with the
	 * specified detail message.
	 * 
	 * @param message
	 *            The detail message.
	 */
	public ExecuteConnectorException(String message) {
		super(message);
	}

	/**
	 * Constructs a new resource connector execution exception with the
	 * specified cause and a detail message of
	 * <code>(cause==null ? null : cause.toString())</code> (which typically
	 * contains the class and detail message of cause).
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public ExecuteConnectorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new resource connector execution exception with the
	 * specified detail message and cause.
	 * 
	 * @param message
	 *            The detail message.
	 * @param cause
	 *            The cause of the exception.
	 */
	public ExecuteConnectorException(String message, Throwable cause) {
		super(message, cause);
	}
}
