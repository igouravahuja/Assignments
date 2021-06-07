
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_iterator
{
	public static void main(String[] args)
	{
		Vector vector=new Vector();
		vector.add("C");
		vector.add("A");
		vector.add("E");
		vector.add("D");
		vector.add("F");
		vector.add(new Integer(101));
		vector.add(null);
		vector.add("A");
		vector.add(3,"B");
		System.out.println(vector);
		Enumeration enumeration=vector.elements();
		while(enumeration.hasMoreElements())
		{
			Object e=enumeration.nextElement();
		}
		ListIterator li=vector.listIterator();
		while(li.hasNext())
		{
			Object n=li.next();
			System.out.println(n);
		}
		ListIterator li2=vector.listIterator(vector.size());
		while(li2.hasPrevious())
		{
			Object p=li2.previous();
			System.out.println(p);
		}
		
	}
}
