package kern.produktverwaltung.aussensicht;

import java.util.Collection;


public interface IProduktenSuchen {
	public Collection<ProduktTO> produktenSuchenPerAttribut (ProduktTO sucheProduktTO);

}
