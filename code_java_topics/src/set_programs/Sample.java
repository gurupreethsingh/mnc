package set_programs;
//import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sample {

	public static void main(String[] args) {
//		Set Interface properties : -  // HashSet, LinkedHashSet, TreeSet classes. 
//		1. any type of data can be stored. (hetogeneous)
//		2. not allow duplicate values
//		3. allows null values .
//      4. size is dynamic .
		
//		LinkedHashSet hs = new LinkedHashSet();
//		hs.add(10);
//		hs.add(10);
//		hs.add(30);
//		hs.add(null);
//		hs.add(40);
//		System.out.println(hs);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);
		ts.add(10);
		ts.add(20);
		ts.add(20);
		System.out.println(ts);
	
	}
}
