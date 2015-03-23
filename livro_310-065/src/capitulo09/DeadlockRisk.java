/**
 * @see  Thread Deadlock
 * @page 419
 */
package capitulo09;

/**
 * @author Josias 22/03/2015
 */
public class DeadlockRisk implements Runnable {

	private static class Resource {
		public int value;
	}

	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();

	public void read() throws InterruptedException {
		synchronized (resourceA) { // May deadlock here			
			synchronized (resourceB) {
				System.out.printf("%s -> A: %d B: %d %n", Thread.currentThread()
						.getName(), resourceA.value, resourceB.value);				
			}

		}
	}

	public void write(int a, int b) throws InterruptedException {
		synchronized (resourceB) { // May deadlock here			
			synchronized (resourceA) {
				resourceA.value = a;
				resourceB.value = b;				
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			this.write(1, 2);
			this.read();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String... args) {
		Thread t1 = new Thread(new DeadlockRisk(), "DeadLock 1");
		t1.start();
		Thread t2 = new Thread(new DeadlockRisk(), "DeadLock 2");
		t2.start();
	}
}
