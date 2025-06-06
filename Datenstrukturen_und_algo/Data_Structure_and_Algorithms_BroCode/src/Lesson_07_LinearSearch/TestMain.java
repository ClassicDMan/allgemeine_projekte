package Lesson_07_LinearSearch;

import java.awt.LinearGradientPaint;

public class TestMain {
	public static void main(String[] args) {

		/*
		 * Linear search = iterate through a collection one element at a time. Runtime
		 * complexity: o(n) 
		 * Disadvantages: 
		 * slow for large datasets. Advantages: 
		 * 1. fast for searches of small to medium datasets. 
		 * 2. Does not need to be sorted. 
		 * 3. useful for data structures that do not have random access (LinkedList)
		 * 
		 */
		
		int[] array = {6, 8, 3, 5, 4, 9, 7, 1, 2};
		
		int index = linearSearch(array, 66);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
		}else {
			System.out.println("Element not found");
		}

	}
	
	private static int linearSearch(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		
		return -1;
	}
}
