import java.util.Scanner;

public class Task76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Mobile Number");
		Scanner sc= new Scanner (System.in);
		long n= sc.nextLong();
		if(n>999999999 && n<10000000000l)
		{
			System.out.println("The number is: "+n);
			
		}
		else
		{
			System.out.println("The number is not valid ");
		}
			
	}

}