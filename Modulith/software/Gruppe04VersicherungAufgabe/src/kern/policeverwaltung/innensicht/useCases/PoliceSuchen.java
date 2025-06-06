package kern.policeverwaltung.innensicht.useCases;

import kern.policeverwaltung.aussensicht.IPoliceSuchen;
import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;

public class PoliceSuchen implements IPoliceSuchen{

	public PoliceTO policeSuchenPerNr(int policenummer) {

		PoliceManager policeManager = new PoliceManager();

		PoliceEntity police = policeManager.policeSuchenPerNr(policenummer);
		if (police == null) {
			return null;
		} else {
			return police.toTO();
		}
	}
}
