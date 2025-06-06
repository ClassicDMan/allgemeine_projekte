package kern.policeverwaltung.innensicht.useCases;

import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;
import persistence.policeverwaltung.aussensicht.IPoliceverwaltungDAO;
import persistence.policeverwaltung.aussensicht.PoliceverwaltungDAOFactory;
import java.util.ArrayList;
import java.util.Collection;

public class PoliceManager {

	private IPoliceverwaltungDAO einDatenverwalter;

	public PoliceManager() {
		PoliceverwaltungDAOFactory pvDAOFactory = new PoliceverwaltungDAOFactory();
		einDatenverwalter = pvDAOFactory.getKundenverwaltungDAO();

	}

	public void policeHinzufuegen(PoliceEntity police) {
		this.einDatenverwalter.policedatenAnlegen(police.toTO());
	}

	public int naechstePolicenummerErmitteln() {
		Collection<PoliceTO> ergebnisliste = new ArrayList<PoliceTO>();

		PoliceTO suchePoliceTO = new PoliceTO();

		for (PoliceTO policeTO : this.einDatenverwalter.policedatenSuchenPerAttribut(suchePoliceTO))
			ergebnisliste.add(policeTO);

		int max = 0;
		for (PoliceTO policeTO : ergebnisliste)
			if (policeTO.getPolicenummer() > max)
				max = policeTO.getPolicenummer();

		return max + 1;

	}

	public Collection<PoliceEntity> policeSuchenPerAttribut(String versicherungsart,
			String verBeginnTag, String verBeginnMonat, String verBeginnJahr, String verEndTag, String verEndMonat,
			String verEndJahr) {

		Collection<PoliceEntity> ergebnisliste = new ArrayList<PoliceEntity>();

		PoliceTO suchePoliceTO = new PoliceTO();

		suchePoliceTO.setVersicherungsart(versicherungsart);
		suchePoliceTO.setVerBeginnTag(verBeginnTag);
		suchePoliceTO.setVerBeginnMonat(verBeginnMonat);
		suchePoliceTO.setVerBeginnJahr(verBeginnJahr);
		suchePoliceTO.setVerEndTag(verEndTag);
		suchePoliceTO.setVerEndMonat(verEndMonat);
		suchePoliceTO.setVerEndJahr(verEndJahr);
//		suchePoliceTO.setPraemienhoehe(praemienhoehe);
//		suchePoliceTO.setIstAktiv(istAktiv);

		for (PoliceTO policeTO : this.einDatenverwalter.policedatenSuchenPerAttribut(suchePoliceTO))
			ergebnisliste.add(policeTO.toEntity());

		return ergebnisliste;
	}
	
	public Collection<PoliceEntity> policeSuchenPerAttribut(int policenummer) {

		Collection<PoliceEntity> ergebnisliste = new ArrayList<PoliceEntity>();

		PoliceTO suchePoliceTO = new PoliceTO();

		suchePoliceTO.setPolicenummer(policenummer);

		for (PoliceTO policeTO : this.einDatenverwalter.policedatenSuchenPerAttribut(suchePoliceTO))
			ergebnisliste.add(policeTO.toEntity());

		return ergebnisliste;
	}

	public boolean istPoliceVorhanden(PoliceEntity police) {

		if (!this.einDatenverwalter.policedatenSuchenPerAttribut(police.toTO()).isEmpty())
			return true;
		else
			return false;

	}

	public void policeEntfernen(PoliceEntity police) {
		this.einDatenverwalter.policedatenLoeschen(police.toTO());
	}

	public void policeAendern(PoliceEntity police) {
		this.einDatenverwalter.policedatenAendern(police.toTO());
	}

	public PoliceEntity policeSuchenPerNr(int policenummer) {

		PoliceTO policeTO;

		policeTO = this.einDatenverwalter.policedatenSuchenPerNummer(policenummer);

		if (policeTO == null)
			return null;
		else
			return policeTO.toEntity();
	}

}
