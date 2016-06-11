package equalsmethod;

public class Equality {
	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = "java";
		String s4 = "java";

		if (s1 == s2) {
			System.out.println("true s1==s2");
		} else
			System.out.println("false s1==s2");

		if (s1 == s3) {
			System.out.println(" true s1==s3");
		} else
			System.out.println(" false s1==s3");
		if (s4 == s3) {
			System.out.println(" true s4==s3");
		} else
			System.out.println(" false s4==s3");
		
		
		System.out.println(s1.equals(s2)+" equals mthod s1-s2");
		System.out.println(s1.equals(s3)+" equals mthod s1-s3");
		System.out.println(s4.equals(s3)+" equals mthod s4-s3");

		Integer a=new Integer(5);
		Integer b=new Integer(5);
		Integer aa=new Integer(155);
		Integer bb=new Integer(155);
		Integer c=5;
		Integer d=5;
		Integer e=155;// false cause >128
		Integer f=155;//>128
		if (a == b) {
			System.out.println("true a==b");
		} else
			System.out.println("false a==b");

		if (a == c) {
			System.out.println(" true a==c");
		} else
			System.out.println(" false a==c");
		if (c == d) {
			System.out.println(" true c==d");
		} else
			System.out.println(" false c==d");
		if(aa==bb)
		System.out.println("true aa==bb");
		else
			System.out.println("false aa==bb");
		if(e==f)
			System.out.println("true e==f");
		else
			System.out.println("false e==f");
		

		System.out.println(a.equals(b)+" equals mthod a-b");
		System.out.println(a.equals(c)+" equals mthod a-c");
		System.out.println(c.equals(d)+" equals mthod c-d");
		System.out.println(e.equals(f)+" equals method e-f");
		System.out.println(aa.equals(e)+" equals method of aa-e");
	

	}
}