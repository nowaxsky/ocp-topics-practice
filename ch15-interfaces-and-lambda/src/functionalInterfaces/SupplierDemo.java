package functionalInterfaces;

import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Person> personSupplier = 
				() -> new Person("New", "new@x.com", 21);					
		/* use anonymous inner class:	
		Supplier<Person> personSupplier = new Supplier<Person>() {
			public Person get() {
				return new Person("New", "new@x.com", 21);
			}
		};	
		*/
		System.out.println(personSupplier.get());
	}
}
