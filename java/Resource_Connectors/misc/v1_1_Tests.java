

import org.apache.log4j.Logger;

import com.autometrics.concurrent.ChannelManager;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.exceptions.UnavailableResourceException;
import com.autometrics.generics.exceptions.PropertiesVOCreationException;
import com.autometrics.generics.vo.PropertiesVO;

public class v1_1_Tests implements Runnable {
	private static Logger logger = Logger.getLogger(v1_1_Tests.class);

	public static void main(String[] args) {
		// create a data connector properties VO
		PropertiesVO vo;

		try {
			vo = new PropertiesVO(new String[] { "server", "websvc", "project",
					"userid", "passwd", "report", "timeout",
					ResourceConnectorFactory.CONNECTOR_VERSION, "concurrent" },
					new String[] { "localhost",
							"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
							"PulseWS", "Administrator", "1911manning",
							"Live_DS1_P2_E1_Make_Segment_Model_Series_Cube",
							"540000",
							ResourceConnectorFactory.DUMMY_CONNECTOR, "true" });

			int i = 0;

			while (i < 5) {
				Thread t = new Thread(new v1_1_Tests(vo));
				t.start();
			}
		} catch (PropertiesVOCreationException e) {
			logger.debug(e.getMessage(), e);
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public v1_1_Tests(PropertiesVO vo) {
		this.vo = vo;
	}

	public PropertiesVO vo;

	public void run() {
		processRequest(this.vo);
	}

	private void processRequest(PropertiesVO vo) {
		try {

			String[][] theData = (String[][]) ChannelManager.getInstance()
					.registerRequest(vo).getData();

			logger.debug("Returned data : " + theData.length + ":"
					+ theData[0].length);
		} catch (UnavailableResourceException e) {
			logger.debug(e.getMessage(), e);
			// e.printStackTrace();
		}
	}
}