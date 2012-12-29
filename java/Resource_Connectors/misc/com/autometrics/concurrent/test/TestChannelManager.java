package com.autometrics.concurrent.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.autometrics.concurrent.ChannelManager;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.generics.vo.PropertiesVO;

public class TestChannelManager {

	public static void main(String[] args) {
		System.out.println((int) Math.round(1 + (Math.random() * (3))));
		// TestChannelManager test = new TestChannelManager();
		// TestChannelManager test = new TestChannelManager(4);
		// TestChannelManager test = new TestChannelManager(3, 10);
	}

	/**
	 * Constructor that runs tests using the dummy data connector to simulate
	 * delays in responses from data requests to back end servers.
	 * <p>
	 * <b>3 channels will be used, and 10 requests will be sent</b>.
	 */
	public TestChannelManager() {
		this(3);
	}

	/**
	 * Constructor that runs tests using the dummy data connector to simulate
	 * delays in responses from data requests to back end servers.
	 * <p>
	 * The number of channels are specified, <b>10 requests will be sent</b>.
	 * 
	 * @param channels
	 *            The maximum number of channels to create
	 */
	public TestChannelManager(int channels) {
		this(channels, 10);
	}

	/**
	 * Constructor that runs tests using the dummy data connector to simulate
	 * delays in responses from data requests to back end servers.
	 * <p>
	 * The number of channels are specified, and so are the number of requests.
	 * 
	 * @param channels
	 *            The maximum number of channels to create
	 * @param requests
	 *            The number of requests to simulate
	 */
	public TestChannelManager(int channels, int requests) {
		try {
			int numChannels = channels;
			int numRequests = requests;

			ArrayList<PropertiesVO> properties = new ArrayList<PropertiesVO>(
					numChannels);

			System.out.println("");
			System.out.println("------------------------------");
			System.out.println("TestChannelManager Start");
			System.out.println("------------------------------");
			System.out.println("");
			System.out.println(" # Channels : " + numChannels);
			System.out.println(" # Requests : " + numRequests);
			System.out.println("");

			// create the unique requests
			for (int i = 1; i <= numChannels; i++) {
				// first testProperties object
				properties.add(new PropertiesVO(new String[] { "concurrent",
						"server", "websvc", "project", "userid", "passwd",
						"report", "params", "verbose", "connectorversion" },
						new String[] { "true", "Request #" + i, "", "", "", "",
								"", "", "",
								ResourceConnectorFactory.DUMMY_CONNECTOR }));
			}

			for (int i = 1; i <= numRequests; i++) {
				int propertyIndex = (int) Math
						.round(1 + (Math.random() * (numChannels - 1)));

				// System.out.println(propertyIndex);
				String threadName = "Test #" + i + "(Request #" + propertyIndex
						+ ")";

				Thread t;

				// generate random thread sleep time
				if (i % 3 == 0) {
					t = new Thread(new TestChannelManagerManagerRunnable(
							properties.get(propertyIndex - 1), 4), threadName);
				}
				// set thread sleep time to 4 seconds
				else {
					t = new Thread(new TestChannelManagerManagerRunnable(
							properties.get(propertyIndex - 1)), threadName);
				}

				t.start();
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Constructor that accepts a number of {@link PropertiesVO} objects that
	 * will be used to submit requests to the {@link ChannelManager}.
	 * 
	 * @param propsIn
	 *            The {@link ArrayList} of {@link PropertiesVO} objects
	 */
	public TestChannelManager(ArrayList<PropertiesVO> propsIn) {
		Thread t;
		int sleepTime;

		for (Iterator<PropertiesVO> i = propsIn.iterator(); i.hasNext();) {
			PropertiesVO props = i.next();

			// generate a random sleep time from 1 - 4 seconds
			sleepTime = (int) Math.round(1 + (Math.random() * (3)));

			t = new Thread(new TestChannelManagerManagerRunnable(props,
					sleepTime));
			t.start();
		}
	}
}