package intro;

public class BasicRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("i: " + i);
		}
	}

}
