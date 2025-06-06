package com.telesku.learning;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	@Test(timeout = 100)
	public void test() {
		ReverseString reverse = new ReverseString();
		//		String actual = reverse.reverseString("Java");	// mpuse on actual --> Refactor --> Inline
		//		String expected = "avaJ";
		assertEquals("avaJ", reverse.reverseString("Java"));
		
		
	}

}
