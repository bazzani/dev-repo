package com.autometrics.connectors;

/**
 * Enumeration for the states that a {@link AbstractResourceConnector} (or one
 * of its sub classes) can be in.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public enum ResourceConnectorState {
	/**
	 * The connector has been created but has not been initialised yet.
	 */
	PRE_INITIALISED,

	/**
	 * The connector is currently initialising.
	 */
	INITIALISING,

	/**
	 * The connector failed to initialise, and unable to perform operations.
	 */
	INITIALISE_FAILED,

	/**
	 * The connector has had its properties validated and ready to perform
	 * operations.
	 */
	INITIALISED,

	/**
	 * The connector is currently processing a request.
	 */
	PROCESSING,

	/**
	 * The connector failed when processing a request.
	 */
	PROCESSING_FAILED,

	/**
	 * The connector is idle, after successfully processing a request.
	 */
	IDLE
}