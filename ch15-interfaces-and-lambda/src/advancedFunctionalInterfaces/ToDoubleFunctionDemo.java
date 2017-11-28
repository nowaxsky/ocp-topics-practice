package advancedFunctionalInterfaces;

import java.util.List;
import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionDemo {

	public static void main(String[] args) {
		List<Person> p1 = Person.createPeople();
		Person first = p1.get(0);
		ToDoubleFunction<Person> convertAgeToDouble = p -> p.getAge();
		System.out.println(convertAgeToDouble.applyAsDouble(first));

	}

}
