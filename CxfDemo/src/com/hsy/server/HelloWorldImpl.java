package com.hsy.server;

import java.util.*;

import javax.jws.WebParam;
import javax.jws.WebService;
import com.hsy.pojo.User;
@WebService(endpointInterface="com.hsy.server.HelloWorld",serviceName="HelloWorld")
public class HelloWorldImpl implements HelloWorld {
Map<Integer,User> users=new LinkedHashMap<Integer,User>();
	public HelloWorldImpl() {
	}

	@Override
	public String sayHi(@WebParam(name="text") String text) {
		// TODO Auto-generated method stub
		return "Hello:"+text;
	}

	@Override
	public String sayHiToUser(User user) {
		// TODO Auto-generated method stub
		users.put(users.size()+1, user);
		return "Hello:"+user.getName();
	}

	@Override
	public String[] SayHiToUserList(List<User> userList) {
		// TODO Auto-generated method stub
		String[] result=new String[userList.size()];
		int i=0;
		for(User u:userList){
			result[i]="Hello:"+u.getName();
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("ws");
	}
	
}
