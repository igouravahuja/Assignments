import java.util.*;

public class StudentMain
{

	public static void main(String[] args)
	{
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		int noOfStudents;
		System.out.println("Please enter the NO. of Students=");
		noOfStudents=sc.nextInt();
		student.setStudentdata(noOfStudents);
		int choice;
		System.out.println("Enter your choice=");
		System.out.println("1. for Displaying Roll no. and Name in ascending order");
		System.out.println("2. for Displaying Roll no. and Name of the Student with Highest %");
		System.out.println("3. for Displaying Roll no. and Name of the Student with Highest Marks in Maths");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				student.display1();
				break;
			case 2:
				student.display2();
				break;
			case 3:
				student.display3();
				break;
			default:
				System.out.println("Wrong Choice Entered");
		}		
	}

}
