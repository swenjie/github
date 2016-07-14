package com.ws.test;

import com.ws.test.client.TestServiceDelegate;
import com.ws.test.client.TestServiceService;

public class TestWsClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestServiceDelegate test=new 
				TestServiceService().getTestServicePort();
		String result=test.test("Hello");
		System.out.println(result);
	}

}
