package projekts;

import static java.lang.Math.abs;// abs method
import static java.lang.Math.ceil;// ceil method 
import static java.lang.Math.*;// it summons all the methodes in math.lang

public class LL_13_Built_in_Methodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Bulit-in Functions - Methods :
//			
//			Java Number Methods 		https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
//			Java String Methods			https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
//			Java Character Method		https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
//			Java Array Method

	
		System.out.println("\n"+"abs= "+abs(-1.1));// it gives the absolute number of the argument
		
		System.out.println("\n"+"ceil= "+ceil(-1.9)); //it gives the greater absolute number near to the argument
		
		System.out.println("\n"+"floor= "+floor(1.9));// it gives the smallest absolute value near to the argument
		
		System.out.println("\n"+"round= "+round(1.4999));
		System.out.println("round= "+round(1.5));
		System.out.println("round= "+round(1.6)); // round gives the absolut number near to the argument under those three conditions
		
		System.out.println("\n"+"sqrt= "+sqrt(9));// it gives the square root (sqrt): from 9 is 3, 16 is 4, 25 is 5
		System.out.println("sqrt= "+sqrt(25));
		
		System.out.println("\n"+"pow= "+pow(2,1));// it takes two values, one for potenz and one for exponent, it takes two vait means 2 power 1, 2 power 3 ..etc
		System.out.println("floor= "+pow(2,3));
		
		System.out.println("\n"+"random= "+random()); // random value between 0.0 and 1.0 but never reachs the absolut 1
		
		//(random()*((max-min)+1))+1;
		
		double x = (random()*((10-1)+1))+1;// it gives a rndom double value between 1 and 10, look to the formal up there
		System.out.println("\n"+"x = "+x);
		double y = (int)(random()*((10-1)+1))+1; // we did a casting from double to int in which we added (int) to the value
		System.out.println("y = "+y);
		int z = (int)(random()*((10-1)+1))+1;// we took changed the data type to int
		System.out.println("y = "+z); 
		
		System.out.println("\n"+"max= "+max(5,1));
		System.out.println("max="+max(5,1.5));
		System.out.println("max four numbers"+max(max(5.5,max(20,4)),15)); //it gives which number is greter than the other, as we can see here, we could take a lot of values to compare them with each other
		System.out.println("\n"+"min= "+min(5,1)); // minimum
		
		System.out.println("\n"+"pow(sqrt())= "+pow(sqrt(100),2)); // we can use two functions in each other, square 100 power two equals 100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}