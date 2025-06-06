package kern.policeverwaltung.innensicht.technischesDatenmodell.types;

public class Datum {
    private String tag;
    private String monat;
    private String jahr;

    public Datum(String tag, String monat, String jahr) {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public Datum() {}

    public String getTag() {
        return tag;
    }

    public String getMonat() {
        return monat;
    }

    public String getJahr() {
        return jahr;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setMonat(String monat) {
        this.monat = monat;
    }

    public void setJahr(String jahr) {
        this.jahr = jahr;
    }
    
    public static boolean datumPrüfen(String tag, String monat, String jahr) {
        // Prüfen, ob die Eingaben numerisch sind
        if (!tag.matches("\\d{1,2}") || !monat.matches("\\d{1,2}") || !jahr.matches("\\d{4}")) {
            return false;
        }

        // Konvertieren der Eingaben in Integer
        int tagNummer = Integer.parseInt(tag);
        int monatNummer = Integer.parseInt(monat);
        int jahrNummer = Integer.parseInt(jahr);

        // Monat zwischen 1 und 12
        if (monatNummer < 1 || monatNummer > 12) {
            return false;
        }

        // Tage pro Monat bestimmen
        int[] tageImMonat = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Schaltjahr prüfen für Februar
        if (monatNummer == 2 && (jahrNummer % 400 == 0 || (jahrNummer % 100 != 0 && jahrNummer % 4 == 0))) {
            tageImMonat[1] = 29;
        }

        // Tag muss innerhalb der Grenzen des Monats liegen
        if (tagNummer < 1 || tagNummer > tageImMonat[monatNummer - 1]) {
            return false;
        }

        // Falls alle Prüfungen bestanden sind, ist das Datum gültig
        return true;
    }

    // Methode zur Umwandlung von DatumTO in java.sql.Date
    public java.sql.Date toSQLDate() {
        // Erstelle einen String im Format yyyy-MM-dd
        String dateString = jahr + "-" + monat + "-" + tag;
        
        // Rückgabe des SQL-Datums (stellen Sie sicher, dass das Datum im richtigen Format ist)
        return java.sql.Date.valueOf(dateString); // Hier wird das Datum korrekt konvertiert
    }

    public static Datum fromSQLString(String sqlDate) {
        String[] parts = sqlDate.split("-");
        if (parts.length == 3) {
            return new Datum(parts[2], parts[1], parts[0]); // Datum in Tag, Monat, Jahr aufteilen
        }
        throw new IllegalArgumentException("Ungültiges Datumformat: " + sqlDate);
    }

    public String toSQLString() {
        return jahr + "-" + monat + "-" + tag;
    }

    @Override
    public String toString() {
        return "DatumTO [tag=" + tag + ", monat=" + monat + ", jahr=" + jahr + "]";
    }
}
