package reduction;

import java.util.stream.IntStream;

public class ReductionDemo {

	private static void testReduceInSequential() {
		
		System.out.println("==========test reduce in sequential");
		//10+1+2+3+4
		int result1 = IntStream.rangeClosed(1, 4)
							   .reduce(10, (sum, element) -> sum + element);
		
		//10+1+2+3
		int result2 = IntStream.range(1, 4)
				  			   .reduce(10, (sum, element) -> sum + element);
		
		System.out.println(result1);
		System.out.println(result2);
	}
	
	private static void testReduceWithCompactly() {
		System.out.println("==========test reduce with compactly");
		int sum = IntStream.rangeClosed(1, 4).reduce(0, Integer::sum);
		int max = IntStream.rangeClosed(1, 4).reduce(0, Integer::max);
		int min = IntStream.rangeClosed(1, 4).reduce(0, Integer::min);
		
		System.out.println("sum = " + sum);
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
	}
	
	private static void testReduceInParallel() {
		System.out.println("==========test reduce in parallel");
		int result = IntStream.rangeClosed(1, 8)
							   .parallel()
							   .reduce(0, (sum, element) -> sum + element);
		System.out.println(result);
	
	}
	
	public static void main(String[] args) {
		testReduceInSequential();
		testReduceWithCompactly();
		testReduceInParallel();

	}

}
