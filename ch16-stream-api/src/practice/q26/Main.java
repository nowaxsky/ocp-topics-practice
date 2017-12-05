package practice.q26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(11, 22, 8);
		System.out.println(ints.stream().max(Comparator.comparing(a -> a)).get());
		System.out.println(ints.stream().mapToInt(a -> a).max());

	}

}
