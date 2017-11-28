package advancedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private String email;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
	public void printPerson() {
		System.out.println(this);
	}
	
	public static List<Person> createPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Bob", "bob@x.com", 21));
		people.add(new Person("Jane", "jane@x.com", 34));
		people.add(new Person("John", "johnx@x.com", 25));
		people.add(new Person("Phil", "phil@x.com", 65));
		people.add(new Person("Betty", "betty@x.com", 55));
		return people;
	}
	
	@Override
	public String toString() {
		return "Name=" + name + ", age" + age + ", email=" + email;
	}
}
