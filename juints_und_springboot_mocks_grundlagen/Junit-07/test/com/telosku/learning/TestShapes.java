package com.telosku.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShapes {
	
	Shapes shape = new Shapes();
	@Test
	void testComputeSquareArea() {
//		assertNotEquals(576, shape.computeSquareArea(24));		// if 24 * 24 = 576 ==> fail
		assertNotEquals(3434, shape.computeSquareArea(24));		// if 24 * 24 = 3434 ==> success
	}
	
	@Test
	void testComputeSquareArea_WithMessage() {
		 // if 24 * 24 = 576 ==> fail
//		assertNotEquals(576, shape.computeSquareArea(24), "Message to dev if test case fail");
		// if 24 * 24 = 3434 ==> success
		assertNotEquals(3434, shape.computeSquareArea(24), "Message to dev if test case fail");		
	}
	
	@Test
	void testComputeSquareArea_Supplier() {
		 // if 24 * 24 = 576 ==> fail
//		assertNotEquals(576, shape.computeSquareArea(24),()->"Message to dev if test case fail");
		// if 24 * 24 = 3434 ==> success
		assertNotEquals(3434, shape.computeSquareArea(24),()->"Message to dev if test case fail");		
	}
	
	@Test
	void test() {
		String str = "Junit";
//		assertTrue(true);
		assertTrue(str.equals("Junit"));		// success
//		assertTrue(str.equals("JUNIT"));		// fail
		
	}

}
