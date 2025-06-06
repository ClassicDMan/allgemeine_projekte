package Lesson_06_LinkedList_vs_ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestMain {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		for (int i = 0; i < 1000000; i++) {
			
			linkedList.add(i);
			arrayList.add(i);
			
		}
		
//		*************LinkedList***********
		
		startTime = System.nanoTime();
		
//		linkedList.get(0);
//		linkedList.get(500000);		
//		linkedList.get(999999);
		
//		linkedList.remove(0);						// faster
//		linkedList.remove(500000);
		linkedList.remove(999999);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList Time: " + elapsedTime + " nano seconds");		
		
//		*************ArrayList***********
		
		startTime = System.nanoTime();
		
//		arrayList.get(0);							// faster
//		arrayList.get(500000);						// much faster
//		arrayList.get(999999);						// faster
		
//		arrayList.remove(0);						// slower, becuase of the shifting operations after the deletion
//		arrayList.remove(500000);					// faster
		arrayList.remove(999999);					// faster
		
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("ArrayList Time: " + elapsedTime + " nano seconds");
		
		
	}
	
	
}
