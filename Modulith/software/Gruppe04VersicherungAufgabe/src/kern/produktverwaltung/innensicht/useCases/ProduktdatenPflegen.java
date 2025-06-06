package kern.produktverwaltung.innensicht.useCases;

import kern.produktverwaltung.aussensicht.IProduktdatenPflegen;
import kern.produktverwaltung.aussensicht.ProduktTO;
import kern.produktverwaltung.innensicht.technischesDatenmodell.ProduktEntity;

public class ProduktdatenPflegen implements IProduktdatenPflegen {

	@Override
	public boolean produktLoeschen(int produktnummer) {

		ProduktManager produktManager = new ProduktManager();
		ProduktEntity produkt = produktManager.produkteSuchenPerNr(produktnummer);
		ProduktTO to = produkt.toTO();

		if (istLoeschbar(to)) {
			produktManager.produktEntfernen(produkt);
			return true;
		} else {
			return false;
		}

	}

	
	public boolean istLoeschbar(ProduktTO produktTO) {
		if (produktTO == null)
			return false;
		else if (!produktTO.getPolicen().isEmpty())
			return false;
		else {
			return true;
		}
	}

}
