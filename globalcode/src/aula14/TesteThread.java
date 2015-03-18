/**
 * 
 */
package aula14;

/**
 * @author jfsilva 17/03/2015
 */
public class TesteThread {
	
	public static void main(String[] args) {
		ExemploThread et = new ExemploThread();
		et.start();
		System.out.println(et.getPriority());

		ExemploRunnable er = new ExemploRunnable();
		Thread t = new Thread(er); //Precisar criar uma thread para chamar o start();
		t.start();
	}
}

class ExemploThread extends Thread {
	public void run() {
		System.out.println("Executando ExemploThread!!!");
	}
}

class ExemploRunnable implements Runnable {
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Executando ExemploRunnable!!!");
	}

}
