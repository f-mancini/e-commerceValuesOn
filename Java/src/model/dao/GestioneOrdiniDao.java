package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import repository.DatabaseConnection;

public class GestioneOrdiniDao {

	public static void cerca() {
		// mi connetto al database
		DatabaseConnection dc;
		Connection conn = null;
		try {
			conn = DatabaseConnection.getConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		// creo il preparedStatement
		PreparedStatement ps = null;

		// creo la query per effettuare la ricerca dell'ordine
		String sql = "SELECT * FROM ORDINI ORDER BY NUMEROORDINI";

	}

	public static void invia() {
		//mi connetto al db
		DatabaseConnection dc;
		Connection conn = null;
		try {
			conn = DatabaseConnection.getConnection();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		// creo il preparedStatement
		PreparedStatement ps = null;

		// creo la query per cambiare lo stato dell'ordine da ricevuto a inviato
		String sql = "";
	}
}
