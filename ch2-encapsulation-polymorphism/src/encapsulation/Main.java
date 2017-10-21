package encapsulation;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager(102, "CPM", "987-87-9487", 10000.00, "engineering");
		manager.raiseSalary(1200.50);
		System.out.println(manager.getName() + "\t" + manager.getManagedDept() + "\t" + manager.getSalary());
	}

}
