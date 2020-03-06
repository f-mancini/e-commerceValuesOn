package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Listino;
import repository.DatabaseConnection;

public class ListinoDao {
	
	public static void addListino(Listino listino) throws Eccezione{
		// Mi connetto al db
		Connection conn = null;
		try {
			conn = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Creo lo statement
		PreparedStatement ps = null;
		
		// Definisco la query per l'inserimento di un listino
		String sql = "INSERT INTO LISTINO (IDLISTINO, DATAINIZIO, DATAFINE) VALUES (?, ?, ?)";
		
		 try {   
		       ps = conn.prepareStatement(sql);
		              
		       ps.setLong(1, listino.getIdListino());
		       ps.setString(2, listino.getDataInizio());
		       ps.setString(3, listino.getDataFine());
		       
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