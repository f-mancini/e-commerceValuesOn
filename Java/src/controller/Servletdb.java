package controller;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import repository.DatabaseConnection;

/**
 * Servlet implementation class Servletdb
 */
@WebServlet("/Servletdb")
public class Servletdb extends HttpServlet {
	private static final long serialVersionUID = 7L;
    
	protected void CreateTable() throws SQLException {
		   DatabaseConnection.creazioneTabelle();
	}
}
