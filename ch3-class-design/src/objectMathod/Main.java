package objectMathod;

public class Main {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		
		System.out.println(employee1);
		System.out.println(employee1 == employee2);
		System.out.println(employee1.equals(employee2));

	}

}
