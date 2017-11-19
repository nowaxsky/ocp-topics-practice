package forkJoin;

import java.util.concurrent.RecursiveTask;

public class FindMaxTask extends RecursiveTask<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1978148372357660426L;
	
	static int counter = 0;
	private final int threshold;
	private final int[] data;
	private int begin;
	private int end;

	public FindMaxTask(int threshold, int[] data, int begin, int end) {
		super();
		this.threshold = threshold;
		this.data = data;
		this.begin = begin;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		if(end - begin < threshold) {
			System.out.printf("%02d", ++counter);
			System.out.print(": " + Thread.currentThread().getName());
			System.out.println(" | " + begin + " ~ " + end);
			int max = Integer.MAX_VALUE;
			for(int i = begin; i < end; i++) {
				int n = data[i];
				if(n > max) {
					max = n;
				}
			}
			return max;
		} else {
			int mid = (end - begin) / 2 + begin;
			FindMaxTask a1 = new FindMaxTask(threshold, data, begin, mid);
			a1.fork();
			FindMaxTask a2 = new FindMaxTask(threshold, data, mid + 1, end);
			return Math.max(a2.compute(), a1.join());
		}
	}

}
