package infrastructure.messageBroker;

public interface Observer {
	
	public void processEvent (Event event);

}
