package com.autometrics.concurrent.exceptions;

/**
 * Thrown when a channel fails to register a request.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class RequestRegistrationException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new request registration exception with the specified detail
	 * message.
	 * 
	 * @param message
	 *            The detail message.
	 */
	public RequestRegistrationException(String message) {
		super(message);
	}

	/**
	 * Constructs a new request registration exception with the specified cause.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public RequestRegistrationException(Throwable cause) {
		super(cause);
	}

	/**
	 * Constructs a new request registration exception with the specified detail
	 * message and cause.
	 * 
	 * @param message
	 *            The detail message.
	 * @param cause
	 *            The cause of the exception.
	 */
	public RequestRegistrationException(String message, Throwable cause) {
		super(message, cause);
	}
}