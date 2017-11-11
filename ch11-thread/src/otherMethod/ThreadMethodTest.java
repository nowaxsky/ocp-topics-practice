package otherMethod;

public class ThreadMethodTest {

	public static void main(String[] args) {
		System.out.println("Thread main is starting...");
		
		//main and t run respectively
		//testNormal();
		
		//when use t.join(), t will run before main, and main pauses till t finished
		//testJoin();
		
		//when non-daemon finished, JVM will shut down, so if you set daemon to true, method will not complete
		testDaemon();
		System.out.println("Thread main is ending...");

	}
	
	private static void testNormal() {
		Thread t = new ThreadTest();
		t.start();
	}
	
	private static void testJoin() {
		Thread t = new ThreadTest();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void testDaemon() {
		Thread t = new ThreadTest();
		t.setDaemon(true);
		t.start();
		//t.setDaemon(true);	//IllegalThreadStateException
		
	}

}
