/**
 * 
 */
package aula03;

/**
 * @author jfsilva 02/03/2015
 */
public class Externa {

	// atributo n�o est�tico
	int atributo;

	// m�todo est�tico
	public static void main(String[] args) {

		Externa.Interna classe = new Externa().new Interna();
		Externa.Interna2 classe2 = new Externa.Interna2();

	}

	// m�todo n�o est�tico
	public void metodo(final int parametro) {
		final int variavelLocal = 0;

		// classe interna local
		class Local {

			/**
			 * a classe local s� acessa as vari�veis dos m�todos se forem
			 * est�ticos
			 **/
			int b = variavelLocal;
			int c = parametro;
			
			int d = atributo;
		}
		Local l = new Local();
	}

	// classe interna
	public class Interna {
		int a = atributo;
	}

	// classe interna est�tica
	public static class Interna2 {

	}

}
