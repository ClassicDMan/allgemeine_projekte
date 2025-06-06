package persistence.produktverwaltung.aussensicht;

import java.util.Collection;
import kern.produktverwaltung.aussensicht.ProduktTO;

public interface IProduktverwaltungDAO {

	public ProduktTO produktdatenSuchenPerNummer(int produktnummer);

	public void produktdatenLoeschen(ProduktTO produktTO);

	public Collection<ProduktTO> produktdatenSuchenPerAttribut(ProduktTO produktTO);

}
