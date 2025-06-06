package LLL_23_finalKeyword;

public class Main {
	
	static void fun() {
		final String a;	// final local variable: per formats, any local variable from type final local variable
						// the execution(run) process will be 2.5 times faster
		a = "aaa";
	}
	
//					Final Keywords ---> 1- stop value changes(final parameters)
//										2- stopd method overriding(final methods)
//										3- stop inheritance(final classes)
	
	public static void main(String[] args) {
		
		
		
		final Student s1 = new Student(01, "Juan", 1993);
												// the first number could be changed in the next line, but if u add final
												// it will not work any more, this called final reference
//		s1 = new Student(553, "Juan", 1993);		
		Student s2 = new Student(02, "Juan", 1993);
		Student s3 = new Student(03, "Juan", 1993);
		Student s4 = new Student(04, "Juan", 1993);
		
		System.out.println("s1 = " + s1.STUDENT_ID);
		System.out.println("s2 = " + s2.STUDENT_ID);
		System.out.println("s3 = " + s3.STUDENT_ID);
		System.out.println("s4 = " + s4.STUDENT_ID);
		
		
		
		
		
		
		
		
		
		
	}

}
