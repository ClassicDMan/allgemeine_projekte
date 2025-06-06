package Lesson_14_MergeSort;

public class TestMergeSort {
	
	/*
	 *	MergeSort = is a divide and conquer algorithm, recursively divide array in 2, sort, re-combine.
		Pass an array in a function that will split the array into arrays (sub arrays which will be left array and right array).
		Copy the primary array and pass it into the sub areas
		It is a recursive method
		the arrays will split till the array has a size of one, and the merge will be called, 
		this way the elements will be merged into one array … etc
		
		Runtime complexity = O ( n log n ) like quickSort, mergeSort, heapSort
		space complexity = O(n)
	 */
	private static void mergeSort(int[] array) {

		int length = array.length;
		if (length <= 1)
			return; // base Case

		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];

		int i = 0;
		int j = 0;

		for (; i < length; i++) {
			if (i < middle) {
				leftArray[i] = array[i];
			} else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);

	}

	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; // indices

		// check the condition for merging
		while (l < leftSize && r < rightSize) {
			if (leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			} else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while (l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 3, 7, 8, 5, 4, 2, 6, 1 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		mergeSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
