package LLL_28_anonymous2;

public class TestClass {
	
	int k = 40;

	TestClass() { // no Param Const

		System.out.println("Empty Test Class");

	}

	TestClass(int i) { // Param Const
		System.out.println("Param Test Class");
	}

	{
		System.out.println("initializer Block"); // initializer Block, it will run first then the Const and Methods will run
	}											// see Ex: MainOne.test4

	public void testMethod() { // Method
		System.out.println("Test");
	}
	
//	public void testMethod2() { 						// Method
//		System.out.println("");
//	}

}
