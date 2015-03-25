/**
 * 
 */
package aula20;

import java.util.*;

/**
 * @author jfsilva
 * 25/03/2015
 */
public class TryMe {

	/**
	 * Ordenar a sa�da pelas chaves/keys	
	 */
	public static void main(String... args) {
		
		Map<String, String> composers = new HashMap(); //implementa um Map
		composers.put("Wagner", "Richard");
		composers.put("Mozard", "Wolfgang Amadeus");
		composers.put("Chopin", "Fryderik Fran�ois");
		
		Set _keys = composers.keySet();//retorna as keys do map
		
		List _toSort = new ArrayList(_keys);//implementa um List podendo ser LinkedList
		
		Collections.sort(_toSort); //m�todo para ordenar
		
		Object[] array = _toSort.toArray(); // converte um list para um array
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}

	}

}
