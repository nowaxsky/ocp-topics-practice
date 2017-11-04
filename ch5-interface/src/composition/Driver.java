package composition;

public class Driver {

	public void testCar(Car car) {
		if (car instanceof CommonCar) {
			car.start();
		} else if(car instanceof CompositedSuperCar) {
			CompositedSuperCar superCar = (CompositedSuperCar) car;
			superCar.start();
			superCar.dive();
			superCar.fly();
		}
	}
}
