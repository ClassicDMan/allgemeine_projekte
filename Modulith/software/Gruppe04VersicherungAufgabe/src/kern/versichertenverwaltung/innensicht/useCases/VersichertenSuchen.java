package kern.versichertenverwaltung.innensicht.useCases;

import kern.versichertenverwaltung.aussensicht.IVersichertenSuchenPerNummer;
import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;
import kern.versichertenverwaltung.innensicht.technischesDatenmodell.VersichertendatenEntity;

public class VersichertenSuchen implements IVersichertenSuchenPerNummer {

	@Override
	public VersichertendatenTO versichertenSuchenPerNummer(int versichertennummer) {
		VersichertenManager versichertenManager = new VersichertenManager();

		VersichertendatenEntity versicherter = versichertenManager.versicherterSuchenPerNr(versichertennummer);
		if (versicherter == null) {
			return null;
		} else {
			return versicherter.toTO();
		}

	}

}
