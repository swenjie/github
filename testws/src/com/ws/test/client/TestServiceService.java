package com.ws.test.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * TestServiceService service = new TestServiceService();
 * TestServiceDelegate portType = service.getTestServicePort();
 * portType.test(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "TestServiceService", targetNamespace = "http://test.ws.com/", wsdlLocation = "http://localhost:8080/ws/TestServicePort?wsdl")
public class TestServiceService extends Service {

	private final static URL TESTSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(com.ws.test.client.TestServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ws.test.client.TestServiceService.class
					.getResource(".");
			url = new URL(baseUrl,
					"http://localhost:8080/ws/TestServicePort?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/ws/TestServicePort?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		TESTSERVICESERVICE_WSDL_LOCATION = url;
	}

	public TestServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public TestServiceService() {
		super(TESTSERVICESERVICE_WSDL_LOCATION, new QName(
				"http://test.ws.com/", "TestServiceService"));
	}

	/**
	 * 
	 * @return returns TestServiceDelegate
	 */
	@WebEndpoint(name = "TestServicePort")
	public TestServiceDelegate getTestServicePort() {
		return super.getPort(
				new QName("http://test.ws.com/", "TestServicePort"),
				TestServiceDelegate.class);
	}

}
