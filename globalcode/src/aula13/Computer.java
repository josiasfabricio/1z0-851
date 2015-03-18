/**
 * 
 */
package aula13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Keyboard { // não implementa serialização
}

/**
 * @author jfsilva 16/03/2015
 */
public class Computer implements Serializable { 
	//todos atributos tem que ser serializados

	private Keyboard k = new Keyboard(); // não implementa serialização
	
	public static void main(String[] args) {
		Computer c = new Computer();
		c.storeIt(c);
	}

	void storeIt(Computer c) {
		try {
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("myFile"));
			os.writeObject(c);
			os.close();
			System.out.println("done");
		} catch (Exception x) {
			System.out.println("exec");
		}
	}

}
