package org.test.webservice;

@javax.jws.WebService(targetNamespace = "http://webservice.test.org/", serviceName = "TestServiceService", portName = "TestServicePort", wsdlLocation = "WEB-INF/wsdl/TestServiceService.wsdl")
public class TestServiceDelegate {

	org.test.webservice.TestService testService = new org.test.webservice.TestService();

	public String test(String string) {
		return testService.test(string);
	}

}