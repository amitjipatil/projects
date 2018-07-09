package patterns;

/**
 * @author amit
 *
 */
public class DuplicateInArray {

	public static void main(String[] args) {
		int arr[]={12,4,1,3,8,8,6,5,12,6,8,2,15,2,8,4,13};
		findDuplicate(arr);
		
		//System.out.println(Math.abs(arr[3]));
	}

	private static void findDuplicate(int[] arr) {
		for(int i:arr)
		{
			/*if(arr[Math.abs(i)]>=0)
			{
				arr[Math.abs(i)]=-arr[Math.abs(i)];
			}
			else
				System.out.println(arr[Math.abs(i)]);*/
			
			if (arr[Math.abs(i)] >= 0)
                arr[Math.abs(i)] = -arr[Math.abs(i)];
            else
                System.out.print(Math.abs(i) + " ");

		}
	}

}
