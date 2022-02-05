import java.util.*;
import java.util.Scanner;
public class Task52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("The Factors of the Given Number "+n+ " are:");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}

	}

}
