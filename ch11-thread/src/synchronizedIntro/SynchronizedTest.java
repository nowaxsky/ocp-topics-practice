package synchronizedIntro;

import java.util.Date;

public class SynchronizedTest {

	public static void main(String[] args) {
		SynchronizedAll o = new SynchronizedAll();
		System.out.println("Start main at: " + new Date());
		
		Thread m1 = new M1Runner(o);
		m1.start();
		
		Thread m2 = new M2Runner(o);
		m2.start();
		
		Thread m3 = new M3Runner(o);
		m3.start();
		
		System.out.println("End main at: " + new Date());
	}
}
