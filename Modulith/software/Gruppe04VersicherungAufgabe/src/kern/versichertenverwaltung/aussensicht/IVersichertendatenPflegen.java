package kern.versichertenverwaltung.aussensicht;

public interface IVersichertendatenPflegen {
	public boolean versichertendatenLaden(VersichertendatenTO versichertedatenTO);
	public boolean alleVersichertenAnzeigen ();
	public boolean versichertenSuchenPerNummer(int versichertenNummer);
	
	
	
//	public boolean versichertendatenAnzeigen(VersichertendatenTO versichertedatenTO);
}
