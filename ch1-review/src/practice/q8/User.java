package practice.q8;

public class User {

	private String firstName;
	private String lastName;
	private static int count;
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		++count;
	}
	
	//What's this?
	//TODO
	static {
		count = 0;
	}
	
	public static int getCount() {
		return count;
	}
}
