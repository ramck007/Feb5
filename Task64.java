import java.util.Scanner;
import java.util.*;
public class Task64 {
	public static int pow(int a, int b)
	{
		if(b!=0) {
			return(a*pow(a,b-1));
		}
		else 
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Base and Power");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b = sc.nextInt();
		int k = pow(a,b);
		System.out.println(a+" ^ "+b+" = "+ k);
	}

}
