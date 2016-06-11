
public class Product {
	public int[] product(int arr[])
	{
		int count=arr.length;
		int myarr[]=new int[count];
		for (int i = 0; i < arr.length; i++) {
			int product = 1;
			for (int j = 0; j < arr.length; j++) {
				if(i!=j)
				{
					product=product*arr[j];
				}
			}
			myarr[i]=product;
		}
		return myarr;
	}

}
