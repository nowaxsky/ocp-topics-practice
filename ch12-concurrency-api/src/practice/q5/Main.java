package practice.q5;

import java.util.concurrent.ForkJoinPool;

public class Main {

	public static void main(String[] args) {
		FibonacciTask task = new FibonacciTask(11);
		ForkJoinPool pool = new ForkJoinPool();
		int r = pool.invoke(task);
		
		System.out.println("result = " + r);

	}

}
