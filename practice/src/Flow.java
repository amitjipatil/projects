
public class Flow {

	static{
		System.out.println("static 1");
	}
	{
		System.out.println("IIB");
	}
	static{
		System.out.println("static 2");
	}
	Flow()
	{
		System.out.println("constructtor..");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		new Flow();
		new Flow();
	}

}
