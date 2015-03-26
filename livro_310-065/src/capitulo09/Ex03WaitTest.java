/**
 * @see  
 * @page
 */
package capitulo09;

/**
 * What is the result of trying to compile and run this program?
	A. It fails to compile because the IllegalMonitorStateException of wait() is not dealt
	with in line 7
	B. 1 2 3
	C. 1 3
	D. 1 2
	E. At runtime, it throws an IllegalMonitorStateException when trying to wait
	F. It will fail to compile because it has to be synchronized on the this object
 */
public class Ex03WaitTest {

	public static void main(String[] args) {
		System.out.print("1 ");
		synchronized (args) {
			System.out.print("2 ");
			try {
				args.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.print("3 ");
	}
}
