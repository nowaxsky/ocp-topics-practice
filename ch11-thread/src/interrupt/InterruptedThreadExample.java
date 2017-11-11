package interrupt;

public class InterruptedThreadExample {

	/*
	 * you can use interrupt to stop the thread
	 */
	public static void main(String[] args) {
		InterruptedRunnable r1 = new InterruptedRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		try {
			//pause thread 1 ms
			Thread.sleep(1);
		} catch (InterruptedException e) {}
		t1.interrupt();

	}

}
