package services.versichertenverwaltung.ports.primary;

import infrastructure.datastore.versichertenverwaltung.VersichertenDAO;
import infrastructure.messageBroker.Event;
import infrastructure.messageBroker.EventBroker;
import infrastructure.messageBroker.Observer;
import services.policeverwaltung.domain.Eventtype;
import services.versichertenverwaltung.ports.secondary.IVersichertenRepository;

public class EventListenerVersichertenverwaltung implements Observer{
	
	
private static EventListenerVersichertenverwaltung instance;
	
	private EventListenerVersichertenverwaltung() {
		EventBroker eventBroker = EventBroker.getInstance();
		eventBroker.addObserver(this, Eventtype.PoliceGeneriert.toString());
		instance = this;
	}
	
	public static EventListenerVersichertenverwaltung getInstance() {
		return instance == null? new EventListenerVersichertenverwaltung(): instance;
	}

	@Override
	public void processEvent(Event event) {

		if(event.getEventtype().equals(Eventtype.PoliceGeneriert.toString())) {
			versichertenDatenaktualisieren(event);
		}else if(event.getEventtype().equals(Eventtype.PoliceGekuendigt.toString())) {
			versichertenPoliceAktualisieren(event);
		}
	}

	private void versichertenPoliceAktualisieren(Event event) {
		IVersichertenRepository versichetenRepository = VersichertenDAO.getInstance();
		String policenummer = event.getParameter1().toString();
		String versicherternummer = event.getParameter2().toString();
		versichetenRepository.versichertenAktualisieren(policenummer, versicherternummer);
		
	}

	private void versichertenDatenaktualisieren(Event event) {
//		try {
//
//			Thread.sleep(3000);
//	    } catch (InterruptedException e) {
//	        e.printStackTrace(); // Fehlerbehandlung, falls der Thread unterbrochen wird
//	    }
		
		IVersichertenRepository versichetenRepository = VersichertenDAO.getInstance();
		
		String versicherternummer = event.getParameter1().toString();
		
		versichetenRepository.aktualisieren(versicherternummer);
		
	}

}
