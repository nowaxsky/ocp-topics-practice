package factoryPattern;

public interface EmployeeDao {

	public boolean add(Employee e);
	public boolean delete(Employee e);
	public Employee findByName(String name);
}
