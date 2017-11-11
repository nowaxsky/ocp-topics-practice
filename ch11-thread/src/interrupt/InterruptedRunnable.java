package interrupt;

public class InterruptedRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread started");
		while(!Thread.interrupted()) {
			System.out.println("I am running...");
		}
		System.out.println("Thread finishing");
		
	}

}
