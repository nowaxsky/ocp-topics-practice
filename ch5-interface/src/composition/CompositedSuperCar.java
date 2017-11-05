package composition;

public class CompositedSuperCar implements Car {

	private CommonCar car = new CommonCar();
	private DivingPlugIn divingPlugIn = new DivingPlugIn();
	private FlyingPlugIn flyingPlugIn = new FlyingPlugIn();
	
	@Override
	public void start() {
		car.start();
	}	
	
	public void dive() {
		divingPlugIn.dive();
	}
	
	public void fly() {
		flyingPlugIn.fly();
	}
	
}
