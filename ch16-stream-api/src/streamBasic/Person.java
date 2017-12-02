package streamBasic;

import java.util.Arrays;
import java.util.List;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public static List<Person> getPersonList() {
		List<Person> people = Arrays.asList(new Person("Max", 18), 
											new Person("Peter", 23), 
											new Person("Pamela", 23), 
											new Person("David", 12));
		return people;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
