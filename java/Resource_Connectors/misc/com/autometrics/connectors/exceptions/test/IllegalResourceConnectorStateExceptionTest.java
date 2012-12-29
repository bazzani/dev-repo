package com.autometrics.connectors.exceptions.test;

import org.junit.Test;

import com.autometrics.connectors.ResourceConnectorState;
import com.autometrics.connectors.exceptions.IllegalConnectorStateException;

/**
 * @author Barry Evans
 */
public class IllegalResourceConnectorStateExceptionTest {
	/**
	 * Test method for
	 * {@link com.autometrics.connectors.exceptions.IllegalConnectorStateException#getMessage()}
	 * .
	 */
	@Test
	public void testGetMessageWithPermittedStates() {
		IllegalConnectorStateException ex = new IllegalConnectorStateException(
				"The connector is currently processing and cannot enter the new state!",
				ResourceConnectorState.INITIALISING,
				ResourceConnectorState.IDLE, new ResourceConnectorState[] {
						ResourceConnectorState.INITIALISE_FAILED,
						ResourceConnectorState.INITIALISED });

		ex.printStackTrace();
	}

	/**
	 * Test method for
	 * {@link com.autometrics.connectors.exceptions.IllegalConnectorStateException#getMessage()}
	 * .
	 */
	@Test
	public void testGetMessageWithoutPermittedStates() {
		IllegalConnectorStateException ex = new IllegalConnectorStateException(
				"The connector is currently processing and cannot enter the new state!",
				ResourceConnectorState.INITIALISING,
				ResourceConnectorState.IDLE);

		ex.printStackTrace();
	}
}