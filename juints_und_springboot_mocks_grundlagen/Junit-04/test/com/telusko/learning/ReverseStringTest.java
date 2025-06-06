package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {

	ReverseString reverse = new ReverseString();

	@Test
	void testReverseString_OneWord() {

//		ReverseString reverse = new ReverseString();	// reverse here is instance
//		String str = reverse.reverseString("Java");		// reverse here is a reference

		assertEquals("avaJ", reverse.reverseString("Java"));

	}

	@Test
	void testReverseString_MultipleWords() {
//		ReverseString reverse = new ReverseString();

		assertEquals("aJoJ nauJ", reverse.reverseString("Juan JoJa"));

	}

}
