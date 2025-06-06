package projekts;

import java.util.Scanner;

public class LL_12_Methods_Important_2 {
	
	//write a java Methode to find the smallest Number among three Numbers:
	
							//  10      20      30 
	static int smallestNumber (int n1, int n2, int n3) {

		int minNumber = n1;			// if u change the signals u can find the maximal number
		if (minNumber > n2)
			minNumber = n2;
		if (minNumber > n3)
			minNumber = n3;
		return minNumber;

		}
		


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//1
		Scanner in = new Scanner (System.in);
		
		int x,y,z;
		System.out.println("Enter #1:");
		x=in.nextInt();
		System.out.println("Enter #2:");
		y=in.nextInt();
		System.out.println("Enter #3:");
		z=in.nextInt();
		System.out.println("the smallest Number is = " + smallestNumber(x,y,z));
		
		
		
//2
		int s = smallestNumber(300,200,100);
		System.out.println("the smallest Number is : " + s);
		
//3		
		System.out.println("the smallest Number is : " + smallestNumber (10,20,30));
		
	}

}
