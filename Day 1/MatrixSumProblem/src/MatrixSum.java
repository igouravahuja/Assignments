import java.util.*;

public class MatrixSum
{
	private int[][] matrix1=new int[2][2];
	private int[][] matrix2=new int[2][2];
	private int[][] sumMatrix=new int[2][2];
	Scanner sc=new Scanner(System.in);
	
	public void setMatrix1()
	{
		System.out.println("Enter Marix 1 Elements=");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
	}

	public void setMatrix2()
	{
		System.out.println("Enter Marix 2 Elements=");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
	}
	public void getSumMatrix()
	{
		System.out.println("Sum Matrix=");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				sumMatrix[i][j]=(matrix1[i][j]+matrix2[i][j]);
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(sumMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
}
