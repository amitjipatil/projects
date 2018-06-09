package string;

public class MyString {
	public static void main(String[] args) {
		String s="amit";
		String ss="amit";
		System.out.println("hsahcode of s:"+s.hashCode());
		System.out.println("hsahcode of ss=:"+ss.hashCode());//same as s

		s=s.replace('a', 'b');
		System.out.println("hsahcode of s*:"+s.hashCode());
		System.out.println(s);
		StringBuffer sb=new StringBuffer();
		System.out.println(sb);
		System.out.println("hsahcode of sb:"+sb.hashCode());
		sb.append('a');
		System.out.println(sb);
		System.out.println("hsahcode of sb*:"+sb.hashCode());	
		//System.out.println(m);
		String mn=s.toUpperCase();
		System.out.println(mn);
		
		String b1=new String("rajj");
		String b2=new String("rajj");
		System.out.println(b1.equals(b2));
		System.out.println("b1 hash "+b1.hashCode());
		System.out.println("b2 hash "+b2.hashCode());// same as b1
		
		
	}

}
