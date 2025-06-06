package infrastructure.datastore.schadensmeldungsverwaltung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import services.schadensmeldungsverwaltung.domain.Policenummer;
import services.schadensmeldungsverwaltung.domain.Schadendatum;
import services.schadensmeldungsverwaltung.domain.Schadenmeldung;
import services.schadensmeldungsverwaltung.domain.Schadennummer;
import services.schadensmeldungsverwaltung.domain.Schadenshoehe;
import services.schadensmeldungsverwaltung.domain.Schadensstatus;
import services.schadensmeldungsverwaltung.ports.secondary.ISchadenmeldungRepository;

public class SchadensmeldungDAO implements ISchadenmeldungRepository {

	private static SchadensmeldungDAO instance;

	private SchadensmeldungDAO() {
		instance = this;
	}

	public static SchadensmeldungDAO getInstance() {
		return (instance == null ? new SchadensmeldungDAO() : instance);
	}

	@Override
	public boolean schadenDatenAnlegen(Schadenmeldung schadensdaten) {
		boolean flag = true;
		if(flag) {
			Connection connection = null;

		    try {
		        connection = Persistence.getConnection();

		        // SQL-Abfrage mit Platzhaltern
		        String query = "INSERT INTO schadenmeldungsverwaltung ("
		                + "schadennummer, schadenmeldungstag, schadenmeldungsmonat, schadenmeldungsjahr,"
		                + "schadenshoehe, schadensstatus, policenummer) "
		                + "VALUES (?, ?, ?, ?, ?, ?, ?)";


		        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
		            preparedStatement.setString(1, schadensdaten.getSchadennummer().getSchadennummer()); 
		            preparedStatement.setString(2, schadensdaten.getSchadendatum().getTag());         
		            preparedStatement.setString(3, schadensdaten.getSchadendatum().getMonat());       
		            preparedStatement.setString(4, schadensdaten.getSchadendatum().getJahr());        
		            preparedStatement.setDouble(5, schadensdaten.getSchadenshoehe().getSchadenshoehe()); 
		            preparedStatement.setString(6, schadensdaten.getSchadensstatus().toString());     
		            preparedStatement.setString(7, schadensdaten.getPolice().getPolicenummer());   


		            preparedStatement.executeUpdate();
		        }

		        Persistence.commitConnection(connection);

		    } catch (Exception e) {
		        e.printStackTrace();
		    } finally {
		        if (connection != null) {
		            Persistence.closeConnection(connection);
		        }
		    }

		}else {
			System.out.println("Fehelr DB");
			return false;
		}
	    
