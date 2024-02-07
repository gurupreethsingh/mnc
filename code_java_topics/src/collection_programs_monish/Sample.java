package collection_programs_monish;
//import java.util.ArrayList;
//import java.util.Vector;
import java.util.LinkedList;

public class Sample {

	public static void main(String[] args) 
	{
		// array and ArrayList - Collection (interface) - List, Queue, Set, Map (interface)
		// Array . 
		int a [] = {11,22,33,44,55, 2};
		String names[] = {"Monish" , "vineeth" , "Guru"};
		
//		List Interface properties : -
//		1. any type of data can be stored. (hetogeneous)
//		2. duplicate values. 
//		3. store null values .
//      4. size is dynamic .
		
		// ArrayList , Vector, LinkedList - java.util
		
//		ArrayList a1 = new ArrayList();
//		a1.add(10);
//		a1.add(20);
//		a1.add(2.3);
//		a1.add(2.3);
//		a1.add(null);
//		a1.add('a');
//		a1.add("hello");	
//		System.out.println(a1);
//		System.out.println(a1.size());
//   ArrayList size increses 50% 
		
//		Vector a1 = new Vector();
//		a1.add(10);
//		a1.add(20);
//		a1.add(2.3);
//		a1.add(2.3);
//		a1.add(null);
//		a1.add('a');
//		a1.add("hello");
//		System.out.println(a1);
//		System.out.println(a1.size());
	// vectors size increases 100%
		
		
		LinkedList a1 = new LinkedList();
		a1.add("hello");
		a1.add(10);
		a1.add(20);
		a1.add(2.3);
		a1.add(2.3);
		a1.add(null); // empty space.
		a1.add('a');
		a1.add("hello");
		System.out.println(a1);
		System.out.println(a1.size());
	// vectors size increases 100%

	}

}
