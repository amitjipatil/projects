
public class Testit {
	
	int a;
	String b;
	Testit(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
	public static void main(String[] args) {
		
		
		Testit t=new Testit(10,"amit");
		Testit tt=new Testit(20,"raj");
		Testit t3=new Testit(10,"amit");
		String s= new String("hi");
		String ss=new String("hi");
		String s3=new String("hi");
		String s4=s;
		String st1="raj";
		String st2="raja";
		
		System.out.println(s3.equals(s));
		System.out.println(t.equals(t3));
		Testit v=t;
			System.out.println(t.equals(v));
			System.out.println(s4==s3);
			System.out.println(st1==st2);
			
	}
	
}
