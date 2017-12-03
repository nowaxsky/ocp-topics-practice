package streamParallel;

public class Employee {

	double salary;
	int id;
	String name;
	
	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void show() {
		System.out.println(id + ",  " + name + ", " + salary);
	}
	
	double getSalary() {
		return this.salary;
	}
}
