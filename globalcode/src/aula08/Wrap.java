/**
 * 
 */
package aula08;

/**
 * @author jfsilva
 * 09/03/2015
 */
public class Wrap {

	/**
	 * @author jfsilva 
	 * @version last update: 09/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		String s = "A";
		short primitive = Short.parseShort(s, 16);
		Short wrapper = Short.valueOf(s, 16);
		System.out.println(wrapper.shortValue()== primitive);

	}

}
