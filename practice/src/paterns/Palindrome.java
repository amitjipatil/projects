package paterns;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int x,sum=0,rem=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		x=sc.nextInt();
		num=x;
		while(num>0)
		{
		rem=num%10;
		sum=rem+(sum*10);
		num=num/10;
		}
		if(sum==x)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
	}

}
