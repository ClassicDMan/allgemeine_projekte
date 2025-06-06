package persistence.produktverwaltung.innensicht.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import kern.produktverwaltung.aussensicht.ProduktTO;
import persistence.produktverwaltung.aussensicht.IProduktverwaltungDAO;

public class ProduktverwaltungDAO implements IProduktverwaltungDAO {

	@Override
	public void produktdatenLoeschen(ProduktTO produktTO) {
		Connection aConnection = Persistence.getConnection();
		try {
			Persistence.executeUpdateStatement(aConnection,
					"delete from produktverwaltung where produktnummer = " + produktTO.getProduktnummer());

			Persistence.commitConnection(aConnection);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}
	}

	@Override
	public Collection<ProduktTO> produktdatenSuchenPerAttribut(ProduktTO produktTO) {
		Connection aConnection = Persistence.getConnection();
		Collection<ProduktTO> produktTOListe = new ArrayList<ProduktTO>();

		StringBuilder suchStringBuilder = new StringBuilder();

		if (produktTO.getBezeichnung() != null && !produktTO.getBezeichnung().isEmpty()) {
			suchStringBuilder.append("bezeichnung = '").append(produktTO.getBezeichnung()).append("'");
		}
		if (produktTO.getBeschreibung() != null && !produktTO.getBeschreibung().isEmpty()) {
			suchStringBuilder.append("beschreibung = '").append(produktTO.getBeschreibung()).append("'");
		}
		if (produktTO.getBedingung() != null && !produktTO.getBedingung().isEmpty()) {
			suchStringBuilder.append("bedingung = '").append(produktTO.getBedingung()).append("'");
		}

		try {
			String query = "SELECT * FROM produktverwaltung";
			if (suchStringBuilder.length() > 0) {
				query += " WHERE " + suchStringBuilder;
			}
			
			System.out.println("Executing query: " + query);
			
			ResultSet resultSet = Persistence.executeQueryStatement(aConnection, query);

			while (resultSet.next()) {
				ProduktTO foundProduktTO = new ProduktTO();
				foundProduktTO.setProduktnummer(resultSet.getInt("produktnummer"));
				foundProduktTO.setBezeichnung(resultSet.getString("bezeichnung"));
				foundProduktTO.setBeschreibung(resultSet.getString("beschreibung"));
				foundProduktTO.setBedingung(resultSet.getString("bedingung"));

				produktTOListe.add(foundProduktTO);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return produktTOListe;
	}

	@Override
	public ProduktTO produktdatenSuchenPerNummer(int produktnummer) {
		Connection aConnection = Persistence.getConnection();
		ResultSet resultSet;
		ProduktTO produktTO = null;
		try {
			// Abfrage für die Policenummer
			String query = "SELECT * FROM produktverwaltung WHERE produktnummer = " + produktnummer;
			resultSet = Persistence.executeQueryStatement(aConnection, query);

			if (resultSet.next()) {

				produktTO = this.resultToProduktTO(resultSet);
			}

			resultSet.close();
			Persistence.commitConnection(aConnection);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Persistence.closeConnection(aConnection);
		}

		return produktTO;
	}

	private ProduktTO resultToProduktTO(ResultSet resultSet) {
		ProduktTO produktTO = new ProduktTO();
		try {
			produktTO.setProduktnummer(resultSet.getInt("produktnummer"));
			produktTO.setBezeichnung(resultSet.getString("bezeichnung"));
			produktTO.setBeschreibung(resultSet.getString("beschreibung"));
			produktTO.setBedingung(resultSet.getString("bedingung"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produktTO;
	}

}
