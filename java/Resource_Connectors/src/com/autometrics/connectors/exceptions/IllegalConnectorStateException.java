package com.autometrics.connectors.exceptions;

import com.autometrics.connectors.AbstractResourceConnector;
import com.autometrics.connectors.ResourceConnectorState;

/**
 * Thrown when a problem occurs during a resource connector state change
 * attempt.
 * 
 * @author Barry Evans
 * @since Version 1.1
 * 
 * @see AbstractResourceConnector
 */
public class IllegalConnectorStateException extends
		ConnectorException {

	private static final long serialVersionUID = 1L;

	/**
	 * The current state of the resource connector before the state change was
	 * attempted.
	 */
	private ResourceConnectorState currentState;

	/**
	 * The new state to change the resource connector to.
	 */
	private ResourceConnectorState newState;

	/**
	 * The states the resource connector is a permitted to enter from the state
	 * when it was currently in.
	 */
	private ResourceConnectorState[] permittedStates;

	/**
	 * Constructs a new resource connector state change exception with the
	 * specified detail message and the current and new states.
	 * 
	 * @param message
	 *            The detail message.
	 * @param currentStateIn
	 *            The current state of the resource connector.
	 * @param newStateIn
	 *            The state the resource connector attempted to enter.
	 */
	public IllegalConnectorStateException(String message,
			ResourceConnectorState currentStateIn,
			ResourceConnectorState newStateIn) {
		this(message, currentStateIn, newStateIn, null);

		// super(message);
		//
		// // set the states on the object
		// this.currentState = currentStateIn;
		// this.newState = newStateIn;
		// this.permittedStates = null;
	}

	/**
	 * Constructs a new resource connector state change exception with the
	 * specified detail message, the current and new states, and the permitted
	 * states from the current state.
	 * 
	 * @param message
	 *            The detail message.
	 * @param currentStateIn
	 *            The current state of the resource connector.
	 * @param newStateIn
	 *            The state the resource connector attempted to enter.
	 * @param permittedStatesIn
	 *            The states the resource connector is a permitted to enter from
	 *            the state when it was currently in.
	 */
	public IllegalConnectorStateException(String message,
			ResourceConnectorState currentStateIn,
			ResourceConnectorState newStateIn,
			ResourceConnectorState[] permittedStatesIn) {
		super(message);

		// set the states on the object
		this.currentState = currentStateIn;
		this.newState = newStateIn;
		this.permittedStates = permittedStatesIn;
	}

	/**
	 * Overridden toString method that will append the old and new states to the
	 * message.
	 */
	public String getMessage() {
		String message = super.getMessage() + " <" + getOldState().toString()
				+ " --> " + getNewState().toString() + ">";

		if (getPermittedStates() != null) {
			message += " : Permitted states [";

			for (ResourceConnectorState state : permittedStates) {
				message += state.toString() + "|";
			}

			message = message.substring(0, message.length() - 1);
			message += "]";
		}

		return message;
	}

	/**
	 * Get the old state of the resource connector when the state change was
	 * attempted.
	 * 
	 * @return The old state of the resource connector.
	 */
	public ResourceConnectorState getOldState() {
		return currentState;
	}

	/**
	 * Get the new state the resource connector was attempting to enter.
	 * 
	 * @return The new state the resource connector was attempting to enter.
	 */
	public ResourceConnectorState getNewState() {
		return newState;
	}

	/**
	 * Get the states the resource connector is a permitted to enter from the
	 * state when it was currently in.
	 * 
	 * @return The permitted states to enter.
	 */

	public ResourceConnectorState[] getPermittedStates() {
		return permittedStates;
	}
}