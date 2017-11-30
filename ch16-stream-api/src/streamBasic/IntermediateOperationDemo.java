package streamBasic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationDemo {

	public static void createStream() {
		System.out.println("====================create Stream method");
		Stream<String> s1 = Arrays.asList("1", "2", "3", "4").stream();
		Stream<Integer> s2 = Arrays.asList(1, 2, 3, 4).stream();
		
		Stream<String> s3 = Stream.of("1", "2", "3", "4");
		Stream<Integer> s4 = Stream.of(1, 2, 3, 4);
		
		Stream<String> s5 = Arrays.stream(new String[] {"1", "2", "3", "4"});
		IntStream s6 = Arrays.stream(new int[] {1, 2, 3, 4});
		
		s1.forEach(System.out::println);
	}
	
	public static void testMap() {
		System.out.println("====================map test");
		Function<Integer, Integer> mapper = n -> 2 * n;
		Stream<Integer> mapResult = Stream.of(1, 2, 3, 4).map(mapper);
		
		Object[] arr = mapResult.toArray();
		List<Object> list = Arrays.asList(arr);
		System.out.println(list);
	}
	
	public static void testMapToInt() {
		System.out.println("====================mapToInt test");
		ToIntFunction<String> mapper = Integer::parseInt;
		IntStream mapResult = Stream.of("a11", "a12", "a13").map(s -> s.substring(1)).mapToInt(mapper);
		
		mapResult.forEach(i -> System.out.println(i));
	}
	
	public static void testPeek() {
		System.out.println("====================peek test");
		Consumer<Integer> action = System.out::println;
		
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4).peek(action);
		Stream<Integer> stream2 = Stream.of(5, 6, 7, 8).peek(action);
		
		/*
		 * Streams may be lazy.
		 * Computation on the source data is performed only when the terminal operation is initiated,
		 * and source elements are consumed only as needed.
		 * 
		 * e.g, stream1 peek is not executed, but stream2 is executed owing to toArray() method
		 * 
		 */
		System.out.println("length: " + stream2.toArray().length);
		
		Stream.of("a", "aa", "aaa", "aaaa")
				.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e))
				.map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e))
				.forEach(System.out::println);
	}
	
	public static void testSorted() {
		System.out.println("====================sorted test");
		List<String> list = Arrays.asList("a2", "a1", "b1", "c2", "c1");
		list.stream().sorted().forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		list.stream().sorted(String::compareTo).forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		list.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(s -> System.out.print(s + " "));
	}
	
	
	public static void main(String[] args) {
		createStream();
		testMap();
		testMapToInt();
		testPeek();
		testSorted();

	}

}
