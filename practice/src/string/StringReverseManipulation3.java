package string;

public class StringReverseManipulation3 {
	public static void main(String[] args) {
		String reverse=StringReverseManipulation3.reverse("AMIT UTTAMRAO PATIL");
		System.out.println(reverse);
	}

	private static String reverse(String string) {
		/*int count=string.length();
		int flag=0;
		String tmp="";
		String arr[]=new String[3];
		int intarr[]=new int[2];
		//return string;
		for(int i=0;i<count;i++)
		{
		char ch=string.charAt(i);
		if(string.charAt(i)==' ')
		{
			intarr[flag]=i;
			flag++;
		}
		//	System.out.println("a");
		//return string;
	}
		for(int j=intarr[1];j<count;j++)
		{
			tmp+=string.charAt(j);
			
			//System.out.println(tmp);
			
		}
		
		return tmp;*/
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