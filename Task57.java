import java.util.Scanner;
public class Task57 {

	public static int add(int n)
	{
		if(n!=0)
			
		return n +add(n-1);
		else
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum= add(n);
		System.out.println("Sum= "+sum);
		
	}

}
