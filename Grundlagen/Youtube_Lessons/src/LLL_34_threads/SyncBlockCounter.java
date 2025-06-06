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

	public void count() {		// synchronized Method  // adding synchronized vor der Rückgabe Typ, -> kann nur einen 
														// Thread ausgeführt, sobald es fertig ist, fängt das nächste wiederan
		counter++;
		System.out.println("Counter = " + this.counter);
	}

}
