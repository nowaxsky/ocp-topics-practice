package forkJoin;

import java.util.concurrent.ThreadLocalRandom;

public class SingleThreadDemo {

	public static void main(String[] args) {
		int[] bigData = new int[1024 * 1024 * 256];
		for(int i = 0; i < bigData.length; i++) {
			bigData[i] = ThreadLocalRandom.current().nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int value: bigData) {
			if(value > max) {
				max = value;
			}
		}
		System.out.println("Found max value: " + max);
		System.out.println("Max value if integer: " + Integer.MAX_VALUE);
	}
}
