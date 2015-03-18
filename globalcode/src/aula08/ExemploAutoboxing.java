/**
 * 
 */
package aula08;

/**
 * @author jfsilva
 * 09/03/2015
 */
public class ExemploAutoboxing {

	/**
	 * @author jfsilva 
	 * @version last update: 09/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		Integer valor = 128;//Integer valor = new Integer(25); boxing
		int i = valor; //int i = valor.intValue(); unboxing
		
		//Double d = 100; //Double d = new Integer(100); Erro de conversão de Wrapper
		
		 Integer valor2 = 128;
		 int j = valor2;
		 
		 if(valor == valor2){//boxing precisa do equals para comparar valores
			 System.out.println("Iguais");
		 }else{
			 System.out.println("Não são iguais");
		 }
		 
		 int t = new Integer(125);
		 byte u = t.byteValue(); //primitivo não tem método
		 
		 Double v = new Double("20") - u;
		 Boolean x = v.equals(19d);
	}

}
