
import java.util.*;

public class Tree_Demo
{
	public static void main(String[] args)
	{
		TreeMap map=new TreeMap();
		map.put(new Integer(103),"CCC");
		map.put(new Integer(105),"EEE");
		map.put(new Integer(102),"BBB");
		map.put(new Integer(101),"AAA");
		map.put(new Integer(104),"DDD");
		map.replace(104,new Integer(100));
		map.put(new Integer(106),null);
		map.remove(105);
		System.out.println(map);
		System.out.println(map.get(102));
		
		TreeMap map1=new TreeMap();
		map1.put("P","CCC");
		map1.put("Q","EEE");
		map1.put("Z","BBB");
		map1.put("Y","AAA");
		map1.put("B","DDD");
		map1.put("A","DDD");
		System.out.println(map1);
		
	}
}
