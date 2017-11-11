package synchronizedIntro;

public class M1Runner extends Thread {

	SynchronizedAll o;
	
	public M1Runner(SynchronizedAll o) {
		this.o = o;
	}
	
	@Override
	public void run() {
		o.m1();
	}
}
