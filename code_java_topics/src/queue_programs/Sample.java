package queue_programs;
import java.util.PriorityQueue;

public class Sample {

	public static void main(String[] args) 
	{
//		Queue Interface properties : -  LinkedList , PriorityQueue
//		1. any type of data can be stored. (hetogeneous)
//		2. duplicate values are allowed. 
//		3. Cannot store null values .
//      4. size is dynamic .
		
//		PriorityQueue a1 = new PriorityQueue();
//		a1.add(30);
//		a1.add(10);
//		a1.add(20);
//		// a1.add(null); // empty space.
		
		
//		PriorityQueue a1 = new PriorityQueue();
//		a1.add("Vineeth");
//		a1.add("Monesh");
//		a1.add("Chetan");
//
//		System.out.println(a1);
		
		
//		PriorityQueue<String> a1 = new PriorityQueue<String>();
//		a1.add("Vineeth");
//		a1.add("Monesh");
//		a1.add("Chetan");
//
//		System.out.println(a1);
		
		PriorityQueue<Integer> a1 = new PriorityQueue<Integer>();
		a1.add(60);
		a1.add(50);
		a1.add(70);
		a1.add(70);

		System.out.println(a1);
	}

}
