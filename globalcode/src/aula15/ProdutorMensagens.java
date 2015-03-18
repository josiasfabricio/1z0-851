/**
 * 
 */
package aula15;

/**
 * @author jfsilva
 * 18/03/2015
 */
public class ProdutorMensagens implements Runnable {

	private final CaixaPostal caixa;

	public ProdutorMensagens(CaixaPostal caixa) {
		this.caixa = caixa;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		synchronized (caixa) { //obter o Monitor do objeto CaixaPostal
			caixa.setMensagem("Mensagem da caixa postal");
			caixa.notifyAll(); //notifica eventuais threads que estão esperando
		}		
	}
}
