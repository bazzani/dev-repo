package com.autometrics.concurrent.exceptions;

import com.autometrics.concurrent.Channel;

/**
 * Thrown when a channel has performed the maximum amount of attempts to create
 * a new thread for its host, primarily due to memory constraints on the OS.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see Channel
 */
public class CreateHostThreadException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructs a new channel host thread creation exception with the
	 * specified detail message.
	 * 
	 * @param message
	 *            The detail message.
	 */
	public CreateHostThreadException(String message) {
		super(message);
	}
}