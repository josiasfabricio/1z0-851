/**
 * 
 */
package aula10;

import java.util.Scanner;

/**
 * @author jfsilva 11/03/2015
 */
public class TestScanner {

	/**
	 * @author jfsilva
	 * @version last update: 11/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner("aa14aA1a23b12aJaa384");
		scan.useDelimiter("a+"); //uma ou mais ocorrência do 'a' minúsculo
		byte b = 0;
		while (scan.hasNext()) {
			if (scan.hasNextByte())//se o valor a partir de 'a'(se torna um token) cabe em um byte (128)
				b += scan.nextByte(); //adiciona o valor encontrado a partir do token no byte
			else
				scan.next();
		}
		System.out.println(b);
	}

}
