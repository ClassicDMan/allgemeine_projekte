package LLL_35_threads;

public class Receiver implements Runnable {

	private Message message;

	public Receiver(Message message) {
		this.message = message;
	}

	@Override
	public void run() {

		while (true) {
			int messagesReceived = 0;
			while (messagesReceived < 3) {
				String receivedMessage = message.read();

				if (receivedMessage.equals("Beenden")) {
					System.out.println("Empfänger beendet");
					break;
				}
				System.out.println("Nachricht empfangen " + receivedMessage);
				messagesReceived++;
			}

		}

	}

}
