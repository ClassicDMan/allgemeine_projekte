package LLL_18_Passing_Objects_to_Methods;

public class Main1 {
						//Passing_Objects_to_Methods    Part 1: Arguments to methods
	
//	static void fun(int n) {			passing by value example
//		n++;
//		
//	}
	
	static void fun(Test1 n) {
		if(n.number > 0) 
			n.number++;
		else
			n.number--;
	}
	
	
	
	public static void main(String[] args) {
		
		
//		int number = 1;			// passing by value example
//		fun(number);
//		System.out.println("Number = " + number);
		
		
		
		
		
		Test1 obj = new Test1();				//passing by reference ---> passing objects to methods
		// obj is Class from type Test and in it there is int number, which can be used to to use a methods
		
		obj.number = 1;
		fun(obj);
		System.out.println("Number (1)= " + obj.number);
		
		Test1 obj2 = new Test1();
		obj2.number = -1;
		fun(obj2);
		System.out.println("Number (2) = " + obj2.number);
	

	}
}
