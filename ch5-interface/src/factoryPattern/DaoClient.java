package factoryPattern;

public class DaoClient {

	public void addEmployee(Employee e) {
		EmployeeDao dao = EmployeeDaoFactory.createEmployeeDao();
		dao.add(e);
	}
}
