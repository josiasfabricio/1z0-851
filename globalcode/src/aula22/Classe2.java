/**
 * 
 */
package aula22;

import static java.lang.System.out;

/**
 * 
 * @author jfsilva
 * 27/03/2015
 */
public class Classe2 {

	void testarPropriedadesGlobais(){
		String valor1 = System.getProperty("fruta1");
		String valor2 = System.getProperty("fruta2", "manga");
		
		out.printf("1: %s %n", valor1);
		out.printf("2: %s %n", valor2);
	}	

	/**
	javac -d bin/aula22/ src/aula22/Classe2.java
	java -classpath bin/aula22 -Dfruta1=Laranja -Dfruta2=Morango aula22.Classe2
	 */
	public static void main(String... param) {
		new Classe2().testarPropriedadesGlobais();
	}

}
