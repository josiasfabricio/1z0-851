/**
 * 
 */
package aula15;

/**
 * @author jfsilva 18/03/2015
 */
public class ConsumidorMensagens implements Runnable {

	private final CaixaPostal caixa;

	public ConsumidorMensagens(CaixaPostal caixa) {
		this.caixa = caixa;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		
		while (caixa.getMensagem() == null) { 
			
			synchronized (caixa) {
				
				try {
					caixa.wait(); //espera se não tem mensagens
					System.out.println("Fui notificado");
					
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				
			}
		}
		System.out.println(caixa.getMensagem());
	}
}
