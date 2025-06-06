 package projekts;

import java.util.Iterator;
import java.util.Random;

public class TestForExam {


//	public static int g(int n) {
//		return n - 1;
//	}
//	public static int h(int n) {
//	    int result = 1;
//	    for(int i = 1; i <= n; i++ ){
//	        result *= i;
//	    }
//	    return result;
//
//	}
//	public static int f1(int m, int n){
//	    if(n == 0){
//	        return m;
//	    }
//	    else{
//	        return f1(h(g(m)), g(n));
//	    }
//	}
//
//
//	public static int f2(int n) {
//		if (n == 0) {
//			return 1;
//		} else
//			return n * f2(n - 1);
//	}
//	
//	public static int q(int x, int y) {
//		if (y == 0){
//		return 1;
//		}else{
//		return x + q(x, y - 1);
//		}
//	}
//	
//	
//	public static int Rekursion(int a, int b, int c, int d, int e) {
//		if (a == 1) {
//			return 1;
//		} else {
//			return a + b + c + d + e + Rekursion(a - 1, b - 1, c, d - 2, 3);
//		}
//	}
	
//	public static int f(int n, int k) {
//		if ((k == 0) || (k == n))
//		return 1;
//		else
//		return f(n - 1, k) + f(n - 1, k - 1);
//		}
		
