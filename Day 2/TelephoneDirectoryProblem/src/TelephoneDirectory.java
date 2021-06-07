
public class TelephoneDirectory
{
	private int[] id=new int[10];
	private String[] name=new String[10];
	private String[] address=new String[10];
	private int[] phoneNo=new int[10];
	
	public void setId(int id,int count)
	{
			this.id[count] = id;
	}
	
	public void setName(String name,int count)
	{
		this.name[count] = name;
	}
	public void setAddress(String address,int count)
	{
		this.address[count] = address;
	}
	public void setPhoneNo(int phoneNo,int count)
	{
		this.phoneNo[count] = phoneNo;
	}
	
	
	public int[] getId()
	{
		return id;
	}
	public String[] getName()
	{
		return name;
	}
	public String[] getAddress()
	{
		return address;
	}
	public int[] getPhoneNo()
	{
		return phoneNo;
	}
}
