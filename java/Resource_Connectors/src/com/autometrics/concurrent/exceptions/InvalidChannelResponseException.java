package com.autometrics.concurrent.exceptions;

import com.autometrics.concurrent.ChannelSubscriber;

/**
 * Thrown when a channel has encountered an error and is unable to return a
 * valid response.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class InvalidChannelResponseException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new invalid response exception with the specified detail
	 * message.
	 * 
	 * @param message
	 *            The detail message of the exception.
	 */
	public InvalidChannelResponseException(String message) {
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
	public InvalidChannelResponseException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs a new invalid response exception with the specified cause.
	 * 
	 * @param cause
	 *            The cause of the exception.
	 */
	public InvalidChannelResponseException(Throwable cause) {
		super(cause);
	}
}