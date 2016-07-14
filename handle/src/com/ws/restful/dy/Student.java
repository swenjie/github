package com.ws.restful.dy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	@JsonProperty("id")
	private int id;
	@JsonProperty("firstName")
	private String firstName;
	@JsonProperty("lastName")
	private String lastName;
	@JsonProperty("age")
	private int age;

	// Must have no-argument constructor
	public Student() {

	}

	public Student(String fname, String lname, int age, int id) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
		this.id = id;
	}

	public void setFirstName(String fname) {
		this.firstName = fname;
	}

	public String getFirstName() {
		return this.firstName;
	}

	
	public void setLastName(String lname) {
		this.lastName = lname;
	}

	public String getLastName() {
		return this.lastName;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return new StringBuffer(" First Name : ").append(this.firstName)
				.append(" Last Name : ").append(this.lastName)
				.append(" Age : ").append(this.age).append(" ID : ")
				.append(this.id).toString();
	}

}