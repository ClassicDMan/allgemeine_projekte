package kern.versichertenverwaltung.innensicht.useCases;

import kern.versichertenverwaltung.aussensicht.IVersichertenSuchenPerNummer;
import kern.versichertenverwaltung.aussensicht.IVersichertendatenPflegen;
import kern.versichertenverwaltung.aussensicht.IVersichertenverwaltungFactory;

public class VersichertenverwaltungFactory implements IVersichertenverwaltungFactory{

	@Override
	public IVersichertendatenPflegen getVersichertendatenPflegen() {
		return new VersichertendatenPflegen();
	}

	@Override
	public IVersichertenSuchenPerNummer getVersichertenSuchenPerNummer() {
		return new VersichertenSuchen();
	}
	
	

}
