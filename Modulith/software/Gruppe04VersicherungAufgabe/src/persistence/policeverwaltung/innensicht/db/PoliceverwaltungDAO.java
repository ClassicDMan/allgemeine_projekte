package persistence.policeverwaltung.innensicht.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import kern.policeverwaltung.aussensicht.PoliceTO;
import persistence.policeverwaltung.aussensicht.IPoliceverwaltungDAO;

public class PoliceverwaltungDAO implements IPoliceverwaltungDAO {

	@Override
	public void policedatenAnlegen(PoliceTO policeTO) {
		Connection connection = null;

		try {
			connection = Persistence.getConnection();


			String insertPolice = "INSERT INTO policeverwaltung ("
					+ "policenummer, versicherungsart, versicherungsbeginnTag, versicherungsbeginnMonat, versicherungsbeginnJahr, "
					+ "versicherungsendeTag, versicherungsendeMonat, versicherungsendeJahr, "
					+ "praemienhoehe, istAktiv, versicherternummer) VALUES (" + policeTO.getPolicenummer() + ", " + "'"
					+ policeTO.getVersicherungsart() + "', " + "'" + policeTO.getVerBeginnTag() + "', " + "'"
					+ policeTO.getVerBeginnMonat() + "', " + "'" + policeTO.getVerBeginnJahr() + "', " + "'"
					+ policeTO.getVerEndTag() + "', " + "'" + policeTO.getVerEndMonat() + "', " + "'"
					+ policeTO.getVerEndJahr() + "', " + policeTO.getPraemienhoehe() + ", "
					+ (policeTO.getIstAktiv() ? "TRUE" : "FALSE") + ", " + policeTO.getVersicherternummer() + ")";

			Persistence.executeUpdateStatement(connection, insertPolice);
			Persistence.commitConnection(connection);

			System.out.println("Police wurde erfolgreich angelegt");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(connection);
		}
	}

	@Override
	public PoliceTO policedatenSuchenPerNummer(int policenummer) {
		Connection aConnection = Persistence.getConnection();
		ResultSet resultSet;
		PoliceTO policeTO = null;
		try {
			// Abfrage für die Policenummer
			String query = "SELECT * FROM policeverwaltung WHERE policenummer = " + policenummer;
			resultSet = Persistence.executeQueryStatement(aConnection, query);

			if (resultSet.next()) {

				policeTO = this.resultToPoliceTO(resultSet);
			}

			resultSet.close();
			Persistence.commitConnection(aConnection);

			} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return policeTO;
	}

