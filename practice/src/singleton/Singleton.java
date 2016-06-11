package singleton;

public class Singleton {
	private static Singleton singleton=new Singleton();
	private Singleton()
	{}
	public static Singleton getInstance()
	{
		return singleton;
	}
	protected void demo()
	{
		System.out.println("demo method is called");
	}

}
