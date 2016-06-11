package statiC;

public class StaticBlock {
	
	static int a=10;
	static {
		
		System.out.println("Static block is executed before the main function");
	   		}
	
	static void m2()
	{
		System.out.println("m2 static method call by using class name not an object");
	}
	void m1()
	{
		System.out.println("M1() method in class A");
	}
	
	public static void main(String[] args) {
           StaticBlock block=new StaticBlock();
		StaticBlock.m2();
		System.out.println("Static data member also accessed by using class name "+StaticBlock.a);
		System.out.println("All class by default have  a default constructor");
		
	}
	static
	{
		System.out.println("All static block after compiling combine into one static block");
		StaticBlock staticBlock=new StaticBlock();
	staticBlock.m1();
	//System.exit(0); //Program execution stops here main method will not be executed
	}

}
