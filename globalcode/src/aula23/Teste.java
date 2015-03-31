package aula23;
import static java.lang.System.out;

public class Teste {

	public static void main(String[] args) {
		int output = 10;
		boolean b1 = false;
		
		if ((b1 == true) && ((output += 10) == 20)) { // && avalia a primeira expressão se for falsa não irá avaliar a segunda
			out.printf("We are equal %d", output);
		}else{
			out.printf("Not equal! %d", output);
		}

	}

}
