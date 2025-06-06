package kern.versichertenverwaltung.innensicht.useCases;

import java.util.ArrayList;
import java.util.Collection;

import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;
import kern.versichertenverwaltung.innensicht.technischesDatenmodell.VersichertendatenEntity;
import persistence.versichertenverwaltung.aussensicht.IVersichertenverwaltungDAO;
import persistence.versichertenverwaltung.aussensicht.VersichertenverwaltungDAOFactory;

public class VersichertenManager {

	private IVersichertenverwaltungDAO einDatenverwalter;

	public VersichertenManager() {
		VersichertenverwaltungDAOFactory versichertenverwaltungDAOFactory = new VersichertenverwaltungDAOFactory();
		einDatenverwalter = versichertenverwaltungDAOFactory.getVersichertenverwaltungDAO();

	}

	public VersichertendatenTO versichertendatenLaden(VersichertendatenEntity versichertendatenEntity) {
		return this.einDatenverwalter.versichertendatenSuchenPerNummer(versichertendatenEntity.getVersichertennummer());

	}

	public Collection<VersichertendatenEntity> alleVersichertenAnzeigen() {

		Collection<VersichertendatenEntity> ergebnisliste = new ArrayList<>();
//		Collection<VersichertendatenTO> alleVersichertenTOs = einDatenverwalter.alleVersichertendatenAnzeigen();

		for (VersichertendatenTO versichertenTO : this.einDatenverwalter.alleVersichertendatenAnzeigen())
			ergebnisliste.add(versichertenTO.toEntity());

		System.out.println("Gefundene Versicherte: " + ergebnisliste.size());
		return ergebnisliste;

	}

	public VersichertendatenEntity versicherterSuchenPerNr(int versicherternummer) {

		VersichertendatenTO versicherterTO;

		versicherterTO = this.einDatenverwalter.versichertendatenSuchenPerNummer(versicherternummer);

		if (versicherterTO == null) {
			return null;
		} else {
			return versicherterTO.toEntity();
		}

	}

}
