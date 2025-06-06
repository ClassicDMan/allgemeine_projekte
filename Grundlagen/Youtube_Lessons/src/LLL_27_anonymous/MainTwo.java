package LLL_27_anonymous;

public class MainTwo {
	
	public interface Showable{
		public void print(int x);
	}
	
//	class x implements Showable{
//		@Override
//		public void print() {
//			System.out.println("Showable");
//		}
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		/*Showable showable = */new Showable() {
//			
//			@Override
//			public void print() {
//				// TODO Auto-generated method stub
//				System.out.println("Showable");
//			}
//		}.print();;
//		
////		showable.print();
		
		Showable showable;
//		showable = new Showable() {
//			
//			@Override
//			public void print(int x) {
//				// TODO Auto-generated method stub
//				System.out.println("Showable " + x);
//			}
//		};
		
		showable = y -> System.out.println("Showable " + y);	// we don't have interface type	// lambda expression // we don't have to write the method
			/*{
		System.out.println("Showable");												//just the body
		};*/		// we could delete that as well														// we use it when we have just single method only
		showable.print(4);
//
	}

}
