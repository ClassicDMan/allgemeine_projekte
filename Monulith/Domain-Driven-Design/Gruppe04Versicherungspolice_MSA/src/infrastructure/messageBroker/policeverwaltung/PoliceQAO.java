package infrastructure.messageBroker.policeverwaltung;

import infrastructure.messageBroker.Event;
import infrastructure.messageBroker.EventBroker;
import infrastructure.messageBroker.IEventBroker;
import services.policeverwaltung.domain.DomainEventPoliceErstellt;
import services.policeverwaltung.domain.DomainEventPoliceGekuendigt;
import services.policeverwaltung.ports.secondary.PoliceEventBroker;

public class PoliceQAO implements PoliceEventBroker {

	private static PoliceQAO instance;

	private PoliceQAO() {
		instance = this;
	}

	public static PoliceQAO getInstance() {
		return (instance == null ? new PoliceQAO() : instance);
	}

	@Override
	public void send(DomainEventPoliceErstellt eventPoliceErstellt) {

		IEventBroker eventBroker = EventBroker.getInstance();
		
		Event event = new Event(eventPoliceErstellt.getEventtype().toString(), 
				eventPoliceErstellt.getVersichertennummer().toString(), 
				eventPoliceErstellt.getPolicenummer().toString(),
				eventPoliceErstellt.getPraemien().toString());
		
		eventBroker.processEvent(event);
	}

	@Override
	public void send(DomainEventPoliceGekuendigt eventPoliceGekuendigt) {

		IEventBroker eventBroker = EventBroker.getInstance();
		
		Event event = new Event(eventPoliceGekuendigt.getEventtype().toString(), 
				eventPoliceGekuendigt.getPolicenummer().toString(),eventPoliceGekuendigt.getVersichertennummer().toString());
		
		eventBroker.processEvent(event);
	}



}
