
import java.io.*;
import java.util.*;


class Linked {


	public static void main(String[] args)
	{

		
		Set<String> hs = new LinkedHashSet<String>();

		hs.add("Java");
		hs.add("Angular");
		hs.add("React");
		hs.add("Javascript");
		hs.add("Python");

		
		Iterator itr = hs.iterator();

		while (itr.hasNext())
			System.out.print(itr.next() + ", ");

		// New line
		System.out.println();

		// Using enhanced for loop for iteration
		for (String s : hs)
			System.out.print(s + ", ");
		System.out.println();
	}
}
