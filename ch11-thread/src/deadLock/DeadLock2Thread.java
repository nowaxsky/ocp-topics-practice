package deadLock;

public class DeadLock2Thread extends Thread {

	int i = 10;
	public synchronized void display(DeadLock2Thread obj) {
		try {
			System.out.println("Thead starts...");
			Thread.sleep(5);
			obj.increment(this);
			System.out.println("Thead ends...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void increment(DeadLock2Thread obj) {
		i++;
	}
}
