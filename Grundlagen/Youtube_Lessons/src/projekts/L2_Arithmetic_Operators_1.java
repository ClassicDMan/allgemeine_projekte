package projekts;

public class L2_Arithmetic_Operators_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Basic Operators ( Arithmetic Operators : + - * / %
		
		int x = 10;
		int y = (5+6)*2;
		int z = 2 % ( 5+5 )*3;
		int m = 90 % 12; // % bedeutet Modulo : 90 Modulo 12 = 6 , weil 7*12 = 84 Rest ist 6 bis zu 90
		
		
		/* byte short = short
		 * int int = int
		 * int float = float
		 * float double = double
		 * int float short double = double 
		 * >>>> das bedeutet: das Ergebnis einer Operation zwischen den Data Typen ist die größte Data Type
		*/
		
		System.out.println("x = "+x);
		
		System.out.println(5+6*2);
		
		System.out.println("y = " +y);
		
		System.out.println("z = "+z);
		
		System.out.println("m = "+m);
		
		System.out.println(15/2); // 15 durch 2 = 7.5 ,aber hier sind die Werte nich defeniert, das ergibt sich also 7
		
		System.out.println(15.0/2); // hier haben wir die 15 defeniert als float oder double data --- > float/ int = float
		
		System.out.println(15.0f/2); // hier ist die 15 float data type, which it takes Numbers with Kommas
		
		int w = 9,u = 2; // it means that int w = 9 and int u = 2
		
		System.out.println("q = " +w/u); // int / int = int das bedeutet 9 / 2 ist 4 und nicht 4.5, damit wir einen Wert mit komma haben möchten
		
		int r = 9;
		float t = 2;
		
		System.out.println("f = " +r/t); // int / float = float and float nimmt komma Nummern ---> 9/2= 4.5
		
		int o = 9,p = 2;
		
		//++o;
		
		System.out.println("v = "+(float)o/p); // widening primitive Conversions, where we have to 
		//int variable but we changed it to float in the resault
		
		float n = 9.14f,b = 2.234f;
				
		System.out.println("k = "+(int)n/(int)b); // Narrowing primitive Conversions, from float to int
		
		
		String ersteWort = "Hallo", zweiteWort = "World";
		
		System.out.println(ersteWort+"\n"+ zweiteWort);
		System.out.println("Hallo\b");
		System.out.println("Ahmad\b\b\n");
		

	}

}
