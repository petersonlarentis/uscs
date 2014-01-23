package br.edu.uscs.labv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.uscs.labv.domain.Pessoa;
import br.edu.uscs.labv.service.CadastroService;
import br.edu.uscs.labv.service.CadastroServiceImpl;


@WebServlet("/cadastroPessoa")
public class CadastroPessoaController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private CadastroService cadastroService;

    public CadastroPessoaController() {
    	cadastroService = new CadastroServiceImpl();
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pessoa pessoa = createPessoa(request);
		cadastroService.cadastrar(pessoa);
	}


	
	
	private Pessoa createPessoa(HttpServletRequest request) {
				
		// TODO: 1 - obter os dados do request ( nome e idade ) e criar um objeto Pessoa com esses dados.
		
		return null;
	}

	
	
}
