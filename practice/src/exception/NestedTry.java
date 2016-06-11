package exception;

public class NestedTry {
	public static void main(String[] args) {
		int a=90;
		int b=10;
		int c=0;
		try
		{
			c=a/b;
			try
			{
			DividationEx dex=null;
			dex.add();
			}
			catch(NullPointerException ee)
			{
				System.out.println("inner try nullpointerEx");
				//ee.printStackTrace();
			}
			catch(Exception ex)
			{
				System.out.println("sssssssss");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println("outer try");
		}
	}

}
