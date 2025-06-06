package services.policeverwaltung.ports.primary;

import java.util.Collection;

public interface IServicePoliceEntfernen {
	public void policeKuendigen(String policenummer, String versichertennummer);
	public Collection<PoliceTO>policenAnzeigen(String versichertennummer);
	Collection<VersichertenTO> alleVersichertenAnzeigen();

}
