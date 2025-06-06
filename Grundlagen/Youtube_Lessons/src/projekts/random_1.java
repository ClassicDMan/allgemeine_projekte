package projekts;

import java.util.Random;

public class random_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  Random note = new Random();
		  
		  int x = note.nextInt(6)+1;
		  
		  int y = note.nextInt(3)+1;
		  
//		  String r = (y==1) ? "Note: " + "+" + x : (y==2) ? "Note: " + "-" + x : (y==3) ? "Note: " + x ;
//		  
//		  System.out.println(r);
			
			  if (y==1) {
			  
			  System.out.println("Note: " + "+"+x); 
			  } else if (y==2) {
			  
			  System.out.println("Note: " + "-"+x); 
			  }else if (y==3) {
			  
			  System.out.println("Note: " + x); 
			  } 
		 

	}

}
