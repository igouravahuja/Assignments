abstract class Demo2
{
	abstract void add();
	abstract void product();
	abstract void division();
}
public class Abst2 extends Demo2
{
	void add()
	{
		System.out.println("Addition is done");;
	}
	void product()
	{
		System.out.println("Product is done");
	}
	void division()
	{
		System.out.println("Division is done");
	}

	public static void main(String[] args)
	{
		Abst2 obj=new Abst2();
		obj.add();
		obj.product();
		obj.division();
	}

}
