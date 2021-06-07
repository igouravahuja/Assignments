class Parent
{
	void property()
	{
		System.out.println("Inside Parent Class");
	}
	void fun()
	{
		System.out.println("Parent Fun Method");
	}
}
class Child extends Parent
{
	void property()
	{
		System.out.println("Inside Child Class");
	}
}
public class MethodOverriding
{

	public static void main(String[] args)
	{
		Parent obj1=new Parent();
		obj1.property();
		
		Child obj2=new Child();
		obj2.property();
		obj2.fun();

	}

}
