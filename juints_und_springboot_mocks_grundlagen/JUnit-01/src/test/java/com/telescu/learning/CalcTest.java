package com.telescu.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Calc c = new Calc();
			int actual = c.divide(10, 5);
			int expectedResult = 2;
			
		assertEquals(expectedResult, actual);
	}

}
