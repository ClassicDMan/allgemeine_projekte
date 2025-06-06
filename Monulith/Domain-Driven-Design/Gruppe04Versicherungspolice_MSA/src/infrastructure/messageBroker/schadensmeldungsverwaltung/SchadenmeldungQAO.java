package infrastructure.messageBroker.schadensmeldungsverwaltung;

import infrastructure.messageBroker.Event;
import infrastructure.messageBroker.EventBroker;
import infrastructure.messageBroker.IEventBroker;
import services.schadensmeldungsverwaltung.domain.DomainEventSchadenmeldungGeaendert;
import services.schadensmeldungsverwaltung.domain.DomainEventSchadenmeldungGeneriert;
import services.schadensmeldungsverwaltung.ports.secondary.SchadenmeldungEventBroker;

public class SchadenmeldungQAO implements SchadenmeldungEventBroker{

	
	private static SchadenmeldungQAO instance;

	private SchadenmeldungQAO() {
		instance = this;
	}

	public static SchadenmeldungQAO getInstance() {
		return (instance == null ? new SchadenmeldungQAO() : instance);
	}
	
	
	@Override
	public void send(DomainEventSchadenmeldungGeneriert eventSchadenGeneriert) {
		IEventBroker eventBroker = EventBroker.getInstance();
		Event event = new Event(eventSchadenGeneriert.getEventtype().toString(), eventSchadenGeneriert.getSchadennummer().toString(), 
				eventSchadenGeneriert.getPolicenummer().toString(), eventSchadenGeneriert.getStatus().toString());
		
		eventBroker.processEvent(event);
	}

	@Override
	public void send(DomainEventSchadenmeldungGeaendert eventSchadenGeaendert) {
		IEventBroker eventBroker = EventBroker.getInstance();
		Event event = new Event(eventSchadenGeaendert.getEventtype().toString(), 
				eventSchadenGeaendert.getPolicenummer().toString(), 
				eventSchadenGeaendert.getSchadennummer().toString(),
				eventSchadenGeaendert.getStatus().toString());
		
		eventBroker.processEvent(event);
		
	}
	
	

}