	private PoliceTO resultToPoliceTO(ResultSet resultSet) {
		PoliceTO policeTO = new PoliceTO();
		try {
			policeTO.setPolicenummer(resultSet.getInt("POLICENUMMER"));
			policeTO.setVersicherungsart(resultSet.getString("VERSICHERUNGSART"));
			policeTO.setVerBeginnTag(resultSet.getString("VERSICHERUNGSBEGINNTAG"));
			policeTO.setVerBeginnMonat(resultSet.getString("VERSICHERUNGSBEGINNMONAT"));
			policeTO.setVerBeginnJahr(resultSet.getString("VERSICHERUNGSBEGINNJAHR"));
			policeTO.setVerEndTag(resultSet.getString("VERSICHERUNGSENDETAG"));
			policeTO.setVerEndMonat(resultSet.getString("VERSICHERUNGSENDEMONAT"));
			policeTO.setVerEndJahr(resultSet.getString("VERSICHERUNGSENDEJAHR"));
			policeTO.setIstAktiv(resultSet.getBoolean("ISTAKTIV"));
			policeTO.setVersicherternummer(resultSet.getInt("VERSICHERTERNUMMER"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return policeTO;
	}

	@Override
	public Collection<PoliceTO> policedatenSuchenPerAttribut(PoliceTO policeTO) {
		Connection aConnection = Persistence.getConnection();
		Collection<PoliceTO> policeTOListe = new ArrayList<>();

		StringBuilder suchStringBuilder = new StringBuilder();
		
		if (policeTO.getVersicherungsart() != null && !policeTO.getVersicherungsart().isEmpty()) {
			suchStringBuilder.append("versicherungsart = '").append(policeTO.getVersicherungsart()).append("'");
		}
		if (policeTO.getVerBeginnTag() != null && !policeTO.getVerBeginnTag().isEmpty()) {
			appendWithAnd(suchStringBuilder, "versicherungsbeginnTag = '" + policeTO.getVerBeginnTag() + "'");
		}
		if (policeTO.getVerBeginnMonat() != null && !policeTO.getVerBeginnMonat().isEmpty()) {
			appendWithAnd(suchStringBuilder, "versicherungsbeginnMonat = '" + policeTO.getVerBeginnMonat() + "'");
		}
		if (policeTO.getVerBeginnJahr() != null && !policeTO.getVerBeginnJahr().isEmpty()) {
			appendWithAnd(suchStringBuilder, "versicherungsbeginnJahr = '" + policeTO.getVerBeginnJahr() + "'");
		}
		if (policeTO.getVerEndTag() != null && !policeTO.getVerEndTag().isEmpty()) {
			appendWithAnd(suchStringBuilder, "versicherungsEndeTag = '" + policeTO.getVerEndTag() + "'");
		}
		if (policeTO.getVerEndMonat() != null && !policeTO.getVerEndMonat().isEmpty()) {
			appendWithAnd(suchStringBuilder, "versicherungsEndeMonat = '" + policeTO.getVerEndMonat() + "'");
		}
		if (policeTO.getVerEndJahr() != null && !policeTO.getVerEndJahr().isEmpty()) {
			appendWithAnd(suchStringBuilder, "versicherungsEndeJahr = '" + policeTO.getVerEndJahr() + "'");
		}
		if (policeTO.getPraemienhoehe() > 0) {
			appendWithAnd(suchStringBuilder, "praemienhoehe = " + policeTO.getPraemienhoehe());
		}
		if (policeTO.getIstAktiv()) 
			appendWithAnd(suchStringBuilder, "istAktiv = true");
		if (policeTO.getVersicherternummer() > 0) {
			appendWithAnd(suchStringBuilder, "versicherternummer = " + policeTO.getVersicherternummer());
		}

		try {
			String query = "SELECT * FROM policeverwaltung";
			if (suchStringBuilder.length() > 0) {
				query += " WHERE " + suchStringBuilder;
			}

			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			while (resultSet.next()) {
				PoliceTO foundPoliceTO = new PoliceTO();
				foundPoliceTO.setPolicenummer(resultSet.getInt("policenummer"));
				foundPoliceTO.setVersicherungsart(resultSet.getString("versicherungsart"));
				foundPoliceTO.setVerBeginnTag(resultSet.getString("versicherungsbeginnTag"));
				foundPoliceTO.setVerBeginnMonat(resultSet.getString("versicherungsbeginnMonat"));
				foundPoliceTO.setVerBeginnJahr(resultSet.getString("versicherungsbeginnJahr"));
				foundPoliceTO.setVerEndTag(resultSet.getString("versicherungsEndeTag"));
				foundPoliceTO.setVerEndMonat(resultSet.getString("versicherungsEndeMonat"));
				foundPoliceTO.setVerEndJahr(resultSet.getString("versicherungsEndeJahr"));
				foundPoliceTO.setPraemienhoehe(resultSet.getDouble("praemienhoehe"));
				foundPoliceTO.setIstAktiv(resultSet.getBoolean("istAktiv"));
				foundPoliceTO.setVersicherternummer(resultSet.getInt("versicherternummer"));

				policeTOListe.add(foundPoliceTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return policeTOListe;
	}

	private void appendWithAnd(StringBuilder queryBuilder, String condition) {
		if (queryBuilder.length() > 0) {
			queryBuilder.append(" AND ");
		}
		queryBuilder.append(condition);
	}

	@Override
	public void policedatenLoeschen(PoliceTO policeTO) {
		Connection aConnection = Persistence.getConnection();
		try {
			Persistence.executeUpdateStatement(aConnection,
					"delete from policeverwaltung where policenummer = " + policeTO.getPolicenummer());
		
			Persistence.commitConnection(aConnection);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}
	}

	@Override
	public void policedatenAendern(PoliceTO policeTO) {
	    Connection aConnection = Persistence.getConnection();
	    try {
	        String sql = "UPDATE policeverwaltung SET " +
	                     "VERSICHERUNGSART = ?, " +
	                     "VERSICHERUNGSBEGINNTAG = ?, " +
	                     "VERSICHERUNGSBEGINNMONAT = ?, " +
	                     "VERSICHERUNGSBEGINNJAHR = ?, " +
	                     "VERSICHERUNGSENDETAG = ?, " +
	                     "VERSICHERUNGSENDEMONAT = ?, " +
	                     "VERSICHERUNGSENDEJAHR = ?, " +
	                     "PRAEMIENHOEHE = ?, " +
	                     "ISTAKTIV = ?, " +
	                     "VERSICHERTERNUMMER = ? " +
	                     "WHERE POLICENUMMER = ?";

	        try (PreparedStatement pstmt = aConnection.prepareStatement(sql)) {
	            pstmt.setString(1, policeTO.getVersicherungsart());
	            pstmt.setString(2, policeTO.getVerBeginnTag());
	            pstmt.setString(3, policeTO.getVerBeginnMonat());
	            pstmt.setString(4, policeTO.getVerBeginnJahr());
	            pstmt.setString(5, policeTO.getVerEndTag());
	            pstmt.setString(6, policeTO.getVerEndMonat());
	            pstmt.setString(7, policeTO.getVerEndJahr());
	            pstmt.setDouble(8, policeTO.getPraemienhoehe());
	            pstmt.setInt(9, policeTO.getIstAktiv() ? 1 : 0);
	            pstmt.setInt(10, policeTO.getVersicherternummer());
	            pstmt.setInt(11, policeTO.getPolicenummer());
	            
	            // Ausführen des Updates
	            pstmt.executeUpdate();
				Persistence.commitConnection(aConnection);

	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        Persistence.closeConnection(aConnection);
	    }
	}
	
	

	
	
//	Tabellen erstellen:

	private static void createTablePoliceverwaltung(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS policeverwaltung (" + "policenummer INT PRIMARY KEY,"
				+ "versicherungsart VARCHAR(25) NOT NULL," + "versicherungsbeginnTag VARCHAR(10) NOT NULL,"
				+ "versicherungsbeginnMonat VARCHAR(10) NOT NULL," + "versicherungsbeginnJahr VARCHAR(10) NOT NULL,"
				+ "versicherungsEndeTag VARCHAR(10) NOT NULL," + "versicherungsEndeMonat VARCHAR(10) NOT NULL,"
				+ "versicherungsEndeJahr VARCHAR(10) NOT NULL," + "praemienhoehe DOUBLE NOT NULL,"
				+ "istAktiv BOOLEAN NOT NULL," + "versicherternummer INT NOT NULL" + ");";

		try (Statement stmt = connection.createStatement()) {
			stmt.executeUpdate(createTableSQL);
			System.out.println("Tabelle 'Policeverwaltung' wurde erfolgreich erstellt.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void createTableVersichertenverwaltung(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS versichertenverwaltung ("
				+ "versichertennummer INT PRIMARY KEY," + "nachname VARCHAR(40) NOT NULL,"
				+ "vorname VARCHAR(40) NOT NULL," + "adresse VARCHAR(60) NOT NULL," + "geburtsdatum DATE NOT NULL,"
				+ "telefonnummer VARCHAR(20)," + "email VARCHAR(255)" + ");";

		try (Statement stmt = connection.createStatement()) {
			stmt.executeUpdate(createTableSQL);
			System.out.println("Tabelle 'Versichertenverwaltung' wurde erfolgreich erstellt.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
