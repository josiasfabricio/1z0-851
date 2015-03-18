/**
 * 
 */
package aula08;

/**
 * @author jfsilva
 * 09/03/2015
 */
public class ExemploWrapper {

	/**
	 * @author jfsilva 
	 * @version last update: 09/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		Integer valor = new Integer(25);
		int i = valor.intValue();
		Integer valor2 = new Integer("25");
		String texto = "F";
		i = Integer.parseInt(texto,16);
		System.out.print(i);
	}

}

