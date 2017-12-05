package practice.q4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList(new Emp("J", "S"), new Emp("P", "S"), new Emp("P", "W"));
		
		//Emp::getFirstName is not a static method
		emp.stream().sorted(Comparator.comparing(Emp::getFirstName)
									  .reversed()
									  .thenComparing(Emp::getLastName))
					.collect(Collectors.toList());

	}

}
