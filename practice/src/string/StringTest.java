package string;
public class StringTest {
public static void main(String[] args) {
	Repeated r=new Repeated();
	String s="success";
	char arr[]=r.repeated(s);
	for(char a:arr)
	{
		System.out.println(a);
	}
}
}
