/**
 * 
 */
package aula20;

import java.util.*;

/**
 * @author jfsilva
 * 25/03/2015
 */
public class CollectionTester {

	public static void main(String[] args) {
		
		List<Byte> myBytes = new ArrayList<Byte>(); 
		
		feedTheBears(myBytes);
		
		for (Byte b : myBytes) {//erro de extração do Integer para Byte
			System.out.println(b);
		}
	}
	
	static void feedTheBears(List bears){
		
		//adiciona fazendo autoboxing virando um Integer, adiciona Integer em vez de Byte
		bears.add(123);
	}

}
