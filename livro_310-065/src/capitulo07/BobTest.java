/**
 * @see  The toString() Method
 * @page 543
 */
package capitulo07;

/**
 * @author jfsilva 01/04/2015
 */
public class BobTest {
	public static void main(String[] args) {
		Bob f = new Bob("GoBobGo", 19);

		System.out.println(f);
	}
}

class Bob {
	int shoeSize;
	String nickName;

	Bob(String nickName, int shoeSize) {
		this.shoeSize = shoeSize;
		this.nickName = nickName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ("I am a Bob, but you can call me " + nickName +
				". My shoe size is " + shoeSize);
	}
}
