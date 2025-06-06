package Lesson_12_InsertionSort;

public class InsertionSortMain {

	/*
	 * InsertionSort = after comparing elements to the left Shift elements to the
	 * right to make room to insert a value
	 * 
	 * Run Time Complexity: o (n ^ 2) = quadratic
	 * 						examples: insertionSort, selectionSort, bubbleSort
	 * small data set = decent
	 * large data set = BAD
	 * 
	 * less steps than bubble sort best case is O (n) 
	 * compared to selection sort O(n ^ 2)
	 * 
	 */
	public static void main(String[] args) {

		int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		insertionSort(array);

		for (int i : array) {
			System.out.println(i);
		}

	}

	private static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i - 1;

			while (j >= 0 && array[j] > temp) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = temp;
		}

	}

}
