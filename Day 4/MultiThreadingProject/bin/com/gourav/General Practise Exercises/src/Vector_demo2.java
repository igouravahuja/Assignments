
import java.util.Enumeration;
import java.util.Vector;

public class Vector_demo2
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
			System.out.println(e);
		}
	}
}
