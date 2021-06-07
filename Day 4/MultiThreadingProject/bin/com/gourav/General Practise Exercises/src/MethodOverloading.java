
public class MethodOverloading
{
	int no;
	void display()
	{
		System.out.println("Method 1 Called");
	}
	void display(int n)
	{
		no=n;
		System.out.println("Method 2 Called - "+no);
	}


	public static void main(String[] args)
	{
		MethodOverloading mo=new MethodOverloading();
		mo.display();
		mo.display(5);

	}

}
