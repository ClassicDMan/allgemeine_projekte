package infrastructure.datastore.policeverwaltung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import services.policeverwaltung.domain.Policenummer;
import services.policeverwaltung.domain.Schadenmeldung;
import services.policeverwaltung.domain.Schadennummer;
import services.policeverwaltung.domain.Versichertennummer;
import services.policeverwaltung.ports.secondary.ISchadenmeldungRepository;

public class SchadenmeldungDAO implements ISchadenmeldungRepository{
	
private static SchadenmeldungDAO instance;
	
	private SchadenmeldungDAO() {
		instance = this;
	}
	
	public static SchadenmeldungDAO getInstance() {
		return(instance == null? new SchadenmeldungDAO(): instance);
	}

	@Override
	public Collection<Schadenmeldung> getAlleSchadenmeldungen() {
	    Collection<Schadenmeldung> schadenmeldungen = new ArrayList<>();
	    Connection connection = null;

	    try {
	        connection = Persistence.getConnection();
	        String query = "SELECT * FROM schadenmeldungsverwaltung";
	        ResultSet resultSet = Persistence.executeQueryStatement(connection, query);

	        while (resultSet.next()) {
	            String schadennummer = resultSet.getString("schadennummer");
	            String begruendung = resultSet.getString("schadenbegruendung");
	            String status = resultSet.getString("schadensstatus");
	            String police = resultSet.getString("policenummer");
	            String versicherter = resultSet.getString("versicherternummer");

	            // Hier könntest du ggf. weitere Felder wie Vorname, Nachname und Versicherungsart abrufen,
	            // falls diese Informationen aus anderen Tabellen hinzugefügt werden sollen.

	            Schadenmeldung schadenmeldung = new Schadenmeldung(
	                new Schadennummer(schadennummer),
	                begruendung,
	                status,
	                new Policenummer(police),
	                new Versichertennummer(versicherter)
	            );

	            schadenmeldungen.add(schadenmeldung);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        if (connection != null) {
	            Persistence.closeConnection(connection);
	        }
	    }

	    return schadenmeldungen;
	}

	@Override
	public void policeAktualisieren(String schadennummer, String policenummer, String schadensstatus) {
		
		Connection connection = null;
	    Collection<Schadenmeldung> gefundeneSchadenmeldungen = new ArrayList<>();
	    
	    try {
	        connection = Persistence.getConnection();
	        
	        String selectQuery = "SELECT * FROM schadenmeldungsverwaltung WHERE policenummer = ?";
	        try (PreparedStatement selectStmt = connection.prepareStatement(selectQuery)) {
	            selectStmt.setString(1, policenummer);
	            ResultSet resultSet = selectStmt.executeQuery();

	            while (resultSet.next()) {
	                String gefundeneSchadennummer = resultSet.getString("schadennummer");
	                String schadenbegruendung = resultSet.getString("schadenbegruendung");
	                String alterSchadensstatus = resultSet.getString("schadensstatus");
	                String altePolicenummer = resultSet.getString("policenummer");
	                String versichertennummer = resultSet.getString("versicherternummer");

	                Schadenmeldung schadenmeldung = new Schadenmeldung(
	                    new Schadennummer(gefundeneSchadennummer),
	                    schadenbegruendung,
	                    alterSchadensstatus,
	                    new Policenummer(altePolicenummer),
	                    new Versichertennummer(versichertennummer)
	                );

	                gefundeneSchadenmeldungen.add(schadenmeldung);
	            }
	        }

	        if (!gefundeneSchadenmeldungen.isEmpty()) {
	            // Es gibt nur eine Schadenmeldung in der Collection aufgrund der Sicherheitsprüfung
	            Schadenmeldung schadenmeldung = gefundeneSchadenmeldungen.iterator().next();

	            // Update durchführen
	            String updateQuery = "UPDATE schadenmeldungsverwaltung SET schadennummer = ?, schadensstatus = ? WHERE policenummer = ? AND versicherternummer = ?";
	            try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
	                updateStmt.setString(1, schadennummer); 
	                updateStmt.setString(2, schadensstatus); 
	                updateStmt.setString(3, policenummer);   
	                updateStmt.setString(4, schadenmeldung.getVersichertennummer().getVersicherternummer());
	                int rowsAffected = updateStmt.executeUpdate();

	                if (rowsAffected > 0) {
	                    System.out.println("Schadenmeldung erfolgreich aktualisiert.");
	                } else {
	                    System.out.println("Fehler beim Aktualisieren der Schadenmeldung.");
	                }
	            }
	        } else {
	            // Schritt 3: Eintrag einfügen, wenn keine Schadenmeldung gefunden wurde
	            String insertQuery = "INSERT INTO schadenmeldungsverwaltung (schadennummer, schadensstatus, policenummer) VALUES (?, ?, ?)";
	            try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
	                insertStmt.setString(1, schadennummer);  
	                insertStmt.setString(2, schadensstatus);
	                insertStmt.setString(3, policenummer);

	                insertStmt.executeUpdate();
	                System.out.println("Schadenmeldung erfolgreich in die Tabelle eingefügt.");
	            }
	        }

	        Persistence.commitConnection(connection);

	    } catch (SQLException e) {
	        System.err.println("Fehler beim Aktualisieren der Schadenmeldungen: " + e.getMessage());
	        e.printStackTrace();
	    } finally {
	        if (connection != null) {
	            Persistence.closeConnection(connection);
	        }
	    }
		
	}

	@Override
	public void aktualisieren(String policenummer, String schadennummer, String schadensstatus, String schadenbegruendung) {
	    Connection aConnection = Persistence.getConnection();
	    
	    try {
	        // SQL-UPDATE-Abfrage
	        String query = "UPDATE schadenmeldungsverwaltung " +
	                       "SET schadenbegruendung = ?, schadensstatus = ? " +
	                       "WHERE policenummer = ? AND schadennummer = ?";

	        PreparedStatement preparedStatement = aConnection.prepareStatement(query);
	        preparedStatement.setString(1, schadenbegruendung); 
	        preparedStatement.setString(2, schadensstatus);     
	        preparedStatement.setString(3, policenummer);     
	        preparedStatement.setString(4, schadennummer);     

	        // Ausführen des Updates
	        int rowsUpdated = preparedStatement.executeUpdate();

	        if (rowsUpdated > 0) {
	            System.out.println("Schadenmeldung erfolgreich aktualisiert für Policenummer: " + policenummer + " und Schadennummer: " + schadennummer);
	        } else {
	            System.out.println("Keine Schadenmeldung gefunden oder Aktualisierung fehlgeschlagen.");
	        }

	        Persistence.commitConnection(aConnection);
	    } catch (SQLException e) {
	        System.err.println("Fehler beim Aktualisieren der Schadenmeldung: " + e.getMessage());
	    } finally {
	        Persistence.closeConnection(aConnection);
	    }
	}



}
