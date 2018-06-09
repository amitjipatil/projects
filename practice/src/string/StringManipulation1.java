package string;

public class StringManipulation1 {

	public static void main(String[] args) {
		
		 //** here "amit" is object of string class, we can access string class methods us "amit"
		    System.out.println("amit".length());
		 //** string addition and concatenation
		    System.out.println(12+"14");//1214
		    System.out.println("12"+14);//1214
		    System.out.println(12+13+"14");//2514
		    System.out.println("14"+12+13);//141213
		    System.out.println("14"+(12+13));//1425
		    
		    
		//** code to print charactor per line of the string
			String name="This is a lot of text in 2*2 page";
			for(char c:name.toCharArray())
			{
				System.out.println(c);
			}
			
	}

}
