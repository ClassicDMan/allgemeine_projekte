package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.learning.dao.JavaCourse;
import com.learning.dao.JunitCourse;
import com.learning.dao.SpringBootCourse;
import com.telusko.service.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testprocessWithCourse() {
		
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
//		assertTrue(status);
		assertFalse(status, ()-> "it is failed bcz unit results in true");			// result in JavaCourse is false ==> test success
	}

}
