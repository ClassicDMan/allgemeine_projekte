package infrastructure.messageBroker.benutzerverwaltung;


import services.benutzerverwaltung.ports.secondary.BenutzerEventBroker;

public class BenutzerQAO implements BenutzerEventBroker{
	private static BenutzerQAO instance;
	
	private BenutzerQAO() {
		instance = this;
	}
	
	public static BenutzerQAO getInstance() {
		return (instance == null? new BenutzerQAO(): instance);
	}
	
	
//	@Override
//	public void send(DomainEventBenutzerEingeloggt eventeingeloggt) {
//			IEventBroker eventbroker = EventBroker.getInstance();
//			Event event = new Event(eventeingeloggt.getId().toString(), eventeingeloggt.getEventtype().toString());
//			
//			eventbroker.processEvent(event);
//		
//	}

//	@Override
//	public void send(DomainEventBenutzerRegistriert eventRegistriert) {
//		IEventBroker eventbroker = EventBroker.getInstance();
//		Event event = new Event(eventRegistriert.getId().toString(), eventRegistriert.getEventtype().toString());
//		
//		eventbroker.processEvent(event);
//
//
//	}

}
