package com.acenture.features;

public class Topic {
	
	private String name;
	private int id;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	
	public Topic() 
	{}
	
	public Topic(String name, int id, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
	return (" "+id+"- "+name+"- "+description);
	}


}
