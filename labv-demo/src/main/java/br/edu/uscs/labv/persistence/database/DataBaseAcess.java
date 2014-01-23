package br.edu.uscs.labv.persistence.database;

import java.sql.Connection;

public interface DataBaseAcess {
	
	Connection openConnection()throws Exception;
}
