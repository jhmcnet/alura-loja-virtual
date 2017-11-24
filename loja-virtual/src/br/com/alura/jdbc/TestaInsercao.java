package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con = DataBase.getConnection();
		

		String sql = "insert into produto (nome,descricao) values(?,?)";
		
		PreparedStatement statement = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		adiciona(con, "TV", "78 polegadas", statement);
		adiciona(con, "TV", "46 polegadas", statement);
		statement.close();
		con.close();
	}

	private static void adiciona(Connection con, String nome, String descricao, PreparedStatement statement)
			throws SQLException {
		statement.setString(1, nome);
		statement.setString(2,descricao);
		boolean resultado = statement.execute();
		System.out.println(resultado);
		ResultSet resultSet = statement.getGeneratedKeys();
		while(resultSet.next()){
			System.out.println(resultSet.getString("id"));
		}		
	}

}
