/**
 * 
 */
package aula11;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * @author jfsilva 12/03/2015
 */
public class ExemploDateFormat {
	private static int estiloShort = DateFormat.SHORT;
	private static int estiloMedium = DateFormat.MEDIUM;
	private static int estiloLong = DateFormat.LONG;
	private static int estiloFull = DateFormat.FULL;

	/**
	 * @author jfsilva
	 * @version last update: 12/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DateFormat dt  = DateFormat.getDateInstance(estiloLong);
		System.out.println(dt.format(cal.getTime()));
	}

}
