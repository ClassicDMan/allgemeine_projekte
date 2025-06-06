package kern.produktverwaltung.innensicht.useCases;

import java.util.ArrayList;
import java.util.Collection;

import kern.produktverwaltung.aussensicht.IProduktenSuchen;
import kern.produktverwaltung.aussensicht.ProduktTO;
import kern.produktverwaltung.innensicht.technischesDatenmodell.ProduktEntity;

public class ProduktenSuchen implements IProduktenSuchen {

	@Override
	public Collection<ProduktTO> produktenSuchenPerAttribut(ProduktTO sucheproduktTO) {
		ProduktManager einProduktManager = new ProduktManager();

		Collection<ProduktEntity> produkteListe = einProduktManager.produktenSuchenPerAttribut(
				sucheproduktTO.getBezeichnung(), sucheproduktTO.getBeschreibung(), sucheproduktTO.getBedingung());
		if (produkteListe.isEmpty()) {
			return new ArrayList<ProduktTO>();
		} else {
			Collection<ProduktTO> produktenListTO = new ArrayList<ProduktTO>();
			for (ProduktEntity einprodukt : produkteListe)
				produktenListTO.add(einprodukt.toTO());
			return produktenListTO;
		}
	}

}
