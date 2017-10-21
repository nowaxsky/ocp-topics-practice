package encapsulation;

public class Manager extends Employee {
	
	private String managedDept;
	
	public Manager(int empId, String name, String ssn, double salary, String managedDept) {
		super(empId, name, ssn, salary);
		this.managedDept = managedDept;
	}
	
	public String getManagedDept() {
		return managedDept;
	}

	
}
