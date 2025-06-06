package dialog.policeverwaltung;

import kern.policeverwaltung.aussensicht.IPoliceSuchen;
//import kern.policeverwaltung.aussensicht.IPoliceSuchen;
import kern.policeverwaltung.aussensicht.IPolicedatenPflegen;
import kern.policeverwaltung.aussensicht.IPolicenSuchen;
import kern.policeverwaltung.aussensicht.IPoliceverwaltungFactory;
import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;
import kern.policeverwaltung.innensicht.technischesDatenmodell.types.VersicherungsartTyp;
import kern.policeverwaltung.innensicht.useCases.PoliceverwaltungFactory;
import kern.versichertenverwaltung.aussensicht.IVersichertendatenPflegen;
import kern.versichertenverwaltung.aussensicht.IVersichertenverwaltungFactory;
import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;
import kern.versichertenverwaltung.innensicht.useCases.VersichertenverwaltungFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Policeverwaltung {

	private static Scanner scanner = new Scanner(System.in);

	public static void Dialog_hauptmenue() {
		int auswahl = 0;
		

		do {
			System.out.println("\n\n -- Versicherungsanwendung - Policeverwaltung");
			System.out.println("=========================");
			System.out.println("1 - Police anlegen");
			System.out.println("2 - Police löschen");
			System.out.println("3 - Police ändern");
			System.out.println("4 - Police suchen");

			System.out.println("5 - zurück zum Hauptmenü");

			try {
				System.out.print("\n Auswahl: ");
				auswahl = scanner.nextInt();
			} catch (InputMismatchException e) {
				auswahl = 0;
				scanner.next();
			}

			switch (auswahl) {
			case 1:
				Dialog_policeAnlegen();
				break;
			case 2:
				Dialog_policeKuendigen();
				break;
			case 3:
				Dialog_policeAendern();
				break;
			case 4:
				Dialog_policeSuchen();
				break;
			case 5:
				;
				break;
			default:
				System.out.println("ungültige Eingabe");
			}
		} while (auswahl != 5);

	}

	public static void Dialog_policeSuchen() {
//		char charpolicenummer;
//		Integer intVal;
//		int policenummer;
		String versicherungsart, versicherungsbeginnTag, versicherungsbeginnMonat, versicherungsbeginnJahr;
		String versicherungsendeTag, versicherungsendeMonat, versicherungsendeJahr;
//		double praemienhoehe;
//		boolean istAktiv;

		System.out.println("Suchkriterien für die Police eingeben (* = Wildcard):");
//		System.out.print("Policenummer: ");
//		charpolicenummer = scanner.next().charAt(0);
//		intVal = (int) charpolicenummer;
//		policenummer = intVal;
//		System.out.print("Versicherungsart: Auswahlmöglichkeiten (kfz, haftpflicht, hausrat) oder *:  ");
		versicherungsart = scanner.next();
		System.out.print("Versicherungsbeginn (Tag) oder *: ");
		versicherungsbeginnTag = scanner.next();
		System.out.print("Versicherungsbeginn (Monat) oder *: ");
		versicherungsbeginnMonat = scanner.next();
		System.out.print("Versicherungsbeginn Jahr: Form JJJJ eingeben:   ");
		versicherungsbeginnJahr = scanner.next();
		System.out.print("Versicherungsende (Tag) oder *: ");
		versicherungsendeTag = scanner.next();
		System.out.print("Versicherungsende (Monat) oder *: ");
		versicherungsendeMonat = scanner.next();
		System.out.print("Versicherungsende (Jahr) oder *: ");
		versicherungsendeJahr = scanner.next();

//		System.out.print("Prämienhöhe: ");
//		praemienhoehe = scanner.nextDouble();
//		System.out.print("istAktiv: ");
//		intEingabe = scanner.nextInt();
//		if(intEingabe != 0 && intEingabe != 1) {
//		    throw new IllegalArgumentException("Ungültige Eingabe! Bitte nur 1 oder 0 eingeben.");
//		}
//		istAktiv = intEingabe == 1;

		// Wildcardbehandlung

		if (versicherungsart.equals("*"))
			versicherungsart = "";
		if (versicherungsbeginnTag.equals("*"))
			versicherungsbeginnTag = "";
		if (versicherungsbeginnMonat.equals("*"))
			versicherungsbeginnMonat = "";
		if (versicherungsbeginnJahr.equals("*"))
			versicherungsbeginnJahr = "";
		if (versicherungsendeTag.equals("*"))
			versicherungsendeTag = "";
		if (versicherungsendeMonat.equals("*"))
			versicherungsendeMonat = "";
		if (versicherungsendeJahr.equals("*"))
			versicherungsendeJahr = "";
//		if (istAktiv.equals("*"))
//			versicherungsendeJahr = "";

		
		IPoliceverwaltungFactory pvFactory = new PoliceverwaltungFactory();
		IPolicenSuchen policenSuchen = pvFactory.getPolicenSuchen();

		PoliceTO suchPoliceTO = new PoliceTO();
//		suchPoliceTO.setPolicenummer(policenummer);
		suchPoliceTO.setVersicherungsart(versicherungsart);
		suchPoliceTO.setVerBeginnTag(versicherungsbeginnTag);
		suchPoliceTO.setVerBeginnMonat(versicherungsbeginnMonat);
		suchPoliceTO.setVerBeginnJahr(versicherungsbeginnJahr);
		suchPoliceTO.setVerEndTag(versicherungsendeTag);
		suchPoliceTO.setVerEndMonat(versicherungsendeMonat);
		suchPoliceTO.setVerEndJahr(versicherungsendeJahr);
//		suchPoliceTO.setPraemienhoehe(praemienhoehe);
//		suchPoliceTO.setIstAktiv(istAktiv);

		Collection<PoliceTO> policen = new ArrayList<PoliceTO>();

		policen = policenSuchen.policenSuchenPerAttribut(suchPoliceTO);

		if (policen.isEmpty()) {
			System.out.println("Keine Police gefunden.");
			return;
		}

		// Anzeige der Suchergebnisse
		System.out.println("Treffer:");

//		for (PoliceTO police : policen) {
//			System.out.print(police.getPolicenummer() + " " + police.getVersicherungsart() + " "
//					+ police.getVerBeginnTag() + "." + police.getVerBeginnMonat() + "." + police.getVerBeginnJahr()
//					+ " - " + police.getVerEndTag() + "." + police.getVerEndMonat() + "." + police.getVerEndJahr() + " "
//					+ police.getPraemienhoehe() + " " + (police.getIstAktiv() ? "Aktiv" : "Inaktiv") + " "
//					+ police.getVersicherternummer() + " ");
//			System.out.println();
//		}
		int index = 0;
		System.out.printf(
				"%-5s | %-20s | %-17s | %-12s | %-12s | %-12s | %-12s | %-12s | %-12s | %-17s | %-8s | %-20s%n", "Nr.",
				"Policenummer", "Versicherungsart", "Beginn Tag", "Beginn Monat", "Beginn Jahr", "Ende Tag",
				"Ende Monat", "Ende Jahr", "Prämienhöhe", "Aktiv", "Versichertennummer");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		for (PoliceTO policeTO : policen) {
			System.out.printf(
					"%-5s | %-20s | %-17s | %-12s | %-12s | %-12s | %-12s | %-12s | %-12s | %-17.2f | %-8s | %-20s%n",
					index + 1, policeTO.getPolicenummer(), policeTO.getVersicherungsart(), policeTO.getVerBeginnTag(),
					policeTO.getVerBeginnMonat(), policeTO.getVerBeginnJahr(), policeTO.getVerEndTag(),
					policeTO.getVerEndMonat(), policeTO.getVerEndJahr(), policeTO.getPraemienhoehe(),
					policeTO.getIstAktiv() ? "Aktiv" : "Inaktiv", policeTO.getVersicherternummer());
			index++;
		}

		return;

	}

	private static void Dialog_policeAendern() {

		int policenummer = Subdialog_policesuchen();

		if (policenummer != 0) {
			Policedaten policedaten = Subdialog_policedatenEingeben();

			IPoliceverwaltungFactory pvFactory = new PoliceverwaltungFactory();
			IPoliceSuchen policeSuchen = pvFactory.getPoliceSuchen();
			IPolicedatenPflegen policepflegen = pvFactory.getPolicedatenPflegen();

			PoliceTO policeTO = policeSuchen.policeSuchenPerNr(policenummer);

			policeTO.setPolicenummer(policenummer);
			policeTO.setVersicherungsart(policedaten.versicherungsart);
			policeTO.setVerBeginnTag(policedaten.verBeginnTag);
			policeTO.setVerBeginnMonat(policedaten.verBeginnMonat);
			policeTO.setVerBeginnJahr(policedaten.verBeginnJahr);
			policeTO.setVerEndTag(policedaten.verEndTag);
			policeTO.setVerEndMonat(policedaten.verEndMonat);
			policeTO.setVerEndJahr(policedaten.verEndJahr);
			policeTO.setPraemienhoehe(policedaten.praemienhoehe);
			policeTO.setIstAktiv(policedaten.istAktiv);

			policepflegen.policeAendern(policeTO);

		}

	}

	public static class Policedaten {
//		private int policenummer;
		private String versicherungsart;
		private String verBeginnTag;
		private String verBeginnMonat;
		private String verBeginnJahr;
		private String verEndTag;
		private String verEndMonat;
		private String verEndJahr;
		private double praemienhoehe;
		private boolean istAktiv;

	}

	public static class Versichertendaten {
		private int versichertennummer;
	}

	private static void Dialog_policeAnlegen() {

		boolean ok;

		System.out.println("\n--- Neue Police anlegen ---" + "\n");

		IPoliceverwaltungFactory pvFactory = new PoliceverwaltungFactory();
		IPolicedatenPflegen policepflegen = pvFactory.getPolicedatenPflegen();

		IVersichertenverwaltungFactory vvfactory = new VersichertenverwaltungFactory();
		IVersichertendatenPflegen versichertepflegen = vvfactory.getVersichertendatenPflegen();

//		VersichertendatenTO versichertenTO = new VersichertendatenTO();
//		versichertenTO.setVersichertennummer(versicherterdaten.versichertennummer);

		System.out.println("Alle Versicherten:\n");
		ok = versichertepflegen.alleVersichertenAnzeigen();
		if (ok) {
			System.out.println("Versicherten auswählen!!");
		}else {
			System.out.println("es gibt keinen Versicherten");
		}

		Versichertendaten versicherterdaten = Subdialog_versicherterdatenEingeben();
		VersichertendatenTO versicherter = new VersichertendatenTO();
		versicherter.setVersichertennummer(versicherterdaten.versichertennummer);
		
		
		ok = versichertepflegen.versichertendatenLaden(versicherter);
		

		Policedaten policedaten = Subdialog_policedatenEingeben();

		PoliceTO policeTO = new PoliceTO();
		policeTO.setVersicherungsart(policedaten.versicherungsart);
		policeTO.setVerBeginnTag(policedaten.verBeginnTag);
		policeTO.setVerBeginnMonat(policedaten.verBeginnMonat);
		policeTO.setVerBeginnJahr(policedaten.verBeginnJahr);
		policeTO.setVerEndTag(policedaten.verEndTag);
		policeTO.setVerEndMonat(policedaten.verEndMonat);
		policeTO.setVerEndJahr(policedaten.verEndJahr);
		policeTO.setPraemienhoehe(policedaten.praemienhoehe);
		policeTO.setIstAktiv(policedaten.istAktiv);
		policeTO.setVersicherternummer(versicherter.getVersichertennummer());

		ok = policepflegen.policeAnlegen(policeTO);

		if (!ok) {
			System.out.println("Police kann nicht angelegt werden");
		}

	}

	private static Versichertendaten Subdialog_versicherterdatenEingeben() {

		System.out.println("Wählen Sie einen Versicherten per Versichertennummer aus");

		Versichertendaten versicherter = new Versichertendaten();
		System.out.println("Versichertennummer:        ");

		int auswahl = scanner.nextInt();
		versicherter.versichertennummer = auswahl;

		return versicherter;
	}

	public static void Dialog_policeKuendigen() {

		int policenummer = Subdialog_policesuchen();

		IPoliceverwaltungFactory pvFactory = new PoliceverwaltungFactory();
		IPolicedatenPflegen policepflegen = pvFactory.getPolicedatenPflegen();

		boolean löschbar = policepflegen.policeLoeschen(policenummer);
		if (!löschbar)
			System.out.println("Police kann nicht gelöscht werden");
	}

	private static int Subdialog_policesuchen() {
		String versicherungsart, verBeginnTag, verBeginnMonat, verBeginnJahr, verEndTag, verEndMonat, verEndJahr;
		double praemienhoehe;

		System.out.println("Suchkriterien für Policen eingeben (* = Wildcard, -1 für nicht relevant):");
		System.out.print("Versicherungsart: Auswahlmöglichkeiten (kfz, haftpflicht, hausrat) oder *:  ");
		versicherungsart = scanner.next();
		System.out.print("Versicherungsbeginn (Tag) oder *: ");
		verBeginnTag = scanner.next();
		System.out.print("Versicherungsbeginn (Monat) oder *: ");
		verBeginnMonat = scanner.next();
		System.out.print("Versicherungsbeginn (Jahr) oder *: ");
		verBeginnJahr = scanner.next();
		System.out.print("Versicherungsende (Tag) oder *: ");
		verEndTag = scanner.next();
		System.out.print("Versicherungsende (Monat) oder *: ");
		verEndMonat = scanner.next();
		System.out.print("Versicherungsende (Jahr) oder *: ");
		verEndJahr = scanner.next();
		System.out.print("Prämienhöhe (-1 für nicht relevant): ");
		praemienhoehe = scanner.nextDouble();
//		System.out.print("Ist aktiv (true/false): ");
//		String aktivInput = scanner.next();
//		istAktiv = aktivInput.equals("*") ? false : Boolean.parseBoolean(aktivInput);

		// Fehelr
		if (versicherungsart.equals("*"))
			versicherungsart = "";
		if (verBeginnTag.equals("*"))
			verBeginnTag = "";
		if (verBeginnMonat.equals("*"))
			verBeginnMonat = "";
		if (verBeginnJahr.equals("*"))
			verBeginnJahr = "";
		if (verEndTag.equals("*"))
			verEndTag = "";
		if (verEndMonat.equals("*"))
			verEndMonat = "";
		if (verEndJahr.equals("*"))
			verEndJahr = "";
		if (praemienhoehe == -1)
			praemienhoehe = 0;

		IPoliceverwaltungFactory pvFactory = new PoliceverwaltungFactory();
		IPolicenSuchen policensuchen = pvFactory.getPolicenSuchen();
		Collection<PoliceTO> policen = new ArrayList<PoliceTO>();

		PoliceTO suchPoliceTO = new PoliceTO();
		suchPoliceTO.setVersicherungsart(versicherungsart);
		suchPoliceTO.setVerBeginnTag(verBeginnTag);
		suchPoliceTO.setVerBeginnMonat(verBeginnMonat);
		suchPoliceTO.setVerBeginnJahr(verBeginnJahr);
		suchPoliceTO.setVerEndTag(verEndTag);
		suchPoliceTO.setVerEndMonat(verEndMonat);
		suchPoliceTO.setVerEndJahr(verEndJahr);
		suchPoliceTO.setPraemienhoehe(praemienhoehe);

		policen = policensuchen.policenSuchenPerAttribut(suchPoliceTO);

		if (policen.isEmpty()) {
			System.out.println("Keine Treffer gefunden.");
			return 0;
		}

		System.out.println("Treffer:");
		int index = 0;

		System.out.printf(
				"%-5s | %-20s | %-17s | %-12s | %-12s | %-12s | %-12s | %-12s | %-12s | %-17s | %-8s | %-20s%n", "Nr.",
				"Policenummer", "Versicherungsart", "Beginn Tag", "Beginn Monat", "Beginn Jahr", "Ende Tag",
				"Ende Monat", "Ende Jahr", "Prämienhöhe", "Aktiv", "Versichertennummer");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		for (PoliceTO policeTO : policen) {
			System.out.printf(
					"%-5s | %-20s | %-17s | %-12s | %-12s | %-12s | %-12s | %-12s | %-12s | %-17.2f | %-8s | %-20s%n",
					index + 1, policeTO.getPolicenummer(), policeTO.getVersicherungsart(), policeTO.getVerBeginnTag(),
					policeTO.getVerBeginnMonat(), policeTO.getVerBeginnJahr(), policeTO.getVerEndTag(),
					policeTO.getVerEndMonat(), policeTO.getVerEndJahr(), policeTO.getPraemienhoehe(),
					policeTO.getIstAktiv() ? "Aktiv" : "Inaktiv", policeTO.getVersicherternummer());
			index++;
		}

		System.out.print("\nTreffer Nummer auswählen: ");
		int auswahl = scanner.nextInt(); 

		index = 0;
		for (PoliceTO policeTO : policen) {
			if (auswahl == index + 1) {
				return policeTO.getPolicenummer();
			} else {
				index++;
			}
		}

		System.out.println("Ungültige Auswahl.");
		return 0;

	}

	private static Policedaten Subdialog_policedatenEingeben() {

		Policedaten policedaten = new Policedaten();
//		System.out.print("Policenummer:        ");
//		policedaten.policenummer = scanner.nextInt();
		System.out.println("1- KFZ,\n" + "2- HAFTPFLICHT,\r\n" + "3- HAUSRAT;");
		System.out.print("Auswahl: ");
		int auswahl = scanner.nextInt();
		switch (auswahl) {
		case 1:
			VersicherungsartTyp typ = VersicherungsartTyp.KFZ;
			policedaten.versicherungsart = typ.toString();
			break;
		case 2:
			VersicherungsartTyp typ2 = VersicherungsartTyp.HAFTPFLICHT;
			policedaten.versicherungsart = typ2.toString();
			break;
		case 3:
			VersicherungsartTyp typ3 = VersicherungsartTyp.HAUSRAT;
			policedaten.versicherungsart = typ3.toString();
			break;
		}
		System.out.println("Versicherungsart:    " + auswahl + "\n");
		System.out.print("Versicherungsbeginn - Tag:    ");
		policedaten.verBeginnTag = scanner.next();
		System.out.print("Versicherungsbeginn - Monat:    ");
		policedaten.verBeginnMonat = scanner.next();
		System.out.print("Versicherungsbeginn - Jahr:    ");
		policedaten.verBeginnJahr = scanner.next();
		System.out.print("Versicherungsende - Tag:     ");
		policedaten.verEndTag = scanner.next();
		System.out.print("Versicherungsende - Monat:   ");
		policedaten.verEndMonat = scanner.next();
		System.out.print("Versicherungsende - Jahr:    ");
		policedaten.verEndJahr = scanner.next();
		System.out.print("Prämienhöhe:         ");
		policedaten.praemienhoehe = scanner.nextDouble();
		System.out.print("Ist die Police aktiv? 1 oder 2" + "\t" + "(1- Aktiv / 2- Inaktiv)?" + "\t");
		auswahl = scanner.nextInt();
		switch (auswahl) {
		case 1:
			policedaten.istAktiv = true;
			break;
		case 2:
			policedaten.istAktiv = false;
			break;
		default:
			System.out.println("Ungültige Eingabe, die Police wird auf inaktiv gesetzt.");
			policedaten.istAktiv = false;
		}

		return policedaten;

	}

}
