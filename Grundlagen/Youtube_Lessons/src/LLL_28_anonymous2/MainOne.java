package LLL_28_anonymous2;

import java.util.ArrayList;

public class MainOne {
	
//	static void print1(var x) {				// var as a parameter in a method, is not allowed
//		
//	}
//	static var  print2(var x) {				// var as a return value type is also not allowed
//		
//	}										// var can't be used wit lambda Expressions too
	
	
//	var x = 4;		// var can't be used in global
	
	
	
	static int d = 12;			// it can bee seen if ti is static
	
	
	
	static void m() {							// anonymous inner class inside a method, and we can define another 
												// anonymous inner class inside it
		
		new TestClass(5) {				// Param Constructor
			private int x = 5;
			@Override
			public void testMethod() { 						// Method
				System.out.println(this.getClass());
			}
																// i removed Override, because here, Method2 does not exist
			public void testMethod2() { 						// this Method has been hidden in SuperClass
	
				System.out.println(d);							// with keyword var test55 i could do it
									// i can see tha variable d, which is outside the anonymous scope
				d = 2;
				System.out.println(d);
			}													
		};
	}
	public static void main(String[] args) {
	
		 int p = 12;
		// TODO Auto-generated method stub

//		TestClass test1 = new TestClass() {
//
//			@Override
//			public void testMethod() { 						// Method
//				System.out.println("Test 2");
//			}
//		};
		
//		test1.testMethod(); // Empty Class, and Test
		
//		TestClass test2 = new TestClass() {					// no Param Constructor
//
//			@Override
//			public void testMethod() { 						// Method
//				System.out.println("Test 2");
//			}
//		};
		
//		test2.testMethod();

//		TestClass test3 = new TestClass(5) {				// Param Constructor
//
//			@Override
//			public void testMethod() { 						// Method
//				System.out.println(this.getClass());
//			}
//		};
//		
//		test3.testMethod();
		
		
		
//		TestClass test4 = new TestClass(5) {				// Param Constructor
////			{
////				System.out.println("initializer Block");	// initializer Block, first Param Const will run than this
////			}
//			@Override
//			public void testMethod() { 						// Method
//				System.out.println(this.getClass());
//			}
//		};
//		
//		test4.testMethod();
		
		
//		TestClass test5 = new TestClass(5) {				// Param Constructor
//			private int x = 5;
//			@Override
//			public void testMethod() { 						// Method
//				System.out.println(this.getClass());
//			}
//			@Override
//			public void testMethod2() { 						// Method, so that innerClass see this, it must be
//				System.out.println(x);							// created inside the Super Class (this is what we know
//			}
//		};
//		
//		test5.testMethod2();
		
//		var test55 = new TestClass(5) {				// Param Constructor
//			private int x = 5;
//			@Override
//			public void testMethod() { 						// Method
//				System.out.println(this.getClass());
//				System.out.println(k);							// k it can be seen
//			}
//																// i removed Override, because here, Method2 does not exist
//			public void testMethod2() { 						// this Method has been hidden in SuperClass
//	
//				System.out.println(d);							// with keyword var test55 i could do it
//									// i can see tha variable d, which is outside the anonymous scope
//				d = 2;
//				System.out.println(d);
//			}													
//		};
//		
//		test55.testMethod();
//		test55.testMethod2();
		
//		var y = 1;
//		var p = "String";
//		var x = 'C';
//		var f = new TestClass();		// var can receive any Data Type
		
//		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<var> list = new ArrayList<>();		// i can't use var as a generic Type
//		var<Float> list = new ArrayList<>();			// i can't use var with a generic Type, it is allowed ???
//		var list = new ArrayList<>();					// it is allowed
//		var k;											// it must be declared, so here it is not allowed
//		var k1 = null;									// it must be declared, so here it is not allowed
//		var k2 = 0;
//		var k3 = 10;
		
		
		var test6 = new TestClass(5) { // Param Constructor
			
			static {
						// is allowed
			}
			final static int p = 5;
			private int x = 5;

			@Override
			public void testMethod() { // Method
				System.out.println(this.getClass());
				System.out.println(k); // it can be seen
			}

			// i removed Override, because here, Method2 does not exist
			public static void testMethod2() { // this Method has been hidden in SuperClass

				System.out.println(p); // with keyword var test55 i could do it
				// i can see tha variable d, which is outside the anonymous scope
				
				System.out.println(d);
			}
		};

	}

}
