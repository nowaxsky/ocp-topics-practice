package practice.q11;

public class Person {

	String name;
	int age;
	
	public Person(String name, int age) throws Exception {
		if(name == null) {
			throw new NoNameException();
		} else if (age <= 0 || age >= 120) {
			throw new AgeOutOfRangeException();
		} else {
			this.name = name;
			this.age = age;
		}
	}
	
	@Override
	public String toString() {
		return name + ", " + age;
	}
	
}
