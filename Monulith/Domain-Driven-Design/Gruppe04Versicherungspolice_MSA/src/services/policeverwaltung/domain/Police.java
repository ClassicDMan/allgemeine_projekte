package services.policeverwaltung.domain;

import java.util.ArrayList;
import java.util.Collection;

import infrastructure.messageBroker.policeverwaltung.PoliceQAO;
import services.policeverwaltung.ports.primary.PoliceTO;
import services.policeverwaltung.ports.secondary.PoliceEventBroker;

// Aggregat
public class Police {
	Policenummer policenummer;
	Versicherungsarttyp versicherungsart;
	Datum versicherungsbeginn;
	Datum versicherungsende;
	Praeminehoehe praemienhoehe;
	Collection<ProduktId> zugehoerigeProdukte;

	protected Versichertennummer versicherternummer;
	Collection<Schadennummer> schadenmeldungen;

	public Police() {
		this.zugehoerigeProdukte = new ArrayList<ProduktId>();
		this.schadenmeldungen = new ArrayList<Schadennummer>();
	}

	public Police(Policenummer policenummer, Versicherungsarttyp versicherungsart, Datum versicherungsbeginn,
			Datum versicherungsende, Praeminehoehe praemienhoehe, Versichertennummer versicherternummer) {

		this.policenummer = policenummer;
		this.versicherungsart = versicherungsart;
		this.versicherungsbeginn = versicherungsbeginn;
		this.versicherungsende = versicherungsende;
		this.praemienhoehe = praemienhoehe;
		this.zugehoerigeProdukte = new ArrayList<ProduktId>();

		this.versicherternummer = versicherternummer;
		this.schadenmeldungen = new ArrayList<Schadennummer>();
	}

	public Versichertennummer getVersicherternummer() {
		return versicherternummer;
	}

	public void setVersicherternummer(Versichertennummer versicherternummer) {
		this.versicherternummer = versicherternummer;
	}

	public Policenummer getPolicenummer() {
		return policenummer;
	}

	public Versicherungsarttyp getVersicherungsart() {
		return versicherungsart;
	}

	public Datum getVersicherungsbeginn() {
		return versicherungsbeginn;
	}

	public Datum getVersicherungsende() {
		return versicherungsende;
	}

	public Praeminehoehe getPraemienhoehe() {
		return praemienhoehe;
	}

	public void setPolicenummer(Policenummer policenummer) {
		this.policenummer = policenummer;
	}

	public void setVersicherungsart(Versicherungsarttyp versicherungsart) {
		this.versicherungsart = versicherungsart;
	}

	public void setVersicherungsbeginn(Datum versicherungsbeginn) {
		this.versicherungsbeginn = versicherungsbeginn;
	}

	public void setVersicherungsende(Datum versicherungsende) {
		this.versicherungsende = versicherungsende;
	}

	public void setPraemienhoehe(Praeminehoehe praemienhoehe) {
		this.praemienhoehe = praemienhoehe;
	}

	public Collection<ProduktId> getProdukten() {
		return this.zugehoerigeProdukte;
	}

	public void addProdukt(ProduktId produktnummer) {
		this.zugehoerigeProdukte.add(produktnummer);
	}

	public Collection<Schadennummer> getSchaden() {
		return this.schadenmeldungen;
	}

	public void addSchaden(Schadennummer schadennummer) {
		this.schadenmeldungen.add(schadennummer);
	}

	public boolean istLoeschbar(Policenummer policenummer) {
		if (schadenmeldungen.size() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public PoliceTO toPoliceTO(Police police) {

		return new PoliceTO(police.getPolicenummer().getPolicenummer(), 
				police.getVersicherungsart().toString(),
				police.versicherungsbeginn.getTag(), 
				police.versicherungsbeginn.getMonat(),
				police.versicherungsbeginn.getJahr(), 
				police.versicherungsende.getTag(),
				police.versicherungsende.getMonat(), 
				police.versicherungsende.getJahr(),
				police.getPraemienhoehe().getPraemienhoehe(), 
				police.getVersicherternummer().getVersicherternummer()
				);
	}
	
	
	// Domain Event
	public boolean policeAnlegen(Policenummer poilcenummer, Versicherungsarttyp typ, Datum beginnDatum,
			Datum endDatum, Praeminehoehe praemie, Versichertennummer versichertennummer) {
		
		Police police = new Police(poilcenummer, typ, beginnDatum, endDatum, praemie, versichertennummer);
		
		DomainEventPoliceErstellt eventErstellt = new DomainEventPoliceErstellt(
				police.getVersicherternummer().getVersicherternummer().toString(), 
				police.getPolicenummer().getPolicenummer().toString(), 
				police.getPraemienhoehe().getPraemienhoehe());

		PoliceEventBroker eventBroker = PoliceQAO.getInstance();
		eventBroker.send(eventErstellt);
		return true;

	}
	
	public boolean policeKuendigen(String policenummer, String versichertennummer) {
		
		DomainEventPoliceGekuendigt eventErstellt = new DomainEventPoliceGekuendigt(policenummer, versichertennummer);

		PoliceEventBroker eventBroker = PoliceQAO.getInstance();
		eventBroker.send(eventErstellt);
		return true;
	}

}
