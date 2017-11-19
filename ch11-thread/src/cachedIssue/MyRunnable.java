package cachedIssue;

public class MyRunnable implements Runnable {

	//use volatile to deny copying cached data
	public volatile boolean running = true;
	
	//this is different with thread-safe, 
	//although you use volatile, maybe have thread-safe problem
	private volatile int i;
	
	@Override
	public void run() {
		System.out.println("Thread started");
		while(running) {
			for(i = 0; i < 10; i++) {
				System.out.println("i: " + i);
			}
		}
		System.out.println("Thread finished");
	}

}
