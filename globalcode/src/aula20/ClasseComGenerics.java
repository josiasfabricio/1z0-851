/**
 * 
 */
package aula20;

/**
 * @author jfsilva
 * 25/03/2015
 */
public class ClasseComGenerics<T> {
	
	public void metodo(T param){
		System.out.printf("Parâmetro recebido %s da classe %s %n", param, param.getClass().getName());
	}

	public static void main(String[] args) {
		
		//Não existe polimorfismo para Generics
		ClasseComGenerics<Object> obj = new ClasseComGenerics<Object>();
		
		obj.metodo(new String("1"));
		obj.metodo(new Integer("1"));
		obj.metodo(1L);
		obj.metodo(1D);
		obj.metodo('1');
	}

}
