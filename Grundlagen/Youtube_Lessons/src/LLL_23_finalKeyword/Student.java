package LLL_23_finalKeyword;

class Student {				// final class can't be inherited and cant't be changed from another class
	final int STUDENT_ID;		//final variable
	String name;
	int yearOfBirth;
	final static float DEGREE_OF_SUCCESS;
	
	static {
		DEGREE_OF_SUCCESS = 50;
	}

	public Student(final int STUDENT_ID, String name, int yearOfBirth) {
		
//		 if we put final ^ up in the constructor the zero STUDENT_ID will not be able to be zero any more
		
//		STUDENT_ID = 0;
		
		this.STUDENT_ID = STUDENT_ID;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	@Override
	final public String toString() {		// final method
		return "Student [STUDENT_ID=" + STUDENT_ID + ", name=" + name + ", yearOfBirth=" + yearOfBirth + "]";
	}
	
	
	
	
	
	
	
}
