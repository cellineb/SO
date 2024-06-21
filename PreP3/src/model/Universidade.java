package model;

public class Universidade {
	
	private String nome;
	private String site;
	
	public Universidade(String nome, String site) {
		this.nome = nome;
		this.site = site;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSite() {
		return site;
	}

}
