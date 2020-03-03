package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import repository.DatabaseConnection;

/**
 * Servlet implementation class Servletdb
 */
@WebServlet("/Servletdb")
public class Servletdb extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void CreateTable() throws SQLException {
		   DatabaseConnection.creazioneTabelle();
	}
}
