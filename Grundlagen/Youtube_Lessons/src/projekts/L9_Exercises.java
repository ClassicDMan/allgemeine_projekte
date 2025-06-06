package projekts;

import java.util.Scanner;

public class L9_Exercises {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
///////////////////////////////////////
////		1.write a program to print numbers from 1 to 10 ?
//		
//		int number = 1 ;
//		
//		for (int i = 1; i <= 10; i++) {
//			
//			int num = number * i;
//			
//			System.out.println("num = " + num);
//		}
//		
 
		
		
		
		
		
		
		
		
		
//		int a = 1;
//		System.out.println("A1 :");
//		do {
//			System.out.println(a);
//			a++;
//		} while (a <= 10);
//
//		System.out.println("\n");
//		System.out.println("A1 :");
//		for (int i = 1; i <= 10; i++) {
//
//			System.out.println(i);
//
//		}
		  
		 
	
///////////////////////////////////	
		
		
//		2. write a program to calculate the sum of 10 floating point numbers using for loop ?
	
//A 2 : 	
	
//		float sum = 0;
//		
//		for (float i=1;i<=10;++i) {
//			
//			sum+=i;
//		}
//		System.out.println("sum = "+ sum);
		
///////////////////////////////////		
//A 2 :
		
//		Scanner in = new Scanner(System.in);
//
//		float sum = 0, num;
//		for (int i = 1; i <= 10; i++) {
//
//			System.out.println("\nA2: geben Sie die Nummer ein: ");
//			num = in.nextFloat();
//			sum += num; // sum = the old sum + num
//
//		}
//		System.out.println("sum= " + sum);
		 
		
//////////////////////////////////////////////
		
		/*
		3. Write a program that asking the user to input a positive integer.
		It should then print the multiplication table of that number.
		*/

		
//A 3 :
		
//		Scanner in = new Scanner(System.in);
//
//		int zahl;
//
//		System.out.println("positive Wert eingeben: ");
//		zahl = in.nextInt();
//		System.out.println("Multiplikationstabele:");
//
//		for (int i = 1; i <= 10; i++) {
//			System.err.println(zahl + " * " + i + " = " + (zahl * i)); // err makes the Numbers Red colored
//
//		}
		 
		
///////////////////////////////////////////////////////
		
//		4.Write a program to find the factorial value of any number entered through the user.
		

//A 4 :
		
//		  Scanner Wert = new Scanner (System.in);
//		  System.out.println("Wert eingeben: ");
//		  int zahl = Wert.nextInt() ;
//		  int y = 1;
//		  
//		  for (int i = zahl; i >= 1 ; i--) {
//		  y = y * i ;
//		  } 
//		  System.out.println("Faktowert= " + y);
		

//A 4 :
		
		
//		Scanner Wert = new Scanner (System.in);
//		System.out.println("Wert eingeben: ");
//		int zahl = Wert.nextInt() ;
//		int y = 1;
//		
//		for (int i = 1; i <= zahl ; i++) {
//			
//			y = y * i ;
//			
//		}
//		System.out.println("Faktowert= " + y);
		
///////////////////////////////////////////////////
		
//		5.Write a program that enters 10 integer numbers from the user and then prints the sum of the even and odd integers.
		
//		Scanner Wert = new Scanner (System.in);
//		int zahl;
//		int sum_even=0, sum_odd=0;
//		int i = 0;
//		while(i<10) {
//			System.out.println("Wert Eingeben: ");
//			zahl=Wert.nextInt();
//			if (zahl%2==0) 
//				sum_even+=zahl;
//			else
//				sum_odd+=zahl;
//			i++;
//		}
//		System.out.println("summe Even Nummern: " + sum_even);
//		System.out.println("summe Odd Nummern: " + sum_odd);
		
		
//////////////////////////////////////////////////////////////////
		
		
//		6.Write a program that enters 10 integer numbers from the user and then prints the numbers of the even and odd integers.
	
//		Scanner Wert = new Scanner (System.in);
//		int zahl;
//		int count_even=0, count_odd=0;
//		int i = 0;
//		while(i<10) {
//			System.out.println("Wert Eingeben: ");
//			zahl=Wert.nextInt();
//			if (zahl%2==0) 
//				count_even++;
//			else
//				count_odd++;
//			i++;
//		}
//		System.out.println("summe Even Nummern: " + count_even);
//		System.out.println("summe Odd Nummern: " + count_odd);
		
		
//		7.Write a program to calculate the sum of following series where n is input by user.
//		1 + 1/2 + 1/3 + 1/4 + 1/5 + .... 1/n.
		
//		Scanner Wert= new Scanner (System.in);
//		int n = Wert.nextInt();
//		float sum = 0;
//		
//		for (int i =1 ; i <= n; i++) {
//			
//			sum+=1.0/i;
//		}
//		
//		System.out.println("sum Series = " + sum);
		
///////////////////////////////////////////////////////////////
		
//		8. write a program to calculate the average number of 10 degrees .
		
//		Scanner in = new Scanner (System.in);
//		float n;
//		float sum = 0.0f;
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Enter # " + i + " : ");
//			n=in.nextInt();
//			sum+=n;
//			
//		}
//		System.err.println("Avg = " + sum/10);
//		
		int i = 1;
		int k = 1;
		int l = ++i + ++k;
		System.out.println(i);
		System.out.println(k);
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		

//		
//		
		
		
		
			
		
	}
}
