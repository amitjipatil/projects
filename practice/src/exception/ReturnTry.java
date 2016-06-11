package exception;

public class ReturnTry {
	int a=11;
	int b=0;
	int c=0;
	public int divide()
	{
		try
		{
			if(a==10)
			{
				System.out.println("in if condition");
			//System.exit(0);
				return 1;
			}
			System.out.println("in try block");
			c=a/b;
			
		}
		catch(Exception e)
		{
			System.out.println("in catch block");
		}
		finally
		{
		 System.out.println("in finally block");	
		}
		return 2;
	}

}
