package infrastructure.datastore.versichertenverwaltung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import services.versichertenverwaltung.domain.CountPolice;
import services.versichertenverwaltung.domain.Versicherten;
import services.versichertenverwaltung.domain.Versichertennummer;
import services.versichertenverwaltung.ports.secondary.IVersichertenRepository;

public class VersichertenDAO implements IVersichertenRepository {

	private static VersichertenDAO instance;

	private VersichertenDAO() {
		instance = this;
	}

	public static VersichertenDAO getInstance() {
		return (instance == null ? new VersichertenDAO() : instance);
	}

	public Versicherten resultToVersicherten(ResultSet resultSet) {
		Versicherten versicherten = new Versicherten();
		try {
			String versichertennummer = resultSet.getString("versicherternummer");
			versicherten.setVersichertennummer(new Versichertennummer(versichertennummer));
			versicherten.setVorname(resultSet.getString("vorname"));
			versicherten.setNachname(resultSet.getString("nachname"));
			versicherten.setOrt(resultSet.getString("ort"));
			versicherten.setPlz(resultSet.getString("plz"));
			versicherten.setStrasse(resultSet.getString("strasse"));
			versicherten.setStrassenNummer(resultSet.getString("strassenNummer"));
			versicherten.setEmailAdresse(resultSet.getString("emailAdresse"));
			versicherten.setTelefonnummer(resultSet.getString("telefonnummer"));
			int zahl = resultSet.getInt("anzahl_policen");
			versicherten.setCount(new CountPolice(zahl));			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return versicherten;
	}
	
	@Override
	public Collection<Versicherten> getAlleVersicherten() {

	    Connection aConnection = Persistence.getConnection();
	    Collection<Versicherten> versichertenListe = new ArrayList<>();

	    try {
	        String query = "SELECT * FROM versichertenverwaltung"; // SQL-Abfrage
	        ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

	        while (resultSet.next()) {
	            versichertenListe.add(resultToVersicherten(resultSet));
	        }
	        resultSet.close();
	        Persistence.commitConnection(aConnection);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Persistence.closeConnection(aConnection);
	    }

	    if (versichertenListe.isEmpty()) {
	        System.out.println("Keine Versicherten gefunden.");
	    } else {
	        System.out.println();
	        
	        System.out.printf("%-20s %-20s %-20s %-20s\n", "Versicherten.Nr", "Vorname", "Nachname", "Anzahl der Policen");
	        System.out.println("--------------------------------------------------------------------------------");
	        
	        for (Versicherten versicherter : versichertenListe) {
	            System.out.printf("%-20s %-20s %-20s %-20s\n", 
	                versicherter.getVersichertennummer().getVersicherternummer(), 
	                versicherter.getVorname(), 
	                versicherter.getNachname(),
	                versicherter.getCount().getCount());
	        }
	    }

	    return versichertenListe;
	}


	public Versicherten getVersichrtenPerNummer(String versichertennummer) {
		Connection aConnection = Persistence.getConnection();
		ResultSet resultSet;
		Versicherten versicherten = new Versicherten();
		try {
			String query = "SELECT * FROM versichertenverwaltung WHERE versicherternummer = " + versichertennummer;
			resultSet = Persistence.executeQueryStatement(aConnection, query);

			if (resultSet.next()) {

				versicherten = this.resultToVersicherten(resultSet);
			}

			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return versicherten;
	}

	@Override
	public void aktualisieren(String versicherternummer) {
	    Connection connection = null;

	    try {
	        // Verbindung zur Datenbank herstellen
	        connection = Persistence.getConnection();

	        String updateVersicherterQuery = "UPDATE versichertenverwaltung SET anzahl_policen = anzahl_policen + 1 WHERE versicherternummer = ?";

	        try (PreparedStatement stmt = connection.prepareStatement(updateVersicherterQuery)) {
	            stmt.setString(1, versicherternummer);

	            stmt.executeUpdate();

	            Persistence.commitConnection(connection);

	            System.out.println("Anzahl der Policen für versicherternummer " + versicherternummer + " erfolgreich erhöht.");
	        }
	    } catch (SQLException e) {
	        System.err.println("Fehler beim Aktualisieren der versicherten Daten: " + e.getMessage());
	        e.printStackTrace();
	    } finally {
	        if (connection != null) {
	            Persistence.closeConnection(connection);
	        }
	    }
	}

	@Override
	public void versichertenAktualisieren(String policenummer, String versicherternummer) {
		Connection connection = null;

	    try {
	        connection = Persistence.getConnection();

	        String updateVersicherterQuery = "UPDATE versichertenverwaltung SET anzahl_policen = anzahl_policen - 1 WHERE versicherternummer = ?";

	        // PreparedStatement Object excuteUpdate gibt int zurück
	        try (PreparedStatement stmt = connection.prepareStatement(updateVersicherterQuery)) {
	            stmt.setString(1, versicherternummer); // Versichertennummer setzen

	            int rowsAffected = stmt.executeUpdate();

	            if (rowsAffected > 0) {
	                System.out.println("Anzahl der Policen für versicherternummer " + versicherternummer + " erfolgreich verringert.");
	            } else {
	                System.out.println("Kein Versicherter mit der versicherternummer " + versicherternummer + " gefunden.");
	            }

	            Persistence.commitConnection(connection);

	        }
	    } catch (SQLException e) {
	        System.err.println("Fehler beim Aktualisieren der versicherten Daten: " + e.getMessage());
	        e.printStackTrace();
	    } finally {
	        // Verbindung schließen
	        if (connection != null) {
	            Persistence.closeConnection(connection);
	        }
	    }
		
	}




}
