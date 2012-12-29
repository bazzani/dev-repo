import java.util.ArrayList;

import javax.xml.bind.PropertyException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.autometrics.connectors.ResourceConnectorState;
import com.autometrics.connectors.exceptions.IllegalConnectorStateException;
import com.autometrics.connectors.exceptions.InvalidConnectorPropertiesException;
import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.generics.exceptions.InvalidPropertiesException;
import com.autometrics.generics.exceptions.RequiredPropertiesMissingException;

public class ExceptionsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.autometrics.generics.exceptions.InvalidPropertiesException#getMessage()}
	 * .
	 */
	// @Test
	public void testGetMessageFromSubClass() {
		ArrayList<String> s = new ArrayList<String>();
		s.add("Property 1");
		s.add("Property 2");

		try {
			try {
				throw new RequiredPropertiesMissingException(s);
			} catch (InvalidPropertiesException ex) {
				throw new InitConnectorException(
						"A problem occured initialising the connector.",
						new InvalidConnectorPropertiesException(
								ex.getMessage()
										+ " when attemepting to apply properties to the connector! "
										+ getSupportedPropertyDetails()));
			}
		} catch (InitConnectorException ex) {
			ex.printStackTrace();
		}
	}

	private String getSupportedPropertyDetails() {
		return "Sample property details.";
	}

	// @Test
	public void test() throws InitConnectorException {
		tryTest();
	}

	private void tryTest() throws InitConnectorException {
		System.out.println("\nInitialising the resource connector...");

		try {
			// move to the initialising state
			// setCurrentState(ResourceConnectorState.INITIALISING);

			// perform the implementation specific initialisation process
			initConnector();

			// move to the initialised state
			setCurrentState(ResourceConnectorState.INITIALISED);

			System.out
					.println("\n...resource connector initialisation complete");
		} catch (IllegalConnectorStateException ex) {
			System.out.println(ex.getMessage());
			// ex.printStackTrace();
			throw new InitConnectorException(ex);
		} catch (InitConnectorException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println("\n...resource connector initialisation failed");
		}

	}

	private void setCurrentState(ResourceConnectorState s)
			throws IllegalConnectorStateException {
		throw new IllegalConnectorStateException("bad state",
				ResourceConnectorState.INITIALISING,
				ResourceConnectorState.PRE_INITIALISED);
	}

	private void initConnector() throws InitConnectorException {
		throw new InitConnectorException("bad init",
				new IllegalConnectorStateException("bad state",
						ResourceConnectorState.INITIALISING,
						ResourceConnectorState.PRE_INITIALISED));
	}

	@Test
	public void test2() throws Exception {
		try {
			try {
				// /System.out.println("\nbefore ex 1");

				throwing("state1 exeception");

				System.out.println("\nafter ex 1");
			} catch (PropertyException e) {
				System.out.println("\nbefore ex 2");

				throw new Exception(e);
			} catch (Exception e) {
				try {
					throwing("state2 exeception");
				} catch (Exception e2) {
					e2.printStackTrace();
				}

				// System.out.println("\nafter ex 2");

				// System.out.println("\nbefore ex 2");
				new InitConnectorException(
						"Resource connector initialisation failed!", e)
						.printStackTrace();

				throw new InitConnectorException(e);
			}
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	private void throwing(String s) throws Exception {
		throw new Exception(s);
		// throw new PropertyException(s);
	}
}