package infrastructure.datastore.schadensmeldungsverwaltung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import services.schadensmeldungsverwaltung.domain.Police;
import services.schadensmeldungsverwaltung.domain.Policenummer;
import services.schadensmeldungsverwaltung.domain.Praemienhoehe;
import services.schadensmeldungsverwaltung.domain.Schadennummer;
import services.schadensmeldungsverwaltung.domain.Schadenshoehe;
import services.schadensmeldungsverwaltung.ports.secondary.IPoliceRepository;
import services.schadensmeldungsverwaltung.domain.Versichertennummer;

public class PoliceDAO implements IPoliceRepository {

	private static PoliceDAO instance;

	private PoliceDAO() {
		instance = this;
	}

	public static PoliceDAO getInstance() {
		return (instance == null ? new PoliceDAO() : instance);
	}

	@Override
	public boolean policedatenAktualisieren(Schadennummer schadennummer, Policenummer policenummer, Schadenshoehe schadenshoehe) {
	    Connection aConnection = Persistence.getConnection();
	    boolean success = false;

	    try {

	    	String checkQuery = "SELECT COUNT(*) FROM policeverwaltung WHERE policenummer = ?";
	        PreparedStatement checkStatement = aConnection.prepareStatement(checkQuery);
	        checkStatement.setString(1, policenummer.getPolicenummer());

	        ResultSet resultSet = checkStatement.executeQuery();
	        resultSet.next();
	        boolean exists = resultSet.getInt(1) > 0;
	        resultSet.close();

	        if (exists) {

	        	String updateQuery = "UPDATE policeverwaltung " +
	                                 "SET schadennummer = ? " +
	                                 "WHERE policenummer = ?";
	            PreparedStatement updateStatement = aConnection.prepareStatement(updateQuery);
	            updateStatement.setString(1, schadennummer.getSchadennummer());
	            updateStatement.setString(2, policenummer.getPolicenummer());

	            int rowsUpdated = updateStatement.executeUpdate();
	            success = rowsUpdated > 0;

	            if (success) {
	                System.out.println("Eintrag aktualisiert: Policenummer " + policenummer.getPolicenummer());
	            } else {
	                System.err.println("Aktualisierung fehlgeschlagen für Policenummer: " + policenummer.getPolicenummer());
	            }

	            updateStatement.close();
	        } else {
	        		System.out.println("Schadenmeldung braucht eine Police um angelegt werden zu können!!! ");

	        }

	        Persistence.commitConnection(aConnection);
	    } catch (SQLException e) {
	        System.err.println("Fehler bei der Operation auf der Tabelle 'policeverwaltung': " + e.getMessage());
	    } finally {
	        Persistence.closeConnection(aConnection); 
	    }

	    return success;
	}



	@Override
	public void policedatenLoeschen(String policenummer, String versicherternummer) {
		Connection connection = null;

		try {
			connection = Persistence.getConnection();

			String deleteQuery = "DELETE FROM policeverwaltung WHERE policenummer = ?";

			try (PreparedStatement deleteStmt = connection.prepareStatement(deleteQuery)) {

				deleteStmt.setString(1, policenummer);

				// Ausführung der Löschanfrage
				int rowsAffected = deleteStmt.executeUpdate();

				if (rowsAffected > 0) {
					System.out.println("Eintrag mit Policenummer " + policenummer + " erfolgreich gelöscht.");
				} else {
					System.out.println("Kein Eintrag mit Policenummer " + policenummer + " gefunden.");
				}

				Persistence.commitConnection(connection);
			}
		} catch (SQLException e) {
			System.err.println("Fehler beim Löschen der Daten: " + e.getMessage());
			e.printStackTrace();
		} finally {
			// Verbindung schließen
			if (connection != null) {
				Persistence.closeConnection(connection);
			}
		}

	}

