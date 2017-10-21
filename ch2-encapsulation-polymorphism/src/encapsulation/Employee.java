package encapsulation;

public class Employee {

	public final int COMPANY_ID = 1234567890;
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
	
	public void changeName(String newName) {
		if(newName != null) {
			this.name = newName;
		}
	}
	
	public void raiseSalary(double increase) {
		this.salary += increase;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}
	
}
