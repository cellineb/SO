package controller;

//extends Thread -> para a classe virar thread
//parâmetros por construtor -> não tem mais o super() no construtor
//só será executado se estiver dentro do método run()

public class ThreadId extends Thread {
	
	private int id = (int) getId();
	
	public ThreadId(int id) {
		this.id = id;
	}

	public void run() {
		//super.run();
		//só se executa o que está aqui dentro.
		System.out.println(id);
	}
	
}
