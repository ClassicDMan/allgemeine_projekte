package services.policeverwaltung.ports.secondary;

import java.util.Collection;

import services.policeverwaltung.domain.Schadenmeldung;

public interface ISchadenmeldungRepository {
	Collection <Schadenmeldung> getAlleSchadenmeldungen();

	void policeAktualisieren(String schadennummer, String policenummer, String schadensstatus);
	void aktualisieren(String n, String m, String b, String h);
}
