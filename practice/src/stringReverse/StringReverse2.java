package stringReverse;

public class StringReverse2 {
	public static void main(String[] args) {
		String st="hello rajaji";
		int count=st.length();
		String tmp="";
		//char arr[]=new char[count];
		for(int i=count-1;i>=0;i--)
		{
			 tmp=tmp+st.charAt(i);
			
		}
		System.out.println(tmp);
		
	}

}
