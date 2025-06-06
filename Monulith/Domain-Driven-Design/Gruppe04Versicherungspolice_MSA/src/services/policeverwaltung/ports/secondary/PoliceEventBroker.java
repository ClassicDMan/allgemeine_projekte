package services.policeverwaltung.ports.secondary;

import services.policeverwaltung.domain.DomainEventPoliceErstellt;
import services.policeverwaltung.domain.DomainEventPoliceGekuendigt;

public interface PoliceEventBroker {

	public void send (DomainEventPoliceErstellt eventPoliceErstellt);
	public void send(DomainEventPoliceGekuendigt eventPoliceGekuendigt);
}
