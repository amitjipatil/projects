package string;

public class StringReverseFastManipulation {

	public static void main(String[] args) {
		
		String rev=reverseString("AmitPatil");
		 
	        System.out.println("Reverse = "+ rev);
	}

	private static String reverseString(String string) {
		System.out.println("Original= "+string);
		char[] charArray = string.toCharArray();
        int len=charArray.length;
        for (int i = 0; i < charArray.length/2; i++) {
            char temp=charArray[i];
            charArray[i]=charArray[len-i-1];
            charArray [len-i-1]=temp;
            }
		return new String(charArray);
	}

}
