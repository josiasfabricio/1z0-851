/**
 * @see  
 * @page
 */
package capitulo09;

/**
Which are true? (Choose all that apply.)
	A. Compilation fails
	B. The output could be 4 4 2 3
	C. The output could be 4 4 2 2
	D. The output could be 4 4 4 2
	E. The output could be 2 2 4 4
	F. An exception is thrown at runtime
 */

class Chicks {
	 synchronized void yack(long id) {
		for (int x = 1; x < 3; x++) {
			System.out.print(id + " ");
			Thread.yield();
		}		
	}
}

public class Ex16ChicksYack implements Runnable {
	Chicks c; //static

	public static void main(String[] args) {
		new Ex16ChicksYack().go();
	}

	void go() {
		c = new Chicks();
		new Thread(new Ex16ChicksYack()).start();
		new Thread(new Ex16ChicksYack()).start();
	}

	public void run() {
		c.yack(Thread.currentThread().getId());
	}
}
