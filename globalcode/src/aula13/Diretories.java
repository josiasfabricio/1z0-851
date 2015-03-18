/**
 * 
 */
package aula13;

import java.io.File;

/**
 * @author jfsilva 16/03/2015
 */
public class Diretories {

	static String[] dirs = { "dir1", "dir2" };

	/**
	 * @author jfsilva
	 * @version last update: 16/03/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {
		for (String d : dirs) {
			String path = d;
			File file = new File(path, args[0]);
			System.out.print(file.exists() + " ");
		}
	}
}
