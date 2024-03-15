package controller;

public class ThreadVetor extends Thread {	
	
	private int n;
	private int vet[];
	
	public ThreadVetor (int n, int[] vet) {
		this.n = n;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		
		if (n%2==0) {
			double tempoInicial = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, -9);
			System.out.println("Número: " + n + ". O tempo em segundos para percorrer o vetor foi: " + tempoFinal);
		}
		else {
			double tempoInicial = System.nanoTime();
			for (int percorrer : vet) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, -9);
			System.out.println("Número: " + n + ". O tempo em segundos para percorrer o vetor foi: " + tempoFinal);
		}
		
	}

}
