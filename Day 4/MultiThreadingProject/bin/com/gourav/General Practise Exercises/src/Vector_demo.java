
import java.util.Vector;

public class Vector_demo
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
		System.out.println(vector.get(4));
		vector.remove("A");
		System.out.println(vector);
		vector.remove(0);
		System.out.println(vector);
		vector.clear();
		System.out.println(vector);
	}

}
