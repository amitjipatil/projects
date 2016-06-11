package paterns;

public class PalindromeString {
	public static void main(String[] args) {
		String s=new String("abcba");
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=sb.reverse();
		String rev;
		
		if(s.equals(sb1))
			System.out.println("palindrome");
		else 
			System.out.println("not palindrome");
		

	}

}
