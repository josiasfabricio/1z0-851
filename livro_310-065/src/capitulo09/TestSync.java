/**
 * @see  So What About Static Methods? Can They Be Synchronized?
 * @page
 */
package capitulo09;

/**
 * @author Josias 22/03/2015
 */
public class TestSync {

	volatile int count;

	public void doStuff() {
		System.out.println("not synchronized");
		synchronized (this) {
			System.out.println("synchronized");
		}
	}

	public int getCount() {
		synchronized (TestSync.class) {
			return count;
		}
	}

	public static void classMethod() throws ClassNotFoundException {
		Class cl = Class.forName("TestSync");
		synchronized (cl) {
			// do stuff
		}
	}
}
