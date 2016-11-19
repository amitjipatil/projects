package com.cogni.model;

import java.util.ArrayList;

public class Student {
int id;
String name;
ArrayList al;
ArrayList<String> st;

public ArrayList<String> getSt() {
	return st;
}
public void setSt(ArrayList<String> st) {
	this.st = st;
}
public ArrayList getAl() {
	return al;
}
public void setAl(ArrayList al) {
	this.al = al;
}
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

}
