package com.autometrics.connectors;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.util.StringTokenizer;

import javax.activation.DataHandler;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.traversal.DocumentTraversal;
import org.w3c.dom.traversal.NodeFilter;
import org.w3c.dom.traversal.NodeIterator;
import org.xml.sax.SAXException;

import com.autometrics.analytics.v9.j2ee.webservices.v1_0.ArrayOfString;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.ConnectToProject;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.Disconnect;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSAuthMode;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSExecutionFlags_type0;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSResultFlags_type0;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.EnumMWSRunStatusType;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.ExecuteReport;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.GetReportResults;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.MSTRWSJStub;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSAttachmentInfo;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSConnectInfo;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSExecuteInfo;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSProjectSessionInfo;
import com.autometrics.analytics.v9.j2ee.webservices.v1_0.MWSResultsWindow;
import com.autometrics.connectors.exceptions.CreateConnectorException;
import com.autometrics.connectors.exceptions.ExecuteConnectorException;
import com.autometrics.connectors.exceptions.InitConnectorException;
import com.autometrics.generics.vo.PropertiesVO;

/**
 * Concrete resource connector for Dearborn 9 (J2EE).
 * 
 * @author Barry Evans
 * @since Version 1.0
 * 
 * @see IResourceConnector
 * @see AbstractResourceConnector
 * @see ResourceConnectorFactory
 * @see PropertiesVO
 */
public class DearbornConnectorV9J2EE extends AbstractResourceConnector {
	/**
	 * The class's logger.
	 */
	protected static Logger logger = Logger
			.getLogger(DearbornConnectorV9J2EE.class);

	/**
	 * The default timeout period (in ms)
	 */
	protected long defaultTimeout;

	/**
	 * The Dearborn Intelligence server to connect to
	 */
	protected String server;

	/**
	 * The port number to use when connecting to the Intelligence server
	 */
	protected String portno;

	/**
	 * The url of the web service to call
	 */
	protected String websvc;

	/**
	 * The project to connect to
	 */
	protected String project;

	/**
	 * The username to use when connecting to the Intelligence server
	 */
	protected String userid;

	/**
	 * The password to use when connecting to the Intelligence server
	 */
	protected String passwd;

	/**
	 * The report to execute on the Intelligence server
	 */
	protected String report;

	/**
	 * The semi colon (;) delimited list of report prompt questions and answers
	 */
	protected String params;

	/**
	 * A flag to tell the Intelligence server to execute the report against its
	 * cache for that report (true)<br>
	 * or to execute the report fresh against the date warehouse (false)
	 */
	protected String cached;

	/**
	 * The timeout to use when executing the report. If <code>null</code>, the
	 * default timeout will be used
	 */
	protected String timeout;

	/**
	 * The web service object used to execute the report
	 */
	private MSTRWSJStub service;

	/**
	 * The session information object
	 */
	private MWSProjectSessionInfo sessInfo;

	/**
	 * The list of created session(s)
	 */
	private ArrayOfString sessionsArray;

	/**
	 * The connection info object
	 */
	private MWSConnectInfo connectInfoObj;

	/**
	 * The object containing the execution flags
	 */
	private EnumMWSExecutionFlags executionFlagsObj;

	/**
	 * The object containing the execution result flags
	 */
	private EnumMWSResultFlags resultFlagsObj;

	/**
	 * The results window object
	 */
	private MWSResultsWindow resultsWindowObj;

	/**
	 * The ExecuteReport object
	 */
	private ExecuteReport executeReportObj;

	/**
	 * Constructor for the DearbornConnectorV9J2EE class.
	 * 
	 * @throws CreateConnectorException
	 * 
	 * @since Version 1.0
	 */
	public DearbornConnectorV9J2EE(PropertiesVO propertiesIn)
			throws CreateConnectorException {
		super(propertiesIn);

		// set the default timeout to 5 minutes
		// defaultTimeout = 300000;

		// Following needed with JDK/JRE 1.5 - probably break 1.6
		System
				.setProperty("javax.xml.transform.TransformerFactory",
						"com.sun.org.apache.xalan.internal.xsltc.trax.TransformerFactoryImpl");
	}

