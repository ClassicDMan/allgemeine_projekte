package services.benutzerverwaltung.domain;

public class Benutzer {

	private BenutzerId benutzerid;
	private String vorname;
	private String nachname;
	private String typ;
	private String passwort;
	
	public Benutzer() { }

	public Benutzer(BenutzerId benutzerid, String vorname, String nachname, String typ, String passwort) {
		this.benutzerid = benutzerid;
		this.vorname = vorname;
		this.nachname = nachname;
		this.typ = typ;
		this.passwort = passwort;
	}

	public BenutzerId getBenutzerid() {
		return benutzerid;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getTyp() {
		return typ;
	}

	public String getPasswort() {
		return passwort;
	}

	public void setBenutzerid(BenutzerId benutzerid) {
		this.benutzerid = benutzerid;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}
	
//	public static Benutzer benutzerEinloggen(BenutzerId id) {
//		
//		IBenutzerRepository benutzerRepository = BenutzerDAO.getInstance();
//		Benutzer benutzer = benutzerRepository.getBenutzerById(id);
//		
//		DomainEventBenutzerEingeloggt eventEingeloggt = new DomainEventBenutzerEingeloggt(benutzer);
//		
//		BenutzerEventBroker eventBroker = BenutzerQAO.getInstance();
//		eventBroker.send(eventEingeloggt);
//		
//		return benutzer;
//	}
	
	
	// Domain Event benutzerRegistrieren
	public static Benutzer benutzerRegistrieren(BenutzerId benutzerId, String vorname, String nachname, String typ,
			String passwort) {
		
		Benutzer benutzer = new Benutzer(benutzerId, vorname, nachname, typ, passwort);
//		DomainEventBenutzerRegistriert eventRegistriert = new DomainEventBenutzerRegistriert(benutzer);
//		BenutzerEventBroker eventBroker = BenutzerQAO.getInstance();
//		eventBroker.send(eventRegistriert);
		return benutzer;
	}

}
