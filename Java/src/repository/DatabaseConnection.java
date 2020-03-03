package repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DatabaseConnection {
	
	Connection conn;
	public Connection getConnection() throws SQLException {
		FileReader fr = null;
		Properties p = null;
		try {
			fr = new FileReader("conf.properties");
			p = new Properties();
			p.load(fr);
		} catch (FileNotFoundException e) {
			System.out.println("File conf.properties non trovato" + e);
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
		String user = p.getProperty("user");
		String password = p.getProperty("password");
		String jdbc = p.getProperty("jdbc");
		String indirizzo = p.getProperty("indirizzo");
		String porta = p.getProperty("porta");
		String db = p.getProperty("db");
		
		String url = "jdbc:" + jdbc + "://" + indirizzo + ":" + porta + "/" + db + "?ServerTimezone=Europe/Rome";
		
		conn = DriverManager.getConnection(url, user, password);
		
		return conn;
		
	}
	
	public void creazioneTabelle() throws SQLException {
		Statement stmt = null;
		DatabaseConnection dbConn = new DatabaseConnection();
	// Apro la connessione
	System.out.println("Connessione al server...");
	dbConn.getConnection();
	System.out.println("Connessione eseguita");
	
	
	// Eseguo la query
	System.out.println("Creazione tabelle...");
	stmt =  conn.createStatement();
	
	String sql = "CREATE TABLE UTENTE" +
				 "(idUtente INT not NULL AUTOINCREMENT," +
				 "nome VARCHAR(30)," +
				 "cognome VARCHAR(30)," +
				 "username VARCHAR(30)," +
				 "password VARCHAR(30)," +
				 "mail VARCHAR(30))"; 
	
	stmt.executeUpdate(sql);
	System.out.println("Tabella creata...");
	conn.close();
	
	}
}



