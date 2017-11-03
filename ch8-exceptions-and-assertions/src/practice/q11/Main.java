package practice.q11;

public class Main {

	//you can not use throws NoNameException, AgeOutOfRangeException,
	//because Person throws Exception instead of NoNameException and AgeOutOfRangeException
	public static void main(String[] args) throws Exception {
		
		Person p1 = new Person("James", 20);
		Person p2 = new Person("Williams", 32);
		System.out.println(p1);
		System.out.println(p2);
	}

}
