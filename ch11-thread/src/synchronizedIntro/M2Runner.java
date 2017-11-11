package synchronizedIntro;

public class M2Runner extends Thread {

	SynchronizedAll o;
	
	public M2Runner(SynchronizedAll o) {
		this.o = o;
	}
	
	@Override
	public void run() {
		o.m2();
	}
}
