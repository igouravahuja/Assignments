import java.util.*;

public class TelephoneDirectoryMain
{
	public static void main(String[] args)
	{
		int id;
		String name;
		String address;
		int phoneNo;
		TelephoneDirectory obj=new TelephoneDirectory();
		Scanner sc=new Scanner(System.in);
		int choice;
		int count=0;
		int i;
		char more;
		System.out.println("Enter Your choice=");
		System.out.println("1. to Enter Data in the Directory");
		System.out.println("2. to get all the entries");
		System.out.println("3 to Exit");
		choice=sc.nextInt();
		System.out.println();
		do
		{
			switch(choice)
			{
			case 1:
				do
				{
					System.out.println("Enter Id=");
					id=sc.nextInt();
					System.out.println("Enter Name=");
					sc.nextLine();
					name=sc.nextLine();
					System.out.println("Enter Address=");
					address=sc.nextLine();
					System.out.println("Enter Phone Number=");
					phoneNo=sc.nextInt();
					obj.setId(id,count);
					obj.setName(name,count);
					obj.setAddress(address,count);
					obj.setPhoneNo(phoneNo,count);
					count++;
					System.out.println("Want to enter more details (Y/N)");
					more=sc.next().charAt(0);
				}
				while(more!='N');
				System.out.println("Enter Your choice=");
				System.out.println("1. to Enter Data in the Directory");
				System.out.println("2. to get all the entries");
				System.out.println("3 to Exit");
				choice=sc.nextInt();
				break;
			case 2:
				for(i=0;i<count;i++)
				{
					System.out.println("=====================");
					System.out.println(obj.getId()[i]);
					System.out.println(obj.getName()[i]);
					System.out.println(obj.getAddress()[i]);
					System.out.println(obj.getPhoneNo()[i]);
				}
				System.out.println("Enter Your choice=");
				System.out.println("1. to Enter Data in the Directory");
				System.out.println("2. to get all the entries");
				System.out.println("3 to Exit");
				choice=sc.nextInt();
				break;
			}
		}
		while(choice!=3);

	}
}
