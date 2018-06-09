package string;

import java.util.Stack;

public class String_initial {
	public static void main(String[] args) {
		int space,length,flag=0;
		String tmp="";
		String fullname="Amit uttamrao patil";
		//Patil a u
		String arr[]=fullname.split(" ");
		Stack<String> st=new <String> Stack();
		for(String s:arr)
		{
		st.push(s);
		}
		tmp=st.pop();
		
		System.out.println(tmp);
		
		
		/*length=fullname.length();
		for(int i=0;i<length;i++)
		{
			tmp=tmp+fullname.charAt(i);
		}
		//Patil a u
*/		
		
		
	}

}
