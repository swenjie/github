package org.test.webservice.client;

public class TestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestServiceDelegate test=new TestServiceService().getTestServicePort();
		String result=test.test(":´³ÈëµÄ");
		System.out.println(result);
	}

}
