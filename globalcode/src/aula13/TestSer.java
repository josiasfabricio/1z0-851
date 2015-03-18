/**
 * 
 */
package aula13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author jfsilva 16/03/2015
 */
public class TestSer {

	public static void main(String[] args) {
		
		SpecialSerial s = new SpecialSerial();
		
		try {
			
			ObjectOutputStream os = new ObjectOutputStream(
					new FileOutputStream("myFile.txt")); //serialização
			os.writeObject(s);
			os.close();
			System.out.print(++s.z + " ");
			
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(
					"myFile.txt")); //deserialização
			SpecialSerial s2 = (SpecialSerial) is.readObject();
			is.close();
			System.out.println(s2.y + " " + s2.z);
			
		} catch (Exception x) {
			System.out.println("exc");
		}

	}

}

class SpecialSerial implements Serializable {
	transient int y = 7;
	static int z = 9;
}
