package controller;

import java.util.Random;
import controller.Classificacao;

public class Sapo5 extends Thread{
	
	Random random = new Random();
	int distanciaMaxima = 25;
	int distanciaPercorrida = 0;
	int pulo;
	
	public Sapo5() {
	}
	
	public void run() {

		while (distanciaPercorrida < distanciaMaxima) {
			pulo = random.nextInt((5)+1);
			distanciaPercorrida = distanciaPercorrida + pulo;
			System.out.println("O sapo 5 deu um pulo de " + pulo + " metros. Ele já percorreu " + distanciaPercorrida + " metros.");
		}
		if (distanciaPercorrida >= distanciaMaxima) {
			System.out.println("O sapo 5 chegou!");
			System.out.println("O sapo 5 chegou na " + Classificacao.Colocacao() + "° colocação!");
		}
		
	}

}
