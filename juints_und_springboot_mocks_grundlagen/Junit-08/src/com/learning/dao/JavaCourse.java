package com.learning.dao;

public class JavaCourse implements Course {
	
	@Override
	public boolean coursePurchased() {
		System.out.println("Java course purchased");
		System.out.println("it is not actually connecting to db hence result in false");
		return false;
	}

}
