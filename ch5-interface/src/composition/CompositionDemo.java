package composition;

public class CompositionDemo {

	public static void main(String[] args) {
		Car basicCar = new CommonCar();
		Driver p1 = new Driver();
		p1.testCar(basicCar);
		
		Car superCar = new CompositedSuperCar();
		Driver p2 = new Driver();
		p2.testCar(superCar);
	}

}
