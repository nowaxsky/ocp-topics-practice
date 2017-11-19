package practice.q11;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(r, "one ");
		t1.start();
		
		//Thread.sleep means current thread sleep(main thread instead of t1)
		//Thread.sleep(4000);
		t1.sleep(4000);
		
		Thread t2 = new Thread(r, "two ");
		t2.start();
		t2.sleep(2000);
		
		System.out.println("more ");

	}

}
