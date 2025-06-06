package kern.produktverwaltung.innensicht.useCases;

import java.util.ArrayList;
import java.util.Collection;

import kern.produktverwaltung.aussensicht.ProduktTO;
import kern.produktverwaltung.innensicht.technischesDatenmodell.ProduktEntity;
import persistence.produktverwaltung.aussensicht.IProduktverwaltungDAO;
import persistence.produktverwaltung.aussensicht.ProduktverwaltungDAOFactory;

public class ProduktManager {

	private IProduktverwaltungDAO einDatenverwalter;

	public ProduktManager() {
		ProduktverwaltungDAOFactory produktverwaltungDAOFactory = new ProduktverwaltungDAOFactory();
		einDatenverwalter = produktverwaltungDAOFactory.getProduktverwaltungDAO();
	}

	public void produktEntfernen(ProduktEntity produkt) {
		this.einDatenverwalter.produktdatenLoeschen(produkt.toTO());
	}

	public Collection<ProduktEntity> produktenSuchenPerAttribut(String bezeichnung, String beschreibung,
			String bedingung) {

		Collection<ProduktEntity> ergebnisliste = new ArrayList<ProduktEntity>();

		ProduktTO sucheProduktTO = new ProduktTO();

		sucheProduktTO.setBezeichnung(bezeichnung);
		sucheProduktTO.setBeschreibung(beschreibung);
		sucheProduktTO.setBedingung(bedingung);

		for (ProduktTO produktTO : this.einDatenverwalter.produktdatenSuchenPerAttribut(sucheProduktTO)) {
			ergebnisliste.add(produktTO.toEntity());
		}

		return ergebnisliste;
	}

	public Collection<ProduktEntity> produktenSuchenPerAttribut(int produktnummer) {
		Collection<ProduktEntity> ergebnisliste = new ArrayList<ProduktEntity>();

		ProduktTO suchProduktTO = new ProduktTO();
		suchProduktTO.setProduktnummer(produktnummer);

		suchProduktTO = this.einDatenverwalter.produktdatenSuchenPerNummer(produktnummer);

		for (ProduktTO produktTO : this.einDatenverwalter.produktdatenSuchenPerAttribut(suchProduktTO))
			ergebnisliste.add(produktTO.toEntity());

		return ergebnisliste;
	}
	
	public ProduktEntity produkteSuchenPerNr(int produktnummer) {

		ProduktTO produktTO;

		produktTO = this.einDatenverwalter.produktdatenSuchenPerNummer(produktnummer);

		if (produktTO == null)
			return null;
		else
			return produktTO.toEntity();
	}

}
