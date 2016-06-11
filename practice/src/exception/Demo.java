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
			
			
			System.out.println("hello");
			System.out.println(10/0);
		}
		finally 
		{
			System.out.println("in finally block");
			
		}

		
	}

}
