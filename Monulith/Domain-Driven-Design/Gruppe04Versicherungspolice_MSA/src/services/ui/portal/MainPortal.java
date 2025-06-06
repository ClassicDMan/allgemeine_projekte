package services.ui.portal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

import services.benutzerverwaltung.ports.primary.AppServiceBenutzerEinloggen;
import services.benutzerverwaltung.ports.primary.AppServiceBenutzerRegistrieren;
import services.benutzerverwaltung.ports.primary.BenutzerTO;
import services.benutzerverwaltung.ports.primary.IServiceBenutzerEinloggen;
import services.benutzerverwaltung.ports.primary.IServiceBenutzerRegistrieren;
import services.policeverwaltung.ports.primary.AppServicePoliceEntfernen;
import services.policeverwaltung.ports.primary.AppServicePoliceGenerieren;
import services.policeverwaltung.ports.primary.IServicePoliceEntfernen;
import services.policeverwaltung.ports.primary.IServicePoliceGeneriren;
import services.policeverwaltung.ports.primary.PoliceTO;
import services.policeverwaltung.ports.primary.VersichertenTO;
import services.schadensmeldungsverwaltung.ports.primary.AppServiceSchadenmeldungAendern;
import services.schadensmeldungsverwaltung.ports.primary.AppServiceSchadenmeldungGenerieren;
import services.schadensmeldungsverwaltung.ports.primary.IServiceSchadenmeldungAendern;
import services.schadensmeldungsverwaltung.ports.primary.IServiceSchadenmeldungGenerieren;
import services.schadensmeldungsverwaltung.ports.primary.PoliceTOO;
import services.schadensmeldungsverwaltung.ports.primary.SchadenmeldungTO;
import services.versichertenverwaltung.ports.primary.AppServiceVersichertenAnzeigen;
import services.versichertenverwaltung.ports.primary.IServiceVersichertenAnzeigen;

public class MainPortal {

	private static Scanner sc = new Scanner(System.in);

	// HAUPTMENUE

	public void dialogStart() {

		int auswahl = 0;

		do {
			System.out.println("\n\nHauptmenue");
			System.out.println("=========================");
			System.out.println("*** Benuzerverwaltung: ***");
			System.out.println("1 - Benutzer anmelden");
			System.out.println("2 - Benutzer registrieren");
			System.out.println("3 - Exit");

			try {
				System.out.print("\n Auswahl: ");
				auswahl = sc.nextInt();
			} catch (InputMismatchException e) {
				auswahl = 0;
				sc.next();
			}

			switch (auswahl) {
			case 1:
				dialogEinloggen();
				break;
			case 2:
				dialogRegistrieren();
				break;
			case 3:
				System.out.println("... end");
				break;
			default:
				System.out.println("ungueltige Eingabe");
			}

		} while (auswahl != 3);

	}

	// Benutzerverwaltung

	// Anmelden
	IServiceBenutzerEinloggen einloggenService = AppServiceBenutzerEinloggen.getInstance();

	private void dialogEinloggen() {
		System.out.println("Versicherungsagent --> id : 4711, passwort: vvvv **** oder ****" + "\n"
				+ "Schadensachbearbeiter --> id: 4712, passwort: ssss");
		System.out.print("Ihre ID eingeben: ");
		String eingabeID = sc.next();
		System.out.print("Passwort eingeben: ");
		String eingabePasswort = sc.next();

		einloggenService.einloggen(eingabeID, eingabePasswort);
		
		if (eingabeID.equals("4711")) {
			versichertenagent();
		} else if (eingabeID.equals("4712")) {
			schadenssachbearbeiter();
		}

	}

	private void versichertenagent() {
		int auswahl = 0;
		System.out.println("\n\nHauptmenue Versicherungsagent");
		System.out.println("=========================");
		System.out.println("*** Policeverwaltung: ***");
		System.out.println("1 - Policeanlegen");
		System.out.println("2 - Police kündigen");
		System.out.println("3 - Exit");
		try {
			System.out.print("\n Auswahl: ");
			auswahl = sc.nextInt();
		} catch (InputMismatchException e) {
			auswahl = 0;
			sc.next();
		}

		switch (auswahl) {
		case 1:
			dialogPoliceAnlegen();
			break;
		case 2:
			dialogPolicekuendigen();
			break;
		case 3:
			System.out.println("... end");
			break;
		default:
			System.out.println("ungueltige Eingabe");

		}
	}

