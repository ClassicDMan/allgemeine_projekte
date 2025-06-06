package Lesson_10_BubbleSort;

public class TestBubbleSort {

	/*
	 * Bubble sort = it is an sorting algorithm, where it compares a pair of
	 * Elements and checks if it is in order, if not, then those Elements will be
	 * switched, and doing so until the whole array is sorted
	 * 
	 * Run Time Complexity: o (n ^ 2) = quadratic
	 * 						examples: insertionSort, selectionSort, bubbleSort
	 * 
	 * 				small data set = okay-ish
					large data set = BAD (plz don't)
	 */
	public static void main(String[] args) {

		int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
		bubbleSort(array);

		for (int i : array) {
			System.out.println(i);
		}

	}

	private static void bubbleSort(int[] array) {
		// TODO Auto-generated method stub

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) { // for ascending order, for descending order then vhange > to <
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

	}

}
