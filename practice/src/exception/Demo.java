package exception;

public class Demo {
	int a;
	Demo(int a)
	{this.a=a;}
	/*@Override
	public boolean equals(Object obj) {
	Demo dd=(Demo) obj;
		if(this.a==dd.a)
		{
			return true;
		}else
			return false;
		
		//return this.equals(obj);
	}*/
	public static void main(String[] args) {
		try 
		{
			Demo d=new Demo(10);
			Demo d1=new Demo(10);
			System.out.println(d.equals(d1));	
			
		//	throw new NullPointerException();// if there is statement after throw exception then it will show error ::unreachable code
			System.out.println("hello");
			System.out.println(10/0);// if this exception ocours then below 2 statements in try block will not execute
			System.out.println("after Arithmatic ex");
			throw new NullPointerException();
			
		}
		catch(ArithmeticException | NullPointerException ne)// java 7 feature to handle multiple exception in 1 catch block
		{
			System.out.println("Exception ocours");
		}
		catch(Throwable t) // we can use throwable class to catch any exception
		{}
		finally 
		{
			System.out.println("in finally block");
	      //throw new ArithmeticException();
			   //we can throw exception in finally block and handle it using try and catch
			   // if this throw is not surrounded with try/catch then it will affect "end of main method" statement:: unreachable code
			
		}
		System.out.println("end of main method");

		
	}

}
