package com.hyan.service;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
@WebService
public class ServiceHello {

	/**
	 * ���ͻ��˵���
	 * @param name �������
	 * @return String ���ؽ��
	 */
	public String getValue(String name){
		return "�ҽ�:"+name;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9001/Service/ServiceHello", new ServiceHello());
		System.out.println("Service success!");
		
	}

}
