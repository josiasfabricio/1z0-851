/**
 * 
 */
package aula06;

/**
 * @author jfsilva
 * 05/03/2015
 */
public class Tester {

	/**
	 * @author jfsilva 
	 * @version last update: 05/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9};
		for(int x : a ){
			if(x % 2 == 0)
				continue;
			for(int i = 1; a[i] <= x; i +=2)
				System.out.print(x);
			if(x > 6)
				break;
		}

	}

}
