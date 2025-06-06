package projekts;

import java.util.Arrays;
import java.util.Scanner;

public class LL_16_OneDiminsional_Arrays_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Exercises
		
		
//1		write a java program to sum values of any array.
		
		int numbers1 [] = {5,7,3,8,3};
		int sum1 =0;
		for (int i = 0; i < numbers1.length; i++) {
			
		sum1 += numbers1[i];
		
		}
		
		System.out.println("sum = " + sum1);
		
		
//2		write a java program to calculate the average value of array elemnts.
		
		
		int numbers2 [] = {2,5,2,6,7,8,3,3};
		int sum2 = 0;
		int avg = 0;
		for (int i = 0; i < numbers2.length; i++) {
			
			sum2 += numbers2[i];
			avg = sum2/numbers2.length;
		}
		System.out.println("avg = " + avg);
		
		
//3		write a java program to test if an array contains a specific value.
		
		
		int numbers3 [] = {5,2,6,8};
		
		Scanner in = new Scanner (System.in);
		System.out.println("geben Sie einen Zahl : ");
		int n =in.nextInt();
		
//		int num =72;
		boolean f = false;
		
		for (int i = 0; i < numbers3.length; i++) {
			if ( numbers3[i] == n ) {
				f = true;
				break;
			}
		}
		if ( f ) {
			System.out.println("Number has been Found in array, n = " + n);
		}else {

			System.out.println("Number has been Not Found in array, n =  " + n);
		}
		
		
//4		write a java program to find the maximum and minimum value of an array.
		
		int numbers4 [] = {2,0,6,-8,5,3,75,-9,22};
		int min = numbers4[0];
		int max = numbers4[0];
		for (int i = 0; i < numbers4.length; i++) {
			
			if (numbers4[i] < min) {
				min = numbers4[i];
			}else if (numbers4[i]>max) {
				max = numbers4[i];
			}
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
		
		
		
		
//5		write a java program to sort a numeric array.
		
		int numbers [] = {4,-6,8,3,6,22,0,7,8};
		Arrays.sort(numbers);
		for (int j = 0; j < numbers.length; j++) {
			if (j == 0) {
				System.out.print("sort of numeric array : " + numbers[j] + " ");
			}
			else {
			System.out.print(numbers[j] + " ");
			}
		}
		
		
		
	}

}
