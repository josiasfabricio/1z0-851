/**
 * 
 */
package threads;

/**
 * @author jfsilva 23/03/2015
 */
public class SimpleClass implements Runnable {

	MyExampleTypes myValue;
	
	public SimpleClass(MyExampleTypes myValue) {
		this.myValue = myValue;
	}
	
	@Override
	public void run() {		
		switch (myValue) {
		case TYPE_A:
			processA();
			break;
			
		case TYPE_B:
			processB();
			break;

		default:
			assert true; 
			assert true;
			break;
		}
	}
	
	public void processA(){
		for (int y = 1; y <= 4; y++) {
			System.out.printf("A:%d ", y);
		}
	}
	
	public void processB(){
		for (int x = 1; x <= 4; x++) {
			System.out.printf("B:%d ", x);
		}
	}
	
	public static void main(String[] args) {
		new SimpleClass(MyExampleTypes.TYPE_A).start(true);
	}
	
	public void start(boolean b){
		new Thread(this).start();
		new Thread(new SimpleClass(MyExampleTypes.TYPE_B)).start();
	}
}

enum MyExampleTypes {
	TYPE_A, TYPE_B;
}
