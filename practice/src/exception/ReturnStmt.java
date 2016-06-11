package exception;

public class ReturnStmt {
	@SuppressWarnings("finally")
	public int m1()
	{
		try{
			return 1;
		}
		catch(Exception e){
			return 2;
		}
		finally
		{
			return 3;
		}
	//	return 4;
	}

	public static void main(String[] args) {
	
		int i=new ReturnStmt().m1();
		System.out.println(i);
	}
}
