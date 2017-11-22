package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual","SA","");
		System.out.println("Abrindo uma conexão!");
		con.close();
	}

}
