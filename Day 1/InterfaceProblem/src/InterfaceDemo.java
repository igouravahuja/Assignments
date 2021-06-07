interface Drawable
{
	void drawingColour();
	void thickness();
}
interface Fillable
{
	void fillingColour();
	void size();
}

class Line implements Drawable,Fillable
{
	public void drawingColour()
	{
		System.out.println("Drawing Color of Line");
	}
	public void thickness()
	{
		System.out.println("Thickness of Line");
	}
	public void fillingColour()
	{
		System.out.println("Filling Colour of Line");
	}
	public void size()
	{
		System.out.println("Size of Line");
	}
}
class Circle
{
	public void drawingColour()
	{
		System.out.println("Drawing Color of Circle");
	}
	public void thickness()
	{
		System.out.println("Thickness of Circle");
	}
	public void fillingColour()
	{
		System.out.println("Filling Colour of Circle");
	}
	public void size()
	{
		System.out.println("Size of Circle");
	}
}
class Square
{
	public void drawingColour()
	{
		System.out.println("Drawing Color of Square");
	}
	public void thickness()
	{
		System.out.println("Thickness of Square");
	}
	public void fillingColour()
	{
		System.out.println("Filling Colour of Square");
	}
	public void size()
	{
		System.out.println("Size of Square");
	}
}
public class InterfaceDemo
{
	
}