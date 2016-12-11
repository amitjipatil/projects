package com.cogni.app.domain;
import javax.persistence.*;
@Entity
@Table(name="student")
public class Student {
	
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column
	private int age;
	
	@Column
	private String address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
