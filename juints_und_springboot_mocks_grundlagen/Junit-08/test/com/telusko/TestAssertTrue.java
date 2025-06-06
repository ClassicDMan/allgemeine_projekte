package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertTrue {

	@Test
	void test() {
//		String str = "Junit";
//		assertTrue(str.equals("Junit"));
		
		String str = "Junit5";		// length = 6
//		assertFalse(str.length() < 5);		// length !< 5 ==> false ==> test success
		assertFalse(str.length() > 5);		// length !> 5 ==> true ==> test failure
	}

}
