package advancedFunctionalInterfaces;

import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		List<Person> p1 = Person.createPeople();
		Person first = p1.get(0);
		String testName = "john";
		BiPredicate<Person, String> nameBiPred = (p, s) -> p.getName().equalsIgnoreCase(s);
		System.out.println("Is the first john? " + nameBiPred.test(first, testName));

	}

}
