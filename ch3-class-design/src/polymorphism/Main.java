package polymorphism;

public class Main {

	public static void main(String[] args) {
		EmployeeStockPlan plan = new EmployeeStockPlan();
		
		Employee manager = new Manager();
		Employee director = new Director();
		
		System.out.println(plan.grantStock(manager));
		System.out.println(plan.grantStock(director));
		
		System.out.println(isManager(director));
		System.out.println(isEmployee(director));
		
		Manager manager2 = new Manager();
		manager2.setDeptName("Marketing");
		System.out.println(manager2.getDeptName());
		
		modifyManagerDept(manager2, "Engineering");
		System.out.println(manager2.getDeptName());

	}
	
	public static boolean isManager(Employee e) {
		return e instanceof Manager ? true : false;
	}
	
	//if e is same class or its child class with Employee, instanceOf will return true 
	public static boolean isEmployee(Employee e) {
		return e instanceof Employee ? true : false;
	}
	
	public static void modifyManagerDept(Employee e, String dept) {
		if(e instanceof Manager) {
			Manager m = (Manager) e;
			m.setDeptName(dept);
		}
	}

}