	@Override
	public Collection<Police> getAllePolicen() {
		Connection aConnection = Persistence.getConnection();
		Collection<Police> policeListe = new ArrayList<>();

		try {
			String query = "SELECT policenummer, praemienhoehe, versicherternummer FROM policeverwaltung";
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			while (resultSet.next()) {

				String policenummer = resultSet.getString("policenummer");
				double praemienhoehe = resultSet.getDouble("praemienhoehe");
				String versicherternummer = resultSet.getString("versicherternummer");

				Police police = new Police(new Policenummer(policenummer), new Praemienhoehe(praemienhoehe),
						new Versichertennummer(versicherternummer));

				policeListe.add(police);
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return policeListe;

	}

	public Policenummer resultToPolice(ResultSet resultSet) {
		Policenummer police = new Policenummer();
		try {
			String policenummer = resultSet.getString("policenummer");
			police.setPolicenummer(policenummer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return police;
	}

	@Override
	public Policenummer getPolicePerNummer(Policenummer policenummer) {
		Connection aConnection = Persistence.getConnection();
		ResultSet resultSet;
		Policenummer police = new Policenummer(policenummer.getPolicenummer());
		try {

			String query = "SELECT * FROM policeverwaltung WHERE policenummer = " + policenummer.getPolicenummer();
			resultSet = Persistence.executeQueryStatement(aConnection, query);

			if (resultSet.next()) {

				police = this.resultToPolice(resultSet);
			}

			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return police;
	}

	@Override
	public void speichern(String policenummer, String versicherternummer, String pHoehe) {
	    Connection aConnection = Persistence.getConnection();
	    try {
	        // SQL-Insert-Abfrage
	        String query = "INSERT INTO policeverwaltung (policenummer, versicherternummer, praemienhoehe) VALUES (?, ?, ?)";
	        PreparedStatement preparedStatement = aConnection.prepareStatement(query);
	        
	        // Parameter für das PreparedStatement setzen
	        preparedStatement.setString(1, policenummer);
	        preparedStatement.setString(2, versicherternummer);
	        preparedStatement.setString(3, pHoehe); 
	        
	        // Ausführen des SQL-Befehls
	        int rowsInserted = preparedStatement.executeUpdate();
	        
	        // Erfolgsmeldung
	        if (rowsInserted > 0) {
	            System.out.println("Police erfolgreich gespeichert in SV_DB P: " +
	                "Policenummer: " + policenummer + ", Versicherternummer: " + versicherternummer + ", Praemienhoehe: " + pHoehe);
	        } else {
	            System.out.println("Speichern fehlgeschlagen.");
	        }
	        
	        Persistence.commitConnection(aConnection);
	    } catch (SQLException e) {
	        System.err.println("Fehler beim Speichern der Police: " + e.getMessage());
	    } finally {
	        Persistence.closeConnection(aConnection); // Verbindung schließen
	    }
	}
	
	
	@Override
	public void speichern(String policenummer, double pHoehe) {
	    Connection aConnection = Persistence.getConnection();
	    try {

	    	String checkQuery = "SELECT COUNT(*) FROM policeverwaltung WHERE policenummer = ?";
	        PreparedStatement checkStatement = aConnection.prepareStatement(checkQuery);
	        checkStatement.setString(1, policenummer);
	        
	        ResultSet resultSet = checkStatement.executeQuery();
	        resultSet.next();
	        boolean exists = resultSet.getInt(1) > 0;
	        resultSet.close();

	        if (exists) {

	        	String updateQuery = "UPDATE policeverwaltung SET praemienhoehe = ? WHERE policenummer = ?";
	            PreparedStatement updateStatement = aConnection.prepareStatement(updateQuery);
	            updateStatement.setDouble(1, pHoehe);
	            updateStatement.setString(2, policenummer);

	            int rowsUpdated = updateStatement.executeUpdate();

	            if (rowsUpdated > 0) {
	                System.out.println("Police erfolgreich aktualisiert: Policenummer: " + policenummer + ", Praemienhoehe: " + pHoehe);
	            } else {
	                System.out.println("Aktualisierung fehlgeschlagen für Policenummer: " + policenummer);
	            }

	            updateStatement.close();
	        } 

	        Persistence.commitConnection(aConnection);
	    } catch (SQLException e) {
	        System.err.println("Fehler beim Speichern der Police: " + e.getMessage());
	    } finally {
	        Persistence.closeConnection(aConnection);
	    }
	}



}
