
public class Test
{
	int a=10;
	static int b=20;
	public void demo()
	{
		int c=30;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		System.out.println(t.a);
		System.out.println(b);
		t.demo();
	}

}
