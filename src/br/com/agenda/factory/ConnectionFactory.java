package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	//Nome do usuário do mysql
	private static final String USERNAME = "root";
	
	//Senha do banco
	private static final String PASSWORD = "mysqlmysql";
	
	//cAMINHO DO BANCO DE DADOS, PORTA, NOME DO BANCO DE DADOS
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";
	
	//Conexão com banco de dados
	public static Connection createConnectionToMySQL() throws Exception {
		
		//Faz com que a classe seja carregada pela JVM
		Class.forName("com.mysql.jdbc.Driver");
		
		//aqui cria a conexão com o BD
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD) ;
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		//recuperar uma conexão com o BD
		Connection con = createConnectionToMySQL();
		
		//testar se a conexão é nula
		if(con != null) {
			System.out.println("Conexão obtida com sucesso!");
			con.close();
		}
	}
}
