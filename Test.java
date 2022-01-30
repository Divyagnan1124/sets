import java.io.*;
import java.util.*;

class Test{

	public static void main(String[] args)
	{

		HashSet<String> hs = new HashSet<String>();

		hs.add("Java");
		hs.add("Angular");
		hs.add("React");
		hs.add("Javascript");
		hs.add("Python");


		Iterator itr = hs.iterator();

		
		while (itr.hasNext())

			
			System.out.print(itr.next() + ", ");
		System.out.println();

		
		for (String s : hs)

			
			System.out.print(s + ", ");
		System.out.println();
	}
}
