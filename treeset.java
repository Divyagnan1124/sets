
import java.util.*;

class GFG {

	
	public static void main(String[] args)
	{
	
		Set<String> ts = new TreeSet<>();

		
		ts.add("Java");
		ts.add("Python");
		ts.add("Angular");
		ts.add("Reactjs");
		ts.add("Javascript");
		

		
		for (String value : ts)

			
			System.out.print(value + ", ");

		System.out.println();
	}
}
