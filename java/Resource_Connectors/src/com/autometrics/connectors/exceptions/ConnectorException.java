package com.autometrics.connectors.exceptions;

/**
 * Base class for all resource connector exceptions.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see IllegalConnectorStateException
 * @see CreateConnectorException
 * @see InitConnectorException
 * @see InvalidConnectorPropertiesException
 * @see ExecuteConnectorException
 */
public class ConnectorException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new resource connector exception with the specified detail
	 * message.
	 * 
	 * @param message
	 *            The detail message.
	 */
	public ConnectorException(String message) {
		super(message);
	}

	/**
	 * Constructs a new resource connector exception with the specified cause.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public ConnectorException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new resource connector exception with the specified detail
	 * message and cause.
	 * 
	 * @param message
	 *            The detail message.
	 * @param cause
	 *            The cause of the exception.
	 */
	public ConnectorException(String message, Throwable cause) {
		super(message, cause);
	}
}