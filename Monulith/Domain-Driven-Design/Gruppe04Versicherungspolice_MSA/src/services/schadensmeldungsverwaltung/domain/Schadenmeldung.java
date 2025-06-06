package services.schadensmeldungsverwaltung.domain;

import infrastructure.messageBroker.schadensmeldungsverwaltung.SchadenmeldungQAO;
import services.schadensmeldungsverwaltung.ports.primary.SchadenmeldungTO;
import services.schadensmeldungsverwaltung.ports.secondary.SchadenmeldungEventBroker;

public class Schadenmeldung {
	
	Schadennummer schadennummer;
	Schadendatum schadendatum;
	Schadenshoehe schadenshoehe;
	Schadensstatus schadensstatus;
	
	Policenummer police;
	
	public Schadenmeldung(Schadennummer schadennummer, Schadendatum schadendatum, Schadenshoehe schadenshoehe,
			Schadensstatus schadensstatus) {
		
		this.schadennummer = schadennummer;
		this.schadendatum = schadendatum;
		this.schadenshoehe = schadenshoehe;
		this.schadensstatus = schadensstatus;
	}
	
	public Schadenmeldung(Schadennummer schadennummer, Schadendatum schadendatum, Schadenshoehe schadenshoehe,
			Schadensstatus schadensstatus, Policenummer police) {
		
		this.schadennummer = schadennummer;
		this.schadendatum = schadendatum;
		this.schadenshoehe = schadenshoehe;
		this.schadensstatus = schadensstatus;
		this.police = police;
	}
	
	public Schadenmeldung() {

	}

	public Schadennummer getSchadennummer() {
		return schadennummer;
	}
	public Schadendatum getSchadendatum() {
		return schadendatum;
	}
	public Schadenshoehe getSchadenshoehe() {
		return schadenshoehe;
	}
	public Schadensstatus getSchadensstatus() {
		return schadensstatus;
	}
	public void setSchadennummer(Schadennummer schadennummer) {
		this.schadennummer = schadennummer;
	}
	public void setSchadendatum(Schadendatum schadendatum) {
		this.schadendatum = schadendatum;
	}
	public void setSchadenshoehe(Schadenshoehe schadenshoehe) {
		this.schadenshoehe = schadenshoehe;
	}
	public void setSchadensstatus(Schadensstatus schadensstatus) {
		this.schadensstatus = schadensstatus;
	}

	public Policenummer getPolice() {
		return police;
	}

	public void setPolice(Policenummer police) {
		this.police = police;
	}
	
	public SchadenmeldungTO toSchadenmeldungTO(Schadenmeldung schadenmeldung) {

		return new SchadenmeldungTO(schadenmeldung.getSchadennummer().getSchadennummer(),
				schadenmeldung.getSchadendatum().getTag(),
				schadenmeldung.getSchadendatum().getMonat(),
				schadenmeldung.getSchadendatum().getJahr(),
				schadenmeldung.getSchadenshoehe().getSchadenshoehe(),
				schadenmeldung.getSchadensstatus().toString(),
				schadenmeldung.getPolice().getPolicenummer()
				);
	}
	
	// Domain Event
	public boolean schadenmeldungAnlegen(Schadenmeldung schadenmeldung) {
		Schadennummer nummer = new Schadennummer(schadenmeldung.getSchadennummer().getSchadennummer());
		Policenummer policenummer = new Policenummer(schadenmeldung.getPolice().getPolicenummer());
		String status = schadenmeldung.getSchadensstatus().toString();
		
		DomainEventSchadenmeldungGeneriert eventGeneriert = new DomainEventSchadenmeldungGeneriert(nummer.getSchadennummer().toString(),
				policenummer.getPolicenummer().toString(), status);
		
		SchadenmeldungEventBroker eventBroker = SchadenmeldungQAO.getInstance();
		eventBroker.send(eventGeneriert);
		
		return true;
	}
	
	// Domain Event
	public boolean schadenmeldungBearbeiten(Policenummer policenummer,  Schadennummer schadennummer, String status) {
		String polNummer = policenummer.getPolicenummer().toString();
		String schaden = schadennummer.getSchadennummer().toString();
		String s = status.toString();
		
		DomainEventSchadenmeldungGeaendert eventGeneriert = new DomainEventSchadenmeldungGeaendert(polNummer, schaden, s.toString());
		
		SchadenmeldungEventBroker eventBroker = SchadenmeldungQAO.getInstance();
		eventBroker.send(eventGeneriert);
		
		return true;
	}

}
