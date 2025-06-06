package projekts;

public class LL_11_Loop_inside_Loop_nestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//////////////////////////////////////////////////////////////////
		
//1 :		
		for (int i = 1; i <= 2; i++) { // Outer Loop
			System.out.println("Outer Loop #1# " + "i = " + i);
			for (int j = 1; j <= 3; j++) { // Nested Loop (Inner Loop)
				System.out.print("Nested Loop #2# " + "j = " + j + " i =" + i + " / ");
				for (int k = 1; k <= 2; k++) {
					System.out.print("Nested Loops #3# " + "j = " + j + " i = " + i + " k = " + k + " / ");

				}
				System.out.println("///////////////////");
			}
			System.out.println("///////////////////");
		}
		
///////////////////////////////////////////////////////////////////

//Extra Information :		
//		nested loops could take any loop Statement as u can see here:
//		
//		  for (int i = 1; i <= 2; i++) { // Outer Loop
//		  
//		  do { while(1<5); } while (condition);
//		  
//		  }

	}

}
