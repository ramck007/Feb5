import java.util.Scanner;
public class Task49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to check prime or not!");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		if(n==0||n==1) {
			System.out.println("Its not a Prime Number");
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
			System.out.println(n+" Is not a Prime Number");
			k=1;
			break;
			}
			
		}
		if(k==0)
		{
			System.out.println(n+" Is a Prime Number");
		}
	}

}
