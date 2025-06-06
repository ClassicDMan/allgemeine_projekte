package services.policeverwaltung.domain;

public class DomainEventPoliceGekuendigt {
	Eventtype eventtype;
	String policenummer;
	String versichertennummer;
	
	public DomainEventPoliceGekuendigt(String policenummer, String versichertennummer) {
		this.eventtype = Eventtype.PoliceGekuendigt;
		this.policenummer = policenummer;
		this.versichertennummer = versichertennummer;
	}
	public Eventtype getEventtype() {
		return eventtype;
	}
	public String getPolicenummer() {
		return policenummer;
	}
	public String getVersichertennummer() {
		return versichertennummer;
	}
	
	

}
