import java.util.Scanner;
import java.util.*;
public class Task56 {

		// TODO Auto-generated method stub
	      static boolean checkPrimeNumber(int n)
		{
	    	  boolean Prime=true;
			
			for(int j=2;j<=n/2;++j)
			{
				if(n%j==0)
				{
					Prime = false;
					break;
				}
				
			}
		
			return Prime;
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter the number to Check Prime Numbers");
			Scanner sc= new Scanner (System.in);
			int n = sc.nextInt();
			boolean flag =false;
			
			for(int i=2;i<=n/2;++i)
			{
				if(checkPrimeNumber(i)) {
				if(checkPrimeNumber(n-i)) {
				System.out.printf("%d = %d + %d\n", n, i, n - i);
		          flag = true;
			}}
			}
			if(!flag)
			{
				System.out.println(n+"Number cannot be as prime number");
			}
	}

}
