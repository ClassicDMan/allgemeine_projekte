package com.learning;

import java.util.Arrays;

public class SortingArray {
	
	public int[] sortingArray(int[] array) {
		Arrays.sort(array);
		return array;
	}
	
	public int[] sortingArray_2(int[] array) {
		for (int i = 0; i < 1000000; i++) {
			Arrays.sort(array);
		}
		
		return array;
	}

}
