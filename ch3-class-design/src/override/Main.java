package override;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "Jim", "11111", 100_000.00);
		Manager manager = new Manager(2, "Tom", "222225", 200_000.00, "Marketing");
		
		//VMI(virtual method invocation)
		Employee vmi = new Manager(2, "Tom", "222225", 200_000.00, "Marketing");
		
		System.out.println(employee.profile());
		System.out.println(manager.profile());
		System.out.println(vmi.profile());

	}

}
