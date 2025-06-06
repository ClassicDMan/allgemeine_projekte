package persistence.versichertenverwaltung.innensicht.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistence {
	
	
	 
	public static Connection getConnection(){
		Connection aConnection = null;
		
		
		try {
			/*
			 * Hier den Namen des JDBC-Treibers angeben. Damit der auch gefunden wird, muss
			 * das jar-File in Eclipde unter 
			 * "Project->Properties->Java Build Path->Libraries->Add External Jars" angegeben werden
			 */
			Class.forName ("org.h2.Driver");
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
		try {
			/* 
			 * Form: @Rechnername:Port, "Db-User", "Password"
			 */
			
//			aConnection = DriverManager.getConnection ("jdbc:h2:D:/H2_21214/databases/bank", "bank", "bank");
			aConnection = DriverManager.getConnection ("jdbc:h2:D:/H2_Gruppe04/databases/VersicherungDB", "sa", "");
//			aConnection = DriverManager.getConnection ("jdbc:h2:tcp://localhost/D:/H2_Gruppe04/databases/VersicherungDB");
			
			aConnection.setAutoCommit(true);
		} catch (SQLException e) {
				e.printStackTrace();
		}
		
		return(aConnection);	
	}
	
	public static void closeConnection(Connection aConnection){
		try {
			aConnection.close();
		} catch (SQLException e) {
				e.printStackTrace();
		}	
	}
	
	public static void commitConnection(Connection aConnection){
		try {
			aConnection.commit();
		} catch (SQLException e) {
				e.printStackTrace();
		}	
	}
	
	
	public static void executeUpdateStatement(Connection aConnection, String aStatement) throws SQLException{
//		System.out.println(aStatement);
		Statement stmt = aConnection.createStatement();
		stmt.executeUpdate(aStatement);
		
	}
	
	public static ResultSet executeQueryStatement(Connection aConnection, String aStatement) throws SQLException{
		ResultSet aResultSet = null;
//		System.out.println("DEBUG: "+aStatement);
		Statement stmt = aConnection.createStatement();
		aResultSet =  stmt.executeQuery(aStatement);
		
		return aResultSet;
	}
	
}
