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
		
		StringBuffer sb1=new StringBuffer("Test");
		StringBuffer sb2=new StringBuffer("Test");
		
		StringEquals obj1=new StringEquals(10, "raj");
		StringEquals obj2=new StringEquals(10,"raj");
		
		
		System.out.println(s1.equals(s2));//true
		System.out.println("S3 equals() s4->"+s3.equals(s4));//true
		System.out.println("S1 equals() s4->"+s1.equals(s4));//true
		System.out.println("S3 equals() null->"+s3.equals(null));//false
		System.out.println(s3.equals(4));//false
		System.out.println("S1 equals() s5->"+s1.equals(s5));//true
		System.out.println("Sb1 equals() sb2->"+sb1.equals(sb2));// false because stringbuffer didnt imoplement equals


		System.out.println("s1==s2 "+(s1==s2));
		System.out.println("S3 and== s4->"+(s3==s4));
		System.out.println("S1 and== s4->"+(s1==s4));
		System.out.println("S1 and== s5->"+(s1==s5));//true
		System.out.println("Sb1 and== sb2->"+(sb1==sb2));//false
	//	System.out.println("S1 and== sb1->"+(s1==sb1));// error incompatable types string and stringBuffer

		
	 
		System.out.println("obj1.equals(obj2) "+obj1.equals(obj2));//false
		/* because StringEquals class didn't implement equals() method and the inherited parent Object class equals() method checks equality on the basis of referance.
		    public boolean equals(Object obj) {
             return (this == obj);
             } 
         */
		
		
		System.out.println("obj1==obj2 "+(obj1==obj2));
		
		StringEquals obj3=new StringEquals("amit");
		System.out.println("####"+s1.equals(obj3));//false
		

	}

}
