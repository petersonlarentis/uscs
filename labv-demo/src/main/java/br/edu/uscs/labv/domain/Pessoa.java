package br.edu.uscs.labv.domain;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	
	
/*	
 * 
 
  	CREATE TABLE PESSOA (
			id INT NOT NULL AUTO_INCREMENT, 
		    NOME VARCHAR(30) NOT NULL,
		    IDADE INT(30),
		    PRIMARY KEY (ID)	    
		);
	
	*
	*/

	
	
}
