package kern.policeverwaltung.innensicht.useCases;

import java.util.ArrayList;
import java.util.Collection;

import kern.policeverwaltung.aussensicht.IPolicenSuchen;
import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;

public class PolicenSuchen implements IPolicenSuchen {

	@Override
	public Collection<PoliceTO> policenSuchenPerAttribut(PoliceTO suchpoliceTO) {
		PoliceManager einPoliceManager = new PoliceManager();
		
		Collection<PoliceEntity> policenListe = einPoliceManager.policeSuchenPerAttribut(
				suchpoliceTO.getVersicherungsart(), suchpoliceTO.getVerBeginnTag(), suchpoliceTO.getVerBeginnMonat(), 
				suchpoliceTO. getVerBeginnJahr(), suchpoliceTO.getVerEndTag(), suchpoliceTO.getVerEndMonat(), 
				suchpoliceTO.getVerEndJahr());
		if (policenListe.isEmpty()) {
			return new ArrayList<PoliceTO>();
		} else {
			Collection<PoliceTO> policenTOliste = new ArrayList<PoliceTO>();
			for (PoliceEntity einpolice : policenListe)
				policenTOliste.add(einpolice.toTO());
			return policenTOliste;
		}
	}
	
	@Override
	public Collection<PoliceTO> PolicenSuchenPerAttributSuchen(PoliceTO suchpoliceTO) {
		PoliceManager einPoliceManager = new PoliceManager();

		Collection<PoliceEntity> policenListe = einPoliceManager.policeSuchenPerAttribut(suchpoliceTO.getPolicenummer());
		if (policenListe.isEmpty()) {
			return new ArrayList<PoliceTO>();
		} else {
			Collection<PoliceTO> policenTOliste = new ArrayList<PoliceTO>();
			for (PoliceEntity einpolice : policenListe)
				policenTOliste.add(einpolice.toTO());
			return policenTOliste;
		}
	}

}
