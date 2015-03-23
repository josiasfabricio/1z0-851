/**
 * @see Iniciando e Executando Mais de um Thread
 * @pag 400
 */
package capitulo09;

/**
 * @author jfsilva 19/03/2015
 */

class NameRunnable2 implements Runnable {
	public void run() {
		for (int x = 1; x <= 3; x++) {
			System.out.println("Run by " + Thread.currentThread().getName()
					+ ", x is " + x);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException ex) {
//			}
		}
	}
}

public class ManyNames {
	public static void main(String[] args) {
		// Make one Runnable
		NameRunnable2 nr = new NameRunnable2();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Fred");
		two.setName("Lucy");
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
	}
}
