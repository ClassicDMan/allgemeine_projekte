package projekts;

import java.util.Scanner;

//	Array is a container object that holds a fixed number of values of a single Type.



public class LL_16_OneDiminsional_Arrays_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int [] n = new int [6];
		
//		int n [] = new int [6];			this is also correct
		
//		int n [];			and like this is also correct
//		n= new int [6];
		
		
//		n[0] = 15;
//		n[1] = 33;
//		n[2] = 52;
//		n[3] = 85;
//		n[4] = 55;
//		n[5] = 85;
		
		
		int [] n = {1,8,9,5};
		
		n[0] = 44;
		
		double [] arr1 = new double [6] ;
		
		boolean [] arr3 = new boolean [6] ;
		arr3 [1] = true;
		int [] arr4 = new int [6] ;
		float [] arr5 = new float [6] ;
		
		
		System.out.println(n.length);
		
		System.out.println("\n" + arr1 [0]);
		System.out.println(arr3 [2]);
		System.out.println(arr4 [0]);
		System.out.println(arr5 [0]);
		
		char [] arr2 = new char [6] ;
		arr2[1] = 'a';
		System.out.println(arr2 [2]);
		
		String [] arr6 = new String [6] ;
		arr6 [0] = "i want it more";
		arr6 [1] = " and i want it today";
		arr6 [2] = " and i want it today";
		arr6 [3] = " and i want it today";
		arr6 [4] = " and i want it today";
		arr6 [5] = " and i want it today";
		System.out.println();
		String [] arr7 = {"Juan", "Omar", "Kaji"};
		
		String [] arr8 = new String [] {"Juan" + "\n", "Omar" + "\t", "Kaji"};
		System.out.println(arr8 [0] + arr8 [1] + arr8[2] );
		
		System.out.println(arr6[0] + arr6[1]);
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		
		for (int i = 0; i < arr7.length; i++) {  // i <= arr7.length -1 ---->  length-1 because u put = in it
			
			System.out.println("name = "+arr7[i]);
			
		
		}
		
		for (String i: arr7) {
			
			System.out.println("\n" + i);
		}
		
		
		Scanner in = new Scanner (System.in);
		int size = in.nextInt();
		int [] arr9 = new int [size] ;
		System.out.println(size);
		arr9 [0] = 10;
		
		System.out.println(arr9[0]);
	}

}
