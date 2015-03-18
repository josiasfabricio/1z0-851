/**
 * 
 */
package aula06;

/**
 * @author jfsilva 05/03/2015
 */
public class ForTest {

	/**
	 * @author jfsilva
	 * @version last update: 05/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		/** rótulo **/
		outer: for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					continue outer;
				}
				System.out.println(" i = " + i + " j = " + j);
			}
		}

	}

}
