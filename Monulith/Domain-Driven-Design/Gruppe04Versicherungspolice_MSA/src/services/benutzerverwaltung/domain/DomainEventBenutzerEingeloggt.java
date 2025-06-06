package services.benutzerverwaltung.domain;


// Schritt 1: extends Event
public class DomainEventBenutzerEingeloggt{
	
	Eventtype eventtype;
	String id;

	public DomainEventBenutzerEingeloggt(Benutzer benutzer) {
		this.eventtype = Eventtype.BenutzerEingeloggt;
		this.id = benutzer.getBenutzerid().getID();
	}

	public Eventtype getEventtype() {
		return eventtype;
	}

	public String getId() {
		return id;
	}
	
//	private final Benutzer benutzer;
//	// Schritt 2: Konstruktur ergänzen
//	public DomainEventBenutzerEingeloggt(Benutzer benutzer) {
//        super(Eventtype.BenutzerEingeloggt.toString(), benutzer);
//        this.benutzer = benutzer; // Typ: Versicherungsagent oder Schadenssachbearbeiter
//    }
//
//	public Benutzer getBenutzer() {
//		return benutzer;
//	}

}