	/**
	 * Initialise the resource connector with the instance properties.
	 * <p>
	 * A {@link InitConnectorException} exception is thrown if a problem occurs
	 * when attempting to initialise the resource connector.
	 * 
	 * @throws InitConnectorException
	 */
	protected void initialiseConnectorImpl() throws InitConnectorException {
		try {
			// set the default timeout to 5 minutes
			defaultTimeout = 300000;

			// close the session and disconnect from the server if a connection
			// is currently active
			closeSessionAndDisconnect();

			// assign parameters to local variables
			server = requestProperties.getPropertyValue("server");
			portno = requestProperties.getPropertyValue("portno");
			websvc = requestProperties.getPropertyValue("websvc");
			project = requestProperties.getPropertyValue("project");
			userid = requestProperties.getPropertyValue("userid");
			passwd = requestProperties.getPropertyValue("passwd");
			report = requestProperties.getPropertyValue("report");
			params = requestProperties.getPropertyValue("params");
			cached = requestProperties.getPropertyValue("cached");
			timeout = requestProperties.getPropertyValue("timeout");

			// display the parameters
			if (logger.isDebugEnabled()) {
				StringBuilder msg = new StringBuilder();
				String spacer = " - ";

				msg.append("Resource connector properties --> ");
				msg.append("Server: " + server);
				msg.append(spacer);
				msg.append("Port No: " + portno);
				msg.append(spacer);
				msg.append("Web Svc: " + websvc);
				msg.append(spacer);
				msg.append("Project: " + project);
				msg.append(spacer);
				msg.append("User: " + userid);
				msg.append(spacer);
				msg.append("Password: " + passwd);
				msg.append(spacer);
				msg.append("Report: " + report);
				msg.append(spacer);
				msg.append("Parameters: " + params);
				msg.append(spacer);
				msg.append("Cached: " + cached);
				msg.append(spacer);
				msg.append("Timeout: " + timeout);

				logger.debug(msg.toString());
			}

			if (logger.isInfoEnabled()) {
				logger.info("Attempting to retrieve the web service...");
			}

			// create the web service object, using the web service url property
			service = new MSTRWSJStub(websvc);

			if (logger.isInfoEnabled()) {
				logger.info("Web service successfully retrieved!");
			}

			// set the custom timeout if it was specified
			if (timeout.length() > 0) {
				if (logger.isInfoEnabled()) {
					logger.info("Using custom timeout... "
							+ Integer.parseInt(timeout) / 1000 + " seconds");
				}
			} else {
				timeout = String.valueOf(defaultTimeout);

				if (logger.isInfoEnabled()) {
					logger.info("Using default timeout... " + defaultTimeout
							/ 1000 + " seconds");
				}
			}

			// set the timeout on the web service object
			service._getServiceClient().getOptions().setTimeOutInMilliSeconds(
					Long.parseLong(timeout));

			/*********
			 * Add additional timeout properties to the Axis client
			 *********/
			/**
			 * service._getServiceClient().getOptions().setProperty(
			 * HTTPConstants.CONNECTION_TIMEOUT, (int) Long.parseLong(timeout));
			 * service._getServiceClient().getOptions().setProperty(
			 * HTTPConstants.SO_TIMEOUT, (int) Long.parseLong(timeout));
			 * 
			 * if (logger.isDebugEnabled()) { logger
			 * .debug("Before Axis Client Send - TimeOutInMilliSeconds : " +
			 * service._getServiceClient().getOptions()
			 * .getTimeOutInMilliSeconds());
			 * logger.debug("Before Axis Client Send - CONNECTION_TIMEOUT : " +
			 * service._getServiceClient().getOptions().getProperty(
			 * HTTPConstants.CONNECTION_TIMEOUT));
			 * logger.debug("Before Axis Client Send - SO_TIMEOUT : " +
			 * service._getServiceClient().getOptions().getProperty(
			 * HTTPConstants.SO_TIMEOUT)); }
			 **/
			// create the connection info object
			connectInfoObj = new MWSConnectInfo();

			// the authentication details
			connectInfoObj.setLogin(userid);
			connectInfoObj.setPassword(passwd);

			// the project to connect to
			connectInfoObj.setProjectName(project);

			// the server to connect to
			connectInfoObj.setProjectSource(server);

			// set the port number, if it is specified
			if (portno.length() > 0) {
				connectInfoObj.setPortNumber(Integer.parseInt(portno));

				if (logger.isInfoEnabled()) {
					logger.info("Using port # " + portno);
				}
			}

			// standard authentication mode is only available
			connectInfoObj.setAuthMode(EnumMWSAuthMode.MWSStandard);

			// create the object containing the execution flags
			executionFlagsObj = new EnumMWSExecutionFlags();
			EnumMWSExecutionFlags_type0 executionFlagsList[];

			// is the cache parameter present?
			if (cached.equalsIgnoreCase("false")) {
				// execution should bypass the cache if one exists, i.e. run
				// fresh against the date warehouse.
				executionFlagsList = new EnumMWSExecutionFlags_type0[1];

				// add the execution flag
				executionFlagsList[0] = EnumMWSExecutionFlags_type0.MWSNoCache;

				// set the list of execution flags on the object
				// passed to the ExecuteReport/GetReportResults methods
				executionFlagsObj
						.setEnumMWSExecutionFlags_type0(executionFlagsList);
			}

			// create the object containing the execution result flags
			resultFlagsObj = new EnumMWSResultFlags();
			EnumMWSResultFlags_type0 resultFlagsList[] = new EnumMWSResultFlags_type0[2];

			// add the result flags
			resultFlagsList[0] = EnumMWSResultFlags_type0.MWSReturnAsCSV;
			resultFlagsList[1] = EnumMWSResultFlags_type0.MWSCSVNoMetricsColumn;

			// set the list of result flags on the object
			// passed to the ExecuteReport/GetReportResults methods
			resultFlagsObj.setEnumMWSResultFlags_type0(resultFlagsList);

			// create the results window object
			resultsWindowObj = new MWSResultsWindow();
			resultsWindowObj.setStartCol(0);
			resultsWindowObj.setStartRow(0);
			resultsWindowObj.setMaxCols(99999);
			resultsWindowObj.setMaxRows(99999);
		} catch (AxisFault axisException) {
			throw new InitConnectorException(
					"A problem occurred while attempting to retrieve the web service.",
					axisException);
		}
	}

