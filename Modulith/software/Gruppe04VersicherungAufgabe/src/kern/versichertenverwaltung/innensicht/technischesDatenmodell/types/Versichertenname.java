package kern.versichertenverwaltung.innensicht.technischesDatenmodell.types;

public class Versichertenname {
	private String vorname;
	private String nachname;
	public Versichertenname(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	// Rekonstruktion aus SQL-kompatiblen String
    public static Versichertenname fromSQLString(String sqlString) {
        String[] parts = sqlString.split(";");
        if (parts.length == 2) {
            return new Versichertenname(parts[0], parts[1]); // Vorname und Nachname trennen
        }
        throw new IllegalArgumentException("Ungültiges Format für Versichertenname: " + sqlString);
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
	
}
