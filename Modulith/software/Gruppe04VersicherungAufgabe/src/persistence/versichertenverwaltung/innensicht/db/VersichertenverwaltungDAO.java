package persistence.versichertenverwaltung.innensicht.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;
import persistence.versichertenverwaltung.aussensicht.IVersichertenverwaltungDAO;

public class VersichertenverwaltungDAO implements IVersichertenverwaltungDAO {

	public VersichertendatenTO resultToVersichertenTO(ResultSet resultSet) {
		VersichertendatenTO versichertenTO = new VersichertendatenTO();
		try {
			versichertenTO.setVersichertennummer(resultSet.getInt("versicherternummer"));
			versichertenTO.setVorname(resultSet.getString("vorname"));
			versichertenTO.setNachname(resultSet.getString("nachname"));
			versichertenTO.setOrt(resultSet.getString("ort"));
			versichertenTO.setPlz(resultSet.getString("plz"));
			versichertenTO.setStrasse(resultSet.getString("strasse"));
			versichertenTO.setStrassenNummer(resultSet.getString("strassenNummer"));
			versichertenTO.setEmailAdresse(resultSet.getString("emailAdresse"));
			versichertenTO.setTelefonnummer(resultSet.getString("telefonnummer"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return versichertenTO;
	}

	@Override
	public Collection<VersichertendatenTO> alleVersichertendatenAnzeigen() {
		Connection aConnection = Persistence.getConnection();
		Collection<VersichertendatenTO> versichertenTOListe = new ArrayList<>();

		try {
			String query = "SELECT * FROM versichertenverwaltung"; // SQL-Abfrage
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			// Ergebnis verarbeiten
			while (resultSet.next()) {
				System.out.println("Versicherter gefunden: " + resultSet.getInt("versicherternummer"));
				versichertenTOListe.add(resultToVersichertenTO(resultSet));
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}
		return versichertenTOListe;
	}

	@Override
	public VersichertendatenTO versichertendatenSuchenPerNummer(int versichertennummer) {
		Connection aConnection = Persistence.getConnection();
		VersichertendatenTO versichertenTO = null;

		try {
			String query = "SELECT * FROM versichertenverwaltung WHERE versicherternummer = " + versichertennummer;
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			if (resultSet.next()) {
				versichertenTO = resultToVersichertenTO(resultSet);
			}
			resultSet.close();
			Persistence.commitConnection(aConnection);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return versichertenTO;
	}

}
