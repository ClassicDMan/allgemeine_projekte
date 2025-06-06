package Lesson_16_HashTables;

import java.util.Hashtable;

public class TestHashTables {

	/*
	 * Hashtable = 	A data structure that stores unique keys to values. Ex:<Integer, String>
					Each key/value pair is known as an Entry.
					Fast insertion, look up, deletion of key/value pairs.
					Not ideal for small datasets, great with large datasets.

		hashing = 	takes a key and computes an integer ( formula will vary based on key and data type ).
					In a Hashtable, we use the hash % capacity to calculate an index number.

					key.hashCode() % capacity = index

		bucket = 	an indexed storage location for one or more Entries.
					Can store multiple entries in case of collision (linked similarly a linked list)
		Collision = hash and generates the same index for more than one key.
					Less collisions = more efficiency.
					
		runtime complexity = 	best case O(1)
			worst case O(n)


	 */
	
	
	public static void main(String[] args) {
	
//		Hashtable<Integer, String> table = new Hashtable<>(10, 0.5f);
		
		
		Hashtable<Integer, String> table = new Hashtable<>(10);
		
		table.put(100, "Juan");
		table.put(123, "Salar");
		table.put(321, "Jotar");
		table.put(555, "Dler");
		table.put(777, "Blend");
		
//		table.remove(777);
		
		for(Integer key : table.keySet()) {
			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
		}
		System.out.println();
		System.out.println();
		
		Hashtable<String, String> table2 = new Hashtable<>(21);
		
		table2.put("100", "Juan");
		table2.put("123", "Salar");
		table2.put("321", "Jotar");
		table2.put("555", "Dler");
		table2.put("777", "Blend");
		
		for (String key : table2.keySet()) {
			System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table2.get(key));
			
		}
		
	}
}
