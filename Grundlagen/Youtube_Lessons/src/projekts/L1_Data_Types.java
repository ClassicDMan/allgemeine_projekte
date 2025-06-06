package projekts;

public class L1_Data_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Primitive Data Types: there are 8 data types :*/
		
		/*1*/ byte e = 4; /* 8 bit and it takes numbers from -128 to 127 */
		
		/*2*/ short w = 3464; /* 16 bit and it takes numbers from -32768 to 32767 */ 
		
		/*3*/ int x  = 17443; /* 32 bits */
		
		
		System.out.println(Integer.MAX_VALUE);	 //it gives the maximum number for the int data type
		
		System.out.println(Integer.MIN_VALUE);	 // it gives the minimum
		
		System.out.println("x = "+x);
		
		System.out.println("w = "+w);
		
		System.out.println("e = "+e);	// to print a string with a variable u must add the plus between them
		
		/*int y = 10.3;		 wir können keinen komma nummer für int und short und byte nehmen */
		
		/*4*/ int z = 'A'; 	/* we can take for x,y,z ...etc variable int data type a true number or an alphabet or signals,
		 * 
		 *  the value of the alphabet and signal u can find it in ASCII Tabelle Page number 65 Kap.3 OOP 1*/
		
		System.out.println("A = " + z);
		
		System.out.println("z = " +'v');
		
		/*5*/ float sssddd = 15.12345678958f; /* 32 bits, nimmt Nummern mit kommas und echte Nummern, und wir müssen 
		 * die Nummer defenieren mit die Buchstabe f, wir können nur 7 Nummern nach dem Komma addieren */
		
		System.out.println("sssddd = "+sssddd);
		
		System.out.println(Float.MAX_VALUE);		// 3.4028235E38 das bedeutet 3.4 * 10 hoch 38
		
		System.out.println(Float.MIN_VALUE);		// 1.4E-45 das bedeutet 1.4 * 10 hoch -45
		
		/*6*/ double a = 4.12345678912345678; /* 64 bit double data type nimmt Nummern mit Kommas und echte Nummern, nimmt 16
		 Nummern nach dem Komma*/
		
		System.out.println("a ="+a);
		/*7*/ long t = 1234567891234567891L; /* Long data Type nimmt hohe echte Nummern, am Ende 
		 * müssen wir L addieren zu defenieren dass es Long ist*/
		System.out.println("l = "+t);
		
		
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		
		/*8*/ char c = 'p'; // 16 bits, es nimmt variable innerhalb einer variable, also c = p oder s = * oder r = O
				
		System.out.println(c);
		
		/*9*/ boolean h = false; // boolean nimmt einer Variable die einer bestimmter boolische Wert hat ( true oder false )
			  boolean j = true;
		
		System.out.println(h);
		System.out.println(j);
		
		// object Data Type :
		
		String str = " i like coding, and i want to learn more"; // String nimmt ein variable die viele Wörter enthält 
		
		System.out.println(str);
		
		byte binaryToDecimal = 0b01111111; // byte take 8 bits and that is why we could take 8 * ones, it takes from -128 to 127
		
		System.out.println(binaryToDecimal);
		
		int binaryToDecimal1 = 0b11111111111000000000011111111111; // int takes 32 bits
		
		System.out.println(binaryToDecimal1);
	
	}

}



