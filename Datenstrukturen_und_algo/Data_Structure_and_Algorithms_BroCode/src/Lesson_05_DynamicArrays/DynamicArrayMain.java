package Lesson_05_DynamicArrays;

public class DynamicArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Static array: is an array with a fix capacity. 
		 * Dynamic array: is an array with a resizable capacity.
		 * 
		 * Advantages of dynamic array:
		 * 1. random access of elements. O(1) 
		 * 2. good locality of reference and data cache utilization. 
		 * 3. Easy to insert/ delete at the end. 
		 * Disadvantages of dynamic array: 
		 * 1. wastes more memory. 
		 * 2. Shifting elements is time consuming. O(n) 
		 * 3. Expanding/shrinking the area is time consuming. O(n)
		 * 
		 */
		

		DynamicArray dynamicArray = new DynamicArray(5);
		System.out.println("empty: " + dynamicArray.isEmpty());
		System.out.println("Size: " + dynamicArray.size);
		System.out.println("Capacity: " + dynamicArray.capacity);
		System.out.println(dynamicArray);
		System.out.println();
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
//		dynamicArray.delete("A");
//		dynamicArray.delete("B");
//		dynamicArray.delete("C");

		
		dynamicArray.insert(0, "X");
		dynamicArray.delete("A");
		System.out.println("(Search Methide) the searched Element is at Index: " + dynamicArray.search("E"));
		
		System.out.println("Size: " + dynamicArray.size);
		System.out.println("Capacity: " + dynamicArray.capacity);
		System.out.println(dynamicArray);
		System.out.println("empty: " + dynamicArray.isEmpty());
		

	}

}
