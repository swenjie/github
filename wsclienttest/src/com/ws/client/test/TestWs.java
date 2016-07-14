package com.ws.client.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.sy.cxf.client.*;
public class TestWs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext factory=new 
				ClassPathXmlApplicationContext("/applicationContext.xml");
		HelloWorld client=(HelloWorld) factory.getBean("helloClient");
		User user0=new User();
		user0.setName("makesi");
		User user1=new User();
		user1.setName("nikesi");
		List<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user0);
		List<String> res=client.sayHiToUserList(userList);
		System.out.println(res.get(0));
		System.out.println(res.get(1));
	}

}
