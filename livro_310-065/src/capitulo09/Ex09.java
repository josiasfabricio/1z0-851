/**
 * @see  
 * @page
 */
package capitulo09;

/**
 * What is the result of this code?
	A. It prints X and exits
	B. It prints X and never exits
	C. It prints XY and exits almost immeditately
	D. It prints XY with a 10-second delay between X and Y
	E. It prints XY with a 10000-second delay between X and Y
	F. The code does not compile
	G. An exception is thrown at runtime
 */
public class Ex09 {

	public static synchronized void main(String[] args)
			throws InterruptedException {
		Thread t = new Thread();
		t.start();
		System.out.print("X");
		t.wait(10000); //sleep()
		System.out.print("Y");
	}

}
