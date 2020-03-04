package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Utente;
import repository.DatabaseConnection;
import model.dao.Eccezione;

public class RegistrazioneDao {

	public static void registrati(Utente utente) throws Eccezione {
		
	   //mi connetto al database
		DatabaseConnection dc;
		Connection conn=null;
		try {
			conn = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       //creo il preparedStatement 
       PreparedStatement ps = null;
       
       //creo la query per la registrazione dell'utente
       String sql="INSERT INTO UTENTE (NOME, COGNOME, USERNAME, MAIL, PASSWORD) VALUES (?, ?, ?, ?, ?)";
       
    try {   
       ps = conn.prepareStatement(sql);
              
       ps.setString(1, utente.getNome());
       ps.setString(2, utente.getCognome());
       ps.setString(3, utente.getUsername());
       ps.setString(3, utente.getMail());
       ps.setString(3, utente.getPassword());
       
       ps.executeUpdate();  
      
    } catch (SQLException ex) {
    	throw new Eccezione(ex.getMessage());
    
    } finally {
    	try {
    		ps.close();
    		conn.close();
    	
    	}  catch (SQLException ex) {
    		throw new Eccezione(ex.getMessage());
    	}
    }
       
          
	}
}
