package intro;

public class Main {

	/*
	 * two way to implement thread:
	 * 
	 * 1.extend Thread: easy
	 * 2.implement Runnable: more custom and can extend other class
	 * 
	 */
	public static void main(String[] args) {
		
		//if you want to use thread, you have to call start() instead of run()
		BasicThread t1 = new BasicThread();
		t1.start();
		
		BasicRunnable r1 = new BasicRunnable();
		Thread t2 = new Thread(r1);
		t2.start();

	}

}
