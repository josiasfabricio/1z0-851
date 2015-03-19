/**
 * 
 */
package aula16;

/**
 * @author jfsilva 19/03/2015
 */
public abstract class SuperClasse {

	protected void metodo() {
		System.out.println("Método da superclasse");
	}

	static void metodoEstatico() {
		System.out.println("Método estático da superclasse");
	}
	
	public final void metodoFinal(){//não pode ser sobreescrito		
		System.out.println("Método final da superclasse");
	}

}

class SubClasse extends SuperClasse {

	public void metodo() { //métodos podem ser subrescritos de forma a se tornarem MENOS restritos
		super.metodo(); //obtendo implementação da superclasse
	}
	
	void metodo(int i){//métodos podem ser sobrecarregados de forma a se tornar MAIS restritios
		System.out.println("Sobrecarga de método: Resultado "+i);
	}

	protected static void metodoEstatico() {
		SuperClasse.metodoEstatico();
	}
}