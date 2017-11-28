package methodRef;

import functionalInterfaces.Person;

public class PersonComparator {

	public int compareName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public static int compareEmail(Person a, Person b) {
		return a.getEmail().compareToIgnoreCase(b.getEmail());
	}
}
