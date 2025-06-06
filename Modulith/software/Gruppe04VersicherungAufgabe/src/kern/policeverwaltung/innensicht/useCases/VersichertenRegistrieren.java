package kern.policeverwaltung.innensicht.useCases;

import kern.policeverwaltung.aussensicht.IVersichertenRegistrieren;
import kern.versichertenverwaltung.aussensicht.IVersichertendatenPflegen;
import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;
import kern.versichertenverwaltung.innensicht.useCases.VersichertenverwaltungFactory;

public class VersichertenRegistrieren implements IVersichertenRegistrieren {
	
	private final IVersichertendatenPflegen versichertendatenPflegen;
	
	public VersichertenRegistrieren() {
        VersichertenverwaltungFactory factory = new VersichertenverwaltungFactory();
        this.versichertendatenPflegen = factory.getVersichertendatenPflegen();
    }

//    @Override
//    public void versichertenHinzufuegen(int versichertennummer) {
//    	
//        // Kommunikation mit der Versicherten-Verwaltung
//        VersichertenManager manager = new VersichertenManager();
//        VersichertendatenEntity versicherterEntity = manager.findeVersichertenNachNummer(versichertennummer);
//
//        if (versicherter != null) {
//            System.out.println("Versicherter mit Nummer " + versichertennummer + " erfolgreich hinzugef�gt.");
//        } else {
//            System.out.println("Versicherter mit Nummer " + versichertennummer + " nicht gefunden.");
//        }
//    }
    
    @Override
    public boolean registriereVersicherten(int policenummer, int versichertennummer) {
        // Erstellt ein leeres TO mit der Versichertennummer
        VersichertendatenTO versichertendatenTO = new VersichertendatenTO();
        versichertendatenTO.setVersichertennummer(versichertennummer);

        // L�dt die Versichertendaten
        boolean geladen = versichertendatenPflegen.versichertendatenLaden(versichertendatenTO);

        if (!geladen) {
            System.out.println("Versicherter mit Nummer " + versichertennummer + " nicht gefunden.");
            return false;
        }

        // Wenn geladen, k�nnen wir hier weitere Logik hinzuf�gen, z. B. mit Policen verbinden
        System.out.println("Versicherter erfolgreich registriert: " + versichertendatenTO);
        return true;
    }
}