package practice.q8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("blue", "green", "yellow");
		Predicate<String> test = n -> {
			System.out.println("finding...");
			return n.contains("blue");
		};
		
		/*
		 * just print one finding...,
		 * because allMatch is short circuit terminal operation
		 */
		list.stream().filter(c -> c.length() > 4).allMatch(test);

	}

}
