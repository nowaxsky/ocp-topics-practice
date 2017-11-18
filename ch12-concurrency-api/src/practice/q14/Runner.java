package practice.q14;

public class Runner implements Runnable {

	String s;
	
	public Runner(String s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		System.out.println(s + " Runner");
	}

	
}
