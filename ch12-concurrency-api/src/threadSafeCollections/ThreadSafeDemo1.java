package threadSafeCollections;

public class ThreadSafeDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new AddThread());
		Thread t2 = new Thread(new AddThread());
		
		t1.start();
		t2.start();
		
		Thread.sleep(1000);
		System.out.println("=====");
		for(Integer i: Container.list) {
			System.out.println(i);
		}
	}

}
