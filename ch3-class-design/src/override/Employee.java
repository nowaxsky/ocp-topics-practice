package override;

public class Employee {

	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId, String name, String ssn, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public String profile() {
		return "id: " + empId + ", name: " + name;
	}
	
}
