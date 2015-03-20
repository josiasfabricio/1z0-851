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
		 * Atribui��o de uma inst�ncia de Car para uma refer�ncia de Vehicle
		 */
		Vehicle v = new Car(); // UP-Cast 
		
		/**
		 * Sobrescrita apontando para a atribui��o de Car,
		 * chamando o m�todo na inst�ncia que esta sendo apontada por "v", no caso de Car.
		 * N�o depende do tipo da refer�ncia quem vai executar o m�todo, em tempo de execu��o
		 * que executa o m�todo � um objeto, depende do tipo da inst�ncia, no caso o stop() da
		 * classe Car.
		 */
		v.stop();
		
		/**
		 * "v" � uma refer�ncia de Vehicle, dessa maneira s� � possivel chamar os m�todos dessa
		 * classe, dessa maneira o m�todo isOutOfFuel() esta definido na classe Car
		 */
		v.isOutOfFuel(); //n�o pode ser chamado pois v faz refer�ncia a Vehicle.
	}

}
