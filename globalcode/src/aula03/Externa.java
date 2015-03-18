/**
 * 
 */
package aula03;

/**
 * @author jfsilva 02/03/2015
 */
public class Externa {

	// atributo não estático
	int atributo;

	// método estático
	public static void main(String[] args) {

		Externa.Interna classe = new Externa().new Interna();
		Externa.Interna2 classe2 = new Externa.Interna2();

	}

	// método não estático
	public void metodo(final int parametro) {
		final int variavelLocal = 0;

		// classe interna local
		class Local {

			/**
			 * a classe local só acessa as variáveis dos métodos se forem
			 * estáticos
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

	// classe interna estática
	public static class Interna2 {

	}

}
