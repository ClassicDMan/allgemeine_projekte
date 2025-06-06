package Lesson_11_SelectionSort;

//import java.util.Iterator;

public class TestSelectionSort {

	/*
	 * selectionSort = search through an array and keep track of the minimum value
	 * during each iteration. At the end of each iteration we swap variables. 
	 * or search through an array and keep track of the maximum value during each
	 * iteration. it depends on the defined criteria.
	 * 
	 * Run Time Complexity: o (n ^ 2) = quadratic
	 * 						examples: insertionSort, selectionSort, bubbleSort
	 * 
	 * 	 			small data set = okay-ish
					large data set = BAD (plz don't)
	 * 
	 */

	public static void main(String[] args) {

		int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		selectionSort(array);

		for (int i : array) {
			System.out.println(i);
		}
	}

	private static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			int min = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}

	}

}
