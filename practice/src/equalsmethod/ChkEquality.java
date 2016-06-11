package equalsmethod;

public class ChkEquality {
public static void main(String[] aaaa) {
	employee e1=new employee();
	employee e2= new employee();
	employee ref=e1;
	String s1=new String("java");
	String s2=new String("fun");
	String s3="java";
	String s4="fun";
	if(e1==ref)
	{
		System.out.println("employee equal..");
	}
	else 
		System.out.println("employee not equal..");
    System.out.println(e1.equals(ref));
    if(s1==s3)
    {
    	System.out.println("string equals");
    }
    else
    	System.out.println("string not equal ");
    System.out.println(s1.equals(s3));
    if(e1==e2)
    	System.out.println("e1,e2 obj equals");
    else
    	System.out.println("e1,e2 obj not equals");
    System.out.println(e1.equals(e2));

}
}
