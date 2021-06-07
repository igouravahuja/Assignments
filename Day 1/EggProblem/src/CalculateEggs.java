
public class CalculateEggs
{
	private int totalEggs;
	private int grossEggs;
	private int dozenEggs;
	private int remainingEggs;
	private int remainder;
	
	public void setTotalEggs(int totalEggs)
	{
		this.totalEggs = totalEggs;
	}

	public void setCalculateEggs()
	{
		grossEggs=(totalEggs/144);
		remainder=(totalEggs%144);
		dozenEggs=remainder/12;
		remainder=(remainder%12);
		remainingEggs=remainder;
	}
	public void getCalculatedEggs()
	{
		System.out.println(grossEggs+" Gross Eggs");
		System.out.println(dozenEggs+" Dozen Eggs");
		System.out.println(remainingEggs+" Remaining Eggs\n");
	}
}
