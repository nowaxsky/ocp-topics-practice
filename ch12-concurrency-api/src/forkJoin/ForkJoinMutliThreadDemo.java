package forkJoin;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ThreadLocalRandom;

public class ForkJoinMutliThreadDemo {

	public static void main(String[] args) {
		Date begin = new Date();
		
		//create data
		int[] bigData = new int[1024 * 1024 * 256];
		for(int i = 0; i < bigData.length; i++) {
			bigData[i] = ThreadLocalRandom.current().nextInt();
		}
		
		FindMaxTask task = new FindMaxTask(bigData.length / 16, bigData, 0, bigData.length - 1);
		
		ForkJoinPool pool = new ForkJoinPool();
		Integer max = pool.invoke(task);
		System.out.println("\nMax value found: " + max);
		
		long t = new Date().getTime() - begin.getTime();
		System.out.println("Complete task within: " + t + " milliseconds");

	}

}
