package view;

import java.util.Random;
import controller.Ex2Controller;

public class Ex2Main {

	public static void main(String[] args) {
		
		int mat[][] = new int[3][5];
		Random random = new Random();
		
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 5; y++) {
				mat[x][y] = (random.nextInt(60)+1);
			}
		}
		
		for (int linhaSoma = 0; linhaSoma < 3; linhaSoma++) {
			Thread thread = new Ex2Controller(mat[linhaSoma], linhaSoma);
			thread.start();
		}
		
	}

}
