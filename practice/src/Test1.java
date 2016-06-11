
public class Test1 {
	static String s;
	void show(String s)
	{
		System.out.println("String");
	}
	void show(Object o)
	{
		System.out.println("object");
	}
/*	void show(Integer i)
	{
		System.out.println("String");
	}
*/

	public static void main(String[] args) {
		
	//	System.out.println(s);
		Test1 tt=new Test1();
		tt.show(null);
		//System.out.println(null);
		
	}

}
