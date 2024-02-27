package controller;

public class Ex2Controller {
	
	public Ex2Controller() {
		super();
	}
	
	public int operacoes(String texto) {
		String[] vetor = texto.split(";");
		int tamanho = vetor.length;
		return tamanho;
	}

}
