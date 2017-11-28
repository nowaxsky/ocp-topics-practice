package practice.q3;

public class Main {

	public static void main(String[] args) {
		
//		Car auto = Car("MyCar")::new;	//compile error
//		Car auto = Car::new;	//compile error
		
		CarFactory rider = Car::new;
		Car vehicle = rider.getCar("MyCar");

	}

}
