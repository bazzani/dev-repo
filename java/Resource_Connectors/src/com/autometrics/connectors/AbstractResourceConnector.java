package com.autometrics.connectors;

import org.apache.log4j.Logger;

import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.connectors.exceptions.ExecuteConnectorException;
import com.autometrics.connectors.exceptions.IllegalConnectorStateException;
import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.connectors.exceptions.InvalidConnectorPropertiesException;
import com.autometrics.generics.exceptions.InvalidPropertiesException;
import com.autometrics.generics.vo.PropertiesVO;
import com.autometrics.generics.vo.PropertyVO;
import com.autometrics.generics.vo.PropertiesVO.PropertyType;

/**
 * Base resource connector class that all resource connectors must extend.
 * <p>
 * Resource connectors can execute commands on and retrieve resources from
 * services.
 * 
 * @author Barry Evans
 * @since Version 1.0
 * 
 * @see IResourceConnector
 * @see ResourceConnectorFactory
 * @see ResourceConnectorPropertiesFactory
 * @see PropertiesVO
 */
public abstract class AbstractResourceConnector implements IResourceConnector {
	/**
	 * The class's logger.
	 */
	protected static Logger logger = Logger
			.getLogger(AbstractResourceConnector.class);

	/**
	 * The properties supported by the connector.
	 */
	protected PropertiesVO supportedProperties;

	/**
	 * The current request properties that will be used to call methods on the
	 * connector.
	 */
	protected PropertiesVO requestProperties;

	/**
	 * The current state of the connector.
	 */
	protected ResourceConnectorState currentState;

	/**
	 * Construct a new resource connector and apply the request properties to
	 * it.
	 * <p>
	 * The supported properties for the concrete class will be created here and
	 * applied to the connector. The request properties will then be applied to
	 * the connector.
	 * <p>
	 * The initialisation of member variables of sub classes should be performed
	 * 
	 * @param requestPropertiesIn
	 *            The properties to validate against the connector.
	 * 
	 * @throws CreateConnectorException
	 * 
	 * @since Version 1.0
	 */
	public AbstractResourceConnector(PropertiesVO requestPropertiesIn)
			throws CreateConnectorException {
		// Move to the pre initialised state initially.
		currentState = ResourceConnectorState.PRE_INITIALISED;

		// create the connector's properties VO from the factory class
		supportedProperties = ResourceConnectorPropertiesFactory
				.GetSupportedProperties(this.getClass().getSimpleName());
		try {
			// apply the properties to the connector
			setRequestProperties(requestPropertiesIn);
		} catch (InitConnectorException e) {
			// throw an exception specific to connector creation, using the
			// caught exception as the cause
			throw new CreateConnectorException("The "
					+ this.getClass().getSimpleName()
					+ " connector could not be created!", e);
		}
	}

	/**
	 * This method has a similar flow of events for all implementations of a
	 * resource connector such as changing states before the specific
	 * initialisation attempt is initiated.
	 * 
	 * @since Version 1.1
	 */
	protected final void initialiseConnector() throws InitConnectorException {
		try {
			if (logger.isInfoEnabled()) {
				logger.info("Initialising the resource connector...");
			}

			// move to the initialising state
			setCurrentState(ResourceConnectorState.INITIALISING);

			// perform the implementation specific initialisation process
			initialiseConnectorImpl();

			// move to the initialised state
			setCurrentState(ResourceConnectorState.INITIALISED);

			if (logger.isInfoEnabled()) {
				logger.info("...resource connector initialisation complete");
			}
		} catch (IllegalConnectorStateException e) {
			try {
				// move to the initialised failed state
				setCurrentState(ResourceConnectorState.INITIALISE_FAILED);
			} catch (IllegalConnectorStateException illegalStateException) {
				logger
						.error(
								"Connector could not enter the "
										+ ResourceConnectorState.INITIALISE_FAILED
										+ " state and may not be able to process further requests!",
								illegalStateException);
			}

			InitConnectorException initException = new InitConnectorException(
					"Connector initialisation failed!", e);

			logger.error(initException.getMessage(), initException);

			throw initException;
		} catch (InitConnectorException e) {
			logger.error("Connector initialisation failed!", e);

			throw e;
		}
	}

	/**
	 * Implementation specific method that uses the request properties to
	 * initialise the connector.
	 * 
	 * @since Version 1.1
	 */
	protected abstract void initialiseConnectorImpl()
			throws InitConnectorException;

	/**
	 * @since Version 1.1
	 */
	public final void execute() throws ExecuteConnectorException,
			IllegalConnectorStateException {
		getResource();
	}

	/**
	 * This method has a similar flow of events for all implementations of a
	 * resource connector such as changing states before the resource retrieval
	 * process is initiated.
	 * 
	 * @since Version 1.1
	 */
	public final ResourceVO getResource() throws ExecuteConnectorException,
			IllegalConnectorStateException {
		try {
			ResourceVO resource;

			if (logger.isInfoEnabled()) {
				logger.info("Retrieving resource from the connector...");
			}

			// move to the processing state
			setCurrentState(ResourceConnectorState.PROCESSING);

			// perform the implementation specific resource retrieval process
			resource = getResourceImpl();

			// move to the idle state
			setCurrentState(ResourceConnectorState.IDLE);

			if (logger.isInfoEnabled()) {
				logger.info("... resource acquired");
			}

			return resource;
		} catch (IllegalConnectorStateException e) {
			logger.error("Connector failure!", e);

			throw e;
		} catch (ExecuteConnectorException e) {
			try {
				// move to the processing failed state
				setCurrentState(ResourceConnectorState.PROCESSING_FAILED);
			} catch (IllegalConnectorStateException illegalStateException) {
				logger
						.error(
								"Connector could not enter the "
										+ ResourceConnectorState.PROCESSING_FAILED
										+ " state and may not be able to process further requests!",
								illegalStateException);
			}

			logger.error("Connector failure!", e);

			throw e;
		}
	}

