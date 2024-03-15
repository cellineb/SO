package controller;

public class Ex2Controller extends Thread {
	
	private int vet[];
	private int linha;
	private int soma = 0;
	
	public Ex2Controller(int vet[], int linha) {
		this.vet = vet;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			soma = vet[i] + soma;
		}
		
		System.out.println("A soma dos valores da linha " + linha + " é " + soma);
		
	}

}

