package br.edu.uscs.labv.service;

import br.edu.uscs.labv.domain.Pessoa;
import br.edu.uscs.labv.persistence.Persistence;
import br.edu.uscs.labv.persistence.PersistenceImpl;

public class CadastroServiceImpl implements CadastroService {

	private Persistence persistence;
		

	public CadastroServiceImpl() {
		persistence = new PersistenceImpl();
	}

	
	@Override
	public void cadastrar(Pessoa pessoa) {
		if(pessoa != null){
			// TODO: 2 - utilizar a interface de persistencia para salvar a pessoa no banco de dados.
		}
	}

}
