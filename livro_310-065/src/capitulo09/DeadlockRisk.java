/**
 * @see  Thread Deadlock
 * @page 419
 */
package capitulo09;

/**
 * @author Josias 22/03/2015
 */
public class DeadlockRisk {
	
	private static class Resource {
		public int value;
	}

	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();

	public int read() {
		synchronized (resourceA) { // May deadlock here
			synchronized (resourceB) {
				return resourceB.value + resourceA.value;
			}
		}
	}

	public void write(int a, int b) {
		synchronized (resourceB) { // May deadlock here
			synchronized (resourceA) {
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}
	
	// TODO public static void main(string[] args){}

}
