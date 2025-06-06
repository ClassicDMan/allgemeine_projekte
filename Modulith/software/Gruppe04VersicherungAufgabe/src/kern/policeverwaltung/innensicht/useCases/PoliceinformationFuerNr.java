package kern.policeverwaltung.innensicht.useCases;

import kern.policeverwaltung.aussensicht.IPoliceInformationenLiefern;
import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;

public class PoliceinformationFuerNr implements IPoliceInformationenLiefern{
	
public PoliceTO policeSuchenByNr(int policenummer) {
		
		PoliceManager policeManager = new PoliceManager();
		
		PoliceEntity einPolice = policeManager.policeSuchenPerNr(policenummer); 
		if (einPolice == null) {
			return null;
		}
		else {
			return einPolice.toTO();
		}
	}


}
