import java.util.*;
public class Task2
{
	

	public static void main(String[] args)
	{
		int choice;
		int count=0;
		String[] name=new String[10];
		int[] age=new int[10];
		String[] desig=new String[10];
		int[] salary=new int[10];
		int[] new_salary=new int[10];
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
						if (desig[count].charAt(0)=='P'||desig[count].charAt(0)=='p'|| desig[count].charAt(0)=='M'||desig[count].charAt(0)=='m'||desig[count].charAt(0)=='T'||desig[count].charAt(0)=='t')
						{
							if(desig[count].charAt(0)=='P')
							{
								salary[count]=30000;
							}
							if(desig[count].charAt(0)=='M')
							{
								salary[count]=40000;
							}
							if(desig[count].charAt(0)=='T')
							{
								salary[count]=25000;
							}
							
							
						}
						else
						{
							System.out.println("Enter Designation=");
							sc.nextLine();
							desig[count]=sc.nextLine();
						}
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
						System.out.println("Salary="+salary[i]);
					}
					System.exit(0);
					break;
				case 3:
					for(i=0;i<count;i++)
					{
						if(desig[i].charAt(0)=='P'||desig[i].charAt(0)=='p')
						{
							new_salary[i]=(salary[i]+10000);
							System.out.println("Name="+name[i]);
							System.out.println("Age="+age[i]);
							System.out.println("Designation="+desig[i]);
							System.out.println("Salary="+new_salary[i]);
						}
						else if(desig[i].charAt(0)=='M'||desig[i].charAt(0)=='m')
						{
							new_salary[i]=(salary[i]+12000);
							System.out.println("Name="+name[i]);
							System.out.println("Age="+age[i]);
							System.out.println("Designation="+desig[i]);
							System.out.println("Salary="+new_salary[i]);
						}
						else if(desig[i].charAt(0)=='T'||desig[i].charAt(0)=='t')
						{
							new_salary[i]=(salary[i]+7000);
							System.out.println("Name="+name[i]);
							System.out.println("Age="+age[i]);
							System.out.println("Designation="+desig[i]);
							System.out.println("Raised Salary="+new_salary[i]);
						}
					}
					System.out.println("Enter your Choice=");
					System.out.println("1 for Create User");
					System.out.println("2 for Display Info");
					System.out.println("3 for Raise Salary");
					System.out.println("4 to Exit");
					choice=sc.nextInt();
					break;
					
			}
		}
		while(choice!=4);
	}

}
