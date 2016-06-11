package exception;

import annotation.myannotation;


public class Divide {

	public static void main(String[] args) {
		byte aa=7;
		byte bb=9;
		//byte cc=aa+bb;
		int cc=aa+bb;
		
		
		short m=5;
		short n=7;
		//short o=m+n;
		int o=m+n;
		Divide divide = new Divide();
		divide.display1();
	}

	void display1() {
		display2();
	}

	private void display2() {
		display3();
	}

	private void display3() {
		display4();

	}

	private void display4() {
	
	int a=10;int b=0;
	try{
	int c=a/b; 
	}
	//System.out.println("in catch block");
	/*finally
	{
	   
		System.out.println("finally block");
	}*/
	catch(Exception e)
	{
		e.getMessage();
		//System.out.println("in catch block");
		
	}
	catch(Throwable th)
	{
		th.printStackTrace();
	}
	
	System.out.println("after dividation");
}
}
