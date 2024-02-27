package view;

import javax.swing.JOptionPane;
import controller.Ex1Controller;

public class Ex1 {

	public static void main(String[] args) {
		Ex1Controller ex1 = new Ex1Controller();
		int[] vetor = new int[1000];
		int[] vetor2 = new int[10000];
		int[] vetor3 = new int[100000];
		vetor = ex1.preencher(vetor, 1000);
		vetor2 = ex1.preencher(vetor2, 10000);
		vetor3 = ex1.preencher(vetor3, 100000);
		System.out.println("O tempo gasto para percorrer o vetor de 1000 posições foi: " + ex1.tempo(vetor));
		System.out.println("O tempo gasto para percorrer o vetor de 10000 posições foi: " + ex1.tempo(vetor2));
		System.out.println("O tempo gasto para percorrer o vetor de 100000 posições foi: " + ex1.tempo(vetor3));
	}

}
