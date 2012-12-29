import org.apache.log4j.Logger;

import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.generics.exceptions.RequiredPropertiesMissingException;

public class Log4jExceptionTest {
	public static void main(String[] args) {
		Logger logger = Logger.getRootLogger();

		// RequiredPropertiesMissingException r = new
		// RequiredPropertiesMissingException("Properties are wrong");
		//		
		// logger.debug("Bad Properties!", r);
		//		
		// logger.error("after");

		try {
			System.out.println("before exception");
			throw new InitConnectorException("Init exception");
		} catch (InitConnectorException ex) {
			ex.printStackTrace();
		}
		System.out.println("after exception");
	}
}
