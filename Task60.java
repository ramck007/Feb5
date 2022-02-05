import java.util.Scanner;
import java.util.*;
public class Task60 {
	public static int de(long n)
	{
		int i=0,dn=0;
		long r;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			dn+=r*Math.pow(2, i);
			i++;
		}
		return dn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Binary Number");
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
		int d= de(n);
		System.out.println("Binary to Decimal "+d);
	}

}
