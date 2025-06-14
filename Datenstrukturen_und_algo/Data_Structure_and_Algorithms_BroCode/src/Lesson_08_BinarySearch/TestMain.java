package Lesson_08_BinarySearch;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {

		/*
		 * Binary search: it is a search algorithm that finds the position of a target
		 * value within a sorted array. 
		 * Half of the area is illuminated during each step. 
		 * Time complexity: O(log n) --> the bigger the size of the data set, the more efficient will the binary search will be
		 * 
		 */
		
		int[] array = new int[1000000];
		int target = 777777;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			
		}
//		int index = Arrays.binarySearch(array, target);
		int index = binarySearch(array, target);
		if(index == -1) {
			System.out.println(target + " not found");
		}else {
			System.out.println("Element found at: " + index);
		}

	}

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		
		int low = 0;
		int high = array.length - 1 ;
		
		while(low <= high) {
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle: " + value);
			
			if(value < target) {
				low = middle + 1;
			}else if(value > target) {
				high = middle - 1;
			}else {
				return middle; // target found
			}
		}
		
		return -1;
	}

}
