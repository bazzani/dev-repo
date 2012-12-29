import com.autometrics.connectors.ConnectorProxy;
import com.autometrics.connectors.ResourceConnectorFactory;
import com.autometrics.connectors.exceptions.ExecuteConnectorException;
import com.autometrics.generics.exceptions.PropertiesVOCreationException;
import com.autometrics.generics.vo.PropertiesVO;

public class test {
	public static void main(String[] args) {
		try {
			ConnectorProxy.execute(new PropertiesVO(new String[] { "server",
					"websvc", "project", "userid", "passwd", "report",
					"params", "concurrent",
					ResourceConnectorFactory.CONNECTOR_VERSION }, new String[] {
					"localhost",
					"http://192.168.1.40/AnalyticsWS/services/MSTRWSJ",
					"PulseWS", "DASHBOARDS_PULSE", "d45hb04rd5",
					"LIVE_DS1_P1_E3_MAKE_TABLE_INDEX",
					"Enter a Serial Sales Month:117;Enter a Sales Day:15",
					"true",
					// ResourceConnectorFactory.DEARBORN_V9_J2EE
					"2" }));
		} catch (ExecuteConnectorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PropertiesVOCreationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//
//		Logger logger = Logger.getLogger("com.autometrics");
//
//		int i = 1;
//
//		if (logger.isInfoEnabled()) {
//			logger.info("Creating Channel # " + i);
//		}
	}
}