	    return flag;
	}
	
	public Schadenmeldung resultToSchadenmeldung(ResultSet resultSet) {
		Schadenmeldung schadenmeldung = new Schadenmeldung();
		
		try {

			schadenmeldung.setSchadennummer(new Schadennummer(resultSet.getString("schadennummer")));
			schadenmeldung.setSchadendatum(new Schadendatum(resultSet.getString("schadenmeldungstag"), resultSet.getString("schadenmeldungsmonat"), resultSet.getString("schadenmeldungsjahr")));
			schadenmeldung.setSchadenshoehe(new Schadenshoehe(resultSet.getDouble("schadenshoehe")));
			schadenmeldung.setSchadensstatus(Schadensstatus.fromString(resultSet.getString("schadensstatus")));
			schadenmeldung.setPolice(new Policenummer(resultSet.getString("policenummer")));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return schadenmeldung;
	}

	@Override
	public Collection<Schadenmeldung> getAlleSchadenmeldungen() {
		
		Connection connection = Persistence.getConnection();
		Collection<Schadenmeldung> schadenListe = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM schadenmeldungsverwaltung ";
			ResultSet resultSet = Persistence.executeQueryStatement(connection, query);

			// Ergebnis verarbeiten
			while (resultSet.next()) {
				schadenListe.add(resultToSchadenmeldung(resultSet));
			}
			resultSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(connection);
		}
		
		if (schadenListe.isEmpty()) {
			System.out.println("Keine Schadenmeldungen gefunden.");
		} else {

			for (Schadenmeldung schadenmeldung : schadenListe) {
				System.out.println("Schadenmeldungen.Nr:" + "\t" + schadenmeldung.getSchadennummer().getSchadennummer()
						+ "\t" + ",Schadenmeldungsstatus:" + "\t" + schadenmeldung.getSchadensstatus().toString() 
						+ "\t\t" + ",zugeordnete Policenummer:" + "\t" + schadenmeldung.getPolice().getPolicenummer());
			}
		}
		return schadenListe;
		
	}

	@Override
	public void schadenDatenAendern(Schadenmeldung schadensdaten) {
	    Connection connection = null;

	    try {
	        // Verbindung zur Datenbank herstellen
	        connection = Persistence.getConnection();

	        // SQL-Update-Anweisung mit Platzhaltern
	        String query = "UPDATE schadenmeldungsverwaltung SET "
	                + "schadenmeldungstag = '" + schadensdaten.getSchadendatum().getTag() + "', "
	                + "schadenmeldungsmonat = '" + schadensdaten.getSchadendatum().getMonat() + "', "
	                + "schadenmeldungsjahr = '" + schadensdaten.getSchadendatum().getJahr() + "', "
	                + "schadenshoehe = " + schadensdaten.getSchadenshoehe().getSchadenshoehe() + ", "
	                + "schadensstatus = '" + schadensdaten.getSchadensstatus().toString() + "', "
	                + "policenummer = '" + schadensdaten.getPolice().getPolicenummer() + "' "
	                + "WHERE schadennummer = '" + schadensdaten.getSchadennummer().getSchadennummer() + "'";

	        Persistence.executeUpdateStatement(connection, query);
	        
	        Persistence.commitConnection(connection);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (connection != null) {
	            Persistence.closeConnection(connection);
	        }
	    }
	}

	@Override
	public Schadenmeldung getSchadenmeldungBySchadennummer(Schadennummer schadenmeldungnummer) {
		Connection connection = Persistence.getConnection();
	    Schadenmeldung schadenmeldung = null;
	    
	    try {
	        String query = "SELECT * FROM schadenmeldungsverwaltung WHERE schadennummer = ?";
	        
	        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	            preparedStatement.setString(1, schadenmeldungnummer.getSchadennummer());
	            ResultSet resultSet = preparedStatement.executeQuery();

	            if (resultSet.next()) {
	                schadenmeldung = resultToSchadenmeldung(resultSet); // Konvertierung von ResultSet zu Schadenmeldung
	            }
	            resultSet.close();
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Persistence.closeConnection(connection);
	    }
	    return schadenmeldung;
	}
	
	@Override
	public Collection<Schadenmeldung> checkAlleSchaden() {

		Connection aConnection = Persistence.getConnection();
		Collection<Schadenmeldung> schadenListe = new ArrayList<>();

		try {
			String query = "SELECT * FROM schadenmeldungsverwaltung";
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			// Ergebnis verarbeiten
			while (resultSet.next()) {
				schadenListe.add(resultToSchadenmeldung(resultSet));
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		if (schadenListe.isEmpty()) {
			System.out.println("...");
		} else {

		}
		return schadenListe;

	}

	@Override
	public void policedatenLoeschen(String policenummer, String versicherternummer) {
	    Connection connection = null;

	    try {
	        connection = Persistence.getConnection();

	        String deleteQuery = "DELETE FROM schadenmeldungsverwaltung WHERE policenummer = ?";

	        try (PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery)) {
	            deleteStmt.setString(1, policenummer);

	            int rowsAffected = deleteStmt.executeUpdate();

	            if (rowsAffected > 0) {
	                System.out.println("Einträge mit Policenummer " + policenummer + " in SV_DB S wurden erfolgreich gelöscht.");
	            } else {
	                System.out.println("Keine Einträge mit Policenummer " + policenummer + " in SV_DB S gefunden.");
	            }

	            Persistence.commitConnection(connection);
	        }
	    } catch (SQLException e) {
	        System.err.println("Fehler beim Löschen der Policendaten: " + e.getMessage());
	        e.printStackTrace();
	    } finally {

	    	if (connection != null) {
	            Persistence.closeConnection(connection);
	        }
	    }
	}


}
