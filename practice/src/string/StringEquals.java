package string;

public class StringEquals {
	int a;
	String b;

	StringEquals(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
	StringEquals(String b)
	{
		this.b=b;
	}
	
	public static void main(String[] args) {
		String s1="amit";
		String s2="amit";
		String s3=new String("amit");
		String s4=new String("amit");
		String s5=s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(null));//false
		System.out.println(s3.equals(4));//false
		System.out.println(s1.equals(s5));//true


		System.out.println("=="+(s1==s2));
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s1==s5);//true
		
		StringEquals obj1=new StringEquals(10, "raj");
		StringEquals obj2=new StringEquals(10,"raj");
		System.out.println("***"+obj1.equals(obj2));
		System.out.println("***"+(obj1==obj2));
		
		StringEquals obj3=new StringEquals("amit");
		System.out.println("####"+s1.equals(obj3));//false
		

	}

}
