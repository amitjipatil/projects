package exception;

public class DividationEx {

	void add()
	{}
	int divide()
	{
		int a=10;
		int b=0;
		int c;		
	
		try{
		c=a/b;
		return 1;
			}
			
		
		catch(Exception e)
		{
			String s=e.getMessage();
			//System.out.println(s);
			System.out.println("in catch bolck");
		 // e.printStackTrace();
		  System.out.println(" after printstack");
		  return 3;
		}
		finally
		{
			System.out.println("finally executed");
		//	return 2;
		}
		
		/*catch(ArithmeticException ae)
		{
			
			System.out.println("in arithmatic catch block");
		}*/

		//return 4;
	}
	public static void main(String[] args) {
		
				
	     	//System.out.println("addition="+(a+b));
	     	//System.out.println(" program executed successfully");
		DividationEx de= new DividationEx();
		int x=de.divide();
		System.out.println("dividation="+x);
	}

	

}
