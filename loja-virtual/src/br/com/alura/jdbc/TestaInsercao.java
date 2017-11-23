package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {
	
	public static void main(String[] args) throws SQLException {
		Connection con = DataBase.getConnection();
		Statement statement = con.createStatement();
		String sql = "insert into produto (nome,descricao) values('Notebook','Notebook Celeron')";
		Boolean resultado = statement.execute(sql, Statement.RETURN_GENERATED_KEYS);
		System.out.println(resultado);
		ResultSet resultSet = statement.getGeneratedKeys();
		while(resultSet.next()){
			System.out.println(resultSet.getString("id"));
		}
		statement.close();
		con.close();
	}

}
