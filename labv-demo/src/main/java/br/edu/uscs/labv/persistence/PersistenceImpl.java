package br.edu.uscs.labv.persistence;

import br.edu.uscs.labv.domain.Pessoa;
import br.edu.uscs.labv.persistence.database.DataBaseAcess;
import br.edu.uscs.labv.persistence.database.MySQLDataBaseAcess;

public class PersistenceImpl implements Persistence{

	private DataBaseAcess dataBaseAcess;
	
	
	
	
	
	public PersistenceImpl() {
		dataBaseAcess = new MySQLDataBaseAcess();
	}





	@Override
	public void salvar(Pessoa pessoa) {
		
		try {

			// TODO: 3 - obter uma conexão com o banco.
			// TODO: 4 - através da conexão preparar uma instrução sql de insert.
			// TODO: 5 - atribuir os valores na instrução sql.
			// TODO: 6 - executar a instrução.
						
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
