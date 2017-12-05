package practice.q17;

import java.util.function.Predicate;

public interface TechFilter extends Predicate<String> {

	public default boolean test(String str) {
		System.out.println("default test");
		return str.equals("Java");
	}
}
