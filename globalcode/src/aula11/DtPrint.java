/**
 * 
 */
package aula11;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author jfsilva 12/03/2015
 */
public class DtPrint {

	/**
	 * @author jfsilva
	 * @version last update: 12/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		Date d = new Date(1123631685981L);
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(d));
	}

}
