package kern.policeverwaltung.innensicht.useCases;

import kern.policeverwaltung.aussensicht.IPolicedatenPflegen;
import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;
import kern.policeverwaltung.innensicht.technischesDatenmodell.types.Datum;
import kern.policeverwaltung.innensicht.technischesDatenmodell.types.VersicherungsartTyp;

public class PolicedatenPflegen implements IPolicedatenPflegen {

	public PolicedatenPflegen() {
	}

	public boolean policedatenValidieren(PoliceManager policeManager, int policenummer, String versicherungsart,
			String verBeginnTag, String verBeginnMonat, String verBeginnJahr, String verEndTag, String verEndMonat,
			String verEndJahr, double praemienhoehe, boolean istAktiv, int versichertennummer) {

		if (policeManager.istPoliceVorhanden(new PoliceEntity(policenummer, versicherungsart, verBeginnTag, verBeginnMonat,
				verBeginnJahr, verEndTag, verEndMonat, verEndJahr, praemienhoehe, istAktiv, versichertennummer))) {
			System.out.println("Eine Police mit den gleichen Daten existiert bereits. System setzt einen Polcenummer Automatisch ein");
			return false;
		}

		return true;
	}

	@Override
	public boolean policeAnlegen(PoliceTO policeTO) {
		PoliceManager policeManager = new PoliceManager();
//		int nextPolicenummer = policeManager.naechstePolicenummerErmitteln();
//		policeTO.setPolicenummer(nextPolicenummer);

//		policeManager.policeHinzufuegen(policeTO.toEntity());

		if (this.policedatenValidieren(policeManager, policeTO.getPolicenummer(), policeTO.getVersicherungsart(),
				policeTO.getVerBeginnTag(), policeTO.getVerBeginnMonat(), policeTO.getVerBeginnJahr(),
				policeTO.getVerEndTag(), policeTO.getVerEndMonat(), policeTO.getVerEndJahr(),
				policeTO.getPraemienhoehe(), policeTO.getIstAktiv(), policeTO.getVersicherternummer())) {

			int max = policeManager.naechstePolicenummerErmitteln();

			policeManager.policeHinzufuegen(new PoliceEntity(max , policeTO.getVersicherungsart(),
					policeTO.getVerBeginnTag(), policeTO.getVerBeginnMonat(), policeTO.getVerBeginnJahr(),
					policeTO.getVerEndTag(), policeTO.getVerEndMonat(), policeTO.getVerEndJahr(),
					policeTO.getPraemienhoehe(), policeTO.getIstAktiv(), policeTO.getVersicherternummer()));
			return true;
		} else {
			policeManager.policeHinzufuegen(policeTO.toEntity());
			return false;
		}
	}

	public boolean istLoeschbar(PoliceTO policeTO) {
		if (policeTO == null)
			return false;
		else if (!policeTO.getSchaden().isEmpty())
			return false;
		else {
			return true;
		}
	}

	@Override
	public boolean policeLoeschen(int policenummer) {

		PoliceManager policeManager = new PoliceManager();
		PoliceEntity police = policeManager.policeSuchenPerNr(policenummer);
		PoliceTO policeTO = police.toTO();

		if (istLoeschbar(policeTO)) {
			policeManager.policeEntfernen(police);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean policeAendern(PoliceTO policeTO) {
		PoliceManager policeManager = new PoliceManager();

		PoliceEntity police = (PoliceEntity) policeManager.policeSuchenPerNr(policeTO.getPolicenummer());
		if (police == null)
			return false;
		else {
			try {
				// Umwandlung der Versicherungsart von String zu Enum
				VersicherungsartTyp versicherungsart = VersicherungsartTyp.fromString(policeTO.getVersicherungsart());
				police.setVersicherungsart(versicherungsart);
			} catch (IllegalArgumentException e) {
				System.err.println("Ungültige Versicherungsart: " + policeTO.getVersicherungsart());
				return false;
			}
			
			
			police.setVersicherungsbeginnDatum(
					new Datum(policeTO.getVerBeginnTag(), policeTO.getVerBeginnMonat(), policeTO.getVerBeginnJahr()));
			police.setVersicherungsendeDatum(
					new Datum(policeTO.getVerEndTag(), policeTO.getVerEndMonat(), policeTO.getVerEndJahr()));
			police.setPraemienhoehe(policeTO.getPraemienhoehe());
			
			police.setIstAktiv(policeTO.getIstAktiv());
			police.setVersicherternummer(policeTO.getVersicherternummer());
			policeManager.policeAendern(police);

			return true;
		}
	}

}
