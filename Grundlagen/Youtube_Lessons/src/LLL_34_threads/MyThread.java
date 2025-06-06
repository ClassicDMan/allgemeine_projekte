package LLL_34_threads;

public class MyThread extends Thread {
	
	@Override
	public void run() {
//		try {
//		System.out.println("3");
//		Thread.sleep(1000);
//		System.out.println("2");
//		Thread.sleep(1000);
//		System.out.println("1");
//		Thread.sleep(1000);
//		System.out.println("Fertig");
//		}catch(InterruptedException e) {
//			e.getStackTrace();
//		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from MyThread");
			try {
			Thread.sleep(400);
			}catch(InterruptedException e) {
				e.getStackTrace();
			}
		}
	}

}
