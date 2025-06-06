package LLL_27_anonymous;

import LLL_27_anonymous.MainTwo.Showable;

public class MainThree {
	
	public interface Showable{
		public void print();
	}
	
	static void display(Showable s) {
		s.print();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display( new Showable() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Showable");
			}
		});
		
//		Showable showable;
//		showable = new Showable() {
//			
//			@Override
//			public void print() {
//				// TODO Auto-generated method stub
//				System.out.println("Showable");
//			}
//		};
//		
//		showable = ()-> System.out.println("Showable");
//
	}

}
