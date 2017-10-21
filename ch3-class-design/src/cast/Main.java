package cast;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		testCastClass(manager);
		testCastInterface(manager);
	}
	
	public static void testCastClass(Manager manager) {
		Employee upCast = (Employee) manager;
		Manager parallelCast = (Manager) manager;
		
		//compile is OK, but runTime is error
		Director downCast = (Director) manager;
	}
	
	public static void testCastInterface(Manager manager) {
		
		//compile is OK, but runTime is error
		//when Manager implements Quit, runTime will pass
		Quit quit = (Quit) manager;
	}

}
