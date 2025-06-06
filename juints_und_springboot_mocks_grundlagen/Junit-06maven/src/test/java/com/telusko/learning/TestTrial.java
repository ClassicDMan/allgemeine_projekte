package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {

	Shapes shape = new Shapes();
	
	@Test
	void test() {
		assertEquals(6, 6);
	}
	
	@Test
	void testComputeSquareAreA() {	
		assertEquals(576, shape.computeSquareArea(24)); 
	}
	
	// the String inside the assertEquals() is considered, if the test is wrong or not wrong 
	// the string will be considered, but it will be seen if there is a failure, now go to the second method.
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5), "Area of Circle calculation is wrong");		
	}
	// the string will be only considered if the test is wrong, this is the different between the two method
	// and what can the lambda do here, the String will be evaluated only if there is a failure.
	@Test
	void testComputeCircleArea_Supplier() {
		assertEquals(76.5, shape.computeCircleArea(5), ()->"Area of Circle calculation is wrong");
	}

}
