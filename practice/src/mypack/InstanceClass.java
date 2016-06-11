package mypack;
import java.sql.*;
class A {
	A() {
		System.out.println("parent class constructor");
	}
	
}

class B extends A {

	
	B() {

		System.out.println("this is child 1 constructor");
	}

}

class C extends B {
	
	C() {
		super();

		System.out.println("this is child2 constructor");
	}
	

	C(int a) {
		

		System.out.println("this is child2 param constructor");
	}
	{
		System.out.println("instance initialiser block");
	};
}

public class InstanceClass {
	public static void main(String[] args) {
		C c = new C(5);

	}

}
