package practice.q24;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> exts = Arrays.asList("KLS", "MPEG4", "JPEG");
		exts.forEach(e -> System.out.print(e + " "));
		
		System.out.println("\n");
		
		String exts2 = exts.stream()
						   .filter(s -> s.contains("PEG"))
						   .peek(System.out::println)
						   .reduce((e1, e2) -> e1 + e2)
						   .get();
		
		System.out.println("\n" + exts2);

	}

}
