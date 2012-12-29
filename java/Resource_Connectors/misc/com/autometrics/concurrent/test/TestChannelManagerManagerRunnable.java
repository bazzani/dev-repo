package com.autometrics.concurrent.test;

import com.autometrics.concurrent.ChannelManager;
import com.autometrics.connectors.exceptions.UnavailableResourceException;
import com.autometrics.generics.vo.PropertiesVO;

public class TestChannelManagerManagerRunnable implements Runnable {

	/**
	 * The properties to execute the request with.
	 */
	PropertiesVO props;

	/**
	 * The number of seconds for the thread to sleep.
	 */
	int sleepTime;

	/**
	 * Run a request with the specified properties, the sleep time will be auto
	 * generated.
	 * 
	 * @param propsIn
	 *            The request properties.
	 */
	public TestChannelManagerManagerRunnable(PropertiesVO propsIn) {
		this(propsIn, (int) Math.round(1 + (Math.random() * (10 - 1))));
	}

	/**
	 * Run a request with the specified properties and sleep time.
	 * 
	 * @param propsIn
	 *            The request properties
	 * @param sleepTime
	 *            The number of seconds the thread should sleep before
	 *            registering the request with the manager.
	 */
	public TestChannelManagerManagerRunnable(PropertiesVO propsIn, int sleepTime) {
		this.props = propsIn;
		this.sleepTime = sleepTime * 1000;
	}

	public void run() {
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ChannelManager.getInstance().registerRequest(props);
		} catch (UnavailableResourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
