package Q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
//		Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		//Collection<String> c = new LinkedHashSet<>();
		//Collection<String> c = new TreeSet<>();
//		c.add("B");
//		c.add("D");
//		c.add("A");
//		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
//		System.out.println(c.toString());
//		[B, D, A, C, null, null, null]
		
		
		
		
//				Collection<String> c = new HashSet<>();
				
//				c.add("B");
//				c.add("D");
//				c.add("A");
//				c.add("C");
//				c.add(null);
//				c.add(null);
//				c.add(null);
//				System.out.println(c.toString());
				//[null, A, B, C, D]
		

//		Collection<String> c = new LinkedHashSet<>();
		
//		c.add("B");
//		c.add("D");
//		c.add("A");
//		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
//		System.out.println(c.toString());
//		[B, D, A, C, null]
		
		Collection<String> c = new TreeSet<>();
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
//		c.add(null);
//		c.add(null);
//		c.add(null);
		System.out.println(c.toString());
		//null is not accepted

	}

}
