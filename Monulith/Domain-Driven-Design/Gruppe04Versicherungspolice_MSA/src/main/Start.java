package main;

import services.policeverwaltung.ports.primary.EventListenerPoliceverwaltung;
import services.schadensmeldungsverwaltung.ports.primary.EventListenerSchadensmeldungsverwaltung;
import services.ui.portal.MainPortal;
//import services.versichertenverwaltung.domain.EventListenerVersichertenverwaltung;
import services.versichertenverwaltung.ports.primary.EventListenerVersichertenverwaltung;

public class Start {
	
	public static void main(String [] args) {
		
		EventListenerVersichertenverwaltung.getInstance();
		EventListenerPoliceverwaltung.getInstance();
		EventListenerSchadensmeldungsverwaltung.getInstance();
		
		new MainPortal().dialogStart();
		
	}

}
