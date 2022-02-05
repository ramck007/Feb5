import java.util.Scanner;
import java.util.*;
public class Task61 {

	public static int dec(int n) 
	{
		int de=0,i=0;
		while(n!=0)
		{
			de+=(n%10)*Math.pow(8, i);
			i++;
			n/=10;
		}
		return de;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Octal");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=dec(n);
		System.out.println("Octal to Decimal is "+d);
	}

}
