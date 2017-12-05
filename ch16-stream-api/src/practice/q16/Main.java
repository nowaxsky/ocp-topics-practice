package practice.q16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Staff> list = Arrays.asList(new Staff("Duke", 25), new Staff("John", 60), new Staff("Jim", 51));
		Predicate<Staff> testAge = s -> s.getAge() > 50;
		
		list = list.stream().filter(testAge).collect(Collectors.toList());
		
		Stream<String> eids = list.stream().map(Staff::getEid);
		
		eids.forEach(n -> System.out.print(n + " "));

	}

}
