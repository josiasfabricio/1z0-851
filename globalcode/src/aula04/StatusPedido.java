/**
 * 
 */
package aula04;

/**
 * @author jfsilva 03/03/2015
 */
public enum StatusPedido {
	CANCELADO("cancelado") {
		int nome;

		public void metodo() {
			System.out.println("cancelado");
		}
	},
	ENVIADO("enviado"), RECEBIDO("recebido");
	String nome;

	StatusPedido(String nome) {
		this.nome = nome;
	}

	public void metodo() {
		System.out.println("método do enum");
	}
}

class Status {
	final static Status 
	CANCELADO = new Status(),
	ENVIADO = new Status(),
	RECEBIDO = new Status();
}
