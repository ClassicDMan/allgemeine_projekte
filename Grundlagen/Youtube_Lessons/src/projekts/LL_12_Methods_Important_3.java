package projekts;

import java.text.DecimalFormat;
import java.util.Scanner;

//Aufgabe:
//Write a Java method to compute the average of three numbers.




public class LL_12_Methods_Important_3 {

	
	public static int sum (int ... x) {			// this became Array
		int s = 0;
		
		for (int i:x) {
			
			s+=i;
			
		} return s;
		
	}
	
	
	static float Avg (float n1, float n2, float n3) {
		
		float average = (n1 + n2 + n3) / 3;
		
		
		return average;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("sum = " + sum(1,2,2,5,8,10,9));
		
Scanner in = new Scanner (System.in);
		
		float x,y,z;
		System.out.println("Enter #1:");
		x=in.nextFloat();
		System.out.println("Enter #2:");
		y=in.nextFloat();
		System.out.println("Enter #3:");
		z=in.nextFloat();
		
		DecimalFormat f = new DecimalFormat("#0.00");
		
		System.out.println("the Average Number is = " + f.format ( Avg(x,y,z) ) );
		
		System.out.println("the Average Number is = " +f.format( Avg(90,8,2)));
		
		
		
		
		
		
		
		

	}

}
