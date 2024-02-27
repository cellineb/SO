package controller;

public class Ex1Controller {
	
	public Ex1Controller() {
		super();
	}
	
	public int[] preencher(int[] vetor, int tamanho) {
		for (int i = 0; i < tamanho; i++){		
			vetor[i]=0;
		}
		return vetor;
	}
	
	public double tempo(int[] vetor) {
		double tempoInicial = System.nanoTime();
		for (int percorrer : vetor) {
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, -9);
		return tempoTotal;
	}

}