	/**
	 * This implementation of the connector executes a report on a Dearborn
	 * server and returns the results.
	 * 
	 * @throws ExecuteConnectorException
	 * 
	 * @since Version 1.1
	 */
	protected final ResourceVO getResourceImpl()
			throws ExecuteConnectorException {
		ResourceVO resource;

		// open a new session and prepare the connection
		openSessionAndPrepareConnection();

		// get the resource
		resource = new ResourceVO(getReportResults());

		// close the session and connection
		closeSessionAndDisconnect();

		return resource;
	}

	/**
	 * Open a new session and prepare the connection to the server if one is not
	 * currently active.
	 */
	protected void openSessionAndPrepareConnection()
			throws ExecuteConnectorException {
		try {
			// create a new list of created session(s)
			sessionsArray = new ArrayOfString();

			// create the ConnectToProject object
			ConnectToProject connectToProject = new ConnectToProject();
			connectToProject.setCInfo(connectInfoObj);

			if (logger.isInfoEnabled()) {
				logger.info("Attempting to get a session...");
			}

			// create the session info object
			sessInfo = service.ConnectToProject(connectToProject, null)
					.getConnectToProjectResult();

			if (logger.isInfoEnabled()) {
				logger.info("Session retrieved successfully!");
			}

			if (logger.isTraceEnabled()) {
				logger.trace("Session # : " + sessInfo.getSession());
			}

			// add the session to the session string array object
			sessionsArray.addString(sessInfo.getSession());

			// set the session on the connection object
			connectInfoObj.setSession(sessInfo.getSession());

			// create the ExecuteReport object. This object contains all the
			// execution settings for the report
			executeReportObj = new ExecuteReport();
			executeReportObj.setCInfo(connectInfoObj);
			executeReportObj.setSReportName(report);
			executeReportObj.setEFlags(executionFlagsObj);
			executeReportObj.setResultsWindow(resultsWindowObj);
			executeReportObj.setEResults(resultFlagsObj);
		} catch (RemoteException e) {
			throw new ExecuteConnectorException(
					"A problem occurred when attempting to retrieve a session from the service.",
					e);
		}
	}

	/**
	 * Close the session and disconnect from the server if a connection is
	 * currently active.
	 */
	protected void closeSessionAndDisconnect() {
		if (service != null && sessionsArray != null) {
			try {
				// create the Disconnect object
				Disconnect disconnect = new Disconnect();

				// set the session information
				disconnect.setArrSessions(sessionsArray);

				// disconnect the active session
				service.Disconnect(disconnect, null);

				if (logger.isInfoEnabled()) {
					logger.info("Disconnected from server");
				}
			} catch (RemoteException e) {
				logger.error("Error while disconnecting from server", e);
			} finally {
				// deference the session objects
				service = null;
				sessionsArray = null;
			}
		}
	}

	/**
	 * @deprecated Use the <code>getResource</code> method in future.
	 * 
	 * @since Version 1.0
	 */
	public void executeReport(PropertiesVO properties) throws Exception {
		getResource();
	}

	/**
	 * @deprecated Use the <code>getResource</code> method in future.
	 * 
	 * @since Version 1.0
	 */
	public String[][] getReportResults(PropertiesVO properties)
			throws Exception {
		return (String[][]) getResource().getData();
	}

