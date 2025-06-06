package LLL_34_threads;

public class SyncBlockThread {

	public static void main(String[] args) {
		SyncBlockCounter counter = new SyncBlockCounter();
		
		SyncBlockRunnable t1 = new SyncBlockRunnable(counter, 1000);
		SyncBlockRunnable t2 = new SyncBlockRunnable(counter, 1000);
		
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		
		System.out.println("Beendet");
		
		
		
		
	}

}
