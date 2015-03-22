package threads;

class TestClassThread extends Thread{
	public void run(){
		System.out.println("in TestClassThread");
	}	
}

class MyTestThread extends Thread{	
	public MyTestThread() {
	}

	public MyTestThread(Runnable r) {
		super(r);
	}

	public void run() {
		System.out.println("in MyTestThread");
	}
	
}

public class MyClass {

	/**
	 * Method run() in class 'MyTestThread' was override what means that now it
	 * will be called instead of method run() of 'result'	
	 */
	public static void main(String[] args) {
		TestClassThread result = new TestClassThread();
		MyTestThread myTest = new MyTestThread(result);
		myTest.start();
	}

}
