/**
 * 
 */
package aula22;
import static java.lang.System.out;

/**
 * @author jfsilva
 * 27/03/2015
 */
public class Classe {

	/**
	javac -d bin/aula22/ src/aula22/Classe.java
	java -classpath bin/aula22 aula22.Classe "hello"
	 */
	public static void main(String... param) {
		out.printf("%s ", param[0]);

	}

}
