package infrastructure.messageBroker;

public class ProcessEventThread implements Runnable{
	
	private Observer observer;
	private Event event;
	
	
	public ProcessEventThread(Observer observer, Event event) {
		this.observer = observer;
		this.event= event;	
	}
	
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("DEBUG Event weitergeleitet: " + event.getEventtype() + 
				"/" + event.getParameter1() + "/" + event.getParameter2() + " an "+ observer);
		
		observer.processEvent(event);
	}

}
