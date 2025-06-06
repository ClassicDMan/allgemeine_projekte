package LLL_34_threads;

import java.util.ArrayList;
import java.util.List;

public class MainThread {
	
	/*
	 * Challenge: Versuche mal 2 Threads zu erstellen zwar in jeweils ein Runnble
	 * übergibst, kannst du auch mit lambdas machen Es muss am ende die Zahlen von
	 * 1 – 10 gezählt werden, bei einem Thread muss die geraden Zahlen gezählt werden,
	 * und bei der anderen die ungeraden Du wirst thread.sleep() Methode auf jeden
	 * fall benutzen, ohne dieses wird das echt schwer zu lösen
	 * 
	 * löse es später man
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// Multithreading // Main Thread // Parallel Threads
		// 1000  Kunden auf der Webseit einen Flug buchen
		// Webseite -> Programm -> DB
		
		
		
		
//		MyThread thread = new MyThread();				// durch Exteance Thread
////		thread.run();			// hier nicht benutzen, sondern die start methode
//		MyRunnable runnable = new MyRunnable();
//		Thread thread2 = new Thread(runnable);			// thread durch implements runnable
//		thread.start();
//		thread2.start();
		
		///////////////////////////////////////////////////////////////////////////////////
		
		List<Hund> hundeListe = new ArrayList<>();
		System.out.println("Unsere Tierheim hat viele Hunde");
		
		
		ThreadMaker.lassImHintergrundLaufen(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					Hund hund = new Hund("Doggo" + i);
					hundeListe.add(hund);
				}
			}
		});
//		try {
//		Thread.sleep(1000);
//		}catch(InterruptedException e) {
//			e.getStackTrace();
//		}
		System.out.println("das sind unsere Hunde:");
		
		for (Hund hund : hundeListe) {
			System.out.println(hund.getName());
		}
		
		
		System.out.println("how many threads are running : " + Thread.activeCount());
		Thread.currentThread().setName("MAIN FROM ME");
		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().isAlive());				// if the Thread is alive
		
		System.out.println(Thread.currentThread().getPriority());			// scale of priority is from 1 - 10, 10 has highest priority
		
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		System.out.println("u r done here");
		
		
		
	}

}
