package LLL_34_threads;

import java.util.List;

public class ThreadMaker {
	
	public static void lassImHintergrundLaufen(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.start();
		try {
		thread.join();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
	}

	

}
