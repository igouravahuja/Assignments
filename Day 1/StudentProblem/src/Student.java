import java.util.*;
import java.util.Random;
public class Student
{
	private int[] rollNo=new int[8];
	private String[] name=new String[8];
	private int[] englishMarks=new int[8];
	private int[] mathsMarks=new int[8];
	private int[] scienceMarks=new int[8];
	private int noOfStudents;
	private int[] percentage=new int[8];
	private int highestPercentage;
	private int highestMathsMarks;
	Scanner sc=new Scanner(System.in);
	//Random rand=new Random();
	
	public void setStudentdata(int noOfStudents)
	{
		this.noOfStudents=noOfStudents;
		for(int i=0;i<noOfStudents;i++)
		{
			sc.nextLine();
			System.out.println("Please Enter Student"+(i+1)+"'s Name=");
			name[i]=sc.nextLine();
			System.out.println("Please Enter Student"+(i+1)+"'s English Marks=");
			englishMarks[i]=sc.nextInt();
			System.out.println("Please Enter Student"+(i+1)+"'s Maths Marks=");
			mathsMarks[i]=sc.nextInt();
			System.out.println("Please Enter Student"+(i+1)+"'s Science Marks=");
			scienceMarks[i]=sc.nextInt();
			rollNo[i]=(1000+i);
		}
	}
	public void display1()
	{
		Arrays.sort(rollNo);
		for(int i=0;i<noOfStudents;i++)
		{
			System.out.println("Roll No="+rollNo[i]);
			System.out.println("Name No="+name[i]);
		}
	}
	public void display2()
	{
		for(int i=0;i<noOfStudents;i++)
		{
			percentage[i]=(englishMarks[i]+mathsMarks[i]+scienceMarks[i])/3;
		}
		Arrays.sort(percentage);
		highestPercentage=noOfStudents;
		System.out.println("Student with Highest Percentage=");
		System.out.println("Roll No="+rollNo[highestPercentage]);
		System.out.println("Name="+name[highestPercentage]);
	}
	public void display3()
	{
		Arrays.sort(mathsMarks);
		highestMathsMarks=noOfStudents;
		System.out.println("Student with Highest Marks in Maths=");
		System.out.println("Roll No="+rollNo[highestMathsMarks]);
		System.out.println("Name="+name[highestMathsMarks]);
	}
}
