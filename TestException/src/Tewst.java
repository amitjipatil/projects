
public class Tewst {
	public static void main(String[] args) {
		
	try{
		
		 int b;
		  b=10/0;
	 try{
		  int a;
		  a=10/0;
		  System.out.println("amit");
	    }
		
	 catch(NumberFormatException ee)
		{
			System.out.println("this is numberformat exception");
	
		}
	 catch(Exception e)
		{
			System.out.println("this is common exception inner try");
	
		}
	 finally
		{
		 System.out.println("finally blick");
			
		}
	}
	
	catch(Exception e)
	{
		System.out.println("outer catch");

	}
	
	}
	
	
}
