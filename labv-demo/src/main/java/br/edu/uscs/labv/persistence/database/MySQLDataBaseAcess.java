package br.edu.uscs.labv.persistence.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDataBaseAcess implements DataBaseAcess{

	
	public MySQLDataBaseAcess() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	
	@Override
	public Connection openConnection() throws Exception {
		return DriverManager.getConnection("jdbc:mysql://localhost/labvdemo", "root", "root");
	}

	
}
