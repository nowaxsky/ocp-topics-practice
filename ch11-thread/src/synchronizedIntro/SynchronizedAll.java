package synchronizedIntro;

import java.util.Date;

public class SynchronizedAll {

	private void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
	}
	
	public synchronized void m1() {
		sleep();
		System.out.println("-- Run m1() at: " + new Date());
	}
	
	public synchronized void m2() {
		sleep();
		System.out.println("-- Run m2() at: " + new Date());
	}
	
	public void m3() {
		sleep();
		System.out.println("-- Run m3() at: " + new Date());
	}
}