	/**
	 * Executes a report and returns the results in a 2D String array, like a
	 * spreadsheet.
	 * <p>
	 * <i>Version 1.1 changed the method signature from
	 * <code>getReportResults(PropertiesVO)</code> to
	 * <code>getReportResults()</code> as the properties are now set on a
	 * connector during construction (or at another time via the
	 * <code>setrequestProperties</code> method), not when the method is
	 * called.</i>
	 * <p>
	 * Throws a {@link ExecuteConnectorException} if a problem occurs during the
	 * execution of the report.
	 * 
	 * @return The report data in a 2D String array.
	 * 
	 * @throws ExecuteConnectorException
	 * 
	 * @since Version 1.0
	 */
	protected String[][] getReportResults() throws ExecuteConnectorException {
		// 2D String array return object
		String[][] returnData = null;

		try {
			if (logger.isDebugEnabled()) {
				logger.debug("Executing the \"" + report + "\" report...");
			}

			// execute the report
			MWSExecuteInfo ei = service.ExecuteReport(executeReportObj, null)
					.getExecuteReportResult();

			// if (logger.isDebugEnabled()) {
			// logger
			// .debug("After Axis Client Send - TimeOutInMilliSeconds : "
			// + service._getServiceClient().getOptions()
			// .getTimeOutInMilliSeconds());
			//
			// logger.debug("After Axis Client Send - CONNECTION_TIMEOUT : "
			// + service._getServiceClient().getOptions().getProperty(
			// HTTPConstants.CONNECTION_TIMEOUT));
			//
			// logger.debug("After Axis Client Send - SO_TIMEOUT : "
			// + service._getServiceClient().getOptions().getProperty(
			// HTTPConstants.SO_TIMEOUT));
			// }

			// if the execute returned a prompt
			if (ei.getExecuteStatus() == EnumMWSRunStatusType.MWSPrompt) {
				if (logger.isInfoEnabled()) {
					logger
							.info("\""
									+ report
									+ "\" report returned a prompt, replacing values...");
				}

				if (logger.isDebugEnabled()) {
					logger.debug("\"" + report + "\" prompt XML : "
							+ ei.getResultXML());
				}

				// get the array of parameters
				String[][] paramsArray = createParamsArray(params);

				// replace the prompt values in the XML string and
				// return only the prompt response section of the xml
				String sPrompt = parseXMLPrompt(ei.getResultXML(), paramsArray);

				if (logger.isTraceEnabled()) {
					logger.trace("\"" + report
							+ "\" response XML being sent back to server : "
							+ sPrompt);
				}

				// create the GetReportResults object
				GetReportResults getReportResults = new GetReportResults();
				getReportResults.setCInfo(connectInfoObj);
				getReportResults.setSPrompt(sPrompt);
				getReportResults.setSRptID(ei.getObjID());
				getReportResults.setSMsgID(ei.getMsgID());
				getReportResults.setEFlags(executionFlagsObj);
				getReportResults.setResultsWindow(resultsWindowObj);
				getReportResults.setEResults(resultFlagsObj);

				// get the report results (again), all prompts will be
				// automatically answered this time
				ei = service.GetReportResults(getReportResults, null)
						.getGetReportResultsResult();
			}

			// if any attachments were retrieved
			if (ei.getAttachInfo() != null) {
				// get the attachment info object
				MWSAttachmentInfo[] aInfo = ei.getAttachInfo()
						.getMWSAttachmentInfo();

				// object to handle the attachment
				DataHandler dh = aInfo[0].getBinaryData();

				// create an input stream for the attachment
				InputStream in = dh.getInputStream();

				// convert the attachment to a byte arrays
				byte[] out = new byte[in.available()];

				// read from the input stream
				in.read(out);

				// convert the data to data to return to a 2D String array
				returnData = convertTo2DStringArray(out);

				if (logger.isInfoEnabled()) {
					logger.info("\"" + report + "\" report returned "
							+ returnData.length + " ROWS (with "
							+ returnData[0].length + " COLUMNS)");
				}
			}
		} catch (UnsupportedEncodingException e) {
			throw new ExecuteConnectorException(e);
		} catch (RemoteException e) {
			throw new ExecuteConnectorException(e);
		} catch (IOException e) {
			throw new ExecuteConnectorException(e);
		}

		return returnData;
	}

	/**
	 * Convert a byte array to a two dimensional String array.
	 * 
	 * @param bytesIn
	 *            The byte array to convert.
	 * @return The two dimensional String array.
	 * 
	 * @throws UnsupportedEncodingException
	 */
	private String[][] convertTo2DStringArray(byte[] bytesIn)
			throws UnsupportedEncodingException {
		// a string tokenizer delimiting on carriage returns & new lines
		StringTokenizer rowTokenizer = null;

		// counters for the size of the 2D array to return
		int rows = 0, columns = 0;

		// the 2D String array
		String[][] returnArray = new String[0][0];

		// create a string tokenizer delimiting on carriage returns & new
		// lines
		rowTokenizer = new StringTokenizer(new String(bytesIn, "UTF-16"),
				"\r\n");

		// iterate the string tokens (each line)
		while (rowTokenizer.hasMoreTokens()) {
			// get the next token (line of text)
			String innerText = rowTokenizer.nextToken();

			// if we are processing the first row
			// Only need to count the header once - not once for each row
			// ....
			if (rows == 0) {
				// create a string tokenizer for the columns
				StringTokenizer colTokenizer = new StringTokenizer(innerText,
						",");

				// for each column
				while (colTokenizer.hasMoreTokens()) {
					// move on to the next column
					colTokenizer.nextToken();

					// increment the number of columns in the return data
					columns++;
				}
			}

			// increment the number of rows in the return data
			rows++;
		}

		// create the 2D array
		returnArray = new String[rows][columns];

		// create a string tokenizer delimiting on carriage returns & new
		// lines
		rowTokenizer = new StringTokenizer(new String(bytesIn, "UTF-16"),
				"\r\n");

		// reset the row number
		rows = 0;

		// process each row
		while (rowTokenizer.hasMoreTokens()) {
			// reset the column number
			columns = 0;

			// get the current row's text value
			String rowString = rowTokenizer.nextToken();

			// set the current row's columnar values
			returnArray[rows] = parseCSVRow(rowString, returnArray[0].length);

			rows++;
		}

		return returnArray;
	}

