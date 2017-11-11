package deadLock;

public class DeadLockDemo {

	private static void _sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		final String resource1 = "jim1";
		final String resource2 = "jim2";
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");
					_sleep();
					System.out.println("Thread 1: try to lock resource 2...");
					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			};
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized (resource2) {
					System.out.println("Thread 2: locked resource 2");
					_sleep();
					System.out.println("Thread 2: try to lock resource 1...");
					synchronized (resource1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			};
		};
		
		t1.start();
		t2.start();

	}

}
