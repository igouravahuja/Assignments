import java.util.Scanner;

public class EggProblemMain
{
	
	public static void main(String[] args)
	{
		CalculateEggs obj=new CalculateEggs();
		Scanner sc=new Scanner(System.in);
		int noOfEggs;
		System.out.println("Please enter total no. of eggs=");
		noOfEggs=sc.nextInt();
		obj.setTotalEggs(noOfEggs);
		obj.setCalculateEggs();
		obj.getCalculatedEggs();
		
	}

}
