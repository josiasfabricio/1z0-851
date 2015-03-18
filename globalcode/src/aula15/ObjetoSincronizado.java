/**
 * 
 */
package aula15;

/**
 * @author jfsilva
 * 18/03/2015
 */
public class ObjetoSincronizado {
	
	/**
	 * Não irá acessar o objeto ao mesmo tempo.
	 */
	public synchronized void metodoSincronizado1(){
		System.out. println("Dentro do método 1");
	}
	
	/**
	 * Não irá acessar o objeto ao mesmo tempo.
	 */
	public synchronized void metodoSincronizado2(){
		System.out. println("Dentro do método 2");
	}

}
