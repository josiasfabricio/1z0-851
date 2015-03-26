/**
 * 
 */
package aula21;

//importando elementos est�ticos
import static java.lang.System.out; //atributo est�tico da classe System
import static java.lang.Integer.*; 
import static java.util.Arrays.*;
import static java.util.Calendar.*;
import static java.text.DateFormat.*;


/**
 * @author jfsilva
 * 26/03/2015
 */
public class StaticImport {

	public static void main(String[] args) {
		String s = "4321";
		out.println(s); // java.lang.System.out
		int i = parseInt(s);//java.lang.Integer
		float [] array = { 15.0f, 2.45f, 2.3f, 4.4f, 5.6f };
		sort(array); //java.util.Arrays
		
		for (float f : array) {
			out.print(f); // java.lang.System.out
		}

		//classe Calendar fica na classe java.util por�m s� foram importados os elementos est�ticos de Calendar
		Calendar cal = getInstance(); //ambiguidade pois o getInstance exite na classe Calendar e DateFormat, necess�rio o import qualificado
		cal.set(DAY_OF_MONTH, 12);
	}

}
