/**
 * @see  
 * @page
 */
package capitulo09;

/**
 * @author jfsilva 25/03/2015
 */
public class TheCount extends Thread {

	public void run() {
		for (int i = 1; i <= 100; ++i) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println("Hahaha");	
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
		}
	}

	public static void main(String[] args) {
		new TheCount().start();
	}

}
