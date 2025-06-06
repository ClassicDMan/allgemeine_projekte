package kern.produktverwaltung.innensicht.useCases;

import kern.produktverwaltung.aussensicht.IProduktdatenPflegen;
import kern.produktverwaltung.aussensicht.IProduktenSuchen;
import kern.produktverwaltung.aussensicht.IProduktverwaltungFactory;

public class ProduktverwaltungFactory implements IProduktverwaltungFactory {

    @Override
    public IProduktdatenPflegen getProduktdatenPflegen() {
        return new ProduktdatenPflegen();  
    }

	@Override
	public IProduktenSuchen getProduktenSuchen() {
		return new ProduktenSuchen();
	}

}