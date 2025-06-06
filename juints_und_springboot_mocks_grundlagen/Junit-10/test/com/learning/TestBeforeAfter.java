package com.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.telusko.learning.Shapes;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)					// One Object will be created per Class Call
@TestInstance(TestInstance.Lifecycle.PER_METHOD)					// One Object will be created per Method
class TestBeforeAfter {
	static int count = 0;
	
	TestBeforeAfter(){
		count++;
		System.out.println("Test Object is created before test Method: ==> " + count + " Object is created");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll test is called");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll test is called");
	}
	
	Shapes shape;
	
	@BeforeEach										// before every test case will be invoked
	void init() {
		shape = new Shapes(); 
		System.out.println("Before Test");
	}

	@Test
	void testComputeSquareArea() {
//		Shapes shape = new Shapes();
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual Test Running");
		
	}
	
	@Test
	void testComputeCircleArea() {
//		Shapes shape = new Shapes();
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual Test Running");
	}
	
	@AfterEach										// after every test case will be invoked, in Junit 4 it is just After
	void destroy() {
		System.out.println("After test clean up");
		
		
	}

}
