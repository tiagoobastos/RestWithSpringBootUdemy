package br.com.erudio;

public class Jogo {
	private String id;
	private String nome;
	private String sistema;
	
	public Jogo(String id, String nome, String sistema) {
		this.id = id;
		this.nome = nome;
		this.sistema = sistema;
	}
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getSistema() {
		return sistema;
	}
	
	

}
