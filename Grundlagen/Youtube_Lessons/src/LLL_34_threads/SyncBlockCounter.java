package LLL_34_threads;

public class SyncBlockCounter {
	// Probelm: Mehrere Threads teilen sich Counter ( SyncBlockCounter )
	private int counter;

	public SyncBlockCounter() {
		this.counter = 0;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getCounter() {
		return counter;
	}

	public void count() {		// synchronized Method  // adding synchronized vor der R�ckgabe Typ, -> kann nur einen 
														// Thread ausgef�hrt, sobald es fertig ist, f�ngt das n�chste wiederan
		counter++;
		System.out.println("Counter = " + this.counter);
	}

}
