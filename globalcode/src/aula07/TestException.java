/**
 * 
 */
package aula07;

/**
 * @author jfsilva
 * 06/03/2015
 */
class RedException extends Exception {}

class BlueException extends Exception{}

class White{
	void m1() throws RedException{
		throw new RedException();
	}
}

public class TestException {

	/**
	 * @author jfsilva 
	 * @version last update: 06/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		White white = new White();
		int a, b, c, d;
		a = b = c = d = 0;		
		try {
			white.m1();
			a++;
		}
		catch(RedException e){ b++;}
		catch(BlueException e){ c++;}// não declarada no thrwos do método
		finally{d++;}
		System.out.print(a + "," + b + "," + c + ","+ d);
	}
}


