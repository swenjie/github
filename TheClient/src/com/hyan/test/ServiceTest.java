package com.hyan.test;
import com.hyan.client.ServiceHello;
import com.hyan.client.ServiceHelloService;
public class ServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceHello hello=new ServiceHelloService().getServiceHelloPort();
		String name=hello.getValue("Hyan");
		System.out.println(name);
	}

}
