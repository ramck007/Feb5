import java.util.Scanner;
public class Task53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two Numbers");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division");
		int n = sc.nextInt();
		switch(n)
		{
		case 1: System.out.println(a+b);
		break;
		case 2: System.out.println(a-b);
		break;
		case 3: System.out.println(a*b);
		break;
		case 4: System.out.println(a/b);
		break;
		default:System.out.println("The Given Number is wrong");
		break;
			
		}
	}

}
