package synchronizers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		int stopUntil = 2;
		int totalThreadCnt = 3;
		 
		final CyclicBarrier barrier = new CyclicBarrier(stopUntil);
		for(int i = 1; i <= totalThreadCnt; i++) {
			new Thread() {
				@Override
				public void run() {
					try {
						System.out.println("before await");
						
						//await 2 thread arrive here to restore executing
						//so this example will make JVM cannot shut down owing to waiting for one thread arrive here
						barrier.await();
						System.out.println("after await");
					} catch (BrokenBarrierException | InterruptedException e) {}
				};
			}.start();
		}

	}

}
