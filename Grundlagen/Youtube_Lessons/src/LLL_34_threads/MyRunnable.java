package LLL_34_threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from runnable");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.getStackTrace();
			}
		}

	}

}
