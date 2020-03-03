package serviceimpl;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import repository.DatabaseConnection;

public class DbServiceImpl {
/*
	public static void main(String[] args) throws SQLException {
		DatabaseConnection conn = new DatabaseConnection();
		Statement stmt = null;
		
		// Apro la connessione
		System.out.println("Connessione al server...");
		conn.getConnection();
		System.out.println("Connessione eseguita");
		
		
		// Eseguo la query
		System.out.println("Creazione tabelle...");
		stmt = ((Connection) conn).createStatement();
		
		String sql = "CREATE TABLE UTENTE" +
					 "(idUtente INT not NULL AUTOINCREMENT," +
					 "nome VARCHAR(30)," +
					 "cognome VARCHAR(30)," +
					 "username VARCHAR(30)," +
					 "password VARCHAR(30)," +
					 "mail VARCHAR(30))"; 
		
		stmt.executeUpdate(sql);
		System.out.println("Tabella creata...");
		((Connection) conn).close();
	}
*/
}
