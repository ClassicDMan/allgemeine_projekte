package kern.policeverwaltung.innensicht.useCases;

import kern.policeverwaltung.aussensicht.IPoliceInformationenLiefern;
import kern.policeverwaltung.aussensicht.IPoliceSuchen;
import kern.policeverwaltung.aussensicht.IPolicedatenPflegen;
import kern.policeverwaltung.aussensicht.IPolicenSuchen;
import kern.policeverwaltung.aussensicht.IPoliceverwaltungFactory;
import kern.policeverwaltung.aussensicht.IVersichertenRegistrieren;

public class PoliceverwaltungFactory implements IPoliceverwaltungFactory {
	
	public IPolicedatenPflegen getPolicedatenPflegen() {
		return new PolicedatenPflegen();
	}

	@Override
	public IPolicenSuchen getPolicenSuchen() {
		return new PolicenSuchen();
	}

	@Override
	public IPoliceSuchen getPoliceSuchen() {
		return new PoliceSuchen();
	}

	@Override
	public IVersichertenRegistrieren getVersichertenRegistrieren() {
		return new VersichertenRegistrieren();
	}

	@Override
	public IPoliceInformationenLiefern getPoliceninformationFuerNr() {
		return new PoliceinformationFuerNr();
	}
	

}


