
public class Position {
	public int position(int arr[],int no)
	{
		int count=arr.length,flag=0;
		for(int i=0;i<count;i++)
		{
			if(arr[i]==no)
			{flag=i;}
		}
		return flag;
	}

}
