package optional;

import java.util.Optional;

public class NewMethod {

	public static Optional<Double> average(int... scores) {
		if(scores.length == 0) return Optional.empty();
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		return Optional.of((double) sum / scores.length);
	}
	
	/*
	 * how to wrap value to optional?
	 * see following 2 methods:
	 */
	public static <T> Optional<T> createOptionalMethod1(T value) {
		Optional<T> o = (value == null) ? Optional.empty() : Optional.of(value);
		return o;
	}
	
	public static <T> Optional<T> createOptionalMethod2(T value) {
		Optional<T> o = Optional.ofNullable(value);
		return o;
	}
	
	
	public static void main(String[] args) {
		System.out.println("optional avg method(90, 100): " + average(90, 100));
		System.out.println("optional avg method(empty): " + average());
		
		Optional<Double> optOK = average(90, 100);
		Optional<Double> optNG = average();
		
		System.out.println("\n====================get()");
		if(optOK.isPresent()) {
			System.out.println("isPresent() = true:\t" + optOK.get());
		}
		System.out.println("isPresent() = false:\tit will throw NoSuchElementException");
//		System.out.println("optional get value: " + optNG.get());	//NoSuchElementException
		
		
		System.out.println("\n====================ifPresent(Consumer)");
		//ifPresent need a consumer
		optOK.ifPresent(d -> System.out.println("isPresent() = true:\t" + d));
		System.out.println("isPresent() = false:\tdo nothing(cannot execute Consumer)");
		optNG.ifPresent(d -> System.out.println("isPresent() = false:\t" + d));
		
		System.out.println("\n====================orElse(T)");
		System.out.println("isPresent() = true:\t" + optOK.orElse(Double.NaN));
		System.out.println("isPresent() = false:\t" + optNG.orElse(Double.NaN));
		
		System.out.println("\n====================orElseGet(Supplier)");
		System.out.println("isPresent() = true:\t" + optOK.orElseGet(() -> Math.random()));
		System.out.println("isPresent() = false:\t" + optNG.orElseGet(() -> Math.random()));
		
		System.out.println("\n====================orElseThrow(Supplier)");
		System.out.println("isPresent() = true:\t" + optOK.orElseThrow(() -> new IllegalStateException()));
		System.out.println("isPresent() = false:\tit will throw Exception define in Supplier");
//		System.out.println("isPresent() = false:\t" + optNG.orElseThrow(() -> new IllegalStateException()));
		

	}

}
