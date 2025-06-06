package kern.versichertenverwaltung.innensicht.technischesDatenmodell.types;

public class Adresse {
	private String ort;
    private String plz;
    private String strasse;
    private String strassenNummer;
    
	public Adresse(String ort, String plz, String strasse, String strassenNummer) {
		super();
		this.ort = ort;
		this.plz = plz;
		this.strasse = strasse;
		this.strassenNummer = strassenNummer;
	}
	
	public String getOrt() {
		return ort;
	}
	public String getPlz() {
		return plz;
	}
	public String getStrasse() {
		return strasse;
	}
	public String getStrassenNummer() {
		return strassenNummer;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public void setStrassenNummer(String strassenNummer) {
		this.strassenNummer = strassenNummer;
	}
	
	// Konvertierung in SQL-kompatiblen String
    public String toSQLString() {
        return ort + ";" + plz + ";" + strasse + ";" + strassenNummer; // Trennzeichen ";"
    }

    // Rekonstruktion aus SQL-kompatiblen String
    public static Adresse fromSQLString(String sqlString) {
        String[] parts = sqlString.split(";");
        if (parts.length == 4) {
            return new Adresse(parts[0], parts[1], parts[2], parts[3]);
        }
        throw new IllegalArgumentException("Ungültiges Format für Adresse: " + sqlString);
    }

    @Override
    public String toString() {
        return strasse + " " + strassenNummer + ", " + plz + " " + ort;
    } 
    
}
