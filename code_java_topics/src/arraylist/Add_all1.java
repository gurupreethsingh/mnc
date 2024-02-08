package arraylist;
import java.util.ArrayList;
public class Add_all1 
{
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(5);
	a1.add("hi");
	a1.add(20.5);
	
	ArrayList a2=new ArrayList();
	a2.add("hello");
	a2.add(5);
	a2.add(5.5);
	
	System.out.println("------before add All()------");
	System.out.println(a1);
	System.out.println(a2);
	
	a1.addAll(a2);
	
	System.out.println("--------after add All()-------");
	System.out.println(a1);
	System.out.println(a2);
 }
}
