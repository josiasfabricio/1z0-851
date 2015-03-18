/**
 * 
 */
package aula09;

/**
 * @author jfsilva
 * 10/03/2015
 */
public class ExemploStringCompare {

	/**
	 * @author jfsilva 
	 * @version last update: 10/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		String s1 = " abc " + " def ";
		String s2 = new String(s1); //criado um novo objeto, nova string sem o POOL

		if(s1 == s2)
			System.out.println(" == succeeded");
		
		if(s1.equals(s2))
			System.out.println(" .equals() succeeded");

	}

}
