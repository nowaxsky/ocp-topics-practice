package factoryPattern;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	@Override
	public boolean add(Employee e) {
		System.out.println("add Employee");
		return true;
	}

	@Override
	public boolean delete(Employee e) {
		System.out.println("delete Employee");
		return true;
	}

	@Override
	public Employee findByName(String name) {		
		return new Employee(name, 18);
	}

}
