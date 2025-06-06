package infrastructure.datastore.policeverwaltung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import services.policeverwaltung.domain.Datum;
import services.policeverwaltung.domain.Police;
import services.policeverwaltung.domain.Policenummer;
import services.policeverwaltung.domain.Praeminehoehe;
import services.policeverwaltung.domain.Versichertennummer;
import services.policeverwaltung.domain.Versicherungsarttyp;
import services.policeverwaltung.ports.secondary.IPoliceRepository;

public class PoliceDAO implements IPoliceRepository {

	private static PoliceDAO instance;

	private PoliceDAO() {
		instance = this;
	}

	public static PoliceDAO getInstance() {
		return (instance == null ? new PoliceDAO() : instance);
	}

	@Override
	public boolean policeDatenAnlegen(Police policedaten) {
		Connection connection = null;

		try {
			connection = Persistence.getConnection();

			String insertPolice = "INSERT INTO policeverwaltung ("
					+ "policenummer, versicherungsart, versicherungsbeginnTag, versicherungsbeginnMonat, versicherungsbeginnJahr, "
					+ "versicherungsendeTag, versicherungsendeMonat, versicherungsendeJahr, "
					+ "praemienhoehe, versicherternummer) VALUES ("
					+ policedaten.getPolicenummer().getPolicenummer().toString() + ", " + "'"
					+ policedaten.getVersicherungsart().toString() + "', " + "'"
					+ policedaten.getVersicherungsbeginn().getTag() + "', " + "'"
					+ policedaten.getVersicherungsbeginn().getMonat() + "', " + "'"
					+ policedaten.getVersicherungsbeginn().getJahr() + "', " + "'"
					+ policedaten.getVersicherungsende().getTag() + "', " + "'"
					+ policedaten.getVersicherungsende().getMonat() + "', " + "'"
					+ policedaten.getVersicherungsende().getJahr() + "', "
					+ policedaten.getPraemienhoehe().getPraemienhoehe() + ", "
					+ policedaten.getVersicherternummer().getVersicherternummer() + ")";

			Persistence.executeUpdateStatement(connection, insertPolice);
			Persistence.commitConnection(connection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(connection);
		}
		return true;

	}

	@Override
	public Collection<Police> getAllePolicen() {

		Connection aConnection = Persistence.getConnection();
		Collection<Police> policeListe = new ArrayList<>();

		try {
			String query = "SELECT * FROM policeverwaltung";
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			// Ergebnis verarbeiten
			while (resultSet.next()) {
				System.out.println("Policen gefunden: " + resultSet.getInt("policenummer"));
				policeListe.add(resultToPolice(resultSet));
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		if (policeListe.isEmpty()) {
			System.out.println("Keine Policen gefunden.");
		} else {
			System.out.println("Policen gefunden");
			for (Police police : policeListe) {
				System.out.println("Police.Nr:" + "\t" + police.getPolicenummer().getPolicenummer() + "\t"
						+ ",Versicherungsart:" + "\t" + police.getVersicherungsart().toString() + "\t\t"
						+ ",Versichertennummer:" + "\t" + police.getVersicherternummer().getVersicherternummer()
						+ "\t\t" + "Schadenmeldungen: " + "\t" + police.getSchaden().size());
			}
		}
		return policeListe;

	}

	@Override
	public Collection<Police> checkAllePolicen() {

		Connection aConnection = Persistence.getConnection();
		Collection<Police> policeListe = new ArrayList<>();

		try {
			String query = "SELECT * FROM policeverwaltung";
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			// Ergebnis verarbeiten
			while (resultSet.next()) {
				policeListe.add(resultToPolice(resultSet));
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		if (policeListe.isEmpty()) {
			System.out.println("...");
		} else {

		}
		return policeListe;

	}

	public Police resultToPolice(ResultSet resultSet) {
		Police police = new Police();
		try {

			police.setPolicenummer(new Policenummer(resultSet.getString("policenummer")));
			police.setVersicherungsart(Versicherungsarttyp.fromString(resultSet.getString("versicherungsart")));
			police.setVersicherungsbeginn(new Datum(resultSet.getString("versicherungsbeginnTag"),
					resultSet.getString("versicherungsbeginnMonat"), resultSet.getString("versicherungsbeginnJahr")));
			police.setVersicherungsende(new Datum(resultSet.getString("versicherungsendeTag"),
					resultSet.getString("versicherungsendeMonat"), resultSet.getString("versicherungsendeJahr")));
			police.setPraemienhoehe(new Praeminehoehe(resultSet.getString("praemienhoehe")));
			Versichertennummer versichertennummer = new Versichertennummer(resultSet.getString("versicherternummer"));
			police.setVersicherternummer(versichertennummer);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return police;
	}

	@Override
	public boolean policeLoeschen(Police police) {
	    Connection connection = null;

	    try {
	        connection = Persistence.getConnection();

	        String deleteSchadenmeldungen = "DELETE FROM schadenmeldungsverwaltung WHERE policenummer = ?";
	        PreparedStatement deleteSchadenStmt = connection.prepareStatement(deleteSchadenmeldungen);
	        deleteSchadenStmt.setString(1, police.getPolicenummer().getPolicenummer());
	        deleteSchadenStmt.executeUpdate();

	        String deletePolice = "DELETE FROM policeverwaltung WHERE policenummer = ?";

	        PreparedStatement preparedStatement = connection.prepareStatement(deletePolice);

	        preparedStatement.setString(1, police.getPolicenummer().getPolicenummer());

	        // Ausführen des Statements
	        int rowsAffected = preparedStatement.executeUpdate();

	        // Überprüfen, ob die Löschung erfolgreich war
	        if (rowsAffected > 0) {
	            System.out.println("Die Police mit der Nummer " + police.getPolicenummer().getPolicenummer()
	                    + " wurde erfolgreich gelöscht.");
	        } else {
	            System.out.println("Die Police mit der Nummer " + police.getPolicenummer().getPolicenummer()
	                    + " konnte nicht gefunden werden.");
	        }

	        Persistence.commitConnection(connection);

	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Persistence.closeConnection(connection);
	    }
	    return true;
	}

	@Override
	public Collection<Police> suchePolice(String versichertennummer) {

		Connection aConnection = Persistence.getConnection();
		Collection<Police> policeListe = new ArrayList<>();

		try {
			String query = "SELECT * FROM policeverwaltung where versicherternummer =" + versichertennummer;
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			while (resultSet.next()) {
				policeListe.add(resultToPolice(resultSet));
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		if (policeListe.isEmpty()) {

		} else {
			System.out.println("Policen gefunden:");
			System.out.printf("%-15s %-20s %-20s\n", "Police.Nr", "Versich_sart", "Versicherter.Nr");
			System.out.println("-------------------------------------------------------------");
			for (Police police : policeListe) {
				System.out.printf("%-15s %-20s %-20s\n", police.getPolicenummer().getPolicenummer(),
						police.getVersicherungsart().toString(),
						police.getVersicherternummer().getVersicherternummer());
			}

		}
		return policeListe;

	}


}
