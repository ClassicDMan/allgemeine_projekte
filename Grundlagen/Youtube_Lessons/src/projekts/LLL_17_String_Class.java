package projekts;

import java.lang.reflect.MalformedParametersException;

public class LLL_17_String_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Strings Class
		
//		String str = "Hello";
//		str=str.concat(", i am Juan");
//		String str1=str+", i am Juan";
//		
//		System.out.println(str);
//		System.out.println(str1);
		
		////////////////////////////////////////////////////////////
//		String str1 = "Hello";
//		String str2 = "Hello";
//		String str3 = "AAAAA";
//		
//		str1 = "12345";
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		
		//////////////////////////////////////////////////////////////////////////
//		String s1 = "ABCD";		//ASCI Code compare, it will compare the two different numbers and will calculate them, play with the alphabets to know more
//		String s2 = "ABCe";
//		
//		System.out.println(s1.compareTo(s2));
//		/*
//		 * 
//		s1>s2 = +num
//		s1<s2 = -num
//		s1=s2 = 0
//		
//		*/
		/////////////////////////////////////////////////////////////////////////////
//		String str1="           hello         ";
//		
//		System.out.println(str1+"hwo r u");
//		System.out.println(str1.trim()+" how r u");			// trim organize the string
//		
		//////////////////////////////////////////////////////////////
//		String str1 = "HEllo i Am JuAn";
//		
//		System.out.println(str1.toLowerCase());
//		System.out.println(str1.toUpperCase());

		/////////////////////////////////////////////////////////////////////////////////////
		
//		int n = 10;
////		String str1 =String.valueOf(n);			//// it changes the n int to n string
//		String str1 = n +"";  // it does the same
//		
//		System.out.println(str1);			
		////////////////////////////////////////////////////////////////////////////////////////
		
		
//		String s1 ="HELLO";
//		String s2 ="HELLO";
//		System.out.println(s1 == s2);			// true but with new String it will give false, check it out
		
//		String s1 = new String ("HELLO");
//		String s2 = new String ("HELLO");
//		System.out.println(s1.equalsIgnoreCase(s2));		//true
//		System.out.println(s1.equalsIgnoreCase("HELLO"));	// true
//		System.out.println(s1 == "HELLO"); // false
//		s1=s2;
//		System.out.println(s1 == s2);		// true
		
		
		////////////////////////////////////////////////////////////////////////////////////
		
//		String s1 = "HELLO";
//		String s2 = "hello";
//		
//		System.out.println(s1.equalsIgnoreCase(s2));		//true
		
		////////////////////////////////////////////////////////////
		
//		String s1 = "Hey welcome to c++ course";
//		String replaceString = s1.replace("c++", "Java");		// it can also replace the char
//		
//		System.out.println(replaceString);
		////////////////////////////////////////////////////////////////////////////////////////////
		
//		String name = "hello how are you doing";
//		
//		System.out.println(name.contains("how are you"));
//		System.out.println(name.contains("how you"));
//		System.out.println(name.contains("hello"));
//		System.out.println(name.contains("fine"));
//		System.out.println(name.contains("k"));
//		System.out.println("h");		// the characters must be between double cotation
		
		////////////////////////////////////////////////////////////////////////////
		
//		String s1 = "hello how are you doing";
//		System.out.println(s1.endsWith("u"));
//		System.out.println(s1.endsWith("doing"));
		
		////////////////////////////////////////////////////////////////////////////
		
//		String s1 = "hello";
//		System.out.println(s1.substring(0));
//		System.out.println(s1.substring(1));		// it will print after it begins from l which is the third index
//		System.out.println(s1.substring(2,4));		// it brgins from the second index and ends at the fifth

		////////////////////////////////////////////////////////////////////////////
		
//		String str = "AA-BB-CC-DD-EE-FF";
//		
//		for (String val: str.split("-")) {
//			System.out.println(val);
//			
//		}
		
		/////////////////////////////////////////////////////////////////////////////
		
		String str [] = {"AA","BB"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		

	}

}
