package deadLock;

public class DeadLockDemo2 {

	/*
	 * this is another dead lock example
	 */	
	public static void main(String[] args) {
		
		final DeadLock2Thread obj1 = new DeadLock2Thread();
		final DeadLock2Thread obj2 = new DeadLock2Thread();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				obj1.display(obj2);
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				obj2.display(obj1);	
			}
		}).start();

	}

}
