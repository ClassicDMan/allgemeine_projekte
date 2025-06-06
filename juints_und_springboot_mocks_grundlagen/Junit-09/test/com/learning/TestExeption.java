package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestExeption {

	@Test
	void testSortingArray_Exeption() {
		
//		try {
		SortingArray array = new SortingArray();
//		int[] unsorted = {2,5,3};
//		int[] sortedArray = array.sortingArray(unsorted);
//		for(int element : sortedArray) {
//			System.out.print(element + ", ");
//		}
//		System.out.println("Statement below exeption");
//		fail();
//		}catch(NullPointerException e) {
//			System.out.println("Exeption generated");
//		}
		
		
		int[] unsorted = null;
		assertThrows(NullPointerException.class, ()-> array.sortingArray(unsorted));
		
	}
	
	@Test
	void testSortingArray_Performance() {
		
		SortingArray array = new SortingArray();
		
		int[] unsorted = {2, 5, 1};
		assertTimeout(Duration.ofMillis(10), ()-> array.sortingArray_2(unsorted));
		
		
	}

}
