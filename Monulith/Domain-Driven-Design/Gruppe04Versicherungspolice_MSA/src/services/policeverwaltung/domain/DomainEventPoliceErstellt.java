package services.policeverwaltung.domain;

public class DomainEventPoliceErstellt {
	
	Eventtype eventtype;
	String versichertennummer;
	String policenummer;
	String praemien;

	
	public DomainEventPoliceErstellt(String versichertennummer, String policenummer, String praemien){
		this.eventtype = Eventtype.PoliceGeneriert;
        this.policenummer = policenummer;
        this.versichertennummer = versichertennummer;
        this.praemien = praemien;
	}

	public DomainEventPoliceErstellt(String policenummer, String versichertennummer) {
		this.eventtype = Eventtype.PoliceGeneriert;
        this.policenummer = policenummer;
        this.versichertennummer = versichertennummer;
	}
	public DomainEventPoliceErstellt(String versichertennummer) {
		this.eventtype = Eventtype.PoliceGeneriert;
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
	
	public String getPraemien() {
		return praemien;
	}
	

}
