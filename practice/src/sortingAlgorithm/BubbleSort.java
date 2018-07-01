package sortingAlgorithm;

//sorting array using bubblesort algorithm
public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]={5,2,8,4,6,9,3};
		 System.out.print("input  array= ");
		 for(int i:arr)
		 {
			 System.out.print(i+" ");
		 }
		 // sort array using bubblesort
		 int sortedarr[]= bubblesort(arr);
		 System.out.println();
		 System.out.print("output array= ");
		 for(int j:sortedarr)
		 {
			 System.out.print(j+" ");
		 }
	}

	private static int[] bubblesort(int[] arr) {
		int temp;
		int num=arr.length;
		for (int i = 0; i < ( num - 1 ); i++) {
		      for (int j = 0; j < num - i - 1; j++) {
		        if (arr[j] > arr[j+1]) 
		        {
		           temp = arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1] = temp;
		        }
		      }
		    }
		return arr;
	}

}
