package com.autometrics.connectors;

import com.autometrics.connectors.exceptions.ExecuteConnectorException;
import com.autometrics.connectors.exceptions.IllegalConnectorStateException;
import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.generics.vo.PropertiesVO;
import com.autometrics.generics.vo.PropertyVO;

/**
 * Interface which all resource connectors must implement.
 * <p>
 * Resource connectors can execute commands on and retrieve resources from
 * services.
 * 
 * @author Barry Evans
 * @since Version 1.0
 * 
 * @see AbstractResourceConnector
 * @see ResourceConnectorFactory
 * @see ResourceConnectorPropertiesFactory
 * @see PropertiesVO
 */
public interface IResourceConnector {
	/**
	 * Execute a command on a connector. Calling this method is similar to calling
	 * the <code>getResource</code> method and not assigning the returned
	 * {@link ResourceVO} to a variable.
	 * <p>
	 * The connector's request properties will determine what logic to perform
	 * on the implementation of the connector.
	 * <p>
	 * Examples of using this method would be to execute a report or some other
	 * operation that the result of which are of no importance, or the operation
	 * does not return any result.
	 * 
	 * @throws ExecuteConnectorException
	 * @throws IllegalConnectorStateException
	 * 
	 * @since Version 1.1
	 */
	public void execute() throws ExecuteConnectorException,
			IllegalConnectorStateException;

	/**
	 * Retrieve a resource from a connector.
	 * <p>
	 * The connector's request properties will determine what logic to perform
	 * during the resource retrieval process.
	 * <p>
	 * The internal data structure that is stored in the returned
	 * {@link ResourceVO} object is determined by the implementation of the
	 * connector and should be cast to the appropriate data type by the object
	 * calling this method i.e. <br>
	 * <code>
	 * ResourceVO theResource = IResourceConnector.getResource();<br>
	 * String[][] results = (String[][]) theResource.getData();
	 * </code>
	 * 
	 * @return The {@link ResourceVO} object containing the data from the
	 *         connector.
	 * 
	 * @throws ExecuteConnectorException
	 * @throws IllegalConnectorStateException
	 * 
	 * @since Version 1.1
	 */
	public ResourceVO getResource() throws ExecuteConnectorException,
			IllegalConnectorStateException;

	/**
	 * Executes a report which does not return any results.<br>
	 * <b>The concrete connector class implements this method.</b>
	 * 
	 * @param properties
	 *            The value object containing the properties to be used when
	 *            executing the report in the connector.
	 * 
	 * @throws Exception
	 * 
	 * @since Version 1.0
	 * 
	 * @deprecated Use the <code>execute</code> method in future.
	 */
	public void executeReport(PropertiesVO properties) throws Exception;

	/**
	 * Executes a report and returns the results in a 2D String array, like a
	 * spreadsheet.<br>
	 * <b>The concrete connector class implements this method.</b>
	 * 
	 * @param properties
	 *            The Value Object containing the properties to be used when
	 *            executing the report in the connector
	 * @return The resulting data in a 2D String array
	 * 
	 * @throws Exception
	 * 
	 * @since Version 1.0
	 * 
	 * @deprecated Use the <code>getResource</code> method in future.
	 */
	public String[][] getReportResults(PropertiesVO properties)
			throws Exception;

	/**
	 * Apply new request properties to the connector.
	 * <p>
	 * Before applying the properties to the connector an attempt is made to
	 * enter the <code>PRE_INITIALISED</code> state to ensure the connector is
	 * in a valid state to accept new properties. If the connector is in the
	 * <code>PROCESSING</code> or <code>INITIALISING</code> states, it is not
	 * possible to set new properties on it.
	 * 
	 * <p>
	 * If the connector is in a valid state,the new properties are validated
	 * against the supported properties before being applied to the connector.
	 * This operation is performed to ensure the connector can function without
	 * problems by having all required properties specified.
	 * <p>
	 * If any required properties are not found, a
	 * {@link InitConnectorException} exception is thrown detailing the
	 * missing required properties. In addition, all required and optional
	 * properties the connector support are listed.
	 * 
	 * @param propertiesIn
	 *            The new properties to apply to the connector.
	 * 
	 * @throws InitConnectorException
	 * 
	 * @since Version 1.1
	 */
	public void setRequestProperties(PropertiesVO propertiesIn)
			throws InitConnectorException;

	/**
	 * Get the current state of connector.
	 * 
	 * @return The current state of the connector.
	 * 
	 * @since Version 1.1
	 */
	public ResourceConnectorState getCurrentState();

	/**
	 * Get all possible properties that the connector can accept
	 * 
	 * @return The collection of property value objects
	 * @deprecated
	 */
	public PropertyVO[] getProperties();

	/**
	 * Get the properties that the connector requires
	 * 
	 * @return The collection of property value objects
	 * @deprecated
	 */
	public PropertyVO[] getRequiredProperties();

	/**
	 * Get the optional properties that the connector accepts
	 * 
	 * @return The collection of property value objects
	 * @deprecated
	 */
	public PropertyVO[] getOptionalProperties();
}