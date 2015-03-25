/**
 * @see  Synchronizing a Block of Code
 * @page
 */
package capitulo09;

/**
 * @author jfsilva 25/03/2015
 */
public class InSync extends Thread {

	StringBuffer letter;

	public InSync(StringBuffer letter) {
		this.letter = letter;
	}

	public void run() {
		synchronized (letter) { // #1
			for (int i = 1; i <= 100; ++i)
				System.out.print(letter);
			
			System.out.println();
			char temp = letter.charAt(0);
			++temp; // Increment the letter in StringBuffer:
			letter.setCharAt(0, temp);
		} // #2
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("A");
		new InSync(sb).start(); 
		new InSync(sb).start();
		new InSync(sb).start();
	}
	
	

}
