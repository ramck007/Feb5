import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Task50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to check Armstrong Number or Not!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		int k,c=0;
		k=n;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		n=k;
		while(n!=0)
		{
			int r=n%10;
			sum=sum + Math.pow(r,c);
			n=n/10;
			
		}
		if(sum==k)
		{
			System.out.println("The Given number is Armstrong");
		}
		else
		{
			System.out.println("The Given number is not a Armstrong");
		}
	}

}
