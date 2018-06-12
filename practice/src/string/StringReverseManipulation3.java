package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReverseManipulation3 {
	public static void main(String[] args) {
		
		//input string : "AMIT UTTAMRAO PATIL" output string: "PATIL UTTAMRAO AMIT"
		String reversebystring=StringReverseManipulation3.reverseByString("AMIT UTTAMRAO PATIL");
		System.out.println("reversebystring= "+reversebystring);
		
		//input string: "&#Am*i435t*-!" output string:"&#ti*m435A*-!"
		String reveereseSpecialString=StringReverseManipulation3.reverseSpecialCharString("&#Am*i435t*-!");
		System.out.println("Reverse special character string=  "+reveereseSpecialString);
		
	}

	private static String reverseSpecialCharString(String str) {
		  
		String s="";
	    int count=0;
	    StringBuffer sb=new StringBuffer(str);
	  //pattern to find only characters
	    Pattern charpattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
	   // matcher to find matching string character with pattern
	    Matcher m = charpattern.matcher(str);
	    //matcher to repeat matching
	    Matcher newmatcher = charpattern.matcher(str);
	      
	 
	      System.out.println("original special character string= "+str);
	      
	      /* loop will fetch one by one characters from string and check for matching with given pattern.if match
	      then it will execute statements under loop*/
	      while (m.find()) {
	    	  //it appends matched charactor to one string
	         s=s+str.charAt(m.start());  //it will result s=Amit
	      }
	      String reverse=new StringBuffer(s).reverse().toString(); //reverse= timA
	      
	      //same as above, loop will executes if pattern matches and replace the existing char with char of reverse string ie. timA
	      while (newmatcher.find()) {
	    	  sb.setCharAt(newmatcher.start(),reverse.charAt(count) );
	    	  count++;// it will increase position of cursor of reverse string.
	      }
	     
		return sb.toString();
	}

	
	private static String reverseByString(String string) {
	System.out.println("original string= "+string);
		String tmp="";
		String arr[]=string.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			
			tmp=tmp+arr[i]+" ";
			//System.out.println(arr[i]+" ");
		}
		return tmp;
	}
}