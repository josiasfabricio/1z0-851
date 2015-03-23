/**
 * 
 */
package aula18;

/**
 * @author jfsilva
 * 23/03/2015
 */
public class TestePessoa {

	/**
	 * @author jfsilva 
	 * @version last update: 23/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		Pessoa b = new Pessoa();
		a.setIdade(13);
		b.setIdade(12);
		//b.setNome(new String("Fulano"));
		
		boolean b1 = a.equals(b);
		boolean b2 = a.hashCode() == b.hashCode();
		int i = a.compareTo(b);
		
		System.out.printf("%b %b %d", b1, b2, i);

	}

}
