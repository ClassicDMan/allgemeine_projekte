package LLL_35_threads;

public class Sender implements Runnable {

	private Message message;

	public Sender(Message message) {
		this.message = message;
	}

	@Override
	public void run() {
		String[] messages = { "Nachricht 1: Hallo, how are you", "Nachricht 2: Hey there i am fine and you",
				" Nachricht 3: i am pretty good thx" };

		for (String msg : messages) {
			message.write(msg);
			System.out.println("Nachricht gesendet " + msg);
		}

		try {
			Thread.sleep(1000); // Wartet eine Sekunde zwischen den Nachrichten
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
		message.write("Beenden");
		System.out.println("Sender beendet");

	}

}
