import java.util.Scanner;
import java.util.*;
public class Task59 {

	/*public static int gc(int a,int b) {
		int k=0;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				k=i;
			}
		}
		return k;
		}*/
	public static int gc(int n1,int n2)
	{
		if(n2!=0)
			return gc(n2,n1%n2);
		else
			return n1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc =new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int g=gc(n1,n2);
		System.out.println("The GCD is "+g);
	}

}
