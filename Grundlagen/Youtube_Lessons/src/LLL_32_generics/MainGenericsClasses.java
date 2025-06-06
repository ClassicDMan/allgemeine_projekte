package LLL_32_generics;

import java.util.ArrayList;
import java.util.HashMap;

public class MainGenericsClasses {
	
	/*
	Enable types( Classes and Interfaces ) to be parameters when defining:
	Classes, interfaces and methods.
	A benefit is to eliminate the need to create multiple versions of methods or classes for various data types.
	Use one version for all reference data types
	 */
	// You can create the objects of a generic class to have data of specific derived types ex.Number

	public static void main(String[] args) {
		
		MyGenericClass <Integer, Integer> myInt = new MyGenericClass<>(1, 9);
		MyGenericClass <Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01);
		MyGenericClass <Character, Character> myChar = new MyGenericClass<>('@', '$');
		MyGenericClass <String, Character> myString = new MyGenericClass<>("Hallo", '!');
		
//		ArrayList<String> myFriends = new ArrayList<>();			//ArrayList is a generic Class
//		HashMap<Integer, String> m = new HashMap<>();				//it is like the hashmaps, teurn the second value
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		
		
		
		
		

	}

}
