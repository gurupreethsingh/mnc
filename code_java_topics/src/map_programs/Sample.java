package map_programs;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Sample {

	public static void main(String[] args) {
		// Map - key-value pair
		// not allow duplicate keys , allow duplicate values. 
		// size is dynamic.
		// any type of data can be stored. 
		// canot store null key , null value can be stored. 
		
		// HashMap, LinkedHasMap, TreeMap  ( fullsorted )
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// put() , get()
		
		hm.put("Ram", 879874657);
		hm.put("Raju", 54544657);
		hm.put("Rajesh", 22124657);
		hm.put("Ram - whatsapp", 879874657);
		System.out.println(hm);
		
		
		LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
		// put() , get()
		
		hm1.put("Ram", 879874657);
		hm1.put("Raju", 54544657);
		hm1.put("Rajesh", 22124657);
		hm1.put("Ram - whatsapp", 879874657);
		System.out.println(hm1);
		
		
		TreeMap<String, Integer> hm2 = new TreeMap<String, Integer>();
		// put() , get()
		
		hm2.put("anil", 879874657);
		hm2.put("Raju", 54544657);
		hm2.put("chetan", 22124657);
		hm2.put("Ram - whatsapp", 879874657);
		System.out.println(hm2);
		

	}

}
