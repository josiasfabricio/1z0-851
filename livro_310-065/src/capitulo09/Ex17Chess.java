/**
 * @see  
 * @page
 */
package capitulo09;

/**
 When either fragment I or fragment II is inserted at line 7, which are true? (Choose all that apply.)
	A. Compilation fails
	B. With fragment I, an exception is thrown
	C. With fragment I, the output could be 4 2 4 2
	D. With fragment I, the output could be 4 4 2 3
	E. With fragment II, the output could be 2 4 2 4
 */
public class Ex17Chess implements Runnable {
	public void run() {
		move(Thread.currentThread().getId());
	}

	//synchronized void move(long id) {
	void move(long id) {
		System.out.print(id + " ");
		System.out.print(id + " ");
	}

	public static void main(String[] args) {
		Ex17Chess ch = new Ex17Chess();
		new Thread(ch).start();
		new Thread(new Ex17Chess()).start();
	}

}
