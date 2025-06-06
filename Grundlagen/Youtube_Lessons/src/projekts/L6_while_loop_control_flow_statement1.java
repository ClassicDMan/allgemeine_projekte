package projekts;

public class L6_while_loop_control_flow_statement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//1		
		/*
		 * 
		 * int count = 1;
		 * 
		 * 
		 * while (count<=5)
		 *  {
		 *   System.out.println("Hi");
		 *    count++;
		 *	}
		 */
		

		
//2
		
//		int count = 1;
//		
//		
//		while (count<=5) {
//			System.out.println("Hi");
//			count++;
//		}
//		System.out.println(count); // the count here is 6 not 5 smart ass.
		
		
//3		
		
//		int count = 5;
//
//		while (count >= 1) {
//			System.out.println("Hi");
//			count--;
//		}
//		System.out.println(+count);
		

//4
		
		int count = 1;

		while (++count > 0 ) {			// instead of writing count ++ or -- or what ever u write there, u can write in the while too. see this example and change and play a little bit.
			System.out.println("Hi #"+count);
		}
			System.out.println("count: "+count);
		
		
		
	}

}
