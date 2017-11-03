package assertions;

public class ClassInvariant {

	int hours;
	int minutes;
	int seconds;
	
	public ClassInvariant(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	void rule() {
		assert(0 <= hours && hours < 24);
		assert(0 <= minutes && minutes < 60);
		assert(0 <= seconds && seconds < 60);
	}
}
