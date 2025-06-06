package kern.versichertenverwaltung.aussensicht;

public interface IVersichertenverwaltungFactory {
	IVersichertendatenPflegen getVersichertendatenPflegen();
	IVersichertenSuchenPerNummer getVersichertenSuchenPerNummer();
}
