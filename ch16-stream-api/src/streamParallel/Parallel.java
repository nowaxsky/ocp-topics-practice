package streamParallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Parallel {
	
	public static void parallelStreamingFromCollection() {
		System.out.println("==========parallel streaming from collection");
		
								   //paralleling from Collection use parallelStream()
		double sum = getEmployees().parallelStream()
								   .filter(e -> e.name.startsWith("Jim"))
								   .filter(e -> e.salary >= 1500)
								   .peek(e -> e.show())
								   .mapToDouble(e -> e.salary)
								   .sum();
		System.out.println(sum);
	}
	
	public static void parallelStreamingFromStream() {
		System.out.println("==========parallel streaming from stream");
		double sum = getEmployees().stream()
								   .filter(e -> e.name.startsWith("Jim"))
								   .filter(e -> e.salary >= 1500)
								   .peek(e -> e.show())
								   .mapToDouble(Employee::getSalary)
								   
								   //paralleling from Stream use parallel()
								   .parallel()
								   .sum();
		System.out.println(sum);
	}
	
	public static void statefulStreaming() {
		System.out.println("==========stateful streaming");
		
		/*
		 * owing to blockList is not stateless(blockList is changing within streaming),
		 * parallelStream() maybe make the WRONG result!
		 * 
		 * if you want to change the state when using parallel stream,
		 * check out statelessStreaming() method
		 *  
		 */
		List<Employee> eList = getEmployees();
		List<Employee> blockList = new ArrayList<>();
		eList.parallelStream()
			 .filter(e -> e.name.startsWith("Jim"))
//			 .peek(System.out::println)
			 .forEach(e -> blockList.add(e));
		
		eList.stream().forEach(e -> e.show());
		System.out.println();
		blockList.stream().forEach(e -> e.show());
	}
	
	public static void statelessStreaming() {
		System.out.println("==========stateless streaming");
		
		List<Employee> eList = getEmployees();
		List<Employee> nonblockList = eList.parallelStream()
										   .filter(e -> e.name.startsWith("Jim"))
										   .collect(Collectors.toList());
		
		eList.stream().forEach(e -> e.show());
		System.out.println();
		nonblockList.stream().forEach(e -> e.show());
		
	}
	
	public static void checkParallelResultOfSum() {
		System.out.println("==========check parallel result of sum");
		
		List<Employee> eList = getEmployees();
		double r1 = eList.stream()
						 .filter(e -> e.name.startsWith("Jim"))
						 .mapToDouble(Employee::getSalary)
						 .sequential()
						 .sum();
		
		double r2 = eList.stream()
						 .filter(e -> e.name.startsWith("Jim"))
						 .mapToDouble(Employee::getSalary)
						 .parallel()
						 .sum();
		System.out.println(r1 == r2);
	}
	
	public static void checkParallelResultOfFindAny() {
		System.out.println("==========check parallel result of findAny");
		
		List<Employee> eList = getEmployees();
		Optional<Employee> e1 = eList.stream()
									 .filter(e -> e.name.startsWith("Jim"))
									 .sequential()
									 .findAny();
		
		Optional<Employee> e2 = eList.stream()
									 .filter(e -> e.name.startsWith("Jim"))
									 .parallel()
									 .findAny();
		System.out.println(e1.get().id == e2.get().id);
	}
	

	public static void main(String[] args) {
		parallelStreamingFromCollection();
		parallelStreamingFromStream();
		statefulStreaming();
		statelessStreaming();
		checkParallelResultOfSum();
		checkParallelResultOfFindAny();

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
