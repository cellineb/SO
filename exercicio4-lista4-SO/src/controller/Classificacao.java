package controller;

public class Classificacao {
	static int colocacao = 1;
	public synchronized static int  Colocacao() {
		return colocacao++;
	}
}
