
public class Score {

	public int score(int arr[],int no)
	{
		int count=arr.length,flag=0;
		for(int i=0;i<count;i++)
		{
			if(arr[i]>no)
			{
				System.out.println("rrrrr");
				break;
			}
			else if(arr[i]==no)
			{
				System.out.println("****");
				flag+=1;
			}
		}
		return flag;
	}
}
