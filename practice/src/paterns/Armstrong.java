package paterns;
import java.util.*;
public class Armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no ");
	int number=sc.nextInt();
	int num=number;
	int sum=0;
	while(num>0)
	{
	int rem=num%10;
    sum=sum+(rem*rem*rem);
    num=num/10;
	}
	if(sum==number)
		System.out.println("armstrong");
	else
		System.out.println("not armstrong");
	
	
}
}