	private void schadenssachbearbeiter() {
		int auswahl = 0;
		System.out.println("\n\nHauptmenue Schadenssachbearbeiter");
		System.out.println("=========================");
		System.out.println("*** Schadensmeldungenverwaltung: ***");
		System.out.println("1 - Schadensmeldung anlegen");
		System.out.println("2 - Schadensmeldung ändern");
		System.out.println("3 - Exit");
		try {
			System.out.print("\n Auswahl: ");
			auswahl = sc.nextInt();
		} catch (InputMismatchException e) {
			auswahl = 0;
			sc.next();
		}

		switch (auswahl) {
		case 1:
			dialogSchadenmeldungAnlegen();
			break;
		case 2:
			dialogSchadenmeldungAendern();
			break;
		case 3:
			System.out.println("... end");
			break;
		default:
			System.out.println("ungueltige Eingabe");
		}
	}

	IServiceBenutzerRegistrieren registrierenService = AppServiceBenutzerRegistrieren.getInstance();

	// Registrieren
	private void dialogRegistrieren() {
		System.out.println("Mitarbeiter ID Nummer eingeben: ");
		String id = sc.next();
		System.out.println("Welche Rolle werden Sie übernehmen: versicherungsagent oder schadenssachbearbeiter");
		String typ = sc.next();
		System.out.println("geben Sie eine passende Passwort: ");
		String passwort = sc.next();
		System.out.println("Vorname: ");
		String vorname = sc.next();
		System.out.println("Nachname: ");
		String nachname = sc.next();
		System.out.println("Alter: ");
		String alter = sc.next();

		BenutzerTO benutzerTO = registrierenService.registrieren(id, vorname, nachname, typ, passwort, alter);
		if (!benutzerTO.equals(null)) {
			System.out.println("Bitte melden Sie sich an");
		} else {
			System.out.println("Versuchen Sie sich nochmal zu registrieren");
		}

	}

	// Policeverwaltung --> anlegen

	IServicePoliceGeneriren policeErstellenService = AppServicePoliceGenerieren.getInstance();

	private void dialogPoliceAnlegen() {
		String versicherternummer = versichertenregi();
		System.out.print("Policenummer:    ");
		String policenummer = sc.next();
		System.out.println("1- KFZ,\n" + "2- HAFTPFLICHT,\r\n" + "3- HAUSRAT;");
		System.out.print("Auswahl: ");
		String versicherungsart;
		int auswahl = sc.nextInt();
		if (auswahl == 1) {
			versicherungsart = "KFZ";
		} else if (auswahl == 2) {
			versicherungsart = "HAFTPFLICHT";
		} else {
			versicherungsart = "HAUSRAT";
		}
		System.out.print("Versicherungsbeginn - Tag:    ");
		String versicherungsbeginnTag = sc.next();
		System.out.print("Versicherungsbeginn - Monat:    ");
		String versicherungsbeginnMonat = sc.next();
		System.out.print("Versicherungsbeginn - Jahr:    ");
		String versicherungsbeginnJahr = sc.next();
		System.out.print("Versicherungsende - Tag:     ");
		String versicherungsendeTag = sc.next();
		System.out.print("Versicherungsende - Monat:   ");
		String versicherungsendeMonat = sc.next();
		System.out.print("Versicherungsende - Jahr:    ");
		String versicherungsendeJahr = sc.next();
		System.out.print("Prämienhöhe:         ");
		String praemienhoehe = sc.next();

		policeErstellenService.policeAnlegen(policenummer, versicherungsart, versicherungsbeginnTag,
				versicherungsbeginnMonat, versicherungsbeginnJahr, versicherungsendeTag, versicherungsendeMonat,
				versicherungsendeJahr, praemienhoehe, versicherternummer);

	}

	// Policeverwaltung --> kündigen

	IServicePoliceEntfernen policeKuendigenService = AppServicePoliceEntfernen.getInstance();

	private void dialogPolicekuendigen() {
	    Collection<VersichertenTO> versichertenList = policeKuendigenService.alleVersichertenAnzeigen();

			System.out.println("wählen Sie den Versicheren aus:: ");
			String versichertennummer = sc.next();
			System.out.println();
	        Collection<PoliceTO> policeList = policeKuendigenService.policenAnzeigen(versichertennummer);

			if(policeList.isEmpty()) {
				System.out.println("Zurück zur Hauptmenü");
				
			}else {
				System.out.println("welche Police möchte Sie kündigen: ");
				String policenummer = sc.next();

				policeKuendigenService.policeKuendigen(policenummer, versichertennummer);
			}


		

	}

	// Schadenmeldungsverwaltung --> anlegen
	IServiceSchadenmeldungGenerieren schadenmeldungGenerieren = AppServiceSchadenmeldungGenerieren.getInstance();

