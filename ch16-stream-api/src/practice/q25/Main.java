package practice.q25;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(10, 20, 30);
		IntFunction<IntUnaryOperator> IF = x -> y -> x * y;
		IntStream newStream = stream.map(IF.apply(15));
		newStream.forEach(System.out::println);

	}

}
