package projekts;


//		Passing Arrays to Methods





public class LL_16_OneDiminsional_Arrays_4 {

	static void print(int x []) { 			// i built the methode in which an array in the main will take
		int min = x[0];
	for (int i = 0; i < x.length; i++) {
		
		System.out.println(x[i]);
	}
	}
	
	static int [] getArray() {
		
		int ar []= {4,5,6};
		return ar; //new int [] {1,2,3};
	}
	
	
	static void setArray (int x []) {
		x[0]=50;
	}
	
	static void setVar(int x) {
		
		x=10;
	}
	
	
	
	
	public static void main(String[] args) {
		int arr [] = {1,2,3,4};
		int arr2 [] = {1,122,33,44};
		
		print(arr);		 // it takes the methode from the print methode
		
//		int x [] = new int [] {1,2,3};
		print(new int [] {1,2,3}); 		// it doesnt has a name if u see, new int [] has a value of three numbers but without a name
		
		print(arr2);
		
		int arr3 [] = getArray();		// here we gotta build an int with the name arr3 and it takes the values from the get Array methode
		System.out.println(arr3[0]);
	
		int arr4 [] = {1,2,3,4};
		int arr5 [] = {40,50,60};
		arr4 = arr5;
		arr5 [0] = 100;
		arr4[0] = 500;
		System.out.println(arr4[0]);
		System.out.println(arr5[0]);
		
		int arr6 [] = {1,2,3};
		setArray(arr6);
		System.out.println(arr6[0]);
		
		int y = 5;
		setVar(y);
		System.out.println(y);
	
		int arr7[]= {1,2,3};
		int arr8[]= {40,50,60};
		int arr9[]= {70,80,90};
		
		arr7=arr8=arr9;
		
		arr7[0]=0;
		
		
		System.out.println(arr7[0]);
		System.out.println(arr8[0]);
		System.out.println(arr9[0]);
	
		
		
		
		
	}
	
}
