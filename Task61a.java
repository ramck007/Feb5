import java.util.Scanner;
import java.util.*;
public class Task61a {

	public static int oct(int n) 
	{
		int ot=0,i=1;
		while(n!=0)
		{
			ot+=(n%8)* i;
			i*=10;
			n/=8;
		}
		return ot;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Decimal");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int o=oct(n);
		System.out.println("Decimal to Octal is "+o);
	}

}
