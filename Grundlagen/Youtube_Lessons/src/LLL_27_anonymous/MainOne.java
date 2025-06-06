package LLL_27_anonymous;

public class MainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RewardClass emp1 = new RewardClass();
		RewardClass emp2 = new RewardClass();
		
//		/*RewardClass emp3 = */ new RewardClass() {			//it is also possible to do that
//			@Override
//			public void rewardMethod() {					//anonymous inner class
//				System.out.println("your reward is $20");
//			}
//		}.rewardMethod();;									// u have to add method name
		
		
		RewardClass emp3 = new RewardClass() {			//it is also possible to do that
			@Override
			public void rewardMethod() {					//anonymous inner class
				System.out.println("your reward is $20");
			}
		};
		
		
		
//		System.out.println(emp1.getClass());		// normal Class
//		System.out.println(emp3.getClass());		// Anonymous Class, the $ means inner class, after it is anonymous
		
		emp1.rewardMethod(); // 10
		emp2.rewardMethod(); // 10
		
//		emp3.rewardMethod(); // 20

	}

}
