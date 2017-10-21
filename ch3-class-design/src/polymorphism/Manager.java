package polymorphism;

public class Manager extends Employee {

	private String DeptName;
	
	@Override
	protected int calculateStock() {
		return 30;
	}
	
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	
	public String getDeptName() {
		return DeptName;
	}

}
