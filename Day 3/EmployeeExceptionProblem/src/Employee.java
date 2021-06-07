import java.util.*;

public class Employee
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SetEmployee obj=new SetEmployee();
		String name;
		int age;
		int count=0;
		char more='Y';
		System.out.println("Enter Details of Employee");
		try
		{
		while(more=='Y')
		{
			
				sc.nextLine();
				System.out.println("Enter Name=");
				name=sc.nextLine();
				obj.setName(name,count);
				System.out.println("Enter Age=");
				age=sc.nextInt();
				obj.setAge(age,count);
				count++;
				System.out.println("Want to enter more details (Y/N)");
				more=sc.next().charAt(0);
			}
		}
			catch(AgeException exception)
			{
				System.out.println("Please Enter Age Between 18 and 60 and Try Again");
			}
		catch(NameException exception)
		{
			System.out.println("Name Duplicacy found, please enter another nameand Try Again");
		}
	}

}
