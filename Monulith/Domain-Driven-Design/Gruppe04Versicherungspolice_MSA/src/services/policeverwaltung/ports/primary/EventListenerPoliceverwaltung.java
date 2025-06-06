package services.policeverwaltung.ports.primary;

import java.util.Random;

import infrastructure.datastore.policeverwaltung.SchadenmeldungDAO;
import infrastructure.messageBroker.Event;
import infrastructure.messageBroker.EventBroker;
import infrastructure.messageBroker.Observer;
import services.policeverwaltung.domain.Eventtype;
import services.policeverwaltung.ports.secondary.ISchadenmeldungRepository;

public class EventListenerPoliceverwaltung implements Observer{
	
    private static EventListenerPoliceverwaltung instance;
    
    private EventListenerPoliceverwaltung() {
    	EventBroker eventBroker = EventBroker.getInstance();
    	eventBroker.addObserver(this, Eventtype.SchadenmeldungGeneriert.toString());
    	eventBroker.addObserver(this, Eventtype.SchadenmeldungGeaendert.toString());
        instance = this;
    }
    
    public static EventListenerPoliceverwaltung getInstance() {
        return instance == null ? new EventListenerPoliceverwaltung() : instance;
    }

	@Override
	public void processEvent(Event event) {
		
		if(event.getEventtype().equals(Eventtype.SchadenmeldungGeneriert.toString())) {
			policeSchadenmeldungAktualisieren(event);
			
		}
		if(event.getEventtype().contentEquals(Eventtype.SchadenmeldungGeaendert.toString())) {
			policedatenAktualisieren(event);
		}
	}

	private void policeSchadenmeldungAktualisieren(Event event) {
		ISchadenmeldungRepository schadenmeldungRepository = SchadenmeldungDAO.getInstance();
		
		String schadennummer = event.getParameter1().toString();
		String policenummer = event.getParameter2().toString();
		String schadensstatus = event.getParameter3().toString();
		
		schadenmeldungRepository.policeAktualisieren(schadennummer, policenummer, schadensstatus);
		
	}

	
	private void policedatenAktualisieren(Event event) {
		
		ISchadenmeldungRepository policeRepository = SchadenmeldungDAO.getInstance();
		String policenummer = event.getParameter1().toString();
		String schadennummer = event.getParameter2().toString();
		String status = event.getParameter3().toString();
	    String schadenbegruendung = getRandomBegruendung();

		policeRepository.aktualisieren(policenummer, schadennummer, status, schadenbegruendung);

		
	}
	
	private String getRandomBegruendung() {
	    // Array von vordefinierten Worten für die Begründung
	    String[] begruendungen = {
	        "Unfall", "Brand", "Diebstahl", "Wasser", "Sturm", "Vandalismus", 
	        "Fahrzeugschaden", "Hagelschaden", "Naturkatastrophe", "Fehler bei der Benutzung"
	    };

	    // Zufälliges Wort aus dem Array auswählen
	    Random random = new Random();
	    int index = random.nextInt(begruendungen.length);

	    return begruendungen[index];
	}

}
