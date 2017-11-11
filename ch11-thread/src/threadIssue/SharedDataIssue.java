package threadIssue;

public class SharedDataIssue {

	public static void main(String[] args) {
		BasicRunnable r1 = new BasicRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(r1);
		t2.start();
		
		//outcome is: 0, 0, 1, 2, 3...
		//but expected is: 0, 1, 2, 3...
	}

}
