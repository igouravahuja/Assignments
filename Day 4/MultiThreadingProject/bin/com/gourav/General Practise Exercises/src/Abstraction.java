abstract class Demo1
{
	abstract void add();
}

class Abstraction extends Demo1
{
	void add()
	{
		System.out.println(1+9);
	}
	public static void main(String[] args)
	{
		Abstraction ab=new Abstraction();
		ab.add();
	}

}
