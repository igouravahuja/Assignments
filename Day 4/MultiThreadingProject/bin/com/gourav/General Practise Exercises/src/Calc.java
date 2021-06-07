
public class Calc {
	int a=6;
	int b=5;
	int c;
	public void sum()
	{
	c=a+b;
	System.out.println(c);
	}
	public void diff()
	{
	c=a-b;
	System.out.println(c);
	}
	public void prod()
	{
	c=a*b;
	System.out.println(c);
	}
	public static void main(String args[])
	{
	Calc c= new Calc();
	c.sum();
	c.diff();
	c.prod();
	}

}
