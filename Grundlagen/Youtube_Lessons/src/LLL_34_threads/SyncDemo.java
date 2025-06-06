package LLL_34_threads;

class Counter {
	
	int count;

	public synchronized void increment() {		// snchronized make the method works, t1 when running, t2 should wait, and after that t2 will run again
		count++;
	}

}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}
		});

		t1.start(); // it will runt the run Method
		t2.start();
		t1.join(); // it waits till the thread dones his Job, an synchronized, will make sure of that happens
		t2.join();

		System.out.println("Count: " + counter.count);

	}

}
