/**
 * 
 */
package capitulo09;

/**
 * @author jfsilva
 * 19/03/2015
 */
public class Teste implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Minha Thread "+Thread.currentThread().getName());

	}

	/**
	 * @author jfsilva 
	 * @version last update: 19/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		Teste r = new Teste();
		Teste x = new Teste();
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(x, "T2");
		t1.start();
		System.out.println(t1.getName());
		t2.start();
		System.out.println(t2.getName());
		
		//System.out.println(t1.getName());
		//System.out.println(Thread.currentThread().getName());

	}

}
