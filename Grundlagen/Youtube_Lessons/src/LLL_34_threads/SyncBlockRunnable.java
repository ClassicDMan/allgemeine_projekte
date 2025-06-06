package LLL_34_threads;

public class SyncBlockRunnable implements Runnable {
//	synchronized = synchronizierter Bereich
	// 1. synchronizierter Methode
	// 2.  synchronizierter Block
	private SyncBlockCounter counter;
	private int time;

	public SyncBlockRunnable(SyncBlockCounter counter, int time) {
		this.counter = counter;
		this.time = time;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(time);
			} catch (Exception e) {
				e.getStackTrace();
			}
			synchronized(counter) {			// synchronized Block		// adding synchronized Block with Object typ Counter...
																		// wird hier das Object benutzt um es sperren zu können
				counter.count();				
			}
		}

	}

}
