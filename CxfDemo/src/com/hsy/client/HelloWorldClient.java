package com.hsy.client;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.Application;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hsy.pojo.User;
import com.hsy.server.HelloWorld;

public class HelloWorldClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JaxWsProxyFactoryBean jwpfb=new JaxWsProxyFactoryBean();
//		jwpfb.setServiceClass(HelloWorld.class);
//		jwpfb.setAddress("http://localhost:8080/CxfDemo/webservice/helloWorld");
//		HelloWorld hw=(HelloWorld) jwpfb.create();
//		User user=new User();
//		user.setName("马克思");
//		user.setDescription("怀念马克思");
//		System.out.println(hw.sayHiToUser(user));
		
		ApplicationContext factory=new 
				ClassPathXmlApplicationContext("/applicationContext.xml");
		HelloWorld client=(HelloWorld) factory.getBean("client");
		User user0=new User();
		user0.setName("makesi");
		User user1=new User();
		user1.setName("nikesi");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user0);
		String [] res=client.SayHiToUserList(userList);
		System.out.println(res[0]);
		System.out.println(res[1]);
		
	}

}
