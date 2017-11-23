package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DataBase.getConnection();
		Statement statement = con.createStatement();
		String sql = "delete from produto where id=3";
		Boolean resultado = statement.execute(sql);
		System.out.println(resultado);
		int count = statement.getUpdateCount();
		System.out.println(count + " linhas removidas");
		statement.close();
		con.close();
			
	}
}
