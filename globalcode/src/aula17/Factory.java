/**
 * 
 */
package aula17;

/**
 * @author jfsilva
 * 20/03/2015
 */
public class Factory extends AbsFactory {

	/* (non-Javadoc)
	 * @see aula17.AbsFactory#buildRunnable(int)
	 */
	@Override
	public Thread buildRunnable(int counter) {//-> Sobrescrita de método tornando menos restritivo
		/**
		 * Retorno Covariante sendo Thread um subtipo de Runnable
		 */
		return new Thread(); 
	}
	
	Double buildWrapper(String value){
		/**
		 * Retorno Covariante sendo Double um subtipo de Number
		 */
		return new Double(value);
		/**
		 * Não existe Retorno Covariante para primitivos, no caso double
		 */
	}
}
