package practice.q4;

public class Emp {

	String firstName;
	String lastName;
	public Emp(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return getFirstName() + "-" + getLastName();
	}
}
