package LLL_29_Exceptions;
import java.lang.Exception;

public class MainTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			int[] arr = new int[5];
//			arr[7] = 5;
//			
//		} catch (ArrayIndexOutOfBoundsException e) {	// Object ArrayIndexOutPfBoundsException
//			// TODO: handle exception
//			System.out.println(e);
//			return;										// this is why it ignored the syso(rest of the code), but with finally
//														// there, it will be executed
//		}finally {
//			System.out.println("Finally");				//finally block is always get executed whether
//														// the exception has occurred or not
//			 											// it is helpful when there is rescources, it will close it at end
//		}
//		System.out.println("Rest of the code");
		
		

		System.out.println(getNumber());				//finally block is always get executed whether
		// the exception has occurred or not
		
		try {
			int []arr = new int[5];
			arr[7] = 5;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
//			return;
			System.exit(0);						// this is the reason finally will not be ran
			
		}finally {
			System.out.println("Finally");
		}
		
	}
	
	static int getNumber() {
		try {
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			return 2;
		}finally{
			return 3;			// there is finally, then it must be executed
		}
	}
	
	
	
	

}
