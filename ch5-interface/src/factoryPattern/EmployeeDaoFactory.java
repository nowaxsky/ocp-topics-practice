package factoryPattern;

public class EmployeeDaoFactory {

	public static EmployeeDao createEmployeeDao() {
		return new EmployeeDaoMemoryImpl();
		//return new EmployeeDaoJdbcImpl();
	}
}
