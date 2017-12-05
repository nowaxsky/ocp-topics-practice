package streamParallel;

import java.util.ArrayList;
import java.util.List;

public class Basic {

	private static void imperativeProgramming() {
		System.out.println("==========imperative programming");
		double sum = 0;
		for(Employee e: getEmployees()) {
			if(e.name.startsWith("Jim") && e.salary >= 1500) {
				e.show();
				sum += e.salary;
			}
		}
		System.out.println(sum);
	}
	
	private static void streamingProgramming() {
		System.out.println("==========streaming programming");
		double sum = getEmployees().stream()
								   .filter(e -> e.name.startsWith("Jim"))
								   .filter(e -> e.salary >= 1500)
								   .peek(e -> e.show())
								   .mapToDouble(e -> e.salary)
								   .sum();
		System.out.println(sum);
	}
	
	public static void main(String[] args) {		
		imperativeProgramming();
		streamingProgramming();

	}
	
	private static List<Employee> getEmployees() {
		List<Employee> es = new ArrayList<>();
		es.add(new Employee(1, "Jim1", 1000));
		es.add(new Employee(2, "Jim2", 2000));
		es.add(new Employee(3, "Jim3", 3000));
		es.add(new Employee(3, "Jjjj", 4000));
		return es;
	}

}
