/**
 * 
 */
package aula23;

import static java.lang.System.out;

class ValHold{
	public int i = 10;
}

public class ObParm {

	public static void main(String[] args) {
		ObParm o = new ObParm();
		o.amethod();
	}
	
	public void amethod(){
		int i = 99;
		ValHold v = new ValHold();
		v.i = 30;
		another(v, i);		
		out.printf("%d",v.i);		
	}
	
	public void another(ValHold v, int i){
		i = 0;
		v.i = 20;
		ValHold vh = new ValHold();
		v = vh;
		out.printf("%d",v.i);	
		out.printf("%d",i);	
	}

}
