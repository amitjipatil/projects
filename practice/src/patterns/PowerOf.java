package patterns;

import java.util.Scanner;

public class PowerOf {
// class to calculate exponential/ powerof 
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter base value");
		
		int i=sc.nextInt();
		System.out.println("enter multiple value");
		int j=sc.nextInt();
        int result= raiseTo(i,j);
        System.out.println(i+" to the "+j+"th= "+result);

	}

	private static int raiseTo(int i, int j) {
		
		//System.out.println("i= "+i);
		int result=1;
		for(int x=1;x<=j;x++)
		{
			result=result*i;
			
		}
		return result;
	}

}
