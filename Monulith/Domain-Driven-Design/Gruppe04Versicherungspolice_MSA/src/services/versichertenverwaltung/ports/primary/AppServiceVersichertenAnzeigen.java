package services.versichertenverwaltung.ports.primary;

import java.util.ArrayList;
import java.util.Collection;

import infrastructure.datastore.versichertenverwaltung.VersichertenDAO;
import services.versichertenverwaltung.domain.Versicherten;
import services.versichertenverwaltung.domain.Versichertennummer;
import services.versichertenverwaltung.ports.secondary.IVersichertenRepository;

public class AppServiceVersichertenAnzeigen implements IServiceVersichertenAnzeigen{
	
	private static AppServiceVersichertenAnzeigen instance;
	
	private AppServiceVersichertenAnzeigen() {
		instance = this;
	}
	public static AppServiceVersichertenAnzeigen getInstance() {
		return(instance == null? new AppServiceVersichertenAnzeigen(): instance);
	}

	@Override
	public Collection<VersichertenTO> versichertenAnzeigen() {
		Collection<VersichertenTO> ergebinsListe = new ArrayList<>();
		
		IVersichertenRepository versichertenRepository = VersichertenDAO.getInstance();
//		ergebinsListe = versichertenRepository.getAlleVersicherten();
		
		for(Versicherten versicherter: versichertenRepository.getAlleVersicherten())
			ergebinsListe.add(versicherter.toVersichertenTO());
		System.out.println("Gefundene Versicherte: " + ergebinsListe.size()); 
		
		return ergebinsListe;
	}
	
	public VersichertenummerTO versicherterPerNummerAnzeigen(String versicherternummer) {
		
		IVersichertenRepository versichertenRepository = VersichertenDAO.getInstance();
		Versichertennummer versicheter = new Versichertennummer(versicherternummer);
		Versicherten versicherter = versichertenRepository.getVersichrtenPerNummer(versicheter.getVersicherternummer());
		 if (versicherter.equals(null)) {
		        System.out.println("Kein Versicherter gefunden mit der Nummer: " + versicherternummer);
		        return null;
		    }
		 return versicherter.getVersichertennummer().toVersichertennummerTO();
	}

}
