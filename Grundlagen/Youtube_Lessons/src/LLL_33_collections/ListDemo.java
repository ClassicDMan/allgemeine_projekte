package LLL_33_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add(0, "!");
		
		Collections.addAll(list, "a", "b", "c", "a");
//		System.out.println(list);
//		list.set(0, "a+");			// the a will become a+
//		list.remove(0);
		System.out.println(list);
		System.out.println(list.indexOf("a+"));			// -1 it doesn't exist, we removed it
		System.out.println(list.lastIndexOf("a"));
		System.out.println(list.subList(0, 2));
		System.out.println(list.get(0));
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
