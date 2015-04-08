/**
 * @see  
 * @page
 */
package capitulo07;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		
		Collections.sort(stuff); // #2
		System.out.println("sorted " + stuff);
		
	}
}
