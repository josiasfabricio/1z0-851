/**
 * 
 */
package aula17;

/**
 * @author jfsilva
 * 20/03/2015
 */
public class Eggs {

	int doX(Long x, Long y){return 1;}
	int doX(long... x){return 2;}
	int doX(Integer x, Integer y){return 3;}
	int doX(Number x, Number y){return 4;}
	
	public static void main(String[] args) {
		new Eggs().go();
	}
	
	void go(){
		short s = 7;
		/**
		 * 1) N�o achou um m�todo doX com dois par�metros short
		 * 2) N�o achou um m�doto doX que recebe outra primitivo para casting: int, long, double
		 * 3) Achou um m�todo doX fazendo AutoBoxing promovendo para Wrapper.class#Short sendo todo Short um Number
		 */
		System.out.print(doX(s, s)+ " ");
		
		/**
		 * 1) N�o achou um m�todo doX com dois par�metros int
		 * 2) N�o achou um m�doto doX que recebe outra primitivo para casting: short, long, double
		 * 3) Achou um m�todo doX fazendo AutoBoxing de Integer
		 */
		System.out.print(doX(7, 7));		
	}

}
