/**
 * 
 */
package aula04;

/**
 * @author jfsilva
 * 03/03/2015
 */
class Hello {

	static String msg = new String();
	
	void compliment(String s){
		msg += s;
		System.out.print(msg + "\t");
	}
	/**
	 * @author jfsilva 
	 * @version last update: 03/03/2015
	 * @param args 
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		h1.compliment("how.");
		h1.compliment("are.");
		h2.compliment("you.");
	}

}
