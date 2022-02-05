import java.util.Scanner;
import java.util.*;
public class Task63 {

	public static String rev(String s)
	{
		if(s.isEmpty())
			return s;
		return rev(s.substring(1)) + s.charAt(0);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the sentence");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String r =rev(s);
		System.out.println("The reversed String "+r);
		
	}

}
