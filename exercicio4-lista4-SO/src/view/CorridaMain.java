package view;

import controller.Sapo1;
import controller.Sapo2;
import controller.Sapo3;
import controller.Sapo4;
import controller.Sapo5;

public class CorridaMain {

	public static void main(String[] args) {
		
		Thread sapo1 = new Sapo1();
		Thread sapo2 = new Sapo2();
		Thread sapo3 = new Sapo3();
		Thread sapo4 = new Sapo4();
		Thread sapo5 = new Sapo5();
		
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
		
	}

}
