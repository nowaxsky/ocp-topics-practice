package otherMethod;

public class ThreadTest extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Thread T is starting...");
			for(int i = 0; i < 3; i++) {
				Thread.sleep(1000);
				System.out.println("Thread T is running...");
			}
			System.out.println("Thread T is ending...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
