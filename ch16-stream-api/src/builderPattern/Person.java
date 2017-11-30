package builderPattern;

public class Person {

	private String name;
	private String email;
	private int age;
	
	private Person(Person.Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.email = builder.email;
	}
	
	public static class Builder {
		private String name = "";
		private String email = "";
		private int age = 0;
		
		public Person build() {
			return new Person(this);
		}
		
		public Person.Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Person.Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Person.Builder age(int age) {
			this.age = age;
			return this;
		}
		
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
	
	@Override
	public String toString() {
		return "Name=" + name + ", Age=" + age + ", email=" + email;
	}
	
	public void printPerson() {
		System.out.println(this);
	}
}
