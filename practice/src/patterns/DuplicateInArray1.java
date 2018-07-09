package patterns;

import java.util.HashSet;
import java.util.Set;

/**
 * @author amit
 *
 */
public class DuplicateInArray1 {

	public static void main(String[] args) {
		
		int arr[]={12,4,1,3,8,8,6,5,12,6,8,2,15,2,8,4,13};
		findDuplicate(arr);
		
		//System.out.println(Math.abs(arr[3]));
	}

	/**
	 * @param arr
	 */
	private static void findDuplicate(int[] arr) {
		Set<Integer> s=new HashSet<Integer>();
		Set<Integer> duplicate=new HashSet<Integer>();
		for(int i:arr)
		{
			if(s.add(i)==false)
			{
				if(duplicate.add(i))
				System.out.print(i+" ");
				}
		}

	}

}
