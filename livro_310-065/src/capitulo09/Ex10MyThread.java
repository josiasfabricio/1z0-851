/**
 * @see  
 * @page
 */
package capitulo09;

/**
 * What is the result?
	A. foo
	B. MyThread foo
	C. MyThread bar
	D. foo bar
	E. foo bar baz
	F. bar foo
	G. Compilation fails
	H. An exception is thrown at runtime
 */
class MyThread extends Thread {
	MyThread() {
		System.out.print(" MyThread"); // <-
	}

	public void run() {
		System.out.print(" bar"); // <-
	}

	public void run(String s) {
		System.out.print(" baz");
	}
}

public class Ex10MyThread {
	public static void main(String[] args) {
		Thread t = new MyThread() { // <- Call the constructor
			public void run() {// <- Override
				System.out.print(" foo"); 
			}
		};
		t.start();
	}
}
