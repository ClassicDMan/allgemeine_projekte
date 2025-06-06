package LLL_22_finalKeyword;

import java.util.Scanner;

public class Student {
	String name;
	int yearOfBirth;

	final int STUDENT_ID; // or we can do it like that, go down and give it a value

	// final varaible doesn't change

//	final int STUDENT_ID = 10;			// we can initialize it here
	final static float DEGREE_OF_SUCCESS; // if we add static this variable will be common
											// with all the classes from type Student
	// if it is static then we have to give it a vlaue in a block or we can give it
	// up there in line 13
	// static final blank variable can be initialized in a static block or in line
	// 13 .
	static {
		DEGREE_OF_SUCCESS = 50;
	}

	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}

//	public void setSTUDENT_ID(int STUDENT_ID) {
//		this.STUDENT_ID = STUDENT_ID;
//	}

	{
		STUDENT_ID = 200;
		System.out.println("Student Block"); // Block has a priority in the Main
	}

//	Scanner in = new Scanner(System.in); {			// you can do it like that, initialize through a person
//	STUDENT_ID = in.nextInt();
//	}

//	Student(){
//		STUDENT_ID = 20;
//	}

	public Student(int STUDENT_ID, String name, int yearOfBirth) {
		System.out.println("Student Const.");

//		this.STUDENT_ID = STUDENT_ID;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

}
