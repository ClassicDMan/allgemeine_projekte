package services.schadensmeldungsverwaltung.domain;

public class DomainEventSchadenmeldungGeneriert {
	
	Eventtype eventtype;
	String schadennummer;
	String policenummer;
	String status;
	
	
    
    
    public DomainEventSchadenmeldungGeneriert(String schadennummer,
			String policenummer, String status) {
		this.eventtype = Eventtype.SchadenmeldungGeneriert; 
		this.schadennummer = schadennummer;
		this.policenummer = policenummer;
		this.status = status;
	}

    public Eventtype getEventtype() {
        return eventtype;
    }


	public String getSchadennummer() {
		return schadennummer;
	}


	public String getPolicenummer() {
		return policenummer;
	}


	public String getStatus() {
		return status;
	}
    

}
