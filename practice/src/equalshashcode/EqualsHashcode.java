package equalshashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "raj");
		Employee e2=new Employee(102, "sam");
		Employee e3=new Employee(103, "avi");
		Employee e4=new Employee(104, "sham");
		Employee e1duplicate=new Employee(101, "raj");
		String s=new String("ram");
		String s1=new String("ram");

		System.out.println("Employee: "+e1.equals(e1duplicate));// false if equals() not overriden in Employee class
		System.out.println("String: "+s.equals(s1));//true because predefined String class implements equals() method
		System.out.println("String s: "+s.hashCode());
		System.out.println("String s1: "+s1.hashCode());// 2 different objects of same class (s,s1) of string class will generate same hashcode because it implemented hashcode()
		System.out.println("Emolpyee e1: "+e1.hashCode());
		System.out.println("Employee e1duplicate: "+e1duplicate.hashCode());//if hashcode() not override then different objects same content (e1,e1duplicate) of employee have different hashcode
		//if 2 different objects of same class having same content and having hashcode() impl. then it will generate same hashcode e1=445533 x=445533
     // if e1==e1duplicate is true then e1.equals(e1duplicate) is always true
		// if e1==e1duplicate is false then e1.equals(e1duplicate) may true or false
		  //if e1.equals(e1duplicate) is true then e1==e1duplicate may true or false
		//if e1.equals(e1duplicate) is false then e1==e1duplicate is always false
		
		/*
		The contract between equals() and hashCode() is:
			1) If two objects are equal, then they must have the same hash code.
			2) If two objects have the same hash code, they may or may not be equal.*/
		
		Map<Employee, Integer> map=new HashMap<Employee, Integer>();
		map.put(e1, 10);
		map.put(e2, 41);
		map.put(e3, 25);
//		map.put(e1duplicate, 77);//if Employee class equals method not implemented  e1duplicate will added to hm
		System.out.println(map);
		System.out.println(map.get(new Employee(101, "raj")));
		




	}

}

 class Employee
{
	private int id;
	private String name;
	
	Employee(int eid,String ename)
	{
		id=eid;
		name=ename;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	}
