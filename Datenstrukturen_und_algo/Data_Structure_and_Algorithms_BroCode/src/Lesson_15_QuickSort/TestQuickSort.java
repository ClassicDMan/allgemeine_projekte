package Lesson_15_QuickSort;

public class TestQuickSort {
	/*
	 * quicksort = 	move smaller elements to left of a pivot.
					Recursively divide array into partitions.

		Runtime complexity = 	best case O (n log n)
								average case O (n log n)
								worst case O ( n ^ 2) if already sorted
								
		space complexity = 		O ( n log n ) due to recursion

	 */

	private static void quickSort(int[] array, int start, int end) {
		if (end <= start)
			return; // base Case

		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);

	}

	private static int partition(int[] array, int start, int end) {

		int pivot = array[end];
		int i = start - 1;

		for (int j = start; j <= end - 1; j++) {

			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;

		return i;

	}

	public static void main(String[] args) {

		int[] array = { 8, 2, 4, 7, 1, 3, 9, 6, 5 };

		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		quickSort(array, 0, array.length - 1);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
