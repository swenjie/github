package com.ws.restful;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
	@JsonProperty("id")
	@XmlElement(name="id")
	private int id;
	@JsonProperty("name")
	@XmlElement(name="name")
	private String name;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
}
