package staticFactory;

public abstract class TV {

	public void turnOn() {
		System.out.println("turn on TV");
	}
	
	public void turnOff() {
		System.out.println("turn off TV");
	}
	
	public void play() {
		System.out.println("plays now");
	}
	
	public void changeChannel() {
		System.out.println("TV changeChannel(), once a channel");
	}
	
	public void changeVolume() {
		System.out.println("TV changeVolume()");
	}
}
