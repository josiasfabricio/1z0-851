/**
 * 
 */
package aula17;

/**
 * @author jfsilva
 * 20/03/2015
 */
public abstract class AbsFactory {
	protected abstract Runnable buildRunnable(int counter);
	
	Number buildWrapper(String value){
		return new Short(value);
	}

}
