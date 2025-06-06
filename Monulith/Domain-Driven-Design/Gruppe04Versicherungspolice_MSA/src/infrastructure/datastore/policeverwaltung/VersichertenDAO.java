package infrastructure.datastore.policeverwaltung;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import services.policeverwaltung.domain.Versicherten;
import services.policeverwaltung.domain.Versichertennummer;
import services.policeverwaltung.ports.secondary.IVersichertenRepository;

public class VersichertenDAO implements IVersichertenRepository {

	private static VersichertenDAO instance;

	private VersichertenDAO() {
		instance = this;
	}

	public static VersichertenDAO getInstance() {
		return (instance == null ? new VersichertenDAO() : instance);
	}

	public Versichertennummer resultToVersicherten(ResultSet resultSet) {
		Versichertennummer versicherten = new Versichertennummer();
		try {
			String versichertennummer = resultSet.getString("versicherternummer");
			versicherten.setVersicherternummer(versichertennummer);
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
	        String query = "SELECT versicherternummer, vorname, nachname FROM versichertenverwaltung";
	        ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

	        while (resultSet.next()) {
	        	
	            String versicherternummer = resultSet.getString("versicherternummer");
	            String vorname = resultSet.getString("vorname");
	            String nachname = resultSet.getString("nachname");

	            Versicherten versicherter = new Versicherten(
	                new Versichertennummer(versicherternummer),
	                vorname,
	                nachname
	            );

	            versichertenListe.add(versicherter);
	        }
	        resultSet.close();
	        Persistence.commitConnection(aConnection);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Persistence.closeConnection(aConnection);
	    }

	    return versichertenListe;
	}


	public Versichertennummer getVersichrtenPerNummer(Versichertennummer versichertennummer) {
		Connection aConnection = Persistence.getConnection();
		ResultSet resultSet;
		Versichertennummer versicherter = new Versichertennummer(versichertennummer.getVersicherternummer());
		try {
			// Abfrage für die Policenummer
			String query = "SELECT * FROM versichertenverwaltung WHERE versicherternummer = " + versicherter.getVersicherternummer();
			resultSet = Persistence.executeQueryStatement(aConnection, query);

			if (resultSet.next()) {

				versicherter = this.resultToVersicherten(resultSet);
			}

			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return versicherter;
	}

//	@Override
//	public void versichertenDatenaktualisieren(Police police) {
//	    Connection connection = null;
//
//	    try {
//
//	    	connection = Persistence.getConnection();
//
//	        String versichertennummer = police.getVersicherternummer().getVersicherternummer();
//	        String policenummer = police.getPolicenummer().getPolicenummer();
//
//	        String checkQuery = "SELECT * FROM versichertenverwaltung WHERE versicherternummer = ?";
//	        try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
//	            checkStmt.setString(1, versichertennummer);
//
//	            ResultSet resultSet = checkStmt.executeQuery();
//	            if (resultSet.next()) {
//	                // Versicherternummer existiert, prüfe auf Policennummer
//	                String existingPolicenummer = resultSet.getString("policenummer");
//
//	                if (existingPolicenummer == null || existingPolicenummer.equals(policenummer)) {
//	                    // Policennummer fehlt oder ist anders -> aktualisiere die vorhandene Zeile
//	                    String updateQuery = "UPDATE versichertenverwaltung " +
//	                            "SET policenummer = ?, anzahl_policen = anzahl_policen + 1 " +
//	                            "WHERE versicherternummer = ?";
//	                    try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
//	                        updateStmt.setString(1, policenummer);
//	                        updateStmt.setString(2, versichertennummer);
//	                        updateStmt.executeUpdate();
//
//	                        System.out.println("Versicherternummer " + versichertennummer +
//	                                " wurde aktualisiert: Policennummer hinzugefügt und anzahl_policen erhöht.");
//	                    }
//	                } else {
//
//	                	System.out.println("Policenummer " + policenummer + " ist bereits zugeordnet.");
//	                }
//	            } else {
//
//	            	String insertQuery = "INSERT INTO versichertenverwaltung (versicherternummer, policenummer, anzahl_policen) " +
//	                        "VALUES (?, ?, 1)";
//	                try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
//	                    insertStmt.setString(1, versichertennummer);
//	                    insertStmt.setString(2, policenummer);
//	                    insertStmt.executeUpdate();
//
//	                    System.out.println("Neue Zeile hinzugefügt: Versicherternummer " + versichertennummer +
//	                            ", Policennummer " + policenummer + ", anzahl_policen = 1.");
//	                }
//	            }
//	        }
//
//	        // Transaktion abschließen
//	        Persistence.commitConnection(connection);
//
//	    } catch (SQLException e) {
//	        // Fehlerbehandlung
//	        e.printStackTrace();
//	        System.out.println("Fehler beim Aktualisieren der Versichertenverwaltung.");
//	    } finally {
//	        // Verbindung schließen
//	        if (connection != null) {
//	            Persistence.closeConnection(connection);
//	        }
//	    }
//	}


}
