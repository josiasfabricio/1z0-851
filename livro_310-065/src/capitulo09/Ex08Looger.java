/**
 * @see  
 * @page
 */
package capitulo09;

import static java.lang.System.out;

/**
 * @author jfsilva 26/03/2015
 */
public class Ex08Looger extends Thread{
	
	Logger l;	
	
	public Ex08Looger(Logger l) {
		this.l = l;
	}
	
	public void run(){
		l.log(" "+Thread.currentThread().getId());
		out.printf(" %s %n", l.getContents());		
	}

	public static void main(String... args) {
		Logger myLog = new Logger();
		
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();
		new Ex08Looger(myLog).start();	
	}

}

class Logger {
	public StringBuilder contents = new StringBuilder();

	public void log(String message) {
		synchronized (this) {		
			contents.append(System.currentTimeMillis());
			contents.append(": ");
			contents.append(Thread.currentThread().getName());
			contents.append(message);
			contents.append("\n");			
		}
	}

	public String getContents() {
		synchronized (this) {			
			return contents.toString();
		}		
	}
}