package infrastructure.datastore.benutzerverwaltung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import services.benutzerverwaltung.domain.Benutzer;
import services.benutzerverwaltung.domain.BenutzerId;
import services.benutzerverwaltung.ports.secondary.IBenutzerRepository;

public class BenutzerDAO implements IBenutzerRepository {
	private static BenutzerDAO instance;

	private BenutzerDAO() {
		instance = this;
	}

	public static BenutzerDAO getInstance() {
		return (instance == null ? new BenutzerDAO() : instance);
	}

	@Override
	public Benutzer getBenutzerById(BenutzerId benutzerid) {
		Benutzer benutzer = null;
		Connection connection = null;

		try {
			connection = Persistence.getConnection();

			String query = "SELECT * FROM benutzerverwaltung WHERE benutzerid = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, benutzerid.getID());

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
	            benutzer = new Benutzer();
				String vorname = rs.getString("vorname");
				String nachname = rs.getString("nachname");
				String typ = rs.getString("typ");
				String passwort = rs.getString("passwort");

				benutzer.setBenutzerid(benutzerid);
				benutzer.setVorname(vorname);
				benutzer.setNachname(nachname);
				benutzer.setTyp(typ);
				benutzer.setPasswort(passwort);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(connection);
		}

		return benutzer;
	}

	@Override
	public Benutzer benutzerdatenRegistrieren(BenutzerId benutzerId, String vorname, String nachname, String typ,
			String passwort) {

		Benutzer benutzer = null;
		Connection connection = null;

		try {
			connection = Persistence.getConnection();
			String query = "INSERT INTO benutzerverwaltung (benutzerid, vorname, nachname, typ, passwort) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, benutzerId.getID());
			stmt.setString(2, vorname);
			stmt.setString(3, nachname);
			stmt.setString(4, typ);
			stmt.setString(5, passwort);

			// Ausführen der SQL-Abfrage
			int rowsInserted = stmt.executeUpdate();

			if (rowsInserted > 0) {
				benutzer = new Benutzer();
				benutzer.setBenutzerid(benutzerId);
				benutzer.setVorname(vorname);
				benutzer.setNachname(nachname);
				benutzer.setTyp(typ);
				benutzer.setPasswort(passwort);
				Persistence.commitConnection(connection);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(connection);
		}

		return benutzer;

	}
}
