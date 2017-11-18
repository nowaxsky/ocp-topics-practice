package practice.q5;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2966196548648480181L;

	final int i;
	
	public FibonacciTask(int i) {
		super();
		this.i = i;
	}

	@Override
	protected Integer compute() {
		if(i <= 1) {
			return i;
		} else {
			FibonacciTask f1 = new FibonacciTask(i - 1);
			f1.fork();
			FibonacciTask f2 = new FibonacciTask(i - 2);
			return f2.compute() + f1.join();
		}
	}
	

}
