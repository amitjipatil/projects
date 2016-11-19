package com.cogni.model;

import java.util.ArrayList;

public class Student {
int id;
String name;
ArrayList al;
ArrayList<String> st;
Address address;
Student(int id,String name,ArrayList al,ArrayList st,Address address)
{
	
	this.id=id;
	this.name=name;
	this.al=al;
	this.st=st;
	this.address=address;
	
	}

public void display()
{
	System.out.println(id);
	
	System.out.println("Student class display method called");
	System.out.println("address= "+address.city+" "+address.pin);
	}

}
