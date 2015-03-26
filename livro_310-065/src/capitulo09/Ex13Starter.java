/**
 * @see  
 * @page
 */
package capitulo09;

/**
 * @author jfsilva 25/03/2015
 
	When the five fragments are inserted, one at a time at line 9, which are true? (Choose all that apply.)
	A. All five will compile
	B. Only one might produce the output 4 4
	C. Only one might produce the output 4 2
	D. Exactly two might produce the output 4 4
	E. Exactly two might produce the output 4 2
	F. Exactly three might produce the output 4 4
	G. Exactly three might produce the output 4 2
	 
 */
public class Ex13Starter implements Runnable {

	void go(long id) {
		System.out.println(id+ " * ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		go(Thread.currentThread().getId());
	}

	
	
	public static void main(String[] args) {
		System.out.print(Thread.currentThread().getId() + " ^ ");
		new Ex13Starter().run();
		new Thread(new Ex13Starter());
		new Thread(new Ex13Starter()).run();
		new Thread(new Ex13Starter()).start();
	}

}
