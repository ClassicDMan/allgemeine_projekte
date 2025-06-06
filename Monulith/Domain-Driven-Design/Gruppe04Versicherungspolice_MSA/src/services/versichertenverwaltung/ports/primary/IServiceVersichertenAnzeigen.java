package services.versichertenverwaltung.ports.primary;

import java.util.Collection;

public interface IServiceVersichertenAnzeigen {
	
	public Collection<VersichertenTO> versichertenAnzeigen();
	public VersichertenummerTO versicherterPerNummerAnzeigen(String versicherternummer);

}
