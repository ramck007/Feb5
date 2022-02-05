import java.util.Scanner;
public class Task58 {

	public static int fact(int n)
	{
		if(n>=1)
			
		return n *fact(n-1);
		else
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum= fact(n);
		System.out.println("The Factorial of "+n+" is "+sum);
		
	}

}
