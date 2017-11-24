package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {
	public static void main(String[] args) throws SQLException {
		Connection con = DataBase.getConnection();
		System.out.println("Abrindo uma conexão!");
		Statement statement = con.createStatement();
		boolean resultado = statement.execute("select * from produto");
		ResultSet resultSet = statement.getResultSet();
		while(resultSet.next()){
			String id = resultSet.getString("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			System.out.println(id + " - " + nome + " - " + descricao);
			con.close();
		}
		resultSet.close();
		statement.close();
	}
}
