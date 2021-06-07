class Grandfather
{
	void display1()
	{
		System.out.println("Inside class 1");;
	}
}
class Father extends Grandfather
{
	void display2()
	{
		System.out.println("Inside class 2");
	}
}
class Grandson extends Grandfather
{
	void display3()
	{
		System.out.println("Inside class 3");
	}
}
public class SingleInh
{

	public static void main(String[] args)
	{
		Grandson g=new Grandson();
		Father f=new Father();
		f.display1();
		f.display2();
		g.display1();
		g.display3();
	}

}
