package threads;

public class MyExample {

	/**
	 * The variable 'k' in 'MyExampleThread' is cached and any changing of it
	 * from the outside until 'k' would be changed or read inside
	 * 'MyExampleThread'. The loop (like at line 13) 'while' use cached value
	 * 'k' - this is done for effectiveness. So 'while' would get the same old
	 * value '3' for 'k' and loop would never ends, butthere is special modifier
	 * 'volatil' for variable 'k' which garantee that 'k' will not be cached
	 * and its value will be actual at any time and in any thread.	
	 */
	public static void main(String[] args) throws InterruptedException{
		MyExampleThread result = new MyExampleThread();
		result.start();
		Thread.sleep(1000); 
		result.k = 8;
	}

}

class MyExampleThread extends Thread{
	volatile int k = 3;
	public void run(){
		while(k == 3){//line 13
			//nothing here
		}
		System.out.println(k);
	}
}