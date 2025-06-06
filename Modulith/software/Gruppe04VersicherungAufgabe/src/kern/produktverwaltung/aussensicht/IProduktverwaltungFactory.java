package kern.produktverwaltung.aussensicht;


public interface IProduktverwaltungFactory {
	
	IProduktdatenPflegen getProduktdatenPflegen();
	IProduktenSuchen getProduktenSuchen();


}
