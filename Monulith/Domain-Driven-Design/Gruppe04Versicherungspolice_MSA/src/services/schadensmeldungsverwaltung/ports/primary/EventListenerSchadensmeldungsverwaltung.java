package services.schadensmeldungsverwaltung.ports.primary;

import infrastructure.datastore.schadensmeldungsverwaltung.PoliceDAO;
import infrastructure.datastore.schadensmeldungsverwaltung.SchadensmeldungDAO;
import infrastructure.messageBroker.Event;
import infrastructure.messageBroker.EventBroker;
import infrastructure.messageBroker.Observer;
import services.schadensmeldungsverwaltung.domain.Eventtype;
import services.schadensmeldungsverwaltung.ports.secondary.IPoliceRepository;
import services.schadensmeldungsverwaltung.ports.secondary.ISchadenmeldungRepository;

public class EventListenerSchadensmeldungsverwaltung implements Observer{

    private static EventListenerSchadensmeldungsverwaltung instance;

	
	private EventListenerSchadensmeldungsverwaltung() {
        EventBroker eventBroker = EventBroker.getInstance();
        // Observer für die relevanten Eventtypen hinzufügen
        eventBroker.addObserver(this, Eventtype.PoliceGekuendigt.toString());
        eventBroker.addObserver(this, Eventtype.PoliceGeneriert.toString());

        instance = this;
    }
	
	public static EventListenerSchadensmeldungsverwaltung getInstance() {
		return instance == null ? new EventListenerSchadensmeldungsverwaltung(): instance;
	}


	@Override
	public void processEvent(Event event) {
		// TODO Auto-generated method stub
		if(event.getEventtype().equals(Eventtype.PoliceGekuendigt.toString())) {
			policeDatenLoeschen(event);
		}else if(event.getEventtype().equals(Eventtype.PoliceGeneriert.toString())) {
			speichern(event);
		}
		
	}



	private void speichern(Event event) {
		IPoliceRepository policeRepository = PoliceDAO.getInstance();
		String policenummer = event.getParameter2().toString();
		String versicherternummer = event.getParameter1().toString();
		String pHoehe = event.getParameter3().toString();
		policeRepository.speichern(policenummer, versicherternummer, pHoehe);
		
	}

	// Domain Service
	private void policeDatenLoeschen(Event event) {
		
		ISchadenmeldungRepository schadenmeldungRepository = SchadensmeldungDAO.getInstance();
		IPoliceRepository policeRepository = PoliceDAO.getInstance();
		
		String policenummer = event.getParameter1().toString();
		String versicherternummer = event.getParameter2().toString();
		policeRepository.policedatenLoeschen(policenummer, versicherternummer);
		schadenmeldungRepository.policedatenLoeschen(policenummer, versicherternummer);		
	}


	
	
	
	
	// Domain Event 1
	
	// Domain event 2

}
