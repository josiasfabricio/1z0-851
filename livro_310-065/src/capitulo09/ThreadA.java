/**
 * @see  Thread Interaction
 * @page 420
 */
package capitulo09;

/**
 * @author Josias 22/03/2015
 */
public class ThreadA {// A contem a thread principal

	public static void main(String[] args) {

		// otem o Thread principal B
		ThreadB b = new ThreadB();
		b.setName("B");
		b.start();//inicia o cálculo		

		//ThreadA pede bloqueio no objeto B, assim B chama o bloqueio
		synchronized (b) {
			try {
				System.out.println("Waiting for "+b.getName()+" to complete...");

				/**
				 * wait() impede que a ThreadA chegue ao final de sua execução antes
				 * que B conclua o cálculo
				 **/
				b.wait();

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is: " + b.total);
		}
	}
}

class ThreadB extends Thread {
	volatile int total;

	public void run() {
		synchronized (this) {
			// calcula a soma dos números de 0 a 99
			for (int i = 0; i < 1000000; i++) {
				total += i;
			}
			//irá notificar qualquer thread que aguarda o objeto B
			notify();
		}
	}
}
