package com.ws.test;

@javax.jws.WebService(targetNamespace = "http://test.ws.com/", serviceName = "TestServiceService", portName = "TestServicePort", wsdlLocation = "WEB-INF/wsdl/TestServiceService.wsdl")
public class TestServiceDelegate {

	com.ws.test.TestService testService = new com.ws.test.TestService();

	public String test(String string) {
		return testService.test(string);
	}

}