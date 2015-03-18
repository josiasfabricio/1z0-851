/**
 * 
 */
package aula06;

/**
 * @author jfsilva 05/03/2015
 */
public class MySwitch {

	/**
	 * @author jfsilva
	 * @version last update: 05/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySwitch ms = new MySwitch();
		ms.amethod();
	}

	public void amethod() {
		int k = 10;
		switch (k) {
		default:
			System.out.println("This is the default output");
			break;
		case 10:
			System.out.println("ten");
		case 20:
			System.out.println("twenty");
			break;
		}
	}

}
