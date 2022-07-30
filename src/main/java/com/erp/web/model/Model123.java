package com.erp.web.model;

import org.springframework.data.mongodb.core.mapping.Document;
import java.util.*;

@Document(collection="studenttable")
public class Model123{
	
	private String id;
	private String name;
	private short age;
	private String address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
	


	
	
	