import java.util.*;

public class MyFirstExceptionProject
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter First Number=");
			int no1=sc.nextInt();
			System.out.println("Enter Second Number=");
			int no2=sc.nextInt();
			int div=no1/no2;
			System.out.println("Division Result="+div);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Infinity..!");
		}
		System.out.println("GoodBye, Have a Nice Day From Main !");
	}

}
