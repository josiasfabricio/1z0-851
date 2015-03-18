/**
 * 
 */
package aula12;

import java.util.Date;

/**
 * @author jfsilva
 * 13/03/2015
 */
public class ExemploPrintf {

	/**
	 * @author jfsilva 
	 * @version last update: 13/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		//%n é a quebra de linha
		
		//%b formata Boolean, 
		//qualquer coisa que não seja null ou boolean false é impresso true
		System.out.printf("Boolean: %b %n", null);
		System.out.printf("Boolean: %b %n", false);
		System.out.printf("Boolean: %b %n", "false");
		System.out.printf("Boolean: %b %n%n", 123);
		
		System.out.printf("Object: %s %n", "false"); //chama o toString()
		System.out.printf("Object: %s %n", new Date()); 
		System.out.printf("Object: %s %n", new Long(123)); 
		System.out.printf("Object: %s %n%n", null);
		
		System.out.printf("Integer: %d %n%n", 123); //inteiro
		
		System.out.printf("Double: %f %n", 123.75); //double
		System.out.printf("Double: %.2f %n", 123.75);//2 digitos depois da virgula
		System.out.printf("Double: '%10.2f' %n", 123.75);//10 casas
		System.out.printf("Double: '%-10.2f' %n", 123.75);//alinhar a esquerda
		System.out.printf("Double: '%010.2f' %n", 123.75);//preencher com '0' os espaços
		System.out.printf("Double: '%+10.2f' %n", -123.75); //exibir o sinal 
		System.out.printf("Double: '%(10.2f' %n", -123.75); //parenteses o número negativo	

	}

}
