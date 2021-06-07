package zoo;
import org.animals.*;

public class VandalurZoo
{

	public static void main(String[] args)
	{
		Animals lion=new Lion();
		lion.isVegetarian();
		lion.canClimb();
		lion.sound();
		System.out.println();
		
		Animals tiger=new Tiger();
		tiger.isVegetarian();
		tiger.canClimb();
		tiger.sound();
		System.out.println();
		
		Animals deer=new Deer();
		deer.isVegetarian();
		deer.canClimb();
		deer.sound();
		System.out.println();
		
		Animals monkey=new Monkey();
		monkey.isVegetarian();
		monkey.canClimb();
		monkey.sound();
		System.out.println();
		
		Animals giraffe=new Giraffe();
		giraffe.isVegetarian();
		giraffe.canClimb();
		giraffe.sound();
	}

}
