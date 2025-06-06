package services.benutzerverwaltung.ports.primary;

import infrastructure.messageBroker.Event;
import infrastructure.messageBroker.EventBroker;
import infrastructure.messageBroker.Observer;
import services.benutzerverwaltung.domain.Eventtype;

public class EventListenerBenutzerverwaltung  implements Observer{
	
	private static EventListenerBenutzerverwaltung instance;
	
	private EventListenerBenutzerverwaltung() {
		EventBroker eventBroker = EventBroker.getInstance();
		eventBroker.addObserver(this, Eventtype.BenutzerEingeloggt.toString());
		eventBroker.addObserver(this,  Eventtype.BenutzerErstellt.toString());
		instance = this;
	}
	
	public static EventListenerBenutzerverwaltung getInstance() {
		return instance == null? new EventListenerBenutzerverwaltung(): instance;
	}

	@Override
	public void processEvent(Event event) {
		
		if(event.getEventtype().equals(Eventtype.BenutzerEingeloggt.toString())) {
			
			
			System.out.println("Benutzer Erfolgreich eingeloggt");
		}
		if(event.getEventtype().contentEquals(Eventtype.BenutzerErstellt.toString())) {
			
			
			System.out.println("Benutzer Erfolgreich erstellt");
		}
			
	}
	
//	@Override
//	public void processEvent(Event event) {
//		
//		if(event instanceof DomainEventBenutzerEingeloggt) {
//			DomainEventBenutzerEingeloggt benutzerEingeloggtEvent = (DomainEventBenutzerEingeloggt) event;
//			Benutzer benutzer = benutzerEingeloggtEvent.getBenutzer();
//			if(benutzer.getTyp().toString().equals("versicherungsagent")) {
//				System.out.println("Policeverwaltung GUI zugreifen");
//			}else if(benutzer.getTyp().toString().equals("schadenssachbearbeiter")) {
//				System.out.println("Schadensmeldung GUI zugreifen");
//			}
//		}
//			
//	}
	
	
	

}