		public static double avg(int [] array) {
			
			double sum = 0, avg = 0;
			for (int i = 0; i < array.length; i++) {

				sum += array[i];
				
			}
			avg = sum / array.length;
			return avg;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n = 24 ^ 15;
//		int m1 = 9 & 5;
//		int m2 = 9 | 5;
//		int m3 = 9 ^ 5;
//		int m4 = 5;
//		System.out.println(n);
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m3);
//		System.out.println(~m4);

//		int a = 44, b = 12;
//		
//		if(a < b) {
//			int h = a;
//			a = b;
//			b = h;
//		}
//		int r ;
//		while(b != 0) {
//			r = a % b;
//			a = b;
//			b = r;
//			
//		}
//		System.out.println(a);

//		System.out.println(f1(6,1));
		
//		System.out.println(!(5 <4));
//		System.out.println(!true);
//		System.out.println( ( 2 > 1 ) | ( ( 4 == 4 ) && ( 1 > 0 ) ) );
//		System.out.println(( 34 != 33 ) && !false );
		
		
		
//		System.out.println(q(4,3));
		
	
	/*

// Create a class named ArraySmallNumber.Implement a static method to find the smallest value in an array and then return it. To test the ArraySmallNumber class, define another class ArraySmallNumberTest that calls the static method in its main method and prints the result to the console?


 ArraySmallNumberTest.java
 
  public class ArraySmallNumberTest {
    public static void main(String[] args) {

         int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

          System.out.println(ArraySmallNumber.findSmallest(array));

         }
    }
          

public class ArraySmallNumber {

    public static int findSmallest(int[] array) {

        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < smallest) {

                smallest = array[i];
            }
        }

        return smallest;

    }
}

//Define an array variable cars that can refer to an array of 8 auto objects?



		int[] car = new int[N];


		car = new int[10]; // Creates a new array
	
	
	*/
		
//		int x = 19, y = 4, z =4;
//	
//		System.out.println((x % y) * --y / ++z);
		
		
		
//		for(int i = 0; i <= 10; i=i+2) {			// 6 mal
//			System.out.println(i);
//		}
//		
//		for (int i = 10; i <= 10; i=i+2) {			// ein mal
//			System.out.println(i);
//		}
//		
////		for (int i = 1; i != 0 ; i++) {				// ohne Ende
////			System.out.println(i);
////		}
//		
//		for(int i = 0, j = 3; i < j; i++, j--) {	// 2 mal
//			System.out.println(i);
//		}
		
		
//		System.out.println(Rekursion(2,4,5,10,5));
		
		
//	int[] x = { 1, 2, 3, 4, 5, 6, 7, 8 };
//	for (int i = 1; i <= x.length; i++) {
//		System.out.println(x[i]);
//	}
	
	
//		int a = 47;
//		int b = -12;
//		int c = 7;
//	System.out.println((a > b + 59) || 15 % c == (13 + b++));
	
//	int z = 0;
//	for (int i = 1, j = 8; i <= j; i++, j = j - 2) {
//	z += i + j;
//	if (j - i == 1)
//	i = 1;
//	}
//	System.out.println(z);

	
		
//		System.out.println(f(4,2));
		
//		System.out.println(f(1, 3));
//		System.out.println(f(1, 3f));
//		System.out.println(f(0b1001, 3));
		
//		int [] arr = {1,2,3,4,5,6};
//		System.out.println(avg(arr));

		
		
		
//		int x = 0;
//		long y = 1000; 
//		x = y;			// weil man kann nicht eine variable vom Typ Long zu int umwandeln, aber es konnte anderes rum funktionieren
	
	
//		int a = 3;
//		int b = 2;
//		int i = 4;
//		int j = 3;
//		int k = i++ + ++j;
//		System.out.println(a | b);		// 0000 0011 | 0000 0010 = 0000 0011 = 3
//		System.out.println(a & b);		// 0000 0011 & 0000 0010 = 0000 0010 = 2
//		System.out.println(a ^ b);		// 0000 0011 ^ 0000 0010 = 0000 0001 = 1
//		System.out.println(i);			// i war 4 dann i++ ---> i = 5
//		System.out.println(j);			// j war 3 dann ++j ---> j = 3 in Zeile 231 danach 4 in Zeile 236
//		System.out.println(k);			// k = 5 + 3 = 8
	
		
		
//		String [] autos = new String [8];
//		autos [0]= "BMW";
//		autos [1]= "Audi";
//		autos [2]= "Mercedes";
//		autos [3]= "Nissan";
//		autos [4]= "Toyota";
//		autos [5]= "Chevrollet";
//		autos [6]= "Hyundai";
//		autos [7]= "Hunda";
//		for (int l = 0; l < autos.length; l++) {
//			System.out.println(autos[l]);
//		}
		
		
//		int sek = 0;
//		int ges = 0;
//		for (int i = 0; i <= 31; i++) {
//		sek = 60 *	60 * 24;
//		ges += sek;
//		}
//		System.out.println("Anzahl der Sekunden im Monat Januar: " + ges);
		
//		int count = 9;
//		
//		for (int i = 0; i < 10 ; i++) {
//			System.out.println("for-Schleife: " + count);
//			count--;
//		}
//		System.out.println();
//		int countt = 9;
//		int i = 0;
//		while(i < 10) {
//			System.out.println("while Schleife: " + countt);
//			i++;
//			countt--;
//		}
		
		
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 10; j++) {
//				System.out.print( j + "@ ");	
//				if(j == 10) {
//					System.out.println();
//				}
//			}
////			System.out.println();
//		}
		
		
		
//		int i = 0;
//		while(i < 5) {
//			int j = 1;
//			while(j <= 10) {
//				System.out.print(j + "@ ");
//				j++;				
//			}
//			System.out.println("");
//			i++;
//			
//		}
		//Es sollen in einer Schleife solange Zufallszahlen generiert und ausgegeben werden, bis der Wert 3 
//		angenommen wird. Zufallszahlen zwischen 1 und 20 werden mit dem folgenden Ausdruck 
//		erzeugt: (int) (Math.random() * 20) + 1
		
		
//		Random random = new Random();
//		boolean weiter = true;
//		while (weiter) {
//
//			int zahl = (int) (Math.random() * 20) + 1;
//
//			System.out.println(zahl);
//			if (zahl == 3) {
//				System.out.println(zahl);
//				break;
//			}
//	
//		}
		
//		Eine Schleife soll von 1 bis 50 durchlaufen werden. Jedes Mal, wenn die Variable i ein Vielfaches 
//		von 9 ist, wird zu einem Zähler 1 addiert. Falls i kein Vielfaches von 9 ist, wird die continueAnweisung angewendet, um den aktuellen Schleifendurchlauf zu beenden
		
//		int count = 0;
//		int i = 0;
//		while( i <= 50 ) {
//			i++;
//			System.out.println(i);
//			
//			if(i % 9 == 0) 
//				count++;
//				continue;
//			
//		}
//		System.out.println("Vielfalt ): " + count);
		
		
//		 Schreiben Sie ein Programm, das ermittelt, wie hoch ein Sparguthaben von 5.000 Geldeinheiten 
//		 bei 7,5 % Verzinsung nach Ablauf eines Jahres ist
				
//		System.out.println(calculate_savings(5000, 0.075, 1));
		
		
		/*
		 * 
		 *  Weil die astronomische Dauer eines Jahres (die Zeit, die die Erde benötigt, um die Sonne einmal 
			zu umrunden) etwas länger dauert als 365 Tage, wurden Schaltjahre zum Ausgleich eingeführt.
			Ein Schaltjahr ist ein Jahr, welches eine Jahreszahl hat, die durch 4 teilbar ist. Jahreszahlen, die 
			durch 100 teilbar sind, sind allerdings keine Schaltjahre. Es sei denn, die Jahreszahl ist durch 400 
			teilbar. Schreiben Sie ein Programm, das prüft, ob ein bestimmtes Jahr ein Schaltjahr ist.
		 */
		
		
//		int y = 2020;
//		if(isLeapYear(2020)){
//			System.out.println("ein Schaltjahr");
//			
//		}else System.out.println("nicht");
		
		
		
//		 Berechnen Sie die Fakultät einer Zahl 
//		 a. iterativ und
//		 b. rekursiv
		
		
//		int f = 1;
//		for (int i = 1; i <= 5; i++) {
//			f *= i;
//		}
//		System.out.println(f);
		
		
//		 test the the solutions down the hill.
		
		
//		System.out.println(sumrek(5));
		
		
		
//		 Ermitteln Sie rekursiv den größten gemeinsamen Teiler zweier ganzer Zahlen >= 0. Es gilt:
//			 ggt(p,q) = p falls q = 0
//			 ggt(p,q) = ggt(q,p) falls p < q
//			 ggt(p,q) = ggt(q,p%q) sonst
		
		
		
//		System.out.println(ggtrek(30,1000));
		
		
		

		
		
		// Schreiben Sie ein Programm, das prüft ob ein String ein Palindom (= Rückwärts
		// und Vorwärts
//			gelesen identisch) ist oder nicht.

//		String a = "mom";
//		
//		String reverse = "";
//		for (int i = a.length()-1; i >= 0; i--) {
//			reverse += a.charAt(i);
//			System.out.println(reverse);
//		}
		
		
//		String string = "dad";
//		boolean x = true;
//		String reverse = new StringBuffer(string).reverse().toString();
//		if (reverse.equals(string)) {
//			System.out.println("ist palindorm");
//		} else
//			System.out.println("ist nicht palindorm";
		
		
//		String string = "mom";
//		System.out.println(s(string));
//	
//		int a [] = {1,2,3,4,5};
//		
//		System.out.println(avg(a));
		
//		byte a = 73;
//		byte b = -113;
////		
//		System.out.println(a^b);
//		System.out.println(a&b);
//		System.out.println(a|b);
//		System.out.println(~a);
//		System.out.println(~b);
		
//		int array [] = {4,5,6,1,4,27};
//		int kleinste = array[0];
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			if(array[i] < array[0]) {
//				kleinste = array[i];
//			}
//		}
//		System.out.println("die kleinste Zahl ist " + kleinste);
		
		
		
//		int count = 10;
//		int i = 0;
//		while(i < 10) {
//			count--;
//			i++;
////			System.out.println(count);
//			
//			System.out.println(i);
//		}
		
//		for(int i = 0, j = 3; i < j; i++, j--) {
//			System.out.println(i);
//		}
//		
//		
//		byte x = (byte) 257;
//		System.out.println(x);
		
		int a = 17;
		int b = 9;
		int c = 1;
		
		System.out.println(a << c);
		
		
		
		
		
		
		
	
	
	}
	
	public static int fa(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}

	public static int f(int n) {

		if (n == 1) {
			return 1;
		} else
			return n * f(n - 1);

	}

	public static String s(String wort) {
		String reverse = new StringBuffer(wort).reverse().toString();
		if(reverse.equals(wort)) {
			return "ist palindorm" ;
		}else return "ist nict palindorm";

	}

	public static int ggtrek(int p, int q) {
		if (p < q) {
			int h = p;
			p = q;
			q = h;
			return ggtrek(p, q);
		} else if (q == 0) {
			return p;
		} else
			return ggtrek(q, p % q);

	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;

		}
		return sum;
	}

//		
	static int sumrek(int m) {
		if (m == 1)
			return 1;
		else {
			return m + sumrek(m - 1);
		}
	}

	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 4 == 0) {
					return true;
				} else
					return false;
			} else
				return true;
		} else
			return false;

	}

	public static double calculate_savings(double principal, double interest_rate, double time) {
		interest_rate = principal * interest_rate * time;
		return principal + interest_rate;
	}

	public static double f(double a, double b) {
		return a + b;
	}

	public static double f(double a, int b) {
		return a * b;
	}

	public static void print(Node n) {
		Node current = n;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public class Node {
		public int data;
		public Node next;

		public Node(int d) {
			data = d;
			next = null;
		}
	}

}
