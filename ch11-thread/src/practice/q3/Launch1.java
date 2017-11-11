package practice.q3;

public class Launch1 {

	static MyThread t = new MyThread();
	
	public Launch1() {
		new Thread(t, "const").start();
	}
	
	public static void main(String[] args) {
		new Launch1();
		new Launch2().go();
	}
	
	static class Launch2 {
		void go() {
			new Thread(t, "inner").start();
		}
	}

}
