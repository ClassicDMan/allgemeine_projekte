package infrastructure.messageBroker;

import java.util.ArrayList;
import java.util.List;


public class EventBroker implements IEventBroker{
	
	public class Pair {
		private Observer observer;
		private String eventtype;
		
		public Pair (Observer observer, String eventtype) {
			this.observer = observer;
			this.eventtype = eventtype;
		}
		
		public Observer getObserver() {
			return this.observer;
		}
		
		public String getEventtype () {
			return this.eventtype;
		}
	}
	
	
	public List<Pair> subscriberlist = new ArrayList<Pair>();
	
	private static EventBroker instance = null;
	
	private EventBroker() {}
	
	public static EventBroker getInstance() {
		if (instance == null) 
				instance = new EventBroker();
		
		return instance;
		
	}
	

	public void processEvent(Event devent) {
		
		Event event = (Event) devent;
		
		for (Pair pair:subscriberlist)
			if (pair.getEventtype().toString().contentEquals(event.getEventtype().toString()))
			{
				Thread thread = new Thread(new ProcessEventThread(pair.getObserver(), event));
				thread.start();
			}
		
		// DEBUG ---> 2
//		printSubscriberList();
	}
	// DEBUG ---> 1
//	public void printSubscriberList() {
//	    System.out.println("Liste der registrierten Subscriber:");
//	    for (Pair pair : subscriberlist) {
//	        System.out.println("Eventtype: " + pair.getEventtype() + ", Observer: " + pair.getObserver().getClass().getName());
//	    }
//	}
		
	public void addObserver(Observer observer, String eventtype) {
		subscriberlist.add(new Pair(observer,eventtype));
		
	}

}
