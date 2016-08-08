package com.cogni.app.entity;
import org.hibernate.*;
import javax.persistence.*;
@Entity
@Table(name="employee")
public class EmoloyeeEntity {
	@Id
	 @Column(name = "eid")
	private int eid;
	
	 @Column(name = "ename")
	 private String ename;
	 
	 @Column(name = "salary")
	 private int salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	 
	 
	
	
	
	
	

}
