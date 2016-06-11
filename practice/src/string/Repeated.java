package string;

public class Repeated {
	public char[] repeated(String name)
	{
		int count=name.length();
		char arr[]=new char[count];
		for (int i = 0; i <count; i++) {
			int flag=0;
			char a;
			char b;
			for(int j=i+1;j<count;j++)
			{
				a=name.charAt(i);
				b=name.charAt(j);
				if(a==b)
				{
					flag=1;
					//arr[i]=a;
				}
			}
			if(flag==1)
			{
				
				arr[i]=name.charAt(i);
			}
		}
		return arr;
	}

}
