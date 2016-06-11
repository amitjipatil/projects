package StaticPack;

public class StaticDemo {
  int a=10;
	static
	{
		final int dd=0;//static,private variable not allowd
		System.out.println("static111");
	}
	static int id;
	public StaticDemo(int id) {
		this.id=id;
		
	}
	void display()
	{
		//static int v=10;
		//only final is allowd as local variable
	}
	public static void main(String[] args) {

		System.out.println(id);
		StaticDemo staticDemo=new StaticDemo(5);
	
		
	}
	static
	{
		 int dd=0;//static,private variable not allowd
		System.out.println("static222");
	}

}
