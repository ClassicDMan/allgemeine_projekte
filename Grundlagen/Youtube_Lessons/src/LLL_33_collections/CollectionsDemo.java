package LLL_33_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
	public static void show() {
		Collection <String> collections = new ArrayList<>();
		collections.add("a");
		collections.add("b");
		collections.add("c");
		
		for(var item : collections) {
			System.out.println(item);
		}
		System.out.println(collections);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
//		Collection <String> collections = new ArrayList<>();
//		Collections.addAll(collections, "a", "b", "c");
//		System.out.println(collections);
////		collections.remove("a");
////		collections.clear();
//		System.out.println(collections.contains("a"));
//		System.out.println(collections.size());
//		Object[] objectArray = collections.toArray();
//		String [] stringArray = collections.toArray(new String[3]);
////		stringArray[0].toCharArray();
//		System.out.println(stringArray.length);
		
		
		
		/////////////////////////////////////////////////////////////////////////
		
//		Collection <String> collections = new ArrayList<>();
//		Collections.addAll(collections, "a", "b", "c");
//		Collection <String> other = new ArrayList<>();
//		other.addAll(collections);
//		
////		System.out.println(collections == other);
//		System.out.println(collections.equals(other));
		
	}

}
