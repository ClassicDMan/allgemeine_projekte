package infrastructure.messageBroker;

public interface IEventBroker {
	
	public void processEvent(Event event);
	
	public void addObserver(Observer observer, String eventtype);

}
