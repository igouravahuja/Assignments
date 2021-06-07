
public class ShoppingMall
{
	private int choice;
	public ShoppingMall(int choice)
	{
		this.choice=choice;
	}
	void buy()
	{
		switch(choice)
		{
		case 1:
			PopCorn p=new Butter();
			p.pop();
			break;
		case 2:
			PopCorn p1=new Salted();
			p1.pop();
			break;
		case 3:
			PopCorn p2=new Chocolate();
			p2.pop();
			break;	
		default:
			System.out.println("Sorry.... Wrong Choice Entered...!");
		}
	}
}
