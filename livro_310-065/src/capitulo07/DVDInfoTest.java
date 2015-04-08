/**
 * @see  
 * @page
 */
package capitulo07;

import java.util.ArrayList;

/**
 * @author jfsilva 08/04/2015
 */
public class DVDInfoTest {

	/**
	 * @author jfsilva
	 * @version last update: 08/04/2015
	 * @param args
	 *            void
	 */
	public static void main(String[] args) {

		ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
		populateList(); // adds the file data to the ArrayList
		System.out.println(dvdList);
	}
	
	private static void populateList() {
	}
}

class DVDInfo {
	String title;
	String genre;
	String leadActor;
	
	DVDInfo(String t, String g, String a) {
		title = t;
		genre = g;
		leadActor = a;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the leadActor
	 */
	public String getLeadActor() {
		return leadActor;
	}

	/**
	 * @param leadActor the leadActor to set
	 */
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	

	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}

}