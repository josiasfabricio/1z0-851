/**
 * 
 */
package aula16;

/**
 * @author jfsilva 19/03/2015
 */
public abstract class SuperClasse {

	protected void metodo() {
		System.out.println("M�todo da superclasse");
	}

	static void metodoEstatico() {
		System.out.println("M�todo est�tico da superclasse");
	}
	
	public final void metodoFinal(){//n�o pode ser sobreescrito		
		System.out.println("M�todo final da superclasse");
	}

}

class SubClasse extends SuperClasse {

	public void metodo() { //m�todos podem ser subrescritos de forma a se tornarem MENOS restritos
		super.metodo(); //obtendo implementa��o da superclasse
	}
	
	void metodo(int i){//m�todos podem ser sobrecarregados de forma a se tornar MAIS restritios
		System.out.println("Sobrecarga de m�todo: Resultado "+i);
	}

	protected static void metodoEstatico() {
		SuperClasse.metodoEstatico();
	}
}