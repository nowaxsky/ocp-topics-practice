package override;

public class Manager extends Employee {

	private String deptName;
	public Manager(int empId, String name, String ssn, double salary, String deptName) {
		super(empId, name, ssn, salary);
		this.deptName = deptName;
	}
	
	@Override
	public String profile() {
		return super.profile() + ", Department: " + this.deptName;
	}

	
}
