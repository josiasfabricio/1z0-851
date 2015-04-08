/**
 * @see  Implementing hashCode()
 * @page
 */
package capitulo07;

class HasHash {
	
	public int x;
	HasHash(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		HasHash h = (HasHash) o; // Don't try at home without instanceof test
		if (h.x == this.x) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return (x * 17);
	}
}

public class HasHashTest {

	public static void main(String[] args) {
		
		HasHash hh1 = new HasHash(1);
		HasHash hh2 = new HasHash(2);
		
		if (hh1.equals(hh2)) {
			System.out.println("hh1 and hh2 are equal");
		}
		else{
			System.out.println("not are equals");
		}

	}

}
