package projekts;

public class L2_Arithmetic_Operators_2 {
	
	public static void main ( String []args) {
	
	// Arithmetic Operators 
	// ++   --
	
	int x = 1;
	// x++;  Postfix / Post increment 
	// ++x;  Prefix / Pre increment // try both wit hte int Value .
	
	x++;
	System.out.println("x = "+x);
	
	int y = 2;
	
	// System.out.println("y ="+ ++y); // the y got a +1 on its value ( ++y in the printing order gives a one to the value )
	// here ---> y = 2, ---> 2+1 =3
	//System.out.println("y ="+ y++); //the y will print the exact y value in the previous order .
	// here the previous y = 3 ---> it printed the three and then added one to its value 
	
	// System.out.println("New y ="+ y); // that is why here we see the new y = 4
	
	             //y=2--> 2--+1>y=3,+1=4  -->    4--+1>   y=5
	System.out.println("y = " + y++ +" "+ ++y +" "+ y++);
	
	System.out.println("final y = " +y);
	int a = 47;
	int b = -12;
	int c = 7;
	System.out.println((a > b + 59) || 15 % c == (13 + b++));
	System.out.println();
	
	

	
		int d = 5;
    	d+= 10; /* d+= 10 ( ist das gleich wie : d = d +10;*/
    	System.out.println("d = " +d); 
    	

   
    
    int k=5, s=1, z=2;
    z+=k-s; // z = z+k-s
    
    System.out.println("Z =" +z);
    
    
    
    // The Assignment Operators :
    // = += -= *= /= %= &= ^= |= <<= >>= >>>=
	

	}

}