	/**
	 * Parse a row in the CSV report result
	 * 
	 * @param line
	 *            The String containing the columnar data that needs to be
	 *            parsed
	 * @param count
	 *            The number of columns of data
	 * @return row The processed row
	 */
	private String[] parseCSVRow(String line, int count) {
		String[] retVal = new String[count];

		// replace any blank Strings (empty columns) with quotation marks
		line = replaceBlanksInString(line);

		// split the string using the quote|comma|quote (",") delimiter
		String[] delimString = line.split("\",\"");

		// iterate the array containing the split string elements
		for (int i = 0; i < delimString.length; i++) {
			// the first element
			if (i == 0) {
				// remove the first character (a quote)
				delimString[i] = delimString[i].substring(1);
			}
			// the last element
			else if (i == delimString.length - 1) {
				// remove the last character (a quote)
				delimString[i] = delimString[i].substring(0, delimString[i]
						.length() - 1);
			}
		}

		// set the return value
		retVal = delimString;

		if (logger.isTraceEnabled()) {
			logger.trace(line);
		}

		return retVal;
	}

	/**
	 * Replace any blank Strings (empty columns) in a comma-delimited String
	 * with quotation marks. The default delimiter is a comma (,)
	 * 
	 * @param inString
	 *            The String to search in
	 * @return outString The modified String
	 */
	private String replaceBlanksInString(String inString) {
		return replaceBlanksInString(inString, ",");
	}

