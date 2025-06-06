package services.schadensmeldungsverwaltung.ports.primary;

import java.util.Collection;

public interface IServiceSchadenmeldungGenerieren {
	
	public void schadenmeldungAnlegen(String schadennummer, String schadenmeldungstag, String schadenmeldungsmonat, 
	String schadenmeldungsjahr, double schadenshoehe, String schadensstatus, String policenummer);
	public Collection<PoliceTOO>policenAnzeigen();
}
