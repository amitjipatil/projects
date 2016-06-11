package string;

public class StringReplace {
	public static void main(String[] args) {
		String s="amit patil";
		System.out.println(s.hashCode());
			s=s.replaceAll("a","x");
		//s=s+" pangao";
		//s.replace("p", "u");
		System.out.println(s);
			System.out.println(s.hashCode());
	}

}