	/**
	 * Replace any blank Strings (empty columns) in a comma-delimited String
	 * with quotation marks
	 * 
	 * @param inString
	 *            The String to search in
	 * @param delimiter
	 *            The String used to delimit the main String
	 * @return outString The modified String
	 */
	private String replaceBlanksInString(String inString, String delimiter) {
		// convert the string to a String array
		String[] stringArray = inString.split(delimiter);

		// was a blank found in the string
		boolean blankFound = false;

		// process each String
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(" ")) {
				// replace the blank with an empty String
				stringArray[i] = "\"\"";

				// flag that a blank was found
				blankFound = true;
			}
		}

		// return the updated String if necessary
		if (blankFound) {
			// create a StringBuilder to convert the String[] to a String
			StringBuilder stringBuilder = new StringBuilder();

			if (stringArray.length > 0) {
				// append the first String
				stringBuilder.append(stringArray[0]);

				// process the remaining Strings
				for (int i = 1; i < stringArray.length; i++) {
					// append the delimiter
					stringBuilder.append(delimiter);

					// append the String
					stringBuilder.append(stringArray[i]);
				}
			}

			return stringBuilder.toString();
		} else {
			return inString;
		}
	}

	/**
	 * Convert a string of parameters to a two dimensional String array <br>
	 * <b>** Currently limited to 10 parameters **</b>
	 * 
	 * @param params
	 *            The string of delimited parameters
	 * @return paramArray The parameters in a two dimensional String array
	 */
	private String[][] createParamsArray(String params) {
		String[][] paramArray = new String[10][2];

		StringTokenizer st1 = new StringTokenizer(params, ";");
		int outer = 0;
		while (st1.hasMoreTokens()) {
			String innerText = st1.nextToken();
			StringTokenizer st2 = new StringTokenizer(innerText, ":");
			int inner = 0;
			while (st2.hasMoreTokens()) {
				paramArray[outer][inner] = st2.nextToken();
				inner++;
			}
			outer++;
		}

		return paramArray;
	}

	/**
	 * Parse the xml returned from executing a report which requires values to
	 * be set before execution can complete. Only the prompt section of the XML
	 * will be returned, not the complete XML string parameter
	 * 
	 * @param xmlData
	 *            The XML data retrieved from executing the report and receiving
	 *            a prompt response
	 * @param paramsArray
	 *            The two dimensional String array passed used to insert values
	 *            into the prompt response
	 * @return xmlResult The resulting XML String
	 */
	private String parseXMLPrompt(String xmlData, String[][] paramsArray) {
		String xmlResult = "";

		try {
			// using factory get an instance of document builder
			DocumentBuilder parser = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder();

			// Check for the traversal module
			DOMImplementation impl = parser.getDOMImplementation();
			if (!impl.hasFeature("traversal", "2.0")) {
				logger
						.error("A DOM implementation that supports traversal is required.");

				return xmlData;
			}

			// read the XML document into an input stream
			ByteArrayInputStream xmlParseInputStream = new ByteArrayInputStream(
					xmlData.getBytes());

			// parse the document using the builder to get DOM representation of
			// the XML file
			Document doc = parser.parse(xmlParseInputStream);

			// normalise the XML document
			doc.getDocumentElement().normalize();

			// the document to return (initially a copy of the input document)
			Document returnDoc = doc;

			// Create the NodeIterator
			DocumentTraversal traversable = (DocumentTraversal) doc;
			NodeIterator iterator = traversable.createNodeIterator(doc,
					NodeFilter.SHOW_ELEMENT, null, true);

			// Iterate over the prompt response, we are looking for the <oi>
			// nodes at "mi/rit/rsl/mi/in"
			Node node = iterator.nextNode();
			if (node.getNodeName().equalsIgnoreCase("mi")) {
				NodeList miNodes = node.getChildNodes();

				// process the mi node children
				for (int miCounter = 0; miCounter < miNodes.getLength(); miCounter++) {
					node = miNodes.item(miCounter);

					if (node.getNodeType() == Node.ELEMENT_NODE
							&& node.getNodeName().equalsIgnoreCase("rit")) {
						NodeList ritNodes = node.getChildNodes();

						// process the mi/rit node children
						for (int ritCounter = 0; ritCounter < ritNodes
								.getLength(); ritCounter++) {
							node = ritNodes.item(ritCounter);

							if (node.getNodeType() == Node.ELEMENT_NODE
									&& node.getNodeName().equalsIgnoreCase(
											"rsl")) {
								NodeList rslNodes = node.getChildNodes();

								// process the mi/rit/rsl node children
								for (int rslCounter = 0; rslCounter < rslNodes
										.getLength(); rslCounter++) {
									node = rslNodes.item(rslCounter);

									if (node.getNodeType() == Node.ELEMENT_NODE
											&& node.getNodeName()
													.equalsIgnoreCase("mi")) {
										// capture the result node, we will
										// return this at the end of the method
										Node resultNode = node;

										NodeList rslMiNodes = node
												.getChildNodes();

										// process the mi/rit/rsl/mi node
										// children
										for (int rslMiCounter = 0; rslMiCounter < rslMiNodes
												.getLength(); rslMiCounter++) {
											node = rslMiNodes
													.item(rslMiCounter);

											if (node.getNodeType() == Node.ELEMENT_NODE
													&& node.getNodeName()
															.equalsIgnoreCase(
																	"in")) {
												NodeList inNodes = node
														.getChildNodes();

												// process the mi/rit/rsl/mi/in
												// node children
												for (int inCounter = 0; inCounter < inNodes
														.getLength(); inCounter++) {
													node = inNodes
															.item(inCounter);

													if (node.getNodeType() == Node.ELEMENT_NODE
															&& node
																	.getNodeName()
																	.equalsIgnoreCase(
																			"oi")) {
														// process the
														// mi/rit/rsl/mi/in/oi/mi
														// node children
														Node inNode = null;
														Node pifNode = null;
														NodeList oiNodes = node
																.getChildNodes();

														if (oiNodes.getLength() > 0) {
															NodeList promptNodes = oiNodes
																	.item(0)
																	.getChildNodes();

															// process the
															// mi/rit/rsl/mi/in/oi
															// node children
															for (int promptCounter = 0; promptCounter < promptNodes
																	.getLength(); promptCounter++) {
																Node promptNode = promptNodes
																		.item(promptCounter);

																if (promptNode
																		.getNodeType() == Node.ELEMENT_NODE) {
																	if (promptNode
																			.getNodeName()
																			.equalsIgnoreCase(
																					"in")) {
																		inNode = promptNodes
																				.item(promptCounter);
																	}
																	if (promptNode
																			.getNodeName()
																			.equalsIgnoreCase(
																					"pif")) {
																		pifNode = promptNodes
																				.item(promptCounter);
																	}
																}
															}

															// replace the
															// values in the
															// prompt from the
															// parameters passed
															// into the method
															// call
															replacePromptValue(
																	inNode,
																	pifNode,
																	paramsArray);
														}
													}
												}
											}
										}

										// replace the parent node with the
										// modified result node
										// in the document we will use for the
										// return String
										returnDoc.replaceChild(resultNode,
												returnDoc.getFirstChild());
									}
								}
							}
						}
					}
				}

				// XML transformer
				TransformerFactory tFactory = TransformerFactory.newInstance();
				Transformer transformer = tFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT, "yes");
				transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,
						"yes");

				StreamResult result = new StreamResult(new StringWriter());
				DOMSource source = new DOMSource(returnDoc);
				transformer.transform(source, result);

				xmlResult = result.getWriter().toString();
			}
		} catch (SAXException e) {
			logger.error("Prompt is not well-formed.", e);
		} catch (IOException e) {
			logger
					.error(
							"Due to an IOException, the parser could not check prompt.",
							e);
		} catch (FactoryConfigurationError e) {
			logger.error("Could not locate a factory class.", e);
		} catch (ParserConfigurationException e) {
			logger.error("Could not locate a JAXP parser.", e);
		} catch (TransformerConfigurationException e) {
			logger.error("Could not locate a valid Transformer.", e);
		} catch (TransformerException e) {
			logger.error("Problems converting document to string.", e);
		}

		return xmlResult;
	}

	/**
	 * Replace the value of a prompt question
	 * 
	 * @param inNode
	 *            the mi/rit/rsl/mi/in/oi/in node from the response XML
	 * @param pifNode
	 *            the mi/rit/rsl/mi/in/oi/pif node from the response XML
	 * @param paramsArray
	 *            2D string array of parameters & values used to replace the
	 *            prompt values
	 */
	private void replacePromptValue(Node inNode, Node pifNode,
			String[][] paramsArray) {
		// get the <in> node's children
		NodeList inKids = inNode.getChildNodes();

		// get the <in> node's attributes
		NamedNodeMap inAttributes = inKids.item(0).getAttributes();

		// get the <oi> node's 'n' attribute (its description)
		Node oiNodeDescAttribute = inAttributes.getNamedItem("n");

		// get the 'n' attribute's value
		String promptDescription = oiNodeDescAttribute.getNodeValue();

		// get the <pif> node's attributes
		NamedNodeMap pifAttributes = pifNode.getAttributes();

		// get the <pif> node's 'pt' attribute type (its type)
		Node pifNodeTypeAttribute = pifAttributes.getNamedItem("pt");

		// get the 'pt' attribute's value
		String pifType = pifNodeTypeAttribute.getNodeValue();

		// get the node name (the prompt field name)
		String pifPromptName = pifAttributes.getNamedItem("ttl").getNodeValue();

		if (inKids.getLength() == 1) {
			// process a prompt providing a list of answers
			if (pifType.equals("6")) {
				// get the value(s) to replace on the prompt from the parameters
				String promptListText = lookupParameter(promptDescription,
						paramsArray);
				// String nodeValue = lookupParameter(pifPromptName,
				// paramsArray);

				// has the prompt been found in the specified parameters?
				if (promptListText.length() > 0) {
					// get the pif node child nodes
					NodeList pifKids = pifNode.getChildNodes();

					// remove the pif/<pa isd=1> node
					pifNode.removeChild(pifKids.item(1));

					// remove the pif/<pa ip=1> node
					pifNode.removeChild(pifKids.item(1));

					// get the pif/<pa ia=1> node
					Node promptAnswerRootNode = pifKids.item(0);

					// get the pif/pa child nodes
					NodeList paIAKids = promptAnswerRootNode.getChildNodes();

					// get the pif/pa/mi node
					Node iaMINode = paIAKids.item(0);

					// get the pif/pa/mi/in (answer referneces) node
					Node promptAnswersRefNode = iaMINode.getChildNodes()
							.item(0);

					// get the pif/pa/mi/fct (answers) node
					Node promptAnswersNode = iaMINode.getChildNodes().item(1);

					// get the pif/<pa il=1> node
					Node promptAnswerListRootNode = pifKids.item(1);

					// get the pif/pa child nodes
					NodeList paILKids = promptAnswerListRootNode
							.getChildNodes();

					// get the pif/pa/mi node
					Node ilMINode = paILKids.item(0);

					// get the pif/pa/mi/in (available answer references) node
					Node promptAnswerListRefNode = ilMINode.getChildNodes()
							.item(0);

					// get the pif/pa/mi/fct (available answers) node
					Node promptAnswerListNode = ilMINode.getChildNodes()
							.item(1);

					if (logger.isDebugEnabled()) {
						logger.debug("Replacing Report Prompt List ("
								+ promptDescription + ")...");
					}

					// split the parameter list values with a comma delimiter
					String[] parameterListValues = promptListText.split(",");

					// get the pif/pa/mi/in (available answer references) child
					// nodes
					NodeList ansRefNodes = promptAnswerListRefNode
							.getChildNodes();

					// get the pif/pa/mi/fct (available answers) child nodes
					NodeList ansNodes = promptAnswerListNode.getChildNodes();

					// all prompt answers need to be added to the answers node
					if (promptListText.equalsIgnoreCase("!A[ALL]")) {
						if (logger.isDebugEnabled()) {
							logger.debug("Adding ALL available answers...");
						}

						// process each available prompt answer in the list
						for (int ansCounter = 0; ansCounter < ansRefNodes
								.getLength(); ansCounter++) {
							// get the <oi> node's n attribute
							String ansValue = ansRefNodes.item(ansCounter)
									.getAttributes().getNamedItem("n")
									.getNodeValue();

							// if an answer is found
							if (ansValue.length() > 0) {
								if (logger.isDebugEnabled()) {
									logger.debug("Adding [" + ansValue + "]");
								}

								// add the <oi> node to the returned answer
								// referneces node
								promptAnswersRefNode.appendChild(ansRefNodes
										.item(ansCounter));

								// add the <at> node to the returned answers
								// node
								// (-1 as the <oi> nodes have an extra entry)
								promptAnswersNode.appendChild(ansNodes
										.item(ansCounter - 1));

								// decrement the counter as the list as an
								// element has been removed
								ansCounter--;
							}
						}
					} else {
						// process each parameter list value
						for (int paramCounter = 0; paramCounter < parameterListValues.length; paramCounter++) {
							// get the current parameter list value
							String paramValue = parameterListValues[paramCounter];

							// process each available prompt answer in the list
							for (int ansCounter = 0; ansCounter < ansRefNodes
									.getLength(); ansCounter++) {
								// get the <oi> node's n attribute
								String ansValue = ansRefNodes.item(ansCounter)
										.getAttributes().getNamedItem("n")
										.getNodeValue();

								// if the answer is in the parameter list values
								if (ansValue.equalsIgnoreCase(paramValue)) {
									if (logger.isDebugEnabled()) {
										logger.debug("Adding [" + ansValue
												+ "]");
									}

									// add the <oi> node to the returned answer
									// referneces node
									promptAnswersRefNode
											.appendChild(ansRefNodes
													.item(ansCounter));

									// add the <at> node to the returned answers
									// node
									// (-1 as the <oi> nodes have an extra
									// entry)
									promptAnswersNode.appendChild(ansNodes
											.item(ansCounter - 1));

									break;
								}
							}
						}
					}

					// close the prompt
					closePrompt(pifAttributes);
				}
			} else
			// else if(pifType.equals("10"))
			{
				// get the pif node child nodes
				NodeList pifKids = pifNode.getChildNodes();

				// get the pif/pa node
				Element paNode = (Element) pifKids.item(0);

				// get the pif/pa child nodes
				NodeList paKids = paNode.getChildNodes();

				// get the value to replace on the prompt from the parameters
				// String nodeValue = lookupParameter(oiNodeDesc, paramsArray);
				String nodeValue = lookupParameter(pifPromptName, paramsArray);

				// has the prompt been found in the specified parameters?
				boolean foundPromptDescription = nodeValue.length() > 0;

				// if we have found the prompt in the parameters, replace the
				// values
				if (foundPromptDescription) {
					// process a text node
					if (paKids.item(0) instanceof Text) {
						Text textNode = (Text) paKids.item(0);

						// replace with nothing
						if (nodeValue.equalsIgnoreCase("!A[ALL]")) {
							if (logger.isDebugEnabled()) {
								logger.debug("Replacing Report Prompt Value ("
										+ pifPromptName + "): "
										+ textNode.getData()
										+ " with <nothing>");
							}

							textNode.setData("");

							// close the prompt
							closePrompt(pifAttributes);
						}
						// replace with the value from the parameters
						else {
							if (logger.isDebugEnabled()) {
								logger.debug("Replacing Report Prompt Value ("
										+ pifPromptName + "): "
										+ textNode.getData() + " with "
										+ nodeValue);
							}

							textNode.setData(nodeValue);

							// close the prompt
							closePrompt(pifAttributes);
						}
					}
					// process a date (tp/stt node)
					else {
						// get the tp node
						Element tpNode = (Element) paKids.item(0);

						// get the tp child nodes
						NodeList tpKids = tpNode.getChildNodes();

						// if any child nodes exist
						if (tpKids.getLength() > 0) {
							// get the stt node
							Node sttNode = (Node) tpKids.item(0);

							// get the node's attributes
							NamedNodeMap sttAttributes = sttNode
									.getAttributes();

							if (logger.isDebugEnabled()) {
								logger.debug("Replacing Report Prompt Value ("
										+ pifPromptName
										+ "): "
										+ sttAttributes.getNamedItem("stv")
												.getNodeValue() + " with "
										+ nodeValue);
							}

							// replace with the value from the parameters
							sttAttributes.getNamedItem("stv").setNodeValue(
									nodeValue);

							// close the prompt
							closePrompt(pifAttributes);
						}
					}
				}
			}
		} else if (inKids.getLength() == 2) {
			// Free format prompt
			NamedNodeMap attributes = inKids.item(1).getAttributes();
			Node didNode = attributes.getNamedItem("did");
			Node descNode = attributes.getNamedItem("n");
			String didText = didNode.getNodeValue();
			String descText = descNode.getNodeValue();

			NodeList pifKids = pifNode.getChildNodes();
			Node paNode = pifKids.item(0);

			NodeList paKids = paNode.getChildNodes();
			Node miNode = paKids.item(0);

			NodeList miKids = miNode.getChildNodes();
			Node esNode = miKids.item(1);

			NodeList esKids = esNode.getChildNodes();
			Node eNode = esKids.item(1);

			NamedNodeMap eAtts = eNode.getAttributes();

			Node eiNode = eAtts.getNamedItem("ei");
			Node disp_nNode = eAtts.getNamedItem("disp_n");

			String nodeValue = lookupParameter(descText, paramsArray);
			// System.out.println("Replacing: " + eiNode.getTextContent() +
			// " with " + nodeValue);
			eiNode.setNodeValue(didText + ":" + nodeValue);
			disp_nNode.setNodeValue(nodeValue);
		}
	}

	/**
	 * Close a prompt by setting its 'cl' attribute
	 * 
	 * @param pifAttributes
	 */
	private void closePrompt(NamedNodeMap pifAttributes) {
		// update the node value to flag that the prompt is closed
		pifAttributes.getNamedItem("cl").setNodeValue("1");
	}

	/**
	 * Return the value of a specified parameter
	 * 
	 * @param name
	 *            The parameter name
	 * @param paramsArray
	 *            The 2D String array of parameters
	 * @return The parameter value
	 */
	private String lookupParameter(String name, String[][] paramsArray) {
		for (int i = 0; i < paramsArray.length; i++) {
			if (paramsArray[i][0] != null) {
				if (paramsArray[i][0].equalsIgnoreCase(name)) {
					return paramsArray[i][1];
				}
			}
		}
		return "";
	}
}