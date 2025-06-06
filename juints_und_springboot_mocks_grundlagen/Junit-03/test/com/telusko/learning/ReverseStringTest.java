package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	@Test
	void test() {
		ReverseString reverse = new ReverseString();
		
		assertEquals("avaJ", reverse.reverseString("Java"));
		assertEquals("neilA", reverse.reverseString("Alien"));
		
	}

}
