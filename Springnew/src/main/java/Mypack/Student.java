package Mypack;

import java.util.Set;

public class Student {
	private String name;  
	private Set studentData;
	private int rollno;
	
	Student (int rollno)
	{
		
	}

	
	public Set getStudentData() {
		return studentData;
	}

	public void setStudentData(Set studentData) {
		this.studentData = studentData;
	}

	public String getName() {  
	    return name;  
	}  
	  
	public void setName(String name) {  
	    this.name = name;  
	}  
	  
	public void displayInfo(){  
	    System.out.println("Hello: "+name);  
	   System.out.println(studentData);
	}  
	
	/* public SampleBean sb;
	   public void setSb(SampleBean sb)//setter injection with object
	   {
	      this.sb = sb;
	   }
	 
	   public void m1()
	   {
	      sb.m2();
	   }*/

}
