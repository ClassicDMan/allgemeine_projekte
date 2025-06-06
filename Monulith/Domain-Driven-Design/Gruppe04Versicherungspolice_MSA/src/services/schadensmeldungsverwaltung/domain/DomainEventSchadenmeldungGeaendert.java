package services.schadensmeldungsverwaltung.domain;

public class DomainEventSchadenmeldungGeaendert {
	
    Eventtype eventtype;
    String policenummer;
    String schadennummer;
    String status;
    
   
    public DomainEventSchadenmeldungGeaendert(String policenummer, String schadennummer, String status) {
        this.eventtype = Eventtype.SchadenmeldungGeaendert; 
        this.policenummer = policenummer;
        this.schadennummer = schadennummer;
        this.status = status;
    }
    
    
    public Eventtype getEventtype() {
        return eventtype;
    }


	public String getPolicenummer() {
		return policenummer;
	}


	public String getSchadennummer() {
		return schadennummer;
	}
	
	public String getStatus() {
		return status;
	}
    
    
    
  
}
