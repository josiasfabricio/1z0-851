/**
 * @see  
 * @page
 */
package capitulo09;

/**
 And given these two fragments:
	I. synchronized void chat(long id) {
	II. void chat(long id) {
	When fragment I or fragment II is inserted at line 5, which are true? (Choose all that apply.)
	A. An exception is thrown at runtime
	B. With fragment I, compilation fails
	C. With fragment II, compilation fails
	D. With fragment I, the output could be yo dude dude yo
	E. With fragment I, the output could be dude dude yo yo
	F. With fragment II, the output could be yo dude dude
 */
class Dudes {
	static long flag = 0;

	//synchronized void chat(long id) {
	void chat(long id) {
		if (flag == 0)
			flag = id;
		for (int x = 1; x < 3; x++) {
			if (flag == id)
				System.out.print("yo ");
			else
				System.out.print("dude ");
		}
	}
}

public class Ex15DudesChat implements Runnable {
	static Dudes d;

	public static void main(String[] args) {
		new Ex15DudesChat().go();
	}

	void go() {
		d = new Dudes();
		new Thread(new Ex15DudesChat()).start();
		new Thread(new Ex15DudesChat()).start();
	}

	public void run() {
		d.chat(Thread.currentThread().getId());
	}
}
