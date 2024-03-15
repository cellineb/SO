package view;

import java.util.Random;
import controller.ThreadVetor;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int vet[] = new int[1000];
		Random random = new Random();
		
		for (int i = 0; i < 1000; i++) {
			vet[i] = random.nextInt((100)+ 1);
		}
		
		for (int i = 1; i < 3; i++) {
			Thread thread = new ThreadVetor(i, vet);
			thread.start();
		}
	}

}
