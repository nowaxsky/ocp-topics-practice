package synchronizedIntro;

public class M3Runner extends Thread {

	SynchronizedAll o;
	
	public M3Runner(SynchronizedAll o) {
		this.o = o;
	}
	
	@Override
	public void run() {
		o.m3();
	}
}
