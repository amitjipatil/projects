
public class MyProduct {
	public static void main(String[] args) {
		int arr[]={2,5,5,5,8};
		Product p=new Product();
		/*int myarr[]=p.product(arr);
		for(int i:myarr)
		{
			System.out.println(i);
		}*/
		Score sc=new Score();
		System.out.println(sc.score(arr, 5));
	}

}
