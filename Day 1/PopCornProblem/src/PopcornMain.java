import java.util.*;

public class PopcornMain
{

	public static void main(String[] args)
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice=");
		System.out.println("1. for Butter PopCorn");
		System.out.println("2. for Salted PopCorn");
		System.out.println("3. for Chocolate PopCorn");
		choice=sc.nextInt();
		ShoppingMall obj=new ShoppingMall(choice);
		obj.buy();
	}

}
