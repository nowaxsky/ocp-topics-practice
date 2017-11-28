package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {		
		Predicate<Person> olderThan23 = p -> p.getAge() >= 23;	
		/* use anonymous inner class:
		Predicate<Person> olderThan23 = new Predicate<Person>() {
			public boolean test(Person p) {
				return p.getAge() >= 23;
			}
		};	
		*/
		for (Person p : Person.createList()) {
			if (olderThan23.test(p)) {
				System.out.println(p);
			}
		}
	}
}
