package br.com.bancobb;

public class Cliente {

	protected String nome;

	public Cliente(String nome) {

		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
