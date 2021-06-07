import java.util.*;

public class Task3
{
	private int number;
	private boolean circular;
	public void setNumber(int number)
	{
		this.number = number;
	}
	public boolean isCircular()
	{
		Power power=new Power();
		power.setNumber(number);
		int result=power.getResult();
		//impliment if statement
		circular=true;
		return circular;
	}	
	public static void main(String[] args)
	{
		Task3 circular=new Task3();
		circular.setNumber(102564);
		System.out.println(circular.isCircular());
	}
}
