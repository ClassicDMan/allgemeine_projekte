package kern.versichertenverwaltung.innensicht.useCases;

import java.util.Collection;

import kern.versichertenverwaltung.aussensicht.IVersichertendatenPflegen;
import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;
import kern.versichertenverwaltung.innensicht.technischesDatenmodell.VersichertendatenEntity;

public class VersichertendatenPflegen implements IVersichertendatenPflegen {

	@Override
	public boolean versichertendatenLaden(VersichertendatenTO versichertendatenTO) {
		VersichertenManager manager = new VersichertenManager();
		
		manager.versichertendatenLaden(versichertendatenTO.toEntity());
		
		System.out.println();
		return true;
	}

	@Override
	public boolean alleVersichertenAnzeigen() {

		VersichertenManager manager = new VersichertenManager();
		Collection<VersichertendatenEntity> versicherte = manager.alleVersichertenAnzeigen();

		if (versicherte.isEmpty()) {
			System.out.println("Keine Versicherten gefunden.");
			return false;
		} else {
			System.out.println("Versicherten gefunden");
			for (VersichertendatenEntity versicherter : versicherte) {
				System.out.println("Ver.Nr:" + "\t" + versicherter.getVersichertennummer() + "\t" + ",Vorname:" + "\t"
						+ versicherter.getVorname() + "\t\t" + ",Nachname:" + "\t" + versicherter.getNachname());
			}
			return true;
		}

	}

	@Override
	public boolean versichertenSuchenPerNummer(int versichertenNummer) {
		VersichertenManager manager = new VersichertenManager();
		
		VersichertendatenEntity entity = manager.versicherterSuchenPerNr(versichertenNummer);
		VersichertendatenTO verTO = entity.toTO();
		
		System.out.println("Versicherternummer " + verTO.getVersichertennummer() +  " ausgewählt, die Name lautet" + verTO.getVorname() + " " +  verTO.getNachname());
		
		manager.versicherterSuchenPerNr(versichertenNummer);
		return true;
	}

}
