/**
 * 
 */
package aula10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jfsilva 11/03/2015
 */
public class MyRegex {

	/**
	 * @author jfsilva
	 * @version last update: 11/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d*"); //zero ou mais ocorrências de digitos
		Matcher m = p.matcher("ab23cd");
		while(m.find()){
			System.out.print(m.start()+m.group()); //impresso 012 23 456
		}

	}

}
