package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		
		for (int idThread = 0; idThread < 5 ; idThread++) {
			//ThreadId threadId = new ThreadId(idThread);  --> primeiro jeito de chamar uma thread.
			Thread threadId = new ThreadId(idThread);    // -> recomendável
			threadId.start();
		}
		
	}

}

