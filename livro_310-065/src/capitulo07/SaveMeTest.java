/**
 * @see  The hashCode() Contract
 * @page
 */
package capitulo07;

import java.io.Serializable;

class SaveMe implements Serializable {
	transient int x;
	int y;

	SaveMe(int xVal, int yVal) {
		x = xVal;
		y = yVal;
	}

	public int hashCode() {
		return (x ^ y); // Legal, but not correct to
		// use a transient variable
	}

	public boolean equals(Object o) {
		SaveMe test = (SaveMe) o;
		if (test.y == y && test.x == x) { // Legal, not correct
			return true;
		} else {
			return false;
		}
	}
}

public class SaveMeTest {

	public static void main(String[] args) {
		SaveMe sm1 = new SaveMe(1, 0);
		SaveMe sm2 = new SaveMe(1, 0);
		
		if (sm1.equals(sm2)) {
			System.out.println("sm1 and sm2 are equals");			
		}else{
			System.out.println("not are equals");
		}
		
	}

}
