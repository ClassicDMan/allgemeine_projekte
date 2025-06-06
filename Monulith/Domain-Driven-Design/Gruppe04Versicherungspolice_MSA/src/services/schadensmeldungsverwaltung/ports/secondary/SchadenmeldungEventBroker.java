package services.schadensmeldungsverwaltung.ports.secondary;

import services.schadensmeldungsverwaltung.domain.DomainEventSchadenmeldungGeaendert;
import services.schadensmeldungsverwaltung.domain.DomainEventSchadenmeldungGeneriert;

public interface SchadenmeldungEventBroker {
	
	public void send (DomainEventSchadenmeldungGeneriert eventSchadenGeneriert);
	public void send (DomainEventSchadenmeldungGeaendert eventSchadenGeaendert);

}
