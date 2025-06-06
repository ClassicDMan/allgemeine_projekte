package kern.policeverwaltung.aussensicht;

public interface IPolicedatenPflegen {
	public boolean policeAnlegen(PoliceTO policeTO);
	public boolean policeLoeschen(int policenummer);
	public boolean policeAendern(PoliceTO policeTO) ;

}
