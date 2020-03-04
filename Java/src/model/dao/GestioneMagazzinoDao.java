package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import repository.DatabaseConnection;

public class GestioneMagazzinoDao {

	public static void cerca() {

		// mi connetto al database
		DatabaseConnection dc;
		Connection conn = null;
		try {
			conn = DatabaseConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// creo il preparedStatement
		PreparedStatement ps = null;

		// creo la query per effettuare la ricerca dei prodotti
		String sql = "SELECT * FROM PRODOTTI ORDER BY DESCRIZIONE";
	}

	public static void inserisci () {
		
		// mi connetto al database
				DatabaseConnection dc;
				Connection conn=null;
				try {
					conn = DatabaseConnection.getConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		// creo il preparedStatement 
			       PreparedStatement ps = null;
		
		// creo la query per inserire un prodotto nel database
				String sql="INSERT INTO PRODOTTO (ID PRODOTTO, DESCRIZIONE) VALUES (?, ?)";
		
	}

	public static void modifica () {
		
		// mi connetto al database
				DatabaseConnection dc;
				Connection conn=null;
				try {
					conn = DatabaseConnection.getConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		// creo il preparedStatement 
			       PreparedStatement ps = null;
				
		// creo la query per modificare un prodotto nel database		
				String sql= "UPDATE PRODOTTO SET DESCRIZIONE WHERE ?";
	}

	public static void elimina () {
		
		// mi connetto al database
				DatabaseConnection dc;
				Connection conn=null;
				try {
					conn = DatabaseConnection.getConnection();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		// creo il preparedStatement 
			       PreparedStatement ps = null;		
				
		// creo la query per eliminare un prodotto nel database
				String sql="DELETE FROM PRODOTTO WHERE ?"
	}

}
