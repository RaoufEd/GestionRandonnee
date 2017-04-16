package gestionrandonnees.utils;

import java.sql.*;

/**
 * singleton class
 * 
 * @author thamer
 *
 */
public class DataSource {

	String url = "jdbc:mysql://localhost:3306/gestion_randonnees";
	String username = "root";
	String password = "";
	private Connection connection;
	private static DataSource datasource;

	private DataSource() {
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static DataSource getInstance() {

		if (datasource == null) {
			datasource = new DataSource();
		}
		return datasource;
	}

}
