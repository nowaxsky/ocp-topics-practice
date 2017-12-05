package practice.q17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java FX", "Java SE");
		Predicate<String> p1 = s -> s.length() > 3;
		
		Predicate<String> p2 = new TechFilter() {
			
			@Override
			public boolean test(String s) {
				
				System.out.println("override test");
				return s.contains("Java");
			};
		};
		
		long qty = strs.stream().filter(p1).filter(p2).count();
		System.out.println(qty);

	}

}
