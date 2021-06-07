import java.util.*;
public class Task1
{
	

	public static void main(String[] args)
	{
		int choice;
		int count=0;
		String[] name=new String[10];
		int[] age=new int[10];
		String[] desig=new String[10];
		int salary[];
		int i;
		char more;
		System.out.println("Enter your Choice=");
		System.out.println("1 for Create User");
		System.out.println("2 for Display Info");
		System.out.println("3 for Raise Salary");
		System.out.println("4 to Exit");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		do
		{
			switch(choice)
			{
				case 1:
					do
					{
						System.out.println("Enter Name=");
						sc.nextLine();
						name[count]=sc.nextLine();
						System.out.println("Enter Age=");
						age[count]=sc.nextInt();
						System.out.println("Enter Designation=");
						sc.nextLine();
						desig[count]=sc.nextLine();
						count++;
						System.out.println("Want to enter more details (Y/N)");
						more=sc.next().charAt(0);
					}
					while(more!='N');
					System.out.println("Enter your Choice=");
					System.out.println("1 for Create User");
					System.out.println("2 for Display Info");
					System.out.println("3 for Raise Salary");
					System.out.println("4 to Exit");
					choice=sc.nextInt();
					break;
			
				case 2:
					for(i=0;i<count;i++)
					{
						System.out.println("Name="+name[i]);
						System.out.println("Age="+age[i]);
						System.out.println("Designation="+desig[i]);
					}
					System.exit(0);
					break;
			}
		}
		while(choice!=4);
	}

}
