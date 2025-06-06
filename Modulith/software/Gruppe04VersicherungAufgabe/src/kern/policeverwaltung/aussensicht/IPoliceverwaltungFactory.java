package kern.policeverwaltung.aussensicht;

public interface IPoliceverwaltungFactory {
	IPolicedatenPflegen getPolicedatenPflegen();
	IPolicenSuchen getPolicenSuchen();
	IPoliceSuchen getPoliceSuchen();
	IVersichertenRegistrieren getVersichertenRegistrieren();
	IPoliceInformationenLiefern getPoliceninformationFuerNr();
	
}
