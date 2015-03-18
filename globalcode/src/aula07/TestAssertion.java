/**
 * 
 */
package aula07;

/**
 * @author jfsilva 06/03/2015
 */
class MyAssert {
	void m1(int i) {
		int j = i % 3;

		switch (j) {
		case 0:
			System.out.print("0");
			break;
		case 1:
			System.out.print("1");
			break;
		default:
			assert j == 2;
			System.out.print(j);
		}
	}
}

public class TestAssertion {

	/**
	 * @author jfsilva
	 * @version last update: 06/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		MyAssert a = new MyAssert();		
		for(int i = 5; i >= -1; i--){
			a.m1(i);
		}
	}

}
