/**
 * 
 */
package aula16;

/**
 * @author jfsilva
 * 19/03/2015
 */
public class TesteHeranca {

	/**
	 * @author jfsilva 
	 * @version last update: 19/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		SubClasse sc = new SubClasse();
		sc.metodo();
		sc.metodo(1);
		sc.metodoFinal();
		
		SubClasse.metodoEstatico();
	}

}
