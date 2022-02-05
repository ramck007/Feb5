import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public class Task51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the First number and Last Number to check Armstrong Number");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.print("The Armstrong Numbers are: ");
		for(int n=n1;n<=n2;n++) {
		double sum=0;
		int k,c=0;
		k=n;
		while(k!=0)
		{
			k=k/10;
			c++;
		}
		k=n;
		while(k!=0)
		{
			int r=k%10;
			sum=sum + Math.pow(r,c);
			k=k/10;
			
		}
		if(sum==n)
		{
			System.out.print(n+" ");
		}
		}
		
	}

}
