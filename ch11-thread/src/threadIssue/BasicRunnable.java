package threadIssue;

public class BasicRunnable implements Runnable {

	private int i;	//this field will be shared!
	
	@Override
	public void run() {
		for(i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
	}

}
