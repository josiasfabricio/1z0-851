/**
 * 
 */
package aula12;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author jfsilva 13/03/2015
 */
public class ExemploNumberFormat {

	/**
	 * @author jfsilva
	 * @version last update: 13/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) throws ParseException {
		NumberFormat fmt = NumberFormat.getInstance();
		Number valor = fmt.parse("12,75"); //observar o "." "," referente ao Locale
		System.out.println(fmt.format(valor));
		
		NumberFormat fmtMoeda = NumberFormat.getCurrencyInstance();//Locale.US
		System.out.println(fmtMoeda.format(valor)); //acrescenta o símbolo de moeda conforme o Locale
	}

}