	/**
	 * Implementation specific method that uses the request properties to
	 * retrieve a resource from a service.
	 * 
	 * @since Version 1.1
	 */
	protected abstract ResourceVO getResourceImpl()
			throws ExecuteConnectorException;

	public void setRequestProperties(PropertiesVO requestPropertiesIn)
			throws InitConnectorException {
		try {
			// attempt to enter the pre initialised state
			setCurrentState(ResourceConnectorState.PRE_INITIALISED);

			// validate the new request properties
			supportedProperties.validateProperties(requestPropertiesIn);

			// assign them to the connector
			this.requestProperties = requestPropertiesIn;

			// initialise the connector
			initialiseConnector();
		} catch (IllegalConnectorStateException e) {
			// what state was the connector in before the state change attempt?
			switch (e.getOldState()) {
			case INITIALISING:
				throw new InitConnectorException(
						"The connector is currently initialising "
								+ "and new properties cannot be set on it!", e);
			case PROCESSING:
				throw new InitConnectorException(
						"The connector is currently processing a request "
								+ "and new properties cannot be set on it!", e);
			}
		} catch (InvalidPropertiesException e) {
			throw new InitConnectorException(
					"A problem occured initialising the connector.",
					new InvalidConnectorPropertiesException(
							e.getMessage()
									+ " when attemepting to apply new properties to the connector! "
									+ getSupportedPropertyDetails()));
		}
	}

	public ResourceConnectorState getCurrentState() {
		return currentState;
	}

	/**
	 * Update the current state of the connector. <i>The state of a connector
	 * can only be updated by itself</i>.
	 * 
	 * @param newState
	 *            The new state of the connector.
	 * 
	 * @throws IllegalConnectorStateException
	 * 
	 * @since Version 1.1
	 */
	protected void setCurrentState(ResourceConnectorState newState)
			throws IllegalConnectorStateException {

		switch (getCurrentState()) {
		case INITIALISING:
			// specify the states that can be entered
			if (newState != ResourceConnectorState.INITIALISE_FAILED
					&& newState != ResourceConnectorState.INITIALISED) {
				logger.warn("Connector failed to enter the " + newState
						+ "state!");

				throw new IllegalConnectorStateException(
						"The connector is currently initialising and cannot enter the new state!",
						ResourceConnectorState.INITIALISING, newState,
						new ResourceConnectorState[] {
								ResourceConnectorState.INITIALISE_FAILED,
								ResourceConnectorState.INITIALISED });
			}

			this.currentState = newState;
			break;
		case PROCESSING:
			// specify the states that can be entered
			if (newState != ResourceConnectorState.PROCESSING_FAILED
					&& newState != ResourceConnectorState.IDLE) {
				logger.warn("Connector failed to enter the " + newState
						+ "state!");

				throw new IllegalConnectorStateException(
						"The connector is currently processing and cannot enter the new state!",
						ResourceConnectorState.PROCESSING, newState,
						new ResourceConnectorState[] {
								ResourceConnectorState.PROCESSING_FAILED,
								ResourceConnectorState.IDLE });
			}
			this.currentState = newState;

			break;
		// we can enter new states at any other time
		case PRE_INITIALISED:
		case INITIALISE_FAILED:
		case INITIALISED:
		case PROCESSING_FAILED:
		case IDLE:
			this.currentState = newState;
			break;

		// handle an unknown state
		default:
			throw new IllegalConnectorStateException(
					"The connector did not recognise the new state!",
					getCurrentState(), newState);
		}
	}

	/**
	 * Get the details of the supported properties in a formatted string.
	 * 
	 * @return The details of the supported properties.
	 * 
	 * @since Version 1.1
	 */
	protected final String getSupportedPropertyDetails() {
		StringBuilder propertyDetails = new StringBuilder();

		// start the property details message
		propertyDetails.append("The \"");
		propertyDetails.append(this.getClass().getName());
		propertyDetails
				.append("\"resource connector's required properties are (");

		// add the required property names
		for (String requiredPropertyName : supportedProperties
				.getPropertyNames(PropertyType.REQUIRED_PROPERTIES)) {
			propertyDetails.append(requiredPropertyName);
			propertyDetails.append("|");
		}

		// remove the last "|" character
		propertyDetails.deleteCharAt(propertyDetails.length() - 1);

		propertyDetails.append("); Optional properties are (");

		// add the optional property names
		for (String optionalPropertyName : supportedProperties
				.getPropertyNames(PropertyType.OPTIONAL_PROPERTIES)) {
			propertyDetails.append(optionalPropertyName);
			propertyDetails.append("|");
		}

		// remove the last "|" character
		propertyDetails.deleteCharAt(propertyDetails.length() - 1);

		propertyDetails.append(")");

		return propertyDetails.toString();
	}

	/**
	 * Get the current request properties.
	 * 
	 * @return The current request properties.
	 */
	protected PropertiesVO getRequestProperties() {
		return requestProperties;
	}

	/**
	 * @deprecated
	 */
	public PropertyVO[] getProperties() {
		return supportedProperties.getAllProperties();
	}

	/**
	 * @deprecated
	 */
	public PropertyVO[] getRequiredProperties() {
		return supportedProperties.getRequiredProperties();
	}

	/**
	 * @deprecated
	 */
	public PropertyVO[] getOptionalProperties() {
		return supportedProperties.getOptionalProperties();
	}
}