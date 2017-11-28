package practice.q2;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		UnaryOperator<Double> uod = d -> d + 100.0;
		
//		List<Integer> ints = Arrays.asList(15, 25);	//compile error
		List<Double> ints = Arrays.asList(15.0, 25.0);
		ints.replaceAll(uod);
		ints.forEach(i -> System.out.println(i));

	}

}
