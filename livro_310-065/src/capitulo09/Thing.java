/**
 * @see  So When Do I Need to Synchronize?
 * @page
 */
package capitulo09;

/**
 * @author Josias 22/03/2015
 */
public class Thing {
	private static int staticField;
	private int nonstaticField;

	public static synchronized int getStaticField() {
		return staticField;
	}

	public static synchronized void setStaticField(int staticField) {
		Thing.staticField = staticField;
	}

	public synchronized int getNonstaticField() {
		return nonstaticField;
	}

	public synchronized void setNonstaticField(int nonstaticField) {
		this.nonstaticField = nonstaticField;
	}
}
