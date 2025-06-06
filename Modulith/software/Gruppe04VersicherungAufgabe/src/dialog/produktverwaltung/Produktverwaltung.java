package dialog.produktverwaltung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

import kern.produktverwaltung.aussensicht.IProduktdatenPflegen;
import kern.produktverwaltung.aussensicht.IProduktenSuchen;
import kern.produktverwaltung.aussensicht.IProduktverwaltungFactory;
import kern.produktverwaltung.aussensicht.ProduktTO;
import kern.produktverwaltung.innensicht.useCases.ProduktverwaltungFactory;

public class Produktverwaltung {

	private static Scanner scanner = new Scanner(System.in);

	public static void Dialog_hauptmenue() {
		int auswahl = 0;

		do {
			System.out.println("\n\n -- Versicherungsanwendung - Produktverwaltung");
			System.out.println("=========================");
			System.out.println("1 - Produkt anlegen");
			System.out.println("2 - Produkt löschen");
			System.out.println("3 - Produkt ändern");
			System.out.println("4 - Produkt suchen");

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
				System.out.println("... end");
				break;
			case 2:
				Dialog_produktLoeschen();
				break;
			case 3:
				System.out.println("... end");
				break;
			case 4:
				System.out.println("... end");
				break;
			case 5:
				break;
			default:
				System.out.println("ungültige Eingabe");
			}
		} while (auswahl != 5);

	}

	private static void Dialog_produktLoeschen() {

		int produktnummer = Subdialog_produktSuchen();

		IProduktverwaltungFactory pvFactory = new ProduktverwaltungFactory();
		IProduktdatenPflegen produktepflegen = pvFactory.getProduktdatenPflegen();

		boolean loeschbar = produktepflegen.produktLoeschen(produktnummer);
		if (!loeschbar) {
			System.err.println("Produkt kann nich gelöscht werden");
		}

	}

	private static int Subdialog_produktSuchen() {

		String bezeichnung, beschreibung, bedingung;

		System.out.println("Suchkriterien für Produkten eingeben (* = Wildcardt):");
		System.out.print("Bezeichnung: " + "\t");
		bezeichnung = scanner.next();
		System.out.print("Beschreibung: " + "\t");
		beschreibung = scanner.next();
		System.out.print("Bedingung: " + "\t");
		bedingung = scanner.next();

		if (bezeichnung.equals("*"))
			bezeichnung = "";
		if (beschreibung.equals("*"))
			beschreibung = "";
		if (bedingung.equals("*"))
			bedingung = "";

		IProduktverwaltungFactory pvFactory = new ProduktverwaltungFactory();
		IProduktenSuchen produktSuchen = pvFactory.getProduktenSuchen();

		Collection<ProduktTO> produkten = new ArrayList<ProduktTO>();
		ProduktTO sucheProduktTO = new ProduktTO();

		sucheProduktTO.setBezeichnung(bezeichnung);
		sucheProduktTO.setBeschreibung(beschreibung);
		sucheProduktTO.setBedingung(bedingung);
		produkten = produktSuchen.produktenSuchenPerAttribut(sucheProduktTO);

		if (produkten.isEmpty()) {
			System.out.println("Keine Treffer gefunden.");
			return 0;
		}

		System.out.println("Treffer:");
		int index = 0;

		System.out.printf("%-5s | %-20s | %-30s | %-12s | %-12s%n", "Nr.", "Produktnummer", "Bezeichnung", "Bedingung",
				"Beschreibung");
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		for (ProduktTO produktTO : produkten) {
			System.out.printf("%-5s | %-20s | %-30s | %-12s | %-12s%n", index + 1, produktTO.getProduktnummer(),
					produktTO.getBezeichnung(), produktTO.getBedingung(), produktTO.getBeschreibung());
			index++;
		}

		System.out.print("\nTreffer Nummer auswählen: ");
		int auswahl = scanner.nextInt(); // Eingabe der Treffer-Nummer

		index = 1;
		for (ProduktTO produktTO : produkten) {
			if (auswahl == index) {
				return produktTO.getProduktnummer(); // Gibt die Produktnummer des ausgewählten Produkts zurück
			} else {
				index++;
			}
		}

		System.out.println("Ungültige Auswahl.");
		return 0;

	}

}
