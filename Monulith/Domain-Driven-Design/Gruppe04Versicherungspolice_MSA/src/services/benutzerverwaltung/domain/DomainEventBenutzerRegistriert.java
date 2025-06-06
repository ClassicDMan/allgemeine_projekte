package services.benutzerverwaltung.domain;

public class DomainEventBenutzerRegistriert {

	Eventtype eventtype;
	String id;

	public DomainEventBenutzerRegistriert(Benutzer benutzer) {
		this.eventtype = Eventtype.BenutzerEingeloggt;
		this.id = benutzer.getBenutzerid().getID();
	}

	public Eventtype getEventtype() {
		return eventtype;
	}

	public String getId() {
		return id;
	}

}
