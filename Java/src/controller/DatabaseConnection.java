package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class DatabaseConnection {
	try {
	DriverManager.@registerDriver (new oracle.jdbc.driver.OracleDriver());
	Connection connection = DriverManager.getConnection("");
	Statement statement = connection.createStatement();
	} catch(SQLException ex) {
		
	}
	
}
