package projekts;


import java.util.Arrays;
import java.util.Scanner;

public class LL_16_OneDiminsional_Arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Char array
		
		
		char arr [] = {97,33};		//	it takes the values from the ASCII code Table.
		char arr1 [] = {'H','e','l','l','o'};
			char ch = 66;
			System.out.println("from ASCII Code 97, 33 : " + arr);
			System.out.println("arr1 : " + arr1);
			System.out.println("char 66 is : " + (char)66);
		
			
			char arr2 [] = new char[2];
			System.out.println("write something : ");
		Scanner in = new Scanner (System.in);
//		String str1 = in.nextLine();
//		arr2 = str.toCharArray();
		arr2 = in.nextLine().toCharArray();
		System.out.print("the typing Character is : ");
		System.out.println(arr2);
		
		
		
		char arr3 [] = {'d','C','b','E','A'};
		
//		String str = new String (arr3,0,2);
		String str = new String (arr3,2,3);  // i want three elements after the second array variable so it means after the b ---> so it will give me b E A
		Arrays.sort(arr3);
		
		System.out.println(arr3); // sorted array
		
		System.out.println(str); // 3 Elements after the second variable .
		
		
		

	}

}
