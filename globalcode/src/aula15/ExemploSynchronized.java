/**
 * 
 */
package aula15;

/**
 * @author jfsilva 18/03/2015
 */
public class ExemploSynchronized {

	public static void main(String[] args) throws Exception {
		ObjetoSincronizado objeto = new ObjetoSincronizado();
		Thread t1 = new Thread(new ProcessadorObjeto01(objeto), "processador01");
		Thread t2 = new Thread(new ProcessadorObjeto02(objeto), "processador02");

		t1.start();
		Thread.sleep(1000); //pausa de 1seg, garante que seja t1 primeiro
		t2.start(); //ficará com o status aguardando o Monitor do objeto 
	}
}

class ProcessadorObjeto01 implements Runnable {
	private ObjetoSincronizado obj;

	ProcessadorObjeto01(ObjetoSincronizado obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.metodoSincronizado1();
	}

}

class ProcessadorObjeto02 implements Runnable {
	private ObjetoSincronizado obj;

	ProcessadorObjeto02(ObjetoSincronizado obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.metodoSincronizado2();
	}

}
