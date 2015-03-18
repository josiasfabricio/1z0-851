/**
 * 
 */
package aula14;

/**
 * @author jfsilva 17/03/2015
 */
public class Borley extends Thread {

	public static void main(String[] args) {
		Borley b = new Borley();
		b.start();
	}

	public void run() {
		System.out.println("Running");
	}

}
