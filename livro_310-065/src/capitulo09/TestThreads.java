/**
 * 
 */
package capitulo09;

/**
 * @author jfsilva 19/03/2015
 */
class FooRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("Runnable running");
		}
	}
}

public class TestThreads {
	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		Thread t = new Thread(r);
		t.start();
	}
}