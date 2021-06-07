import java.util.*;
public class Scanner_first
{
	int a,b;
	void add(int num1, int num2)
	{
		int c;
		a=num1;
		b=num2;
		c=a+b;
		System.out.println("Addition is ="+c);
		
	}

	public static void main(String[] args)
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter First Number=");
		n1=sc.nextInt();
		System.out .println("Enter Second Number=");
		n2=sc.nextInt();
		
		Scanner_first obj=new Scanner_first();
		obj.add(n1,n2);
		
	}

}
