package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void test() {
		int[] expected = {2,4,6,8};
		int[] actual = {4,8,6,2};
//		int[] actual = expected;
		
		Arrays.sort(actual);				// after sorting, the test will be success ==> {2,4,6,8}
		
//		assertArrayEquals(expected, actual);
		assertEquals(expected, actual);				// ==> it is checking the reference variables, 
													// both /expected, actual) are referring to two different arrays
													// if actual = expected ==> the test will be success
	}
	
	@Test
	void  testArraySort() {
		
	}

}
