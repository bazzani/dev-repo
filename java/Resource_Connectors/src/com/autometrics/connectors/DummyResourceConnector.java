package com.autometrics.connectors;

import org.apache.log4j.Logger;

import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.connectors.exceptions.ExecuteConnectorException;
import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Dummy resource connector class that simulates delayed responses to requests.
 * 
 * @author Barry Evans
 * @since Version 1.1
 */
public class DummyResourceConnector extends AbstractResourceConnector {
	private static Logger logger = Logger
			.getLogger(DummyResourceConnector.class);

	/**
	 * Method performs no action.
	 * 
	 * @throws CreateConnectorException
	 */
	public DummyResourceConnector(PropertiesVO propertiesIn)
			throws CreateConnectorException {
		super(propertiesIn);
	}

	/**
	 * Method performs no action.
	 */
	protected void initialiseConnectorImpl()
			throws InitConnectorException {
		logger.debug("in initConnector()");
	}

	protected final ResourceVO getResourceImpl()
			throws ExecuteConnectorException {
		logger.debug("in getResource()");

		int sleepTime = (int) Math.round(Math.random() * 5000);

		System.out.println("Resource connector sleeping for : " + sleepTime
				+ "\n");

		// make the thread sleep for random time between 1-5 seconds
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String[][] data = new String[sleepTime][50];

		for (int i = 0; i < sleepTime; i++) {
			for (int j = 0; j < 50; j++) {
				if (i % 2 == 0) {
					data[i][j] = getRequestProperties().getPropertyValue(
							"server");
				} else {
					data[i][j] = getRequestProperties().getPropertyValue(
							"project");
				}
			}
		}

		return new ResourceVO(data);
	}

	/**
	 * Method performs no action.
	 * 
	 * @deprecated Use the <code>getResource</code> method in future.
	 * 
	 * @since Version 1.0
	 */
	public void executeReport(PropertiesVO properties) throws Exception {
		execute();
	}

	/**
	 * Get dummy report results, with a random delay
	 * 
	 * @deprecated Use the <code>getResource</code> method in future.
	 * 
	 * @since Version 1.0
	 */
	public String[][] getReportResults(PropertiesVO properties)
			throws Exception {
		return (String[][]) getResource().getData();
	}
}