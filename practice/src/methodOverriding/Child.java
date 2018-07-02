package methodOverriding;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

public class Child extends Parent{
	
	
	// if parent class method doesnt throw any exception then child class overriden method can only throw unchecked exception
	//if overriding/parent method throws unchecked exception then 
	// if parent class methods return  type is Object(parent type) then we can use any class as return type(Integer/String/Student/)
	// that is we can use same or narrow/small/child class as return type for child class overriden method	
	@Override
	 Integer add() throws NullPointerException
	{
			System.out.println("add() child class");
		return null;
	}
	
	//if parent class overriding method throws unchecked exception then we may or may not throw any exception. if we throw then it can be any unchecked(parent type/ child type/ any unchecked) 
	//if parent class overriding method throws unchecked exception then in overridenwe cant throw any checked/compile time exception
	@Override
	void uncheck()throws RuntimeException
	{
		
	}
	
	
	// if parent class method throws checked exception then child class overriden method may or may not throw exception. if throwing exception then it should be same or child type **checked** exception
	// if parent class method throws checked exception then child class overriden method can throw any unchecked exception
	@Override
	public List test() throws FileNotFoundException
	{
		
		return null;
	}
	
	//cant override static method
	static void draw()
	 {
		 System.out.println("draw() child static");
	 }
	
	void m2()
	{
		System.out.println("m2() child");
	}
	public static void main(String[] args) {
		/*Overriding ch=new Overriding();
		ch.add();*/
		//Overriding.add();
		
		Parent parent=new Parent();
		Child child=new Child();
		Parent pc=new Child();
		
		parent.m1();
		
	    child.m2();
	    child.add();
	    
	    pc.m1();// m1 is not present in child so parent class m1() will execute
	    pc.add();// child class add() will call as child class have add method()
		pc.draw();// its static method so overriding is not possible. its method hiding
		
		
	}

}
