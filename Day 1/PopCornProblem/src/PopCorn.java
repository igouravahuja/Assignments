
abstract class PopCorn
{
	abstract void pop();
}
class Butter extends PopCorn
{
	void pop()
	{
		System.out.println("Butter Popcorn is Popping..!");
	}
}
class Salted extends PopCorn
{
	void pop()
	{
		System.out.println("Salted Popcorn is Popping..!");
	}
}
class Chocolate extends PopCorn
{
	void pop()
	{
		System.out.println("Chocolate Popcorn is Popping..!");
	}
}