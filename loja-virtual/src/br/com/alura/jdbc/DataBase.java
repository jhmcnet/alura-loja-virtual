package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {	

	static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual","SA","");
		return con;
	}

}
