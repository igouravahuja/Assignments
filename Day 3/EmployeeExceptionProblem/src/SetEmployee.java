
public class SetEmployee
{
	private String[] name=new String[10];
	private int[] age=new int[10];
	private int res=0;
	public void setName(String name,int count)
	{
		for(int i=0;i<count;i++)
		{
			res=((getName()[i]).compareTo(name));
			if(res==0)
			{
				throw new NameException("Duplicate Name Entry");
			}
		}
		this.name[count] = name;
	}
	
	public void setAge(int age,int count)
	{
		if(age<0 || age>60 || age<18)
		{
			throw new AgeException("Invalid Age Entered");
		}
		this.age[count] = age;
	}
	public String[] getName()
	{
		return name;
	}
	
	public int[] getAge()
	{
		return age;
	}
	
	
}
