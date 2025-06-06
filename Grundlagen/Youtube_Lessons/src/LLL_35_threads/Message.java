package LLL_35_threads;

public class Message {

	private String content;
	private boolean empty = true;

	public synchronized String read() {
		while (empty) {
			try {
				wait();		// Thread wartet, bis eine Nachricht verfügbar ist
			} catch (InterruptedException e) {
				e.getStackTrace();
			}

		}
		empty = true;
		notifyAll();		// Benachrichtigt andere Threads, dass sie eine Nachricht lesen können
		return content;
	}
	
	public synchronized void write(String content) {
		while(!empty) {
			try {
				wait();		// Thread wartet, bis die vorherige Nachricht gelesen wurde
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		this.content = content;
		empty = false;
		notifyAll();		// Benachrichtigt andere Threads, dass sie eine Nachricht geschrieben können
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
