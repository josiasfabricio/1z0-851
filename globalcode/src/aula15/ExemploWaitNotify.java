/**
 * 
 */
package aula15;

/**
 * @author jfsilva 18/03/2015
 */
public class ExemploWaitNotify {

	public static void main(String[] args) throws Exception {
		CaixaPostal caixa = new CaixaPostal();
		Thread t1 = new Thread(new ConsumidorMensagens(caixa),"consumidorMensagens");
		Thread t2 = new Thread(new ProdutorMensagens(caixa),"produtorMensagens");

		t1.start();
		Thread.sleep(1000);

		t2.start();
	}

}
