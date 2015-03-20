/**
 * 
 */
package aula17;

/**
 * @author jfsilva
 * 20/03/2015
 */

class Pessoa{}

class Funcionario extends Pessoa {}

class Cliente extends Pessoa {}

public class Polimorfismo {
	public static void main(String[] args){

		Pessoa p = new Funcionario(); //UP-Cast : todo funcionario é pessoa não precisa do cast (tipo para sbtipo)
		
		/**
		 * java.lang.ClassCastExceptionjava.lang.ClassCastException
		 */	
		Cliente c = (Cliente) p; //Down-Cast não é válido pois "p" faz referência a funcionário
	}

}
