/**
 * 
 */
package aula17;

/**
 * @author jfsilva 20/03/2015
 */
class Vehicle {
	void move() {
		System.out.println("moving");
	}

	void stop() {
		System.out.println("stopping");
	}
}

public class Car extends Vehicle {
	void isOutOfFuel() {
		System.out.println("no");
	}

	void stop() {
		System.out.println("parking");
	}

	public static void main(String[] args) {
		
		/**
		 * Atribuição de uma instância de Car para uma referência de Vehicle
		 */
		Vehicle v = new Car(); // UP-Cast 
		
		/**
		 * Sobrescrita apontando para a atribuição de Car,
		 * chamando o método na instância que esta sendo apontada por "v", no caso de Car.
		 * Não depende do tipo da referência quem vai executar o método, em tempo de execução
		 * que executa o método é um objeto, depende do tipo da instância, no caso o stop() da
		 * classe Car.
		 */
		v.stop();
		
		/**
		 * "v" é uma referência de Vehicle, dessa maneira só é possivel chamar os métodos dessa
		 * classe, dessa maneira o método isOutOfFuel() esta definido na classe Car
		 */
		v.isOutOfFuel(); //não pode ser chamado pois v faz referência a Vehicle.
	}

}
