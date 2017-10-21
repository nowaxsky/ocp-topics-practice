package practice.q4;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Jim();
		Student s2 = new Harry();
		Jim s3 = new Jim();
		Harry s4 = new Harry();
		
		System.out.println(s1.getName());
		System.out.println(s1.name);
		
		System.out.println(s2.getName());
		System.out.println(s2.name);
		
		System.out.println(s3.getName());
		System.out.println(s3.name);
		
		System.out.println(s4.getName());
		System.out.println(s4.name);

	}

}