	private void dialogSchadenmeldungAnlegen() {

		Collection<PoliceTOO> policelist = schadenmeldungGenerieren.policenAnzeigen();
		
		if(policelist.isEmpty()) {
			System.out.println("Zurück zur Hauptmenü");
		}else {
			System.out.println("Wählen Sie die Police.Nr: ");
			String policenummer = sc.next();
			
			System.out.print("Schadenmeldungsnummer:    ");
			String schadennummer = sc.next();
			System.out.print("Schadenmeldungstag:    ");
			String schadenmeldungstag = sc.next();
			System.out.print("Schadenmeldungsmonat:    ");
			String schadenmeldungsmonat = sc.next();
			System.out.print("Schadenmeldungsjahr:    ");
			String schadenmeldungsjahr = sc.next();
			System.out.print("Schadenshoehe:    ");
			double schadenshoehe = sc.nextDouble();
			System.out.println("1- OFFEN,\n" + "2- IN_BEARBEITUNG,\r\n" + "3- ABGESCHLOSSEN;");
			System.out.print("Auswahl: ");
			String schadensstatus;
			int auswahl = sc.nextInt();
			
			if (auswahl == 1) {
				schadensstatus = "OFFEN";
			} else if (auswahl == 2) {
				schadensstatus = "IN_BEARBEITUNG";
			} else {
				schadensstatus = "ABGESCHLOSSEN";
			}

			schadenmeldungGenerieren.schadenmeldungAnlegen(schadennummer, schadenmeldungstag, schadenmeldungsmonat,
					schadenmeldungsjahr, schadenshoehe, schadensstatus, policenummer);
		}
		

	}
	
	// Schadenmeldungsverwaltung --> ändern

	IServiceSchadenmeldungAendern schadenmeldungAendern = AppServiceSchadenmeldungAendern.getInstance();
	private void dialogSchadenmeldungAendern() {
		
		Collection<SchadenmeldungTO> schadenmeldungen = new ArrayList<>();
		schadenmeldungen = schadenmeldungAendern.alleSchadenmeldungenAnzeigen();

		if (schadenmeldungen.isEmpty()) {
			System.out.println("Zurück zur Hauptmenü");
		} else {
			System.out.println("welche Schadenmeldungn möchte Sie ändern, bitte Schadenmeldungsnummer eingeben: ");		
		}
		String schadennummer = sc.next();
		System.out.println("eingegebene Nummer: " + schadennummer);
		if(schadennummer == null || schadennummer.isEmpty()) {
			System.out.println("Zurück zur Hauptmenü, keine Schadennummer gegeben");			
		}else {
			
	        SchadenmeldungTO schadenmeldung = schadenmeldungAendern.schadenmeldungPerNummerLiefern(schadennummer);
			
			 System.out.println("Geben Sie die neuen Daten für die Schadenmeldung ein:");

	            System.out.println("Schadenmeldungstag (TT):");
	            String tag = sc.next();
	            schadenmeldung.setSchadenmeldungsTag(tag);
	            
	            System.out.println("Schadenmeldungsmonat (MM):");
	            String monat = sc.next();
	            schadenmeldung.setSchadenmeldungsMonate(monat);
	            
	            System.out.println("Schadenmeldungsjahr (JJJJ):");
	            String jahr = sc.next();
	            schadenmeldung.setSchadenmeldungsJahr(jahr);
	            
	            System.out.println("Schadenhöhe :");
	            double schadenshoehe = sc.nextDouble();
	            schadenmeldung.setSchadenshoehe(schadenshoehe);
	            
	            System.out.println("Schadenstatus (z.B. 'offen', 'in_bearbeitung', 'abgeschlossen'): ");
	            String statusInput = sc.next();
	            schadenmeldung.setSchadensstatus(statusInput);
	            
	            schadenmeldungAendern.schadenmeldungAendern(schadenmeldung);
   
		}

	}

	// Versichertenverwaltung --> Versicherten anzeigen

	IServiceVersichertenAnzeigen versichrtenAnzeigen = AppServiceVersichertenAnzeigen.getInstance();

	private String versichertenregi() {
		versichrtenAnzeigen.versichertenAnzeigen();
		System.out.println("Wählen Sie eine Kunde durch die Versicherter.Nr: ");
		String verscihertennummerEingabe = sc.next();
		System.out.println("eingegebene Nummer: " + verscihertennummerEingabe);
		String nummer = versichrtenAnzeigen.versicherterPerNummerAnzeigen(verscihertennummerEingabe)
				.getVersicherternummer();
		return nummer;

	}

}
