package view;

import controller.Threads;

public class Main {

	public static void main(String[] args) {
		controller.Threads threads = new Threads();
		
		
		long tempoInicial = System.nanoTime();
		String process = "-a -c 10 www.UOL.com.br";
		threads.readProcess(process);
		long tempoFinal = System.nanoTime();
		long tempoTotalUOL = (long) ((tempoFinal - tempoInicial) / Math.pow(10, -9));
		System.out.println("UOL: tempo de interação --> " + tempoTotalUOL);
		
		tempoInicial = System.nanoTime();
		process = "-a -c 10 www.terra.com.br";
		threads.readProcess(process);
		tempoFinal = System.nanoTime();
		long tempoTotalTerra = (long) ((tempoFinal - tempoInicial) / Math.pow(10, -9));
		System.out.println("Terra: tempo de interação --> " + tempoTotalTerra);
		
		tempoInicial = System.nanoTime();
		process = "-a -c 10 www.google.com.br";
		threads.readProcess(process);
		tempoFinal = System.nanoTime();
		long tempoTotalGoogle = (long) ((tempoFinal - tempoInicial) / Math.pow(10, -9));
		System.out.println("Google: tempo de interação --> " + tempoTotalGoogle);
		
	}

}
