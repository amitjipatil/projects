package equalshashcode;

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "raj");
		Employee e2=new Employee(102, "sam");
		Employee e3=new Employee(103, "avi");
		Employee e4=new Employee(104, "sham");
		Employee x=new Employee(101, "raj");
		String s=new String("ram");
		String s1=new String("ram");

		System.out.println("Employee: "+e1.equals(x));// false if equals() not overriden in Employee class
		System.out.println("String: "+s.equals(s1));//true because predefined String class implements equals() method
		System.out.println("String s: "+s.hashCode());
		System.out.println("String s1: "+s1.hashCode());// 2 different objects of same class (s,s1) of string class will generate same hashcode because it implemented hashcode()
		System.out.println("Emolpyee e1: "+e1.hashCode());
		System.out.println("Employee x: "+x.hashCode());//if hashcode() not override then different objects same content (e1,x) of employee have different hashcode
		//if 2 same class objects having same content and having hashcode() impl. then it will generate same hashcode e1=445533 x=445533






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
