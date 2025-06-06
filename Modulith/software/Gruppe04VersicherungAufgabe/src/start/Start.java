package start;

import dialog.menue.Hauptmenue;

public class Start {
    public static void main(String[] args) {
//        // Verbindung zur Datenbank herstellen
//        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/versicherungDB", "sa", "")) {
//            
//            // Tabelle erstellen, wenn sie nicht existiert
//            createPoliceTable(connection);
//            
//            // DAO und Manager initialisieren
//            IDAOPolice daoPolice = new DAOPoliceImpl(connection);
//            PoliceManager policeManager = new PoliceManager(daoPolice);
//
//            // Dialogklasse für Benutzereingaben initialisieren und starten
//            PoliceDialog dialog = new PoliceDialog(policeManager);
//            dialog.start();  // Startet den Dialog
//            
//            
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    	
    	Hauptmenue.Sart_Dialog();
    }

}



















//package start;
//
//import dialog.policeverwaltung.PoliceDialog;
//import kern.policeverwaltung.innensicht.useCases.PoliceManager;
//import kern.versichertenverwaltung.innensicht.useCases.VersichertenServiceImpl;
//import persistence.policeverwaltung.aussensicht.IDAOPolice;
//import persistence.policeverwaltung.innensicht.DAOPoliceImpl;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Start {
//    public static void main(String[] args) {
//        try (Connection connection = DriverManager.getConnection("jdbc:h2:~/versicherungDB", "sa", "")) {
//            createTables(connection);
//
//            IDAOPolice daoPolice = new DAOPoliceImpl(connection);
//            PoliceManager policeManager = new PoliceManager(daoPolice);
//            VersichertenServiceImpl versichertenService = new VersichertenServiceImpl();
//
//            PoliceDialog dialog = new PoliceDialog(policeManager, versichertenService);
//            dialog.start();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private static void createTables(Connection connection) {
//        try (Statement stmt = connection.createStatement()) {
//            stmt.executeUpdate(
//                "CREATE TABLE IF NOT EXISTS Police (" +
//                "policenummer INT PRIMARY KEY," +
//                "versicherungsart VARCHAR(255) NOT NULL," +
//                "versicherungsbeginn DATE NOT NULL," +
//                "versicherungsende DATE NOT NULL," +
//                "praemienhoehe DOUBLE NOT NULL," +
//                "versichertennummer INT NOT NULL," +
//                "istAktiv BOOLEAN NOT NULL" +
//                ");"
//            );
//            System.out.println("Tabellen wurden erstellt.");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
