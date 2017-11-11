package cachedIssue;

public class CachedDataIssue {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(int i = 0; i < 300; i++) {
			System.out.println("A");
		}
		/*
		 * if you use normal var running, thread cannot know this time running should be false
		 * so volatile can pass value into thread intermediately, 
		 * generally used in shutting down thread precisely
		 */
		r1.running = false;

	}

}
