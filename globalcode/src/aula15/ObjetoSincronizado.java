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
	 * N�o ir� acessar o objeto ao mesmo tempo.
	 */
	public synchronized void metodoSincronizado1(){
		System.out. println("Dentro do m�todo 1");
	}
	
	/**
	 * N�o ir� acessar o objeto ao mesmo tempo.
	 */
	public synchronized void metodoSincronizado2(){
		System.out. println("Dentro do m�todo 2");
	}

}
