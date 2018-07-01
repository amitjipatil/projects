package cloning;

public class NormalCopy {

	public static void main(String[] args) {
		
		Employee obj=new Employee(20);
		Employee copy=obj;
		System.out.println("obj.hashCode() "+obj.hashCode());
		System.out.println("obj age="+obj.age);
		
		System.out.println("copy.hashCode() "+copy.hashCode());// same as obj
		System.out.println("copy age="+copy.age);
		
		copy.age=44;
		
		System.out.println("copy age after change 44 in copy="+copy.age);
		
		//problem is- we didnt change value of original object ie. obj.age ,we changed copy obj. but obj is automatically changed  
		System.out.println("obj age ="+obj.age);// obj value is automatically changed to 44
        // if clone is used then obj value will not be changed 
	}

}

class Employee
{
	int age;
	public Employee(int age) {
	   this.age=age;
	}
	}
