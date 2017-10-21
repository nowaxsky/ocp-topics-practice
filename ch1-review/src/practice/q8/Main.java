package practice.q8;

public class Main {

	public static void main(String[] args) {
		User u1 = new User("Jim", "Tzeng");
		User u2 = new User("Duke", "Java");
		User u3 = new User("Edwin", "Chung");
		User u4 = new User("Sonic", "Huang");
		u4 = null;
		u3 = u2;
		
		//4
		System.out.println(User.getCount());
	}

}
