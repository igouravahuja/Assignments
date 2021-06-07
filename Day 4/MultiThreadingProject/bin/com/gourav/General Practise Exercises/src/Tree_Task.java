
import java.util.*;

public class Tree_Task
{
	public static void main(String[] args)
	{
		TreeMap map=new TreeMap();
		map.put(new Integer(10),"Ram");
		map.put(new Integer(05),"Sham");
		map.put(new Integer(25),"Rohan");
		map.put(new Integer(15),"Mohan");
		map.put(new Integer(20),"Tina");
		System.out.println(map);
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.println(obj);
		}
		
	}
}
