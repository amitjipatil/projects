package vararg;

public class MainArg {
	public static void main(String[] args) {
		MainArg arg=new MainArg();
		
		int i=arg.main(111);
		System.out.println(i);
		arg.main(222,444,66);
	}
	public int main(int s)
	{
		System.out.println("single arg");
		return s;
	}
	public static void main(int... s)//main(String... s) not possible. duplicate method
	{
		System.out.println("var arg");
		//return 5;
	}
	
	

}
