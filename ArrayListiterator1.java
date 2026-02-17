package module1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListiterator1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("apple");
		al.add("bananna");
		al.add("grapes");
		al.add("goa");
		ListIterator it=al.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
		
		

	}

}
