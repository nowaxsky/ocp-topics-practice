package advancedFunctionalInterfaces;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		List<Person> p1 = Person.createPeople();
		Person first = p1.get(0);
		UnaryOperator<String> unaryStr = s -> s.toUpperCase();
		System.out.println("Before: " + first.getName());
		System.out.println("After: " + unaryStr.apply(first.getName()));

	}

}
