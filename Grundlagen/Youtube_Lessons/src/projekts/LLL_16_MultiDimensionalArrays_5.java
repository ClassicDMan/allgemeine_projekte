package projekts;

public class LLL_16_MultiDimensionalArrays_5 {

	
	static void print(int a[][]) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
//	static int [][]get2dArray(){
//		
//		int ar[][]=new int [2][3];
//		return ar;
//	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Multi Dimensional Array ( Two Dimensional Array)
		
//		int [][]arr1=new int [3][4];		// 3 rows and 4 columns 
//		
//		arr1[0] = new int [5];
//		arr1[1] = new int [2];
//		arr1[2] = new int [1];
//		
//		arr1[0][0] = 15;
//		arr1[0][1] = 19;
//		arr1[0][2] = 14;
//		arr1[0][3] = 18;
//		
//		arr1[1][0] = 21;
//		arr1[1][1] = 22;
//		arr1[1][2] = 27;
//		arr1[1][3] = 26;
//		
//		arr1[2][0] = 34;
//		arr1[2][1] = 36;
//		arr1[2][2] = 37;
//		arr1[2][3] = 38;

		//////////////////////////////////////////////////////////////////////////////////////
		
//		int [][]arr2={
//				{1,5,8},		// row 1 has 3 elements
//				{5,6},			// row 2 has two elements
//				{4}				// row 3 has one elements
//				};
//		System.out.println(arr2.length);		// how many rows is there
//		System.out.println(arr2[0].length);		// try 1 and 2 instead of 0			how many columns is there in the rows 
		
//		for (int i = 0; i < arr2[0].length; i++) {
//			
//			System.out.print(arr2[0][i] + " ");
//			
//		}
		
//		for (int row = 0; row < arr2.length; row++) {	// we need here nested Loop
//			for (int col = 0; col < arr2[row].length; col++) {
//				
//				System.out.print(arr2[row][col]+" ");
//				
//			}
//			System.out.println();
//		}
		
		
		
//		for (int[]r:arr2) {	// we must give an int so we call it r and we tell it that it has the values of arr2, and we must tell it that it is an array []
//			for (int c:r) {// int c has the vakues of arr2, so in each circle it will print a values from the arr2
//				
//				System.out.print(c+" ");
//				
//			}
//			System.out.println(); // after every row it comes here and gives a println
//		}
		
		///////////////////////////////////////////////////////////////
		
//		change the matrix from 2*3 to 3*2
		
		
//		int [][]arr3 = {
//				{1,3,5},
//				{2,4,6},
//		};
//		/* 
//		 1 2 	
//		 3 4
//		 5 6
//		 
//		  
//		 */
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print(arr3[j][i]);
//			}
//			System.out.println();
//		}
		
		
		
		int [][]arr4 = {
				{1,3,5},
				{2,4,6},
		};
		
		print(arr4);
		
		
	

	}

}
