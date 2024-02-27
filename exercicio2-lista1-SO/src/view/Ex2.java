package view;

import javax.swing.JOptionPane;
import controller.Ex2Controller;

public class Ex2 {

	public static void main(String[] args) {
		Ex2Controller ex2 = new Ex2Controller();
		String texto1 = JOptionPane.showInputDialog("Digite o primeiro texto");
		String texto2 = JOptionPane.showInputDialog("Digite o segundo texto");
		String texto3 = JOptionPane.showInputDialog("Digite o terceiro texto");
		System.out.println("O texto 1 tem " + ex2.operacoes(texto1));
		System.out.println("O texto 2 tem " + ex2.operacoes(texto2));
		System.out.println("O texto 3 tem " + ex2.operacoes(texto3));
	}

}
