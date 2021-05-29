package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank;
 * 
 * @author thais
 * 
 * @version 0.1
 *
 */

public class Cliente implements Serializable {

	private static final long serialVersionUID = 9205117266306915548L;
	// inicialmente, esse atributo vai dar erro. Mas, basta utilizar
	// o código disponibilizar no erro lançado;
	// é uma boa prática utilizar esse atributo, é como se fosse
	// o ID.
	
	
	private String cpf;
	private String profissao;
	private String nome;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
